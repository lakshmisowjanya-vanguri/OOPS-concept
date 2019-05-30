package taskday4;
import java.util.*;
class Critter{
	void fly() {
		System.out.println("flying");
	}
	void sleep() {
		System.out.println("sleep");
	}
}
public class Butterfly extends Critter{
	String color="yellow";
	int x=0,a;
	
		
	void fly(String fly) {
		System.out.println("flying in the   "+fly);
	}
	void sleep(int hour) {
		System.out.println("sleep  "+hour+" hrs");
	}
	void moment(int n) {
		for(int i=0;i<=n;i++) {
			System.out.println("X ");
			System.out.println(" A");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Butterfly b=new Butterfly();
		System.out.println("parent class methods");
		b.fly();
		b.sleep();
		System.out.println("child class methods");
		b.fly("sky");
		b.sleep(8);
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of moments ");
		int n=s.nextInt();
		b.moment(n);
		
	}

}

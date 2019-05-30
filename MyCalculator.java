package taskday4;
import java.util.Scanner;
interface AdvancedArithmetic{
	 int divisor_sum(int n);
}
public class MyCalculator implements AdvancedArithmetic {
	public int divisor_sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		 return sum;
	 }
	public static void main(String[] args) {
		MyCalculator  m=new MyCalculator ();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int total=m.divisor_sum(n);
		System.out.println("total numbe of divisior is :"+total);
	}
}

package taskday4;
import java.util.Scanner;
abstract class Book{
    String title;
    abstract void setTitle(String s);
     String getTitle(){
        return title;
    }
}
public class MyBook extends Book{
	void setTitle(String s) {
		System.out.print("the title is");
	}
	public static void main(String[] args) {
		MyBook m=new MyBook();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		m.title=s;
		m.setTitle(s);
		String p=m.getTitle();
		sc.close();
		System.out.println(" : "+p);	
	}
}

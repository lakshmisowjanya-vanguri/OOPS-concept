package taskday4;
import java.util.*;
public class ScannerExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		String b=s.nextLine();
		int c=0;
		try {
			int d=s.nextInt();
		 c=Integer.parseInt(s.nextLine());
		} catch(Exception e) {
			System.out.println(e);
			
		}
		
		System.out.println(a+"  "+b+" "+c);
	}

}

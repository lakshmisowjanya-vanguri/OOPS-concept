package taskday4;
import java.util.*;
public class DecimalTOBinary {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int a[]=new int[n];
		int i=0;
		while(n>0) {
			a[i]=n%2;
			i++;	
			n=n/2;		
		}
		for(int j=i-1;j>=0;j--) {
			System.out.println(a[j]);
		}
	}
}
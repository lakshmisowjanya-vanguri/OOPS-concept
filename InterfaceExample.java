package taskday4;
interface A1{
	void print();
}
interface A2{
	void print();
}
public class InterfaceExample implements A1,A2{
	 public void print() {
	 System.out.println("a1 interface");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample i=new InterfaceExample();
		i.print();

	}

}

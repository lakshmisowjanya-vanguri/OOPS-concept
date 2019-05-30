package taskday4;
import java.util.*;
class Circle{
	void areaCircle() {
		double r=3.4;
		double a=(2*(3.14)*r);
		System.out.println("area of circle :"+a);
	}
}
class Square extends Circle{
	void areaSquare() {
		double a=3.4;
		double a1=(a*a);
		System.out.println("area of square :"+a1);
	}
}
class Rectangle extends Square{
	void rectangleArea () {
		double l=3.4;
		double b=4.8;
		double a1=(l*b);
		System.out.println("area of rectangle :"+a1);
	}
}
class Sphere extends Rectangle {
	void sphereArea () {
		double r=3.4;
		double a1=(4*3.14*r*r);
		System.out.println("area of sphereArea :"+a1);
	}
}
public class AreaInheritance  extends Sphere{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere s=new Sphere();
		s.areaCircle();
		s.sphereArea ();
		s.rectangleArea();
		s.areaSquare();
		

		
	}

}

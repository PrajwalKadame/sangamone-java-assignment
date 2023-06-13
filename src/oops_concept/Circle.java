package oops_concept;

public class Circle {
	
	double circle(double r) {
	    double area=3.142*r*r;
		return area;
	}
	
	public static void main(String[] args) {
		Circle circle=new Circle();
		double x=circle.circle(5);
		System.out.println(x);
	}
}

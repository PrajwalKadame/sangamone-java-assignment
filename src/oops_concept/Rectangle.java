package oops_concept;

public class Rectangle {
	private int length;
	private int width;
	
	
	
	
	int Area(int length , int width) {
		return length*width;
	}	
	 int perimeter(int length, int width) {
		return 2*(length+width);
	}
	
public static void main(String[] args) {

		
		
		Rectangle rectangle=new Rectangle();
		int a=rectangle.Area(5, 5);
		int b=rectangle.perimeter(5, 5);
		System.out.println("Area: "+a);
		System.out.println("perimeter: "+b);
	}

}

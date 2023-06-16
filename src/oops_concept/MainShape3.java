package oops_concept;

public class MainShape3 {
	public static void main(String[] args) {
		Rectangle6 rectangle=new Rectangle6(6,5);
		Circle6 circle=new Circle6(6);
		Triangle6 triangle=new Triangle6(6,5,2,4);
		
		    System.out.println("Rectangle Area: " + rectangle.calculateArea());
		    System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
	        System.out.println("Circle Area: " + circle.calculateArea());
	        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
	        System.out.println("Triangle Area: " + triangle.calculateArea());
	        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
	}
}

abstract class Shape3{
	abstract double calculateArea();
	abstract double calculatePerimeter();
}

class Rectangle6 extends Shape3{
	double length;
	double width;
	public Rectangle6(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	double calculateArea() {
		return length*width;
	}

	double calculatePerimeter() {
		
		return 2*(length+width);
	}	
}

class Circle6 extends Shape3{
	double radius;
	
	public Circle6(double radius) {
		this.radius=radius;
	}
	
	double calculateArea() {
		return Math.PI*radius*radius;
	}

	double calculatePerimeter() {
		
		return 2*Math.PI*radius;
	}	
}

class Triangle6 extends Shape3{
	double base;
	double height;
	double side1;
	double side2;
	public Triangle6(double base, double height, double side1, double side2) {
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	double calculateArea() {
		return 0.5*base*height;
	}

	double calculatePerimeter() {
		
		return side1+base+side2;
	}	
}

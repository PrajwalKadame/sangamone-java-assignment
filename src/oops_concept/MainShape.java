package oops_concept;

abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle2 extends MainShape {
    private double length;
    private double width;

    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle4 extends MainShape {
    private double radius;

    public Circle4(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends MainShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class MainShape {
    public static void main(String[] args) {
        Rectangle2 rectangle = new Rectangle2(4, 5);
        Circle4 circle = new Circle4(3);
        Triangle triangle = new Triangle(6, 8);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}


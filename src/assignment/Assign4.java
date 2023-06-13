package assignment;

public class Assign4 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before");
		System.out.println("a value "+a);
		System.out.println("b value "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After");
		System.out.println("a value "+a);
		System.out.println("b value "+b);
	}

}

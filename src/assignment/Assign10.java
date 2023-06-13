package assignment;

import java.util.Scanner;

public class Assign10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		double area=area(num);
		System.out.println(area);
	}
	
	public static double area(int r) {
		double area = 3.142*r*r;
		return area;
	}
}

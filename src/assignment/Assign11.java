package assignment;

import java.util.Scanner;

public class Assign11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number"+"°C");
		int num=sc.nextInt();
		double fahrenheit=faran(num);
		System.out.println(fahrenheit+"°F");
	}
	
	public static double faran(int a) {
		double fahrenheit = (a*1.8) + 32;
		return fahrenheit;
	}
}

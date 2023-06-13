package assignment;

import java.util.Scanner;

public class Assign7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enater 1st no");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int max=maxNumber(num1,num2,num3);
		System.out.println(max+" is the max no");
	}
	public static int maxNumber(int a, int b, int c) {
		int max=a;
		if(b>max) {
			max=b;
		}if(c>max) {
			max=c;
		
	}return max;
	}
	
}

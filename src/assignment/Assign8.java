package assignment;

import java.util.Scanner;

public class Assign8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		fibo(num);
	}
	
	public static void fibo(int a) {
		int f1=0;
		int f2=1;
		int f3=0;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=0;i<a-2;i++) {
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			
		}
	}
}

package assignment;

import java.util.Scanner;

public class Assign19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int sum=add(num);
		System.out.println(sum);
	}
	
	public static int add(int a) {
		int sum=0;
		while(a!=0) {
			
			int rem=a%10;
			sum=sum+rem;
			a=a/10;
			
			
		}return sum;
	}
	
}

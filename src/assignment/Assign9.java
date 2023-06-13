package assignment;

import java.util.Scanner;

public class Assign9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int palidrome=pali(num);
		int copy=num;
		if(palidrome==copy) {
			System.out.println("no is palidrome");
		}else {
			System.out.println("no is not palidrome");
		}
		
	}
	
	public static int pali(int a) {
		int no=a;
		
		int rev=0;
		while(no!=0){
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}return rev;
		
		
	}

}

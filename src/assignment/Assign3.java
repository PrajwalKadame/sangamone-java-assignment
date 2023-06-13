package assignment;

import java.util.Scanner;

public class Assign3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int num=sc.nextInt();
		
		if (num<0){
			System.out.println("Negative");
		}
		else if (num>0){
			System.out.println("Positive");
		}else {
			System.out.println("Zero");
		}
	}
}

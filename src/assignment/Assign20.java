package assignment;

import java.util.Scanner;

public class Assign20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		double num1=sc.nextDouble();
		System.out.println("Enter 2st Number");
		double num2=sc.nextDouble();
		System.out.println("1.Addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("Enter your choice:");
		int num3=sc.nextInt();
		
	switch (num3){
	
		case 1:{System.out.println(num1+num2);
		}break;
		
		case 2:{System.out.println(num1-num2);
		}break;
	
		case 3:{System.out.println(num1*num2);
		}break;
	
		case 4:{System.out.println(num1/num2);
		}break;
	
	}
	}

}

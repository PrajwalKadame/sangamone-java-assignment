package assignment;

import java.util.Scanner;

public class FactorialAssign5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int factorial=calculateFactorial(num);
	System.out.println("The factorial of "+num+" is "+factorial);
}
public static int calculateFactorial(int a) {
	int fact=1;
	for(int i=1; i<=a; i++)
	{
		fact=fact*i;
	}
	return fact;
	
}
}

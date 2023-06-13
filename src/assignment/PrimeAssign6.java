package assignment;

import java.util.Scanner;

public class PrimeAssign6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	boolean prime=primeno(num);
	if(prime==true)
	{
		System.out.println("Prime no");
	}else {
		System.out.println("Not a prime no");
	}
}
public static boolean primeno(int a) {
	boolean flag=true;
	for(int i=2; i<a; i++) {
		if(a%i==0) {
			flag=false;
			break;
		}
	}return flag;
}
}

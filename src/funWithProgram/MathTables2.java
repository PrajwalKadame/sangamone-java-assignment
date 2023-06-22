package funWithProgram;

import java.util.Scanner;

public class MathTables2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start value");
		int start=sc.nextInt();
		System.out.println("Enter end value");
		int end=sc.nextInt();
		
		for(int i=start; i<=end; i++) {
			for(int j=1; j<=10; j++) {
				int result=i*j;
				System.out.println(i+" * "+j+" = "+result);
			}
			System.out.println();
		}
	}

}

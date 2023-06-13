package assignment;
import java.util.Scanner;
public class AddNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. 1");
		int no1=scanner.nextInt();
		
		System.out.println("Enter no. 2");
		int no2=scanner.nextInt();
		
		int num=no1+no2;
		System.out.println(num);
		
	}

}

package assignment;

import java.util.Scanner;

public class Assign16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        long factorial = fact(number);

        System.out.println("Factorial of " + number + " = " + factorial);
    }

    public static long fact(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * fact(number - 1);
        }
    }
}



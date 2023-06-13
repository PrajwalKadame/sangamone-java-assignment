package assignment;

import java.util.Scanner;

public class Assign13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String word1=sc.next();
		String word=vowel(word1);
		System.out.println(word);
	
	}
	
	public static String vowel(String a) {
		String rev="";
		for(int i=a.length()-1; i>=0;i--) {
			
			rev=rev+a.charAt(i);

		}
		return rev;
		}

}

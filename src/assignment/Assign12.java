package assignment;

import java.util.Scanner;

public class Assign12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String word1=sc.next();
		vowel(word1);
	
	}
	
	public static void vowel(String a) {
		for(int i=0; i<a.length() ;i++) {
			char ch=a.charAt(i);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.print(ch+", ");
		}
		}
}

}

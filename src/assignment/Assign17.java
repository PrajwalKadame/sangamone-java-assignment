package assignment;

import java.util.Arrays;

public class Assign17 {
 public static void main(String[] args) {
	String str1="Race";
	String str2="Care";
	
	str1=str1.toLowerCase();
	str2=str2.toLowerCase();
	
	if (str1.length()==str2.length()) {
		char[] chararr1=str1.toCharArray();
		char[] chararr2=str2.toCharArray();
		
		Arrays.sort(chararr1);
		Arrays.sort(chararr2);
		
		boolean result=Arrays.equals(chararr1, chararr2);
		
		if(result) {
			System.out.println(str1+" and "+str2+" are anagram");
		}else {
			System.out.println(str1+" and "+str2+" are not anagram");
		}
		
		
	}
	
	
}
}

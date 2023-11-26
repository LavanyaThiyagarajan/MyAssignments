package practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Lis ten";
		String s2="Silent";
				
		String str1 = s1.replaceAll("\\s", "").toLowerCase();
		String str2 = s2.replaceAll("\\s", "").toLowerCase();
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
				
		//String equal=(Arrays.equals(charArray1, charArray2))?"Ana":"not ANa";
		//System.out.println(equal);
		
		if(Arrays.equals(charArray1, charArray2)) {
			System.out.println("Anagram");			
		}
		else {
			System.out.println("Not Anagram");
		}
		

		
		

	}

}

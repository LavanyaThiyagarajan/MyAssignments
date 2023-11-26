package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Lavanya";
		String result="";
		
		char[] charArr=s.toCharArray();
		for(int i=charArr.length-1;i>=0;i--) {
			result=result+charArr[i];
			
		}
		System.out.println(result);
		
		
	}

}

package practice;

import java.io.IOException;
	import java.util.Arrays;

public class capgemini {

public static void main(String[] args) throws IOException {
		
		int[]a= {3,2,1,5,4};
		
		Arrays.sort(a);
		String result="";
		
		for(int i=0;i<a.length;i++) {
			result+="A"+a[i];
			if(i<a.length-1) {
				result+="_";
			}
		}
		System.out.println(result);
	}
}

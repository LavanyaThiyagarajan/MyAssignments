package practice;

import java.util.Arrays;

public class cap_duplicateandoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programming";
		char[] charAr=str.toCharArray();
		int count=0;
		Arrays.sort(charAr);
		for(Character c : charAr) {
			System.out.print(c);
		}
			
		for(int i=0;i<charAr.length-1;i++) {
			if(charAr[i]==charAr[i+1]) {
				count++;
			}
			if(count>0) {
				System.out.println(charAr[i]+" "+(count+1));
				count=0;
			}
		}
		if(count>0) {
			System.out.println(charAr[charAr.length-1]+" "+(count+1));
		}
		

	}

}

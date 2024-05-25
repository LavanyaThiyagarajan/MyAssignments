package practice;

import java.util.Arrays;

public class cap_longestsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,9,16,6,8,7};
		int maxlength=1;
		int currentlength=1;
		int endindex=0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				currentlength++;
				if(currentlength>maxlength) {
					maxlength=currentlength;
					endindex=i;
				}
			}
			else {
				currentlength=1;
			}
		}
		
		int[] longestsubstring=new int[maxlength];
		System.arraycopy(arr,endindex-maxlength+1,longestsubstring,0,maxlength);
		
		
		System.out.println(Arrays.toString(longestsubstring));
		

	}

}

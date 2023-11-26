package practice;

import org.bouncycastle.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {20,10,50,40,30};
		
		int max=num[0];
		
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {     //smallest number put < here
				max=num[i];
			}
		}
		System.out.println(max);

	}

}

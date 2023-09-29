package javachallenge;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReturnMajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,3,2,2,2};	
		int length = nums.length;
		int maxCount=0;
		int index=-1;
		
		for(int i=0;i<length;i++) {
			int count=0;
			for(int j=0;j<length;j++) {
				if(nums[i]==nums[j]) {
					count++;					
				}
				if(count>maxCount) {
					maxCount=count;
					index=i;
				}				
			}
		}
		if(maxCount>length/2)
		System.out.println(nums[index]);
		}		
}

package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bouncycastle.util.Arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {20,10,50,40,30};
		
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<num.length;i++) {
			li.add(num[i]);
		}
		
		Integer max = Collections.min(li);
		System.out.println(max);
		
		/*
		 * int max =num[0];
		 * 
		 * 
		 * for(int i=0;i<num.length;i++) { if(num[i]<max) { max=num[i]; } }
		 * System.out.println(max);
		 */

	}

}

package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,6,4,5};
		
		
		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
		//-----------------OR
		List<Integer> li=new ArrayList<Integer>();
		for(Integer val:num) {
			li.add(val);
		}
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		

	}

}

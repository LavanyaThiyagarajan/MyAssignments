package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,3,4,5};
		
		
		List<Integer> li=new ArrayList<Integer>();
		for(Integer val:num) {
			li.add(val);
		}
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		

	}

}

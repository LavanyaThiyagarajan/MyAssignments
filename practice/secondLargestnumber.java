package practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class secondLargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {7,7,4,8,2};
		Set<Integer> s=new LinkedHashSet<Integer>();
		Arrays.sort(num);
		
		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
			s.add(num[i]);
			}
		System.out.println(s);

		Object[] arr=s.toArray();
		System.out.println(arr[1]);
		
		
		System.out.println("Another approach");

		
		
		  Set<Integer> set=new LinkedHashSet<Integer>(); int[] num1= {7,7,4,8,2};
		  
		  Arrays.sort(num1);
		  
		  for(int val:num1) { 
			 set.add(val); 
			  }
		 
		  
		  
		  Object[] arr1=set.toArray(); 
		  for(int i=0;i<arr1.length;i++) {
		  System.out.println(arr1[i]);
		  }
		  
		  System.out.println("Second Large num:" +arr1[arr1.length-2]);
		  
		 

	}

}

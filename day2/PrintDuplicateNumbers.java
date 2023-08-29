package week4.day2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,8,7,8};


		Set<Integer> hashSet=new LinkedHashSet<Integer>();
		Set<Integer> duphashSet=new LinkedHashSet<Integer>();
		for (Integer val : data) {

			boolean add = hashSet.add(val);			
			if(!add)
			{ 
				duphashSet.add(val);
			} 
			}
		for(Integer val:duphashSet) {
			System.out.println(val);
		}


		//System.out.println(o);


	}

}

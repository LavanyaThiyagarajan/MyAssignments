package javachallenge;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindSingleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] num= {4,1,2,1,2};
		
		Set<Integer>oriSet=new LinkedHashSet<Integer>();
		Set<Integer>dupSet=new LinkedHashSet<Integer>();
		
		for(Integer res :num) {
		boolean add = oriSet.add(res);
		if(!add) {
			dupSet.add(res);
		}
		}
		//System.out.println(oriSet);
		oriSet.removeAll(dupSet);
		//System.out.println(dupSet);
		Object[] oriSetarray = oriSet.toArray();
		for(Object res : oriSetarray) {
		System.out.println(res);
		}
	}

}

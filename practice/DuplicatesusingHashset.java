package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesusingHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num= {1,1,2,3,4,4,5,6,6};
		
		Set<Integer> oriSet=new LinkedHashSet<Integer>();
		Set<Integer> dupSet=new LinkedHashSet<Integer>();
		
		for(Integer val:num) {
			boolean add=oriSet.add(val);
			
			if(!add) {
				dupSet.add(val);
			}
			
		}
		System.out.println(oriSet);
		System.out.println(dupSet);
		oriSet.removeAll(dupSet);
		System.out.println(oriSet);
		//System.out.println(dupSet);
		
		
		

	}

}

package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name="lavanya";
		char[] charArray = name.toCharArray();
		Set<Character> set=new LinkedHashSet<Character>();
		Set<Character> dupSet=new LinkedHashSet<Character>();
		for (Character val : charArray) {			
			boolean add = set.add(val);
			if(!add) {
				dupSet.add(val);
			}
		}
		set.removeAll(dupSet);
		for (Character val : set) {
			System.out.println(val);
		}
		
	}

}

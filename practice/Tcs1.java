package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Tcs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "abcsdfr";
		String s2= "abcafggr";
		
		Set<Character> set=new LinkedHashSet<Character>();
		
		String s3=s1.concat(s2);
		System.out.println(s3);
		String replace=s3.replaceAll("[^abc]", "");
		System.out.println(replace);
		
		char[] arr1=replace.toCharArray();
		
		for(Character res:arr1) {
			set.add(res);
		}
		
		System.out.println(set);
		Object[] obj=set.toArray();
		
		for(Object o :obj) {
			System.out.print(o);
		}
		
		
		
	}

}

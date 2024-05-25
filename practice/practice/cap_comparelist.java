package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cap_comparelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		
		List<String> l2=new ArrayList<>();
		l2.add("b");
		l2.add("c");
		l2.add("a");
		
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1);
		System.out.println(l2);
		
		if(l1.equals(l2)) {
			System.out.println("bth r equal");
		}

	}

}

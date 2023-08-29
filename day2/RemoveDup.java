package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name="PayPal India";
      char[] charArray = name.toCharArray();
      Set<Character> charSet=new LinkedHashSet<Character>();
      Set<Character> dupCharSet= new LinkedHashSet<Character>();
      for (Character val : charArray) {
		boolean add = charSet.add(val);
		if(!add) {
			dupCharSet.add(val);
		}		
	}
      for (Character val : charSet) {
    	  if(val!=' ') {
    		  System.out.println(val);
    	  }
		
	}
	}

}

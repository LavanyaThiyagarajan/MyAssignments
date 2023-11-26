package practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.devtools.v113.input.Input;

public class OccurenceOfCharacter {

	
	////occurences of character
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String input="Lavanya";
				
				Set<Character> o=new LinkedHashSet<Character>();
				char[] charArray = input.toCharArray();
				for(int i=0;i<=charArray.length-1;i++) {
					int count=0;
					
					for(int j=0;j<=charArray.length-1;j++) {
						if(charArray[i]==charArray[j]) {
							count++;	
						}				
					}		 
					
					boolean add = o.add(charArray[i]);
					if(add) {
						System.out.println("Occurences of "+charArray[i]+ " " +count );
					}	
					
					
				}
	}
}
	



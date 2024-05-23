package practice;

import java.io.IOException;

public class wordfinding {
	public static void main(String[] args) throws IOException {
		
	String input="JAVAJACKPROGRAMJAVAJAVA";
	String word="JAVA";
	
	int count=0;
	int index=0;
	
	while((index=input.indexOf(word,index))!=-1) {
		count++;
		index+=word.length();
		
	}
System.out.println(word+""+count);
	
		
	}
}


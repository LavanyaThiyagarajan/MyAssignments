package week3.day4;

public class ChangeOddIndexToUpperCase {
public static void main(String[] args) {
	String test = "changeme";
	char[] charArr = test.toCharArray();
	for(int i=0;i<charArr.length;i++) {
		if(i%2==0) {			
			System.out.print(Character.toUpperCase(charArr[i]));
		}
		else {
			System.out.print(charArr[i]);
		}
	}
	
}
}

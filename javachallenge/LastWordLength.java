package javachallenge;

public class LastWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=" fly me  to  the moon ";
		String s2="luffy is still joyboy";
		String s3="Hello World";
		
		
		String[] split = s1.split(" ");
		int length = split.length;
		String val = split[length-1];
		System.out.println("Last Word is: " +val);
		System.out.println("Length of the last word is: " +val.length());
		
		String[] split1 = s2.split(" ");
		int length1 = split1.length;
		String val1 = split1[length1-1];
		System.out.println("Last Word is: " +val1);
		System.out.println("Length of the last word is: " +val1.length());
		
		String[] split2 = s3.split(" ");
		int length2 = split2.length;
		String val2 = split2[length2-1];
		System.out.println("Last Word is: " +val2);
		System.out.println("Length of the last word is: " +val2.length());
		/*
		 * System.out.println(length); for (String res : split) {
		 * System.out.println(res); }
		 */
		
		
		

	}

}

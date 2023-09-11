package javachallenge;

public class LastWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=" fly me  to  the moon ";
		String s2="luffy is still joyboy";
		String s3="Hello World";
		String [] s= {" fly me  to  the moon ","luffy is still joyboy","Hello World"};

		for(int i=0;i<s.length;i++) {
			
			String[] split = s[i].split(" ");
			int length = split.length;
			String val = split[length-1];
			System.out.println("Last Word is: " +val);
			System.out.println("Length of the last word is: " +val.length());
		}

	}

}

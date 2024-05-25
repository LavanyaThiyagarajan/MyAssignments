package practice;

public class sumofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc12fe3";
		
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			char c=	s.charAt(i);
			if(Character.isDigit(c)) {
				sum+=Character.getNumericValue(c);
			}
		}
		System.out.println(sum);

	}

}

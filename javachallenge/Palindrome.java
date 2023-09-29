package javachallenge;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		String input="A man, a plan, a canal: Panama";
		String replaceAll = input.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		System.out.println("Before reversing: "+replaceAll);								
		
		char[] charArray = replaceAll.toCharArray();
		String result="";
		//StringBuilder sb=new StringBuilder();
		for(int j=charArray.length-1;j>=0;j--) {
			//char c = replaceAll.charAt(j);				
			//sb.append(c);				
			result=result+charArray[j];
		}
		System.out.println("Appended : "+result);
	//	String res = sb.toString();
		//System.out.println(res);
		
		//StringBuilder sb=new StringBuilder(replaceAll);
		//String res = sb.reverse().toString();
		//System.out.println("After Reversing: "+sb);
		
		if(result.equals(replaceAll))
			System.out.println("true");
		else
			System.out.println("false");
	

	}

}

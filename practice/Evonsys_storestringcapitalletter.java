package practice;

public class Evonsys_storestringcapitalletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Case ID was MP-123.";
		
		String uppercasecharacter="";
		String lowercasecharacter="";
		
		char[] charAr=input.toCharArray();
		
		for(int i=0;i<charAr.length;i++) {
			if(Character.isUpperCase(charAr[i])) {
				uppercasecharacter+=charAr[i];
			}
			else if(Character.isLowerCase(charAr[i]))
				lowercasecharacter+=charAr[i];
		}
		System.out.println("UpperCaseCharacter:" +uppercasecharacter);
		System.out.println("LowerCaseCharacter:" +lowercasecharacter);
	}
	

}

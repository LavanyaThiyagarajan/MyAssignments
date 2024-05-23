package practice;

public class Vowels_Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Hello";
		
		String vowels="";
		String consonants="";
		
		int vowelcount=0;
		int consonantcount=0;
		
		char[] charAr=input.toLowerCase().toCharArray();
		
		for(int i=0;i<charAr.length;i++) {
			if(Character.isLetter(charAr[i])) {
				if(isvowel(charAr[i])) {
					vowels+=charAr[i];
					vowelcount++;
				}
				else {
					consonants+=charAr[i];
					consonantcount++;
				}
			}
		}
		System.out.println("consonantcount:"+consonantcount);
		System.out.println("vowelcount:"+vowelcount);		
		System.out.println("concatenated:"+vowels+consonants);
		System.out.println("vowels:"+vowels);
		System.out.println("consonants:"+consonants);
	}
	
	public static boolean isvowel(char ch) {
		
		return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
	}

}

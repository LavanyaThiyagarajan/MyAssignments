package practice;

public class ReverseEvenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] splitArr=test.split(" ");
		
		for(int i=0;i<splitArr.length;i++) {
			if(i%2!=0) {
			char[] charArr=splitArr[i].toCharArray();
			for(int j=charArr.length-1;j>=0;j--) {
				System.out.print(charArr[j]);
	
			}
			}
			else
				System.out.print(splitArr[i]);
			System.out.print(" ");
		}

	}

}

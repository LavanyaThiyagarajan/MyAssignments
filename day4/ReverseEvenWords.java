package week3.day4;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] splitArr = test.split(" ");

		for(int i=0;i<splitArr.length;i++) {
			if(i%2!=0) {
				char[] charArray = splitArr[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--)
				{
					System.out.print(charArray[j]);
			}				
		}
			else {
				System.out.print(splitArr[i]);
			}
			System.out.print(" ");
	}
	}

}

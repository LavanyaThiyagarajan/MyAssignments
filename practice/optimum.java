package practice;

public class optimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Java is a programming language";
		String[] splitArr=input.split(" ");
		
		for(int i=0;i<=splitArr.length-1;i++) {
			char[] charArr=splitArr[i].toCharArray();
			System.out.print(" ");
			for(int j=charArr.length-1;j>=0;j--) {
				System.out.print(charArr[j]);
			}
		}

	}

}



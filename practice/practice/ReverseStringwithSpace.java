package practice;

public class ReverseStringwithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="My name is lavanya";
		char[] inputArr=text.toCharArray();
		
		char[] result=new char[inputArr.length];
		
		//mark spaces in result
		for(int i=0;i<inputArr.length;i++) {
			if(inputArr[i]==' ') {
				result[i]=' ';
			}
		}
		
		//traverse charArr string from beginning
		//and put characters in result from end
		int j=result.length-1;
		
		for(int i=0;i<inputArr.length;i++) {
			if(inputArr[i]!=' ') {
				if(result[j]==' ') {
					j--;
				}
				result[j]=inputArr[i];
				j--;
			}
		}
		
		System.out.println(result);			
	}

}

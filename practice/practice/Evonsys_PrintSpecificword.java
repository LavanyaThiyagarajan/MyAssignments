package practice;

public class Evonsys_PrintSpecificword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///learn properties under PageObjectModel>testcase>learnproperties.java
		String input="Case ID was MP-123.";
		String[] inputAr=input.split(" ");
		
		
		System.out.println(inputAr[inputAr.length-1]);//to print last word
		System.out.println(inputAr[inputAr.length-1].replace(".","").replaceAll("[^0-9]",""));

	}

}

package week2.day1;

import java.util.Arrays;

public class FindSecondLargest {
	int[] data= {3,2,11,4,6,7};	
	
	public void displayArray() {
		System.out.println("ORIGINAL ARRAY");
		for(int i=0;i<=data.length-1;i++) {			
			System.out.println(data[i]);
		}
	}
	public void sortArray() {
		Arrays.sort(data);
		System.out.println("SORTED ARRAY");
		for(int i=0;i<=data.length-1;i++) {		
			System.out.println(data[i]);
		}		
	}
	
	public void secondLargest() {
		System.out.println("SECONDLARGESTNUMBER");		
		System.out.println(data[data.length-2]);
	}

	public static void main(String[] args) {
		FindSecondLargest o=new FindSecondLargest();
		o.displayArray();		
		o.sortArray();
		o.secondLargest();
	}
}

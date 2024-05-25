package practice;

import java.util.Arrays;

public class FindLowestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num1= {1,5,4,3,2};
		int [] num2= {9,6,8,2,7};
		int lowestNumber;
		
		Arrays.sort(num1);
		Arrays.sort(num2);
		
		//int lowestNumber=(num1[0]>num2[0]) ?num1[0]:num2[0];
		
		if(num1[0]>num2[0]) {
			System.out.println(num2[0]);		
			//lowestNumber=num2[0];
		}
		else {
			System.out.println(num1[0]);
			//lowestNumber=num1[0];
			
		}
		
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num2.length;j++) {
				if(num1[i]==num2[j]) {
					System.out.println(num1[i]+" is repeated: " +-1);
					//lowestNumber=-1;
					break;
				}
			}
		}
		
		//System.out.println(lowestNumber);
		
		

	}

}

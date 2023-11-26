package practice;

import java.util.Arrays;

public class UniqueElements {
	public static void main(String[] args) {
		int[] num= {1,1,2,2,3,5,10};
		
		for(int i=0;i<=num.length-1;i++) {
			boolean unique=true;
			for(int j=i+1;j<=num.length-1;j++) {
				if(num[i]==num[j]) {
					unique=false;
					break;
				}
			}
			if(unique) {
				System.out.println(num[i]);
			}
			
		}
	}

}

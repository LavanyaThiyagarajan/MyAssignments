package practice;

import java.util.ArrayList;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {13,15,16,18,22};		
		
		for(int i=num[0];i<num[num.length-1];i++) {
			boolean found=false;
			for(int j=0;j<=num.length-1;j++) {
				if(i==num[j]) {
					found=true;
					break;
				}
			}
			if(!found) {
				System.out.println(i+" ");
			}
		}

	}

}

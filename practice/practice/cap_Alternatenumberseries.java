package practice;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class cap_Alternatenumberseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=-1;
		
		int count=7;
		
		for(int i=0;i<count;i++) {
			System.out.print(start+" ");   ///-1 1 3 5 7 9 11 
			start+=2;
		}
		
		///////////////////////////////
		
		int n=7;
		int[] series =new int[n];
		series[0]=-1;
		series[1]=3;
		
		for(int i=2;i<n;i++) {
			series[i]=series[i-1]+2;
		}
		System.out.println(" ");
		for(int i=0;i<n;i++) {
			
			System.out.print(series[i] );/////-1,3,5,7,9,11,13
			if(i<n-1)
				System.out.print(",");
		}
	}

}

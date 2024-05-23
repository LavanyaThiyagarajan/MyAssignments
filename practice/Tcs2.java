package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tcs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 	List<List<Integer>> tries=Arrays.asList(Arrays.asList(1,2,3),
	 							  Arrays.asList(2,3),
	 							  Arrays.asList(3));
	 	
	 	for(int i=0;i<tries.size();i++) {
	 		List<Integer> currenttry=tries.get(i);
	 		for(Integer val: currenttry) {
	 			System.out.println("Try" +(i+1)+" "+val);
	 		}
	 	}
	 	
	 	
	 	
	}

}

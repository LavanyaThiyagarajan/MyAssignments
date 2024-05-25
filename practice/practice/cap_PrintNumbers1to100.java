package practice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class cap_PrintNumbers1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumbers(1);

	}
	
	 public static  void PrintNumbers(int n) {
		 if(n<=100) {
			 System.out.println(n);
			 PrintNumbers(n+1);
		 }
		
	}

}

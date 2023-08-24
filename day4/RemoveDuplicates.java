package week3.day4;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 1;
		String[] splitWrd = text.split(" ");
		int len=splitWrd.length;
		for (int i=0;i<splitWrd.length-1;i++) {
			for (int j=i+1;j<splitWrd.length;j++) {
				if(splitWrd[i].equals(splitWrd[j]))	{
					splitWrd[j]="";				
					count++;
					if(count>1) {
						splitWrd[j]="";
					}
				}
			}	

		}					

		for (int i=0;i<splitWrd.length;i++) 
		{			 		 
			System.out.print(splitWrd[i]+" "); 		 

		}


	}
}

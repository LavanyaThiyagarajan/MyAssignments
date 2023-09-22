package javachallenge;

public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temp;
		int number=8;
		double sqrt=number/2; //4 
		do {
		temp=sqrt;		//4 3 2.833 2.828
		sqrt=(temp+(number/temp))/2; //3  2.833	2.828 2.828
		}while((temp-sqrt)!=0);
		int res=(int) sqrt;
		System.out.println("sqrt before truncating decimal:  " +sqrt);
		System.out.println("sqrt after truncating decimal:  " +res);
		
	}

	
	
	
}

package javachallenge;

public class HappyNumber {

	public static int happyNumber(int num) {

		int sum=0;
		int rem;

		while(num!=0) {
			rem=num%10;
			sum=sum+(rem*rem);
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=4;
		int result = num;
		
		while(result!=1 && result!=4) 
		{
			 result = happyNumber(result);
		}
		if(result==1)
			System.out.println(num+ " : a HappyNumber");
		else if(result==4)
			System.out.println(num+ " : not a Happy Number");
		
	}

}

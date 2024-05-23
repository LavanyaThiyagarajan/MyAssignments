package practice;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=321;
		int sum=0;
		int rem;

		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			//System.out.println(sum);
			num=num/10;
		}
		System.out.println(sum);

	}

}

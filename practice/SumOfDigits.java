package practice;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=321;
		int sum=0;
		int temp;

		while(num>0)
		{
			temp=num%10;
			sum=sum+temp;
			//System.out.println(sum);
			num=num/10;
		}
		System.out.println(sum);

	}

}

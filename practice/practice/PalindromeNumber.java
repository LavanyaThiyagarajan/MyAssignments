package practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12321;
		int orinum=num;
		
		int rem=0;
		int sum=0;
		
		while(num>0) {
			rem=num%10; 
			sum=sum*10+rem;
			num=num/10;
		}
		
		System.out.println(sum);
		if(orinum==sum)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}

}

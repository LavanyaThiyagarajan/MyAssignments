package week1.day2;

public class CheckPositiveOrNegativeNumber {
public static void main(String[] args) {
	int number=-40;
	if(number<0)
	{
		number=(-number);
		System.out.println("The given number is Converted to Postive number: " +number);
	}
	else
	{
		System.out.println("The given number is Positive");
	}
}
}

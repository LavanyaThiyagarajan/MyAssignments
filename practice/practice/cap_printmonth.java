package practice;

public class cap_printmonth {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		printmonth(n);
	}
	
	public static void printmonth(int num) {
		String month="";
		
		switch(num) {
		case 1:
			month="January";
			break;
		case 2:
			month="Febrauary";
			break;
		default:
			month="In valid";
			break;
		}
		System.out.println("Month: "+month);
		
	}

}

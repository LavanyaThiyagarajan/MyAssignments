package practice;

public class capgemini_Stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am an automation tester";
		String[] splitAr=s.split(" ");
		
	
		
		for(int i=0;i<splitAr.length;i++) {
			if(splitAr[i].length()>=2) {
			
				System.out.println(splitAr[i].substring(splitAr[i].length()-2,splitAr[i].length()-1));
			}
			else {
				System.out.println("not available");
			}
		}

	}

}

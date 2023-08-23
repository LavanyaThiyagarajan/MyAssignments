package week3.day2;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Id:" +id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("ID: " +id + "," + "Name: " +name);
	}
	public void getStudentInfo(String email,String phoneNumber) {
		System.out.println("Email: " +email + "," +"PhoneNumber: " +phoneNumber);
	}
	
	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(1);
		s.getStudentInfo(2, "Lavanya");
		s.getStudentInfo("lavanyathyagu@gmail.com", "9840636350");
	}
}

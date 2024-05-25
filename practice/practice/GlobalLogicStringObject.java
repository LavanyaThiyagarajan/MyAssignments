package practice;

public class GlobalLogicStringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String s1="hi";//String literals ,  //create object in string pool,if another string literal with same value(hi) created
		//it refer to same object, just re-use the same object
		String s2="hi";
		String s5="bb";
		
		Integer a=100;
		Integer b=100;
		
		Integer c=500;
		Integer d=500;
		
		Integer e=128;
		Integer f=128;
		
		
		String s3=new String("hi");//explicitly create object in heap memory. if another string with value(hi) created using 
		//literal or another string object refer to different object
		String s4=new String("hi");
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s5);//false
		System.out.println(s1==s3);//false
		System.out.println(s2==s3);//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s3==s4);//false
		System.out.println(a==b);//true
		System.out.println(c==d);//false
		System.out.println(e==f);//false
	}

}

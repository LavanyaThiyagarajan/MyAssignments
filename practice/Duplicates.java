package practice;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {1,1,2,2,3,8,8,4,5,5};
		
		for(int i=0;i<num.length-1;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}
			}
		}
		}

}

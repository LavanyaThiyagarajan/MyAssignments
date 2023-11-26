package practice;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {0,3,0,3,6,5,5};
		
		for(int i=0;i<=num.length-1;i++) {
			for(int j=i+1;j<num.length;j++) {
				int temp=0;
				if(num[i]>num[j]) {//descending means use <
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			System.out.println(num[i]+ " ");
		}

	}

}

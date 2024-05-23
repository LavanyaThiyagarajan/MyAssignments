package practice;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="JAVA JAPAN JAVA JAPAN JAVA";
		String [] splitWords=input.split(" ");
		
		String[] words= {"JAPAN","JAVA"};
	
		
		for(String word : words) {
			int count=0;
			for(String splitWord : splitWords) {				
				if(splitWord.equals(word)) {					
					count++;
				}
			}
			System.out.println(word+" "+count);
		}

	}

}

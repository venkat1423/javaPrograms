package javaPrograms;

public class WordCount {
	
	public static void main(String[] args) {
		
		String str = "Hello World, This is the           String";
		String[] words = str.trim().split("\\s+");
		
		System.out.println("Word Count : "+words.length);
	}

}

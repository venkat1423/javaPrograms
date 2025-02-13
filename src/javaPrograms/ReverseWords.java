package javaPrograms;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		String str = "hello world program";
		
		String[] words = str.trim().split("\\s+");
		
		StringBuilder reversedstr = new StringBuilder();
		
		for(int i = words.length-1; i>=0; i--) {
			reversedstr.append(words[i]).append(" ");
		}
		System.out.println("ReversedWords : "+reversedstr.toString().trim());
	}

}

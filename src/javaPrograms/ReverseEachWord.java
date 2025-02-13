package javaPrograms;

public class ReverseEachWord {
	
	public static void main(String[] args) {
		
		String str = "hello world           program";
		String[] words = str.trim().split("\\s+");
		
		StringBuilder reversedstr = new StringBuilder();
		
		for(String word : words) {
			String reversedword = new StringBuilder(word).reverse().toString();
			reversedstr.append(reversedword).append(" ");
		}
		System.out.println("Reversed each word String : "+reversedstr);
	}

}

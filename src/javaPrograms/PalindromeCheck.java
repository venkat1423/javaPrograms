package javaPrograms;

public class PalindromeCheck {
	
	public static void main(String[] args) {
		String str = "malayalm";
		String sb = new StringBuilder(str).reverse().toString();
		
		System.out.println("Is Palindrome? : "+sb.equals(str));
	}

}

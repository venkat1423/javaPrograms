package javaPrograms;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "Hello world program";
		StringBuilder reverseString = new StringBuilder(str);
		String rev = reverseString.reverse().toString();
		System.out.println("Reverse String is : "+rev);
	}

}

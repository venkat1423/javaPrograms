package javaPrograms;

import java.util.Arrays;

public class AnagramCheck {
	
	public static void main(String[] args) {
		
		String str1 = "listen";
		String str2 = "entisl";
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println("Two Strings are Anagrams? : "+Arrays.equals(arr1, arr2));
	}

}

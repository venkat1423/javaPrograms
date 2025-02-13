package javaPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInString {
	
	public static void main(String[] args) {
		
		String str = "programming";
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for (char ch:str.toCharArray()) {
			set.add(ch);
		}
		
		StringBuilder result = new StringBuilder();
		for(char ch:set) {
			result.append(ch);
		}
		
		System.out.println("String after removing duplicates : "+result);
	}

}

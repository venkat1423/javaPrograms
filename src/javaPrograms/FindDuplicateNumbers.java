package javaPrograms;

import java.util.HashSet;

public class FindDuplicateNumbers {
	
	public static void main(String[] args) {
		int arr[] = {2, 1, 4, 2, 6, 1, 4, 5, 4, 1};
		HashSet<Integer> arr1 = new HashSet<>();
		
		System.out.print("Duplicates are : ");
		for (int num:arr) {
			if (!arr1.add(num)) {
				System.out.print(num+" ");
			}
		}
	}

}

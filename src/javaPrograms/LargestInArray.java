package javaPrograms;

public class LargestInArray {
	
	public static void main(String[] args) {
		int []numbers = {3, 4, 6, 1, 2, 4};
		int max = numbers[0];
		
		for(int num:numbers) {
			if (num>max) {
				max = num;
			}
		}
		System.out.println("Largest Number in Array is "+max);
	}

}

package javaPrograms;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 4, 7, 2, 5};
		int sum = 0;
		
		for(int num : arr) {
			sum += num;
		}
		System.out.println("Sum of array elements : "+sum);
	}

}

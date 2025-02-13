package javaPrograms;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 6};
		int n = 6;
		
		int sum = n*(n+1)/2;
		int avgsum = 0;
		
		for(int num:arr) {
			avgsum += num;
		}
		
		System.out.println("Missing number is "+(sum-avgsum));
	}

}

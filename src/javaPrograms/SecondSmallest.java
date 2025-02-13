package javaPrograms;

public class SecondSmallest {
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 5, 3, 40, 35};
		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if(num < first) {
				second = first;
				first = num;
			}
			else if (num < second && num != first) {
				second = num;
			}
		}
		System.out.println("Second smallest number is "+second);
	}

}

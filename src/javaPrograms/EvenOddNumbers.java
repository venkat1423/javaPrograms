package javaPrograms;

public class EvenOddNumbers {
	
	public static void main(String[] args) {
		
		int[] arr = { 2, 5, 1, 9, 4, 6};
		
		System.out.print("Even Numbers : ");
		
		for(int num : arr) {
			if(num%2 == 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
		
		System.out.print("Odd Numbers : ");
		for(int num : arr) {
			if(num%2 != 0) {
				System.out.print(num + " ");
			}
		}
	}

}

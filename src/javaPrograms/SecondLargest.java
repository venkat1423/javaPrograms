package javaPrograms;

import java.util.Scanner;

public class SecondLargest {
	
	public static void main(String[] args) {
	/*	
	//	int[] arr = {10, 20, 5, 3, 40, 35};
		
		System.out.print("Enter the number of array elements : ");
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the "+n+ " Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num > first) {
				second = first;
				first = num;
			}
			else if (num > second && num != first) {
				second = num;
			}
		}
		System.out.println("Second largest number is "+second);
		
		*/
		
		System.out.println("Enter the size of array");
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the elements");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
	//	int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		
		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if(num<first) {
				second = first;
				first = num;
			}
			else if(num < second && num != first){
				second = num;
			}
		}
		
		System.out.println("The second largest number is : "+second);
	}

}

package javaPrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
	//	int num = 12;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		boolean isPrime = true;
		
		for (int i = 2; i <= num/2; i++) {
			if(num%i==0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(num+" is Prime? "+ isPrime);
	}

}

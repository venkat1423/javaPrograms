package javaPrograms;

public class Factorial {
	
	public static void main(String[] args) {
		int num=3, fact=1;
		
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial of num "+num+" is "+fact);
	}

}

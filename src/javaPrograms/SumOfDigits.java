package javaPrograms;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		int num = 1253, sum=0;
		System.out.println(num%10);
		System.out.println(num/10);
		
		while (num > 0) {
			sum = sum + num%10;
			num = num / 10;
		}
		
		System.out.println("Sum of digitd is "+sum);
	}

}

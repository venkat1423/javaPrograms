package javaPrograms;

public class Fibonacci {
	
	public static void main(String[] args) {
	/*	int n=10, a=0, b=1;
		System.out.print("Fibonacci series : "+a+" "+b);
		
		for (int i=2; i<=n; i++) {
			int next = a+b;
			System.out.print(" "+next);
			a=b;
			b=next;
			
	}*/
		int n =5, a=0, b=1;
		System.out.print("Fabonacci series : "+a+" "+b);
		
		for (int i = 2; i <= n; i++) {
			int next = a+b;
			System.out.print(" "+next);
			a=b;
			b=next;
		}
		
	}

}

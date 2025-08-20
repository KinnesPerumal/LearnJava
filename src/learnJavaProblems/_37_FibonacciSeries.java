package learnJavaProblems;

import java.util.Scanner;

class fibonacciSeries{
	public void fibonacci(int n) {
		int a=0,b=1,c;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			c= a+b;
			a=b;
			b=c;	
		}
	}
}

public class _37_FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you number: ");
		int n = sc.nextInt();
		fibonacciSeries fib = new fibonacciSeries();
		fib.fibonacci(n);
		sc.close();
	}

}

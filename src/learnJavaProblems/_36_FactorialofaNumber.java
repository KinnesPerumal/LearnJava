package learnJavaProblems;

import java.util.Scanner;

class factorialofNum {
	public int fact(int n) {
		int f = 1;
		int i=1;
		while(i<=n) {
			f = f*i;
			i++;
		}
		return f;
	}
}

public class _36_FactorialofaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the factorial of N value: ");
		int n = sc.nextInt();
		factorialofNum fn = new factorialofNum();
		int output = fn.fact(n);
		System.out.println("Output: "+output);
		sc.close();

	}

}

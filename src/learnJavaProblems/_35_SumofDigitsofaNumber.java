package learnJavaProblems;

import java.util.Scanner;

class SumofDig {
	public int sum(int n) {
		int sum=0;
		while(n>0) {
			int temp = n%10;
			sum = sum+temp;
			n=n/10;
		}
		return sum;
	}
}

public class _35_SumofDigitsofaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		SumofDig sd = new SumofDig();
		int output = sd.sum(n);
		System.out.println("Output: "+output);
		sc.close();
		

	}

}

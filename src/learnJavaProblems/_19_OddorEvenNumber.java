package learnJavaProblems;

import java.util.Scanner;

class oddOrEven {
	public String oddEven(int n) {
		String status="Odd";
		if(n%2==0) {
			status = "Even";
		}
		return status;
	}
}

public class _19_OddorEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		oddOrEven oe = new oddOrEven();
		String status = oe.oddEven(n);
		System.out.println(status);
		

	}

}
	
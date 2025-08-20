package learnJavaProblems;

import java.util.Scanner;

class firstNaturalNum {
	public void natualNum(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
	}
}

public class _34_FirstNNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N valu to print natural Numbers: ");
		int n = sc.nextInt();
		firstNaturalNum fn = new firstNaturalNum();
		fn.natualNum(n);
		sc.close();

	}

}

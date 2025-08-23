package learnJavaProblems;

import java.util.Scanner;

class sumofNumSe {
	public double series(int n) {
		double s = 0.0;
		for(int i=1; i<=n; i++) {
			s = s +1.0/i;
		}
		return s;
	}
}

public class _49_SumofNumberSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sumofNumSe sn = new sumofNumSe();
		double output = sn.series(n);
		System.out.println(output);
		sc.close();

	}

}

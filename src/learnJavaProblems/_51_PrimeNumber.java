package learnJavaProblems;

import java.util.Scanner;

class primeNumber {
	public boolean primeNum(int n) {
		boolean status;
		int f=0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				f++;
			}
		}
		if(f==2) {
			status = true;
		}else {
			status = false;
		}
		return status;
	}
}

public class _51_PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primeNumber pn = new primeNumber();
		System.out.println("Output: "+pn.primeNum(n));
		sc.close();
		

	}

}

package learnJavaProblems;

import java.util.Scanner;

class sumofNum {
	public int sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
}

public class _33_SumofNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N number of value: ");
		int n = sc.nextInt();
		sumofNum sn = new sumofNum();
		int output = sn.sum(n);
		System.out.println("Output: "+output);
		sc.close();
		

	}

}

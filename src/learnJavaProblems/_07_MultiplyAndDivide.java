package learnJavaProblems;

import java.util.Scanner;

class multipleDiv{
	public int mulFun(int N) {
		return N<<1;
	}
	public int divFun(int N) {
		return N>>1;
	}
}

public class _07_MultiplyAndDivide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number N: ");
		int N = sc.nextInt();
		multipleDiv fn = new multipleDiv();
		System.out.println("Output: "+fn.mulFun(N)+","+fn.divFun(N));
	}

}

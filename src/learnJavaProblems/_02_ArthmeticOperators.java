package learnJavaProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class operators {
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public int sub(int n1, int n2) {
		return n1-n2;
	}
	public int mul(int n1, int n2) {
		return n1*n2;
	}
	public int div(int n1, int n2) {
		return n1/n2;
	}
		
}

public class _02_ArthmeticOperators {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input like N1,N2 values: ");
		String[] inputs = sc.nextLine().split(",");
		int n1 = Integer.parseInt(inputs[0]);
		int n2 = Integer.parseInt(inputs[1]);
		operators ad = new operators();
		System.out.println(ad.add(n1, n2));
		System.out.println(ad.sub(n1, n2));
		System.out.println(ad.mul(n1, n2));
		System.out.println(ad.div(n1, n2));
		

	}

}

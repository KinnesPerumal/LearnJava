package learnJavaProblems;

import java.util.Scanner;

public class _08_NumberofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number N: ");
		long N =  sc.nextLong();
		int value = String.valueOf(N).length();
		System.out.println(value);
		
	}

}

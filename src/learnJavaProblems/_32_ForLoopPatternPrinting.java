package learnJavaProblems;

import java.util.Scanner;

public class _32_ForLoopPatternPrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N number of line: ");
		int n = sc.nextInt();
		//for Loop
//		for(int i=0;i<n;i++) {
//			System.out.println("*");
//		}
		//while Loop
		int i =0;
		while(i<n) {
			System.out.println("*");
			i++;
		}
		sc.close();

	}

}

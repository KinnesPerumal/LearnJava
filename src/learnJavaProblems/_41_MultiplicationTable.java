package learnJavaProblems;

import java.util.Scanner;

class multiplicationTbl {
	public void table(int n) {
		for(int i=1; i<=10;i++) {
			System.out.println(i+" X "+n+" = "+i*n);
		}
	}
}

public class _41_MultiplicationTable {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter your multiplication table: ");
		int n = sc.nextInt();
		multiplicationTbl mt = new multiplicationTbl();
		mt.table(n);
		sc.close();
		
	}

}

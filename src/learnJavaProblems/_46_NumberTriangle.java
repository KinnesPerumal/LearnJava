package learnJavaProblems;

import java.util.Scanner;

class numberTriangle {
	public void numTriangle(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=n-i;j++) {
				 	System.out.print(" ");
			}
			for(int k=1; k<=(i*2)-1; k++) {
					System.out.print(i);
			}
			System.out.println();
		}
	}
}
public class _46_NumberTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		numberTriangle nt = new numberTriangle();
		nt.numTriangle(n);
		sc.close();
	}

}

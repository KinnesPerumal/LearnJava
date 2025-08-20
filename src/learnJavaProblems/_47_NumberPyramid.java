package learnJavaProblems;

import java.util.Scanner;

class numberpyramid {
	public void numpPyramid(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			int c=i;
			for(int k=1; k<=i; k++) {
				System.out.print(c+" ");
				c++;
			}
			c=c-2;
			for(int k=1; k<i; k++) {
				System.out.print(c+" ");
				c--;
			}
			System.out.println();	
		}
	}
}
public class _47_NumberPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		numberpyramid nt = new numberpyramid();
		nt.numpPyramid(n);
		sc.close();
	}

}

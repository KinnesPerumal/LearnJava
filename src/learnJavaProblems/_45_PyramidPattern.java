package learnJavaProblems;

import java.util.Scanner;

class pyramidPattern {
	public void pyramid(int r) {
		
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=r-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=(i*2)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

public class _45_PyramidPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		pyramidPattern pp = new pyramidPattern();
		pp.pyramid(r);
		

	}

}

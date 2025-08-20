package learnJavaProblems;

import java.util.Scanner;

class floydsTriangle {
	public void triangle(int r) {
		int value =1;
		for (int i=1; i<=r; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(value++ +" "); 
			}
			System.out.println();
		}
	}
}

public class _43_FloydsTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		floydsTriangle ft = new floydsTriangle();
		ft.triangle(r);
		sc.close();

	}

}

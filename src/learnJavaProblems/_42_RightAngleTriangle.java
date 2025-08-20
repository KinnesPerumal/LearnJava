package learnJavaProblems;

import java.util.Scanner;

class rightAngleTriangle {
	public void triangle(int r) {
		for(int i=1;i<=r;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

public class _42_RightAngleTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number of rows limit: ");
		int r = sc.nextInt();
		rightAngleTriangle ra =new rightAngleTriangle();
		ra.triangle(r);
		sc.close();

	}

}

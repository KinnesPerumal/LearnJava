package learnJavaProblems;

import java.util.Scanner;

class ceilOfNum {
	public int ceilNumber(double n) {
		int ceilNum = (int)Math.ceil(n);
		return ceilNum;
	}
}

public class _17_CeilofANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Decimal Number: ");
		double n = sc.nextDouble();
		ceilOfNum cn = new ceilOfNum();
		System.out.println("Output: "+cn.ceilNumber(n));
		
		

	}

}

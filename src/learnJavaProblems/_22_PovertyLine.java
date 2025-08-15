package learnJavaProblems;

import java.util.Scanner;

class povertyLine {
	public String povertyStatus(int n) {
		String status = "Below Poverty Line";
		if(n>6250) {
			status = "Above Porverty Line";
		}
		return status;
	}
}

public class _22_PovertyLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the indivudal income: ");
		int n = sc.nextInt();
		povertyLine pl = new povertyLine();
		String out = pl.povertyStatus(n);
		System.out.println("Output: "+out);
		sc.close();
		

	}

}

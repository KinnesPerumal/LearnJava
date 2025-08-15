package learnJavaProblems;

import java.util.Scanner;

class votingEligible {
	public String eligiblity(byte a) {
		String status;
		if(a>=18) {
			status = "Eligible";
		}else {
			status = "Non-Eligible";
		}
		return status;
	}
}

public class _15_VotingEligibility {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		byte a = sc.nextByte();
		votingEligible ve = new votingEligible();
		String output = ve.eligiblity(a);
		System.out.println("Output: "+output);
	}

}

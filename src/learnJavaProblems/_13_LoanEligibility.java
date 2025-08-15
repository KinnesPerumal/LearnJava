package learnJavaProblems;

import java.util.Scanner;

class loanEligibity {
	public String eligible(long amount) {
		String sts = "Non-Eligible"; 
		if(amount>=40000) {
			sts = "Eligible";
		}
		return sts;
	}
}

public class _13_LoanEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Loan Amount: ");
		long input = sc.nextInt();
		loanEligibity ln = new loanEligibity();
		String status = ln.eligible(input);
		System.out.println("Output: "+status);
		sc.close();
		
		

	}

}

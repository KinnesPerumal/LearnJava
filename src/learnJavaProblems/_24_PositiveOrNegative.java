package learnJavaProblems;

import java.util.Scanner;

class PositiveorNegative{
	public String posOrNeg(int n) {
		String status = null;
		if(Integer.MAX_VALUE>=n && n>0) {
			status = "Positive";			
		}else if(Integer.MIN_VALUE<n && n<0) {
			status = "Negative";
		}else {
			status = "Neatural";
		}
		return status;
	}
}

public class _24_PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Postive or Negative value: ");
		int n = sc.nextInt();
		PositiveorNegative pn = new PositiveorNegative();
		String status = pn.posOrNeg(n);
		System.out.println("Output: "+status);
		sc.close();
		
		
		
		

	}

}

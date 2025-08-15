package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class taxComp {
	public double netSalary(int B,int T, int H) {
		int G = B+T+H;
		double N;
		N =G-(G*4/100);
		if(G>55000) {
			N =G-(G*8.2/100);				
		}
		return N;
	}
}
public class _16_SalaryAndTaxComputation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Basic Salary, Transport Allowance, House Allowance: ");
		String input = sc.nextLine();
		List<Integer> salaryDtls = Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		taxComp tc = new taxComp();
		double netSalary = tc.netSalary(salaryDtls.get(0), salaryDtls.get(1), salaryDtls.get(2));
		System.out.println("Output: "+netSalary);
		sc.close();

	}

}

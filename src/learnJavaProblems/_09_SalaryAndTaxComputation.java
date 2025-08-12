package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class salaryTaxcomp {
	public double netSalary(int B, int T, int H) {
		int G = B+T+H;
		double netSalary=G;
		
		if(G>55000) {
			netSalary = G-((8.2/100)*G);
		}		
		return netSalary;
		
	}
}

public class _09_SalaryAndTaxComputation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Salary, TransportAllowance, House Allowance: ");
		String inputs = sc.nextLine();
		List<Integer> salary = Arrays.stream(inputs.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		int B = salary.get(0);
		int T = salary.get(1);
		int H = salary.get(2);
		salaryTaxcomp net = new salaryTaxcomp();
		System.out.println("Output: "+net.netSalary(B, T, H));
		sc.close();
		

	}

}

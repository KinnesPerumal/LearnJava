package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class salaryandtx {
	public double salaryTax(double B,double T, double H) {
		double tax=0;
		double G=B+T+H;
		System.out.println("Gross Salary: "+G);
		if(G>5000) {
			tax = 0.3f;
		}else if(1000<G && G<5000) {
			tax = 0.2f;
		}else if(G<1000) {
			tax = 0.1f;
		}
		double N = G-(G*tax);
		return N;
	}
}

public class _25_SalaryAndTaxComputation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the BasicSalary, TransportAllowance, HouseAllowance: ");
		String input = sc.nextLine();
		List<Integer> salary = Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		salaryandtx st = new salaryandtx();
		double netSalary = st.salaryTax(salary.get(0), salary.get(1), salary.get(2));
		System.out.println(netSalary);
		sc.close();

	}

}

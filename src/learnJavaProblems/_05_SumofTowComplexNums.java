package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class sumofComplexnums {
	public void sumofComplex(double r1, double i1, double r2, double i2) {
		double realSum = r1+r2;
		double imagSum = i1+i2;
		System.out.println(realSum+" + "+imagSum+"i");
	}
}

public class _05_SumofTowComplexNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values like R1,I1, R2, I2 : ");
		String input = sc.nextLine();
		List<Double> cn = Arrays.stream(input.split(",")).map(Double::parseDouble).collect(Collectors.toList());
		sumofComplexnums comp = new sumofComplexnums();
		comp.sumofComplex(cn.get(0), cn.get(1), cn.get(2), cn.get(3));
		
		
		
		
	}

}

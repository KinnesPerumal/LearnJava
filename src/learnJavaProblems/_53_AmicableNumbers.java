package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class amicableNumbers {
	public String amicable(int n1, int n2) {
		String status = null;
		int firstSum=0,secondSum=0;
		if(n1==n2) {
			status = "Entered values are same, Please enter differenct numbers";
		}else {
			for(int i=1; i<n1; i++) {
				if(n1%i==0) {
					firstSum+=i;
				}
			}
			for(int i=1; i<n2; i++) {
				if(n2%i==0) {
					secondSum+=i;
				}
			}
			if(n1==secondSum && n2==firstSum) {
				status = "true";
			}else {
				status = "false";
			}
		}

		return status;
	}
}

public class _53_AmicableNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		List<Integer> values = Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		amicableNumbers an = new amicableNumbers();
		String status =  an.amicable(values.get(0), values.get(1));
		System.out.println(status);

	}

}

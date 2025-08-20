package learnJavaProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class gratestComDiv {
	public int divisor(int n1,int n2) {
		int gcd = 0;
		for(int i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0 && n2%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}
}
public class _40_GratestCommonDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n1 and n2 numbers: ");
		String input = sc.nextLine();
		List<Integer> numbers = Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		gratestComDiv gc = new gratestComDiv();
		int output = gc.divisor(numbers.get(0), numbers.get(1));
		System.out.println("Output: "+output);
		sc.close();
	}

}

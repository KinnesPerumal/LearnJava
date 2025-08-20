package learnJavaProblems;

import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class powerofNum {
	public double power(int x,int y) {
		double ans = 0;
		ans = Math.pow(x, y);
		return ans;
	}
}

public class _38_PowerofaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 2 number X to the power of Y: ");
		String input = sc.nextLine();
		List<Integer> values = Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());	
		powerofNum pn = new powerofNum();
		double output = pn.power(values.get(0), values.get(1));
		System.out.println("Output: "+output);
		sc.close();


	}

}

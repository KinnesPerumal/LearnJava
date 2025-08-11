package learnJavaProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class operators {
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public int sub(int n1, int n2) {
		return n1-n2;
	}
	public int mul(int n1, int n2) {
		return n1*n2;
	}
	public int div(int n1, int n2) {
		return n1/n2;
	}
		
}

public class _02_ArthmeticOperators {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input like N1,N2 values: ");
//		String[] inputs = sc.nextLine().split(",");
//		int n1 = Integer.parseInt(inputs[0]);
//		int n2 = Integer.parseInt(inputs[1]);
		String inputs = sc.nextLine();
		List<Integer> list = Arrays.stream(inputs.split(",")).map(Integer::parseInt).collect(Collectors.toList());
//		System.out.println(list);
		int n1=list.get(0);
		int n2=list.get(1);
		operators ad = new operators();
		int sum = ad.add(n1, n2);
		int dif = ad.sub(n1, n2);
		int pro = ad.mul(n1, n2);
		int quo = ad.div(n1, n2);
		System.out.println(sum+" "+dif+" "+pro+" "+quo);
		
		

	}

}

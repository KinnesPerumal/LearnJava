package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class swapNumbers {
	public String swap(int n1,int n2) {
//		n1 = n1+n2;
//		n2 = n1-n2;
//		n1 = n1-n2;
		n1 = n1^n2;
		n2 = n1^n2;
		n1 = n1^n2;
		return n1+","+n2;
			
		
	}
}

public class _06_SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N1 and N2 values: ");
		String input = sc.nextLine();
		List<Integer> values = Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		System.out.println(values);
		swapNumbers swp = new swapNumbers();
		String swapped = swp.swap(values.get(0), values.get(1));
		System.out.println(swapped);
		
		

		
		
	}

}

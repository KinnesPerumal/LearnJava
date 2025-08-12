package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class multipleofNum{
	public String mulNum(int n,int m) {
		String msg = "Is Not Multiple";
		if(n%m==0) {
			msg="Is a Multiple";
		}
		return msg;
	}
}

public class _12_MultipleOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String input = sc.nextLine();
		List<Integer> numbers = Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		multipleofNum mn = new multipleofNum();
		String output = mn.mulNum(numbers.get(0), numbers.get(1));
		System.out.println(output);

	}

}

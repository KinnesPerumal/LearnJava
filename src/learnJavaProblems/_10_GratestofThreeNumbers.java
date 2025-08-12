package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class gratestThreeNums {
	public int gratestNum(int N1,int N2,int N3) {
		int gnum = 0;
		if(N1>N2 && N1>N3) {
			//10,30,20
			gnum=N1;
		}else if(N2>N1 && N2>N3) {
			gnum=N2;
		}else {
			gnum=N3;
		}
		return gnum;
	}
}

public class _10_GratestofThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Three Numbers: ");
		String input = sc.nextLine();
		List<Integer> numbers = Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		gratestThreeNums gn = new gratestThreeNums();
		int gratestNum = gn.gratestNum(numbers.get(0), numbers.get(1), numbers.get(2));
		System.out.println("Output: "+gratestNum);
		

	}

}

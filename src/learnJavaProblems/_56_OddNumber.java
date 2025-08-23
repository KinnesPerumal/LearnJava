package learnJavaProblems;

import java.util.Arrays;
import java.util.Scanner;

class oddNumber {
	public int oddCount(int [] n) {
		int oddCount=0;
		for(int i=0; i<n.length; i++) {
			if(n[i]%2 !=0) {
				oddCount++;
			}
		}
		return oddCount;
	}
}

public class _56_OddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int [] numbers = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
		oddNumber on = new oddNumber();
		System.out.println("Output: "+on.oddCount(numbers));
		sc.close();

	}

}

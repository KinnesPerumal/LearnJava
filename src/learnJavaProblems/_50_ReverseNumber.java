package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class reverseNumber {
	public int reverse(int n) {
		int reverseNumber = 0;
		while(n!=0) {
			int lastDigit = n%10;
			reverseNumber = reverseNumber*10+lastDigit;
			n=n/10;
		}
		return reverseNumber;
		
		 
		
	}
}

public class _50_ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine	();
		List<Integer> values = Arrays.stream(n.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		reverseNumber rn = new reverseNumber();
		int reversed = rn.reverse(values.get(0));
		System.out.println("Output: "+reversed);
		sc.close();
		
				

	}

}

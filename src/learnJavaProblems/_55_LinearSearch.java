package learnJavaProblems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class linearSearch {
	public boolean search(int n, int s, int [] arr ) {
		int checkvalue;
		for(int i=0; i<n; i++) {
			checkvalue = arr[i];
			if(s==checkvalue) {
				return true;
			}
		}
		return false;
	}
}

public class _55_LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter NumberofElements N, FindElement S, Array of numbers: ");
		String input = sc.nextLine();
		//N - number of elements, S-find value,A-array of number
		String [] numbers = input.trim().split("#");
		int numberofElements = Integer.parseInt(numbers[0]);
		int findNumber = Integer.parseInt(numbers[1]);
		int [] arrayNums = Arrays.stream(numbers[2].split(",")).mapToInt(Integer::parseInt).toArray();
		linearSearch ls = new linearSearch();
		boolean output = ls.search(numberofElements, findNumber, arrayNums);
		System.out.println(output);
		sc.close();
	}

}

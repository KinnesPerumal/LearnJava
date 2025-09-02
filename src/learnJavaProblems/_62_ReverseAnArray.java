package learnJavaProblems;

import java.util.Arrays;
import java.util.Scanner;

class reverseArray {
	public int[] reverse(int[] array) {
		int[] reverseArray = new int[array.length];
		int arrLen =0;
		for(int i=array.length-1; i>=0; i--) {
			reverseArray[arrLen]=array[i];
			arrLen+=1;
		}
		return reverseArray;
	}
}

public class _62_ReverseAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int [] array = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
		reverseArray ra = new reverseArray();
		System.out.println(Arrays.toString(ra.reverse(array)));
	}

}

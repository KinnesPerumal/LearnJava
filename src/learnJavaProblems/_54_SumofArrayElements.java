package learnJavaProblems;

import java.util.Scanner;

class sumofarrayElements {
	public int sumArray(int[] numbers) {
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			sum+=numbers[i];
		}
		return sum;
	}
}

public class _54_SumofArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] splittedArray = input.split(",");
		int [] 	numbers = new int[splittedArray.length];
		for(int i=0; i<splittedArray.length; i++) {
			numbers[i]= Integer.parseInt(splittedArray[i]);
		}
		sumofarrayElements sumArr = new  sumofarrayElements();
		System.out.println("Sum: "+sumArr.sumArray(numbers));
		
		
		

	}

}

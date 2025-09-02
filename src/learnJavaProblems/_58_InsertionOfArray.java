package learnJavaProblems;

import java.util.Arrays;
import java.util.Scanner;

class insertionofArray {
	public String insertion(int newelement, int index, int[] arrayElements) {
		int[] tempArray = arrayElements;
		int[] insertArray = new int[tempArray.length+1];
		int tempArrayIndex=0;
		int newArrayIndex=0;
								//3
		while(tempArrayIndex<=index) {
			insertArray[newArrayIndex] = tempArray[tempArrayIndex];
			tempArrayIndex++;
			newArrayIndex++;
		}
		insertArray[newArrayIndex]=newelement;
		newArrayIndex++;
		
		while(newArrayIndex<insertArray.length) {
			insertArray[newArrayIndex]=tempArray[tempArrayIndex];
			tempArrayIndex++;
			newArrayIndex++;
		}
		return Arrays.toString(insertArray);
		
	}
}

public class _58_InsertionOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] values = input.split("#");
		int newElement = Integer.parseInt(values[0]);
		int indexofArray = Integer.parseInt(values[1]);
		int [] arrayElements = Arrays.stream(values[2].trim().split(",")).mapToInt(Integer::parseInt).toArray();
		insertionofArray ia = new insertionofArray();
		String output = ia.insertion(newElement, indexofArray, arrayElements);
		System.out.println("Output: "+output);
		sc.close();
		
		
		
		
		

	}

}

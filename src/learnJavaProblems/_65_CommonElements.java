package learnJavaProblems;

import java.util.Arrays;
import java.util.Scanner;

class commonElements {
	public int commonValue(int[] a1, int[] a2) {
		int commonValue =0;
		for(int i=0;i<a1.length; i++) {
			for(int j=0; j<a2.length; j++) {
				if(a1[i]==a2[j]) {
					commonValue++;
				}
				
			}
		}
		return commonValue;
	}
}

public class _65_CommonElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] splitArray = input.split("#");
		int[] array1 = Arrays.stream(splitArray[0].split(",")).mapToInt(Integer::parseInt).toArray();
		int[] array2 = Arrays.stream(splitArray[1].split(",")).mapToInt(Integer::parseInt).toArray();
		commonElements ce = new commonElements();
		System.out.println(ce.commonValue(array1, array2));
		sc.close();
		
		

	}

}

package learnJavaProblems;

import java.util.Arrays;
import java.util.Scanner;

class mergeTwoArrays {
	public int[] mergedArray(int[] a1, int[] a2) {
		int[] mergeArray = new int[a1.length+a2.length];
		int sourceIndex= 0;
		int mergeIndex = 0;
		while(sourceIndex<a1.length) {
			mergeArray[mergeIndex]=a1[sourceIndex];
			mergeIndex+=1;
			mergeArray[mergeIndex]=a2[sourceIndex];
			mergeIndex+=1;
			sourceIndex+=1;
		}
//		int len = mergeArray.length-1;
//		for(int i=0; i<a1.length; i++) {
//			mergeArray[i] = a1[i];
//		}
//		for(int i=0; i<a2.length; i++) {
//			mergeArray[len]=a2[i];
//			len--;
//		}
//		Arrays.sort(mergeArray);
		return mergeArray;
	}
}

public class _61_MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] values = input.split("#");
		int[] a1 = Arrays.stream(values[0].split(",")).mapToInt(Integer::parseInt).toArray();
		int[] a2 = Arrays.stream(values[1].split(",")).mapToInt(Integer::parseInt).toArray();
		mergeTwoArrays ma = new mergeTwoArrays();
		System.out.println(Arrays.toString(ma.mergedArray(a1, a2)));
		

	}

}

package learnJavaProblems;

import java.util.Arrays;
import java.util.Scanner;

class segregateNums {
	public String rearrange(int[] a) {
		int [] arrayValues = a;
		int [] rearranged = new int[arrayValues.length];
		int leftArray =0;
		int n=rearranged.length;
		for(int i=0; i<arrayValues.length; i++) {
			if(arrayValues[i]==1) {
				rearranged[leftArray]=arrayValues[i];
				leftArray++;
			}else if(arrayValues[i]==0) {
				n=n-1;
				rearranged[n]=arrayValues[i];
			}
		}
		return Arrays.toString(rearranged);
	}
}

public class _57_Segregate0and1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] numbers = input.split(",");
		int[] arrayNums = new int[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			arrayNums[i]= Integer.parseInt(numbers[i]);
		}
		segregateNums sn = new segregateNums();
		System.out.println(sn.rearrange(arrayNums));
		sc.close();

	}

}

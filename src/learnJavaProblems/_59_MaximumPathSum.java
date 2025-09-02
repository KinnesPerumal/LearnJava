package learnJavaProblems;

import java.util.Arrays;
import java.util.Scanner;

class maximumPathSum {/*4,5,6
						6,2,8
						8,2,5  */
	public int maxSum(int[][] matrix) {
		int maxSum=0;
		for(int i=0;i<matrix.length; i++) {
			int x=0;
			int y=i;
			int diagonalSum=0;
			for(int j=i; j<matrix.length; j++) {
				diagonalSum+=matrix[x][y];
				x++;
				y++;
				if(diagonalSum>maxSum) {
					maxSum=diagonalSum;
				}
			}	
		}
		for(int i=1;i<matrix.length; i++) {
			int x=i;
			int y=0;
			int diagonalSum=0;
			for(int j=i; j<matrix.length; j++) {
				diagonalSum+=matrix[x][y];
				x++;
				y++;
				if(diagonalSum>maxSum) {
					maxSum=diagonalSum;
				}
			}
		}
		return maxSum;
	}
}

public class _59_MaximumPathSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] splitArray = input.split("#");
		int [][]  matrix = new int[splitArray.length][splitArray.length];
		for(int i=0; i<splitArray.length; i++) {
			String [] row = splitArray[i].split(",");
			for(int j=0; j<row.length; j++) {
				matrix[i][j] = Integer.parseInt(row[j]);
			}
		}
		maximumPathSum mx = new maximumPathSum();
		System.out.println(mx.maxSum(matrix));
		
	}

}

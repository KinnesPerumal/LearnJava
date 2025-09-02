package learnJavaProblems;

import java.util.Arrays;
import java.util.Scanner;

class matrixMultiplication {
	/*	[1, 1, 1]   	[1, 1, 1]
		[2, 2, 2]		[2, 2, 2]
		[3, 3, 3]		[3, 3, 3]
	 */
	public int[][] matrixMul(int n, int[][] matrix1, int[][] matrix2) {
		int[][] matrix = new int[n][n];
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix1.length; j++) {
				for(int k=0; k<n; k++) {
					matrix[i][j] += matrix1[i][k]*matrix2[k][i];
				}
				
			}
		}
//		System.out.println(Arrays.deepToString(matrix));
		return matrix;
	}
}

public class _60_MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String [] values = input.split("@");
		
		int n = Integer.parseInt(values[0]);
	
		String[] m1values = values[1].split("#");
		int[][] matrix1 = new int[n][n];
		for(int i=0; i<n; i++) {
			String[] row = m1values[i].split(",");
			for(int j=0; j<n; j++) {
				matrix1[i][j] = Integer.parseInt(row[j]); 
			}
		}
		
		String[] m2values = values[2].split("#");
		int[][] matrix2 = new int[n][n];
		for(int i=0; i<n; i++) {
			String[] row = m2values[i].split(",");
			for(int j=0; j<n; j++) {
				matrix2[i][j] = Integer.parseInt(row[j]); 
			}
		}
		matrixMultiplication mmul = new matrixMultiplication();
		System.out.println(Arrays.deepToString(mmul.matrixMul(n, matrix1, matrix2)));;
	}

}

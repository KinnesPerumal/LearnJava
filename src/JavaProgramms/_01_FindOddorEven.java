package JavaProgramms;

import java.util.Scanner;

public class _01_FindOddorEven {

	public static void main(String[] args) {
		//Java program to Find Odd or Even number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any valid number: ");
		int value = sc.nextInt();
		
		if(value%2==0) {
			System.out.println(value+" is Even");
		}else {
			System.out.println(value+" is odd");
		}
		sc.close();

	}

}

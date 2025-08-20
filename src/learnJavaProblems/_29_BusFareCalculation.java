package learnJavaProblems;

import java.util.Scanner;


class BusFareCal {
	public int calculation(int k) {
		int amount = 0;	
		if(k<5) {
			amount = 1;
		}else if(k>=5 && k<10) {
			amount = 2;
		}else if(k>=10 && k<30) {
			amount = 5;
		}else if(k>=30 && k<50) {
			amount = 8;
		}else if(k>=50 && k<80) {
			amount = 15;
		}else if(k>=80 && k<=100) {
			amount = 30;
		}
		return amount;
	}
}

public class _29_BusFareCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your KM b/w 1 to 100: ");
		int k = sc.nextInt();
		BusFareCal bf = new BusFareCal();
		int amount = bf.calculation(k);
		System.out.println("Output: $"+amount);
		
		sc.close();
	}
}

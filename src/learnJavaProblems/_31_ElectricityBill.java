package learnJavaProblems;

import java.util.Scanner;

class electricityBill {
	public float billAmount(int unit) {
		float amount = 0;
		if(unit>=1 && unit<=25 ) {
			amount = unit*1.25f;
		}else if(unit>=26 && unit<=50) {
			amount = unit*1.45f;
		}else if(unit>=51 && unit<=75) {
			amount = unit*1.65f;
		}else if(unit>=76 && unit<=95) {
			amount = unit*1.95f;
		}else {
			amount = unit*2.00f;
		}
		return amount;
	}
}
public class _31_ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your meetred Units:");
		int input = sc.nextInt();
		electricityBill eb= new electricityBill();
		float output = eb.billAmount(input);
		System.out.println("Output: $"+output);
		sc.close();
		
	}

}

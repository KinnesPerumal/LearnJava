package learnJavaProblems;

import java.util.Scanner;

class leapYear {
	public boolean leapYr(int y) {
		boolean status;
		if(y%4==0 && y%100 !=0 || y%400==0) {
			status = true;
		}else {
			status = false;
		}
	
		return status;
	}
}

public class _26_LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Year: ");
		int y = sc.nextInt();
		leapYear ly = new leapYear();
		boolean status = ly.leapYr(y);
		System.out.println("Output: "+status);
		sc.close();
		

	}

}

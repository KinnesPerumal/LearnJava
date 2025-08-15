package learnJavaProblems;

import java.util.Scanner;

class mobileNumVal {
	public boolean mblVal(String n) {
		boolean status = false;
		if(n.length()==10) {
			status =true;
			
		}
		return status;
		
	}
}

public class _14_MobileNumberValiditity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine().trim();
		mobileNumVal mv = new mobileNumVal();
		boolean status = mv.mblVal(n);
		System.out.println(status);

	}

}

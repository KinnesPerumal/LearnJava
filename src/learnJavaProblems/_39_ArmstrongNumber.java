package learnJavaProblems;

import java.util.Scanner;

class armstrongNum {
	public boolean armStrong(int n) {
		boolean status=false;
		int sum=0,originalValue=n;
		while(n!=0) {
			int digit = n%10;
			sum+=digit*digit*digit;
			n/=10;
		}
		if(sum==originalValue) {
			status = true;
		}
		return status;
	}
}

public class _39_ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		armstrongNum an = new armstrongNum();
		boolean output = an.armStrong(n);
		System.out.println("Output: "+output);
		sc.close();

	}

}

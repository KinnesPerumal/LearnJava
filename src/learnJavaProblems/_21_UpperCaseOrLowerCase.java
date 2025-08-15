package learnJavaProblems;

import java.util.Scanner;

class UpperOrLower {
	public String caseLowerOrUpper(char a) {
		String letter = "Enter a single Letter";
		if(Character.isUpperCase(a)) {
			letter="UpperCase";
		}else if(Character.isLowerCase(a)) {
			letter="LowerCase"; 
		}
		return letter;
	}
}

public class _21_UpperCaseOrLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a single letter: ");
		char a = sc.next().charAt(0);
		UpperOrLower ul = new UpperOrLower();
		String output =ul.caseLowerOrUpper(a);
		System.out.println("Output: "+output);

	}

}

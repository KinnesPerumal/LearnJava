package learnJavaProblems;

import java.util.Scanner;

class bonusComp {
	public String bonus(String index) {
		String amount= "NA";
		if(index.contains("a")) {
			amount = "$5000";
		}else if(index.contains("b")) {
			amount = "$4500";
		}else if(index.contains("c")) {
			amount = "$3000";
		}else if(index.contains("d")) {
			amount = "$1500";
		}else if(index.contains("e")) {
			amount = "$500";
		}
		return amount;
	}
}

public class _30_BonusComputation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Performance Index A to E: ");
		String index = sc.next().toLowerCase();
		bonusComp bc = new bonusComp();
		String output = bc.bonus(index);
		System.out.println("Output: "+output);
		sc.close();

	}

}

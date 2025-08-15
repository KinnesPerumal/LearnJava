package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class coinChange {			//4     					12     			21
	public void exactChange(int fiveAvailable, int oneAvailable, int amount) {
		int totalFive = amount/5;
		int totalOne = amount - totalFive*5;
		if(fiveAvailable<=totalFive) {
			if(oneAvailable>=totalOne) {
				System.out.println(totalOne+" and "+totalFive);
			}else {
				System.out.println("NP");
			}
		}
		
		
		
	}
}

public class _18_CoinChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		List<Integer> coins = Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		coinChange cc = new coinChange();
		cc.exactChange(coins.get(0), coins.get(1), coins.get(2));
		
		
	}

}

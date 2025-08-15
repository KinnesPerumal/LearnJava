package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class profitandLoss{
	public String profitandloss(int cp,int sp) {
		String status=null;
		if(sp>cp) {
			status = "Profit";
		}else if(sp<cp) {
			status = "Loss";
		}
		else {
			status = "No Profit and No loss";
		}
		return status;
	}
}

public class _23_PorfitAndLoss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the CostPrice and SellingPrice: ");
		String input = sc.nextLine();
		List<Integer> price = Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		profitandLoss pl = new profitandLoss();
		String output = pl.profitandloss(price.get(0), price.get(1));
		System.out.println("Output: "+output);
		sc.close();
		
	}

}

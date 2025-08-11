package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class addressPrint {
	public void print(String X,long M,String A, int I,double BillAmount) {
		System.out.println("Name : "+X+" , Mobile : "+M+" , Address : "+A+" , Items : "+I+" , Bill Amount : $"+BillAmount);
	}
	public int billAmount(int I, float C) {
		return (int) (I*C);	
	}
}

public class _04_AddressPrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the NameoftheCustomer, MobileNo,Address,Items,Cost: ");
		String billDetails = sc.nextLine();
		List<String> list = Arrays.stream(billDetails.split(",")).collect(Collectors.toList());
//		System.out.println(list);
		String CustomerName = list.get(0);
		long mobileNumber = Long.parseLong(list.get(1));
		String Address = list.get(2);
		int items = Integer.parseInt(list.get(3));
		float cost = Integer.parseInt(list.get(4));
		addressPrint ap = new addressPrint();
		double billAmount = ap.billAmount(items, cost);
		ap.print(CustomerName, mobileNumber, Address, items, billAmount);
		sc.close();
		
		
	}

}

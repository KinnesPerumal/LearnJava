package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class printingAddress {
	
	public void ptrAddress(String H,String S, String C) {
//		System.out.println("House Number : "+H+" Street Name : "+S+" City : "+C);
		System.out.println("House Number: "+H);
		System.out.println("Street Name : "+S);
		System.out.println("City : "+C);
		
	}
	
}

public class _03_PrintingAddress {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Address HouseNumber,StreetName,City: ");
		String inputs = sc.nextLine();
		List<String> address = Arrays.stream(inputs.split(",")).collect(Collectors.toList());
//		System.out.println(Address);
		String houseNumber = address.get(0);
		String streetName = address.get(1);
		String city = address.get(2);
		printingAddress pa = new printingAddress();
		pa.ptrAddress(houseNumber, streetName, city);
		
		
	}

}

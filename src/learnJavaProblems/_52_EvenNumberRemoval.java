package learnJavaProblems;

import java.util.Scanner;

class evenNumberRemoval {
	public String evenNumRemove(String n) {
		
		if(Integer.parseInt(n)%2==0) {
			return "0";
		}
		else {
			StringBuilder numbers = new StringBuilder();
			numbers.append(n);
			
			for(int i=0; i<numbers.length(); i++) {
			
				if((int)numbers.charAt(i)%2==0) {
					numbers.deleteCharAt(i);
				}
			}
			return numbers.toString();
		}
		
	}
}

public class _52_EvenNumberRemoval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		evenNumberRemoval er = new evenNumberRemoval();
		System.out.println(er.evenNumRemove(n));
		sc.close();

	}

}

package learnJavaProblems;

import java.util.Arrays;
import java.util.Scanner;

class contiguousArray {
	public void contiguous(char[] chars) {
		int maxlen =0;
		//a,b,a
		for(int start=0; start<chars.length; start++) {
			int aCount=0, bCount=0;
			for(int end=start; end<chars.length; end++) {
			
				//l1-end=0;1<3;
				//l2-end=1;1<3;
				//l3-end=2;2<3;
				
				if(chars[end]=='b') {
					bCount++;
				}else {
					aCount++;
				}
				//l2-1==1
				if(aCount==bCount) {   //0	  //2- //1
					maxlen = Math.max(maxlen, end-start+1);//0
				}
			}
		}
		System.out.println(maxlen);
	}
}

public class _63_ContiguousArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] chars = input.toCharArray();
		contiguousArray ca = new contiguousArray();
		ca.contiguous(chars);

	}

}

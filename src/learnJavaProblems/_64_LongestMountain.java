package learnJavaProblems;

import java.util.Arrays;
import java.util.Scanner;

class longestMountain {
	//1,2,3,4,2,1,0,1,2,1 
	public void mountainLength(int[] nums) {
		int i=0;//6
		int maxLen=0;
		while(i<nums.length-1) {
			int higher=0;//3
			int lower=0;//3
			int len=0;
			while(i<nums.length-1 && nums[i]<nums[i+1]) {
				higher++;
				i++;
			}
			while(i<nums.length-1 && nums[i]>nums[i+1]) {
				lower++;
				i++;
			}
			len=(higher+lower)+1;
			maxLen = Math.max(maxLen, len);	
		}
		System.out.println(maxLen);
		


	}
}

public class _64_LongestMountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int [] nums = Arrays.stream(input.trim().split(",")).mapToInt(Integer::parseInt).toArray();
		longestMountain lm = new longestMountain();
		lm.mountainLength(nums);
		sc.close();

	}

}

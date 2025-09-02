package arraysCompare;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysString implements Comparator {

	public static void main(String[] args) {
		
		String[] names = {"Kinnes","Bavya","Rajamani","Perumal","Sharmila","Suganthan"};
//		Arrays.sort(names);
		ArraysString as = new ArraysString();
		Arrays.sort(names, as);
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}

	}

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
//		int result = s1.compareTo(s2);
		//using length
		if(s1.length()>s2.length()) {
			return -1;
		}
		else if(s1.length()<s2.length()) {
			return 1;
		}
		else {
			return 0;
		}
		
		//using result - assending and decending 
		
		/*
		 * if(result>0) { return -1; } else if(result<0) { return 1; } else { return 0;
		 * }
		 */
	}

}

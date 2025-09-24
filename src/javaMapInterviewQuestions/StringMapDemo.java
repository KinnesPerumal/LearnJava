package javaMapInterviewQuestions;

import java.util.HashMap;

public class StringMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Kinnessharmi";
		char[] charArray = s.toCharArray();
		HashMap<Character, Integer> charCountMap = new HashMap();
		
		for(char c:charArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			}else {
				charCountMap.put(c, 1);
			}
		}
		System.out.println(charCountMap);
	}

}

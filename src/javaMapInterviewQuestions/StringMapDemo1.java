package javaMapInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringMapDemo1 {

	public static void main(String[] args) {

		StringMapDemo1 ob = new StringMapDemo1();
		ob.countEachChar();
		ob.countEachWord();

	}

	private void countEachWord() {
		//count of each word
		String sInput = "kinnes Ajay Bavya kinnes";
		String[] strArray = sInput.split(" ");
		HashMap<String, Integer> hm = new HashMap();
		for(String s:strArray) {
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}else {
				hm.put(s, 1);
			}
		}
		System.out.println(hm);
		Set<Map.Entry<String, Integer>> me = hm.entrySet();
		for(Map.Entry<String, Integer> entry:me) {
			if(entry.getValue()>1)
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		 
	}

	private void countEachChar() {
		//count of each character
		String s = "vishalsubburam";
		char[] charArray = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap();
		for(char c:charArray) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);

		Set<Map.Entry<Character, Integer>> es = hm.entrySet();
		for(Map.Entry<Character, Integer> entry:es) {
			//if you want to print duplicate values
			//					if(entry.getValue()==1)
			//if your want to print no duplicate elemetnt
			if(entry.getValue()==1)
				System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}

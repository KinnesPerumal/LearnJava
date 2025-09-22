package javaCollections;

import java.util.ArrayList;

public class _01_List {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add(100);
		l.add("200");
		l.add(300);
		System.out.println(l);
		System.out.println(l.remove("200"));
		System.out.println(l);
		
		ArrayList l2 = new ArrayList();
		l2.add(999);
		l2.add(888);
		l2.add(777);
		System.out.println(l2);
		l2.addAll(l);
		System.out.println(l2);
//		l2.removeAll(l);
		l2.retainAll(l);
//		System.out.println(l2);
		
		/*
		 * ArrayList l = new ArrayList(); l.add(10); l.add(20); l.add(30);
		 * l.add("Kinnes"); l.add(4.5f); l.add(2,"Bavya"); l.add(true);
		 * 
		 * System.out.println(l); l.add(1,"suganthan"); System.out.println(l);
		 * System.out.println(l.get(1)); System.out.println(l.indexOf("suganthan"));
		 * l.add("suganthan"); System.out.println(l);
		 * System.out.println("first index of sugantahn: "+l.indexOf("suganthan"));
		 * System.out.println("Last index of suganthhan: "+l.lastIndexOf("suganthan"));
		 * 
		 * l.remove(0); System.out.println(l); System.out.println(l.remove("Kinnes"));
		 * System.out.println(l); System.out.println(l.remove("suganthan"));
		 * System.out.println(l);
		 */
		
		
		/*
		 * System.out.println(l.size()); System.out.println(l.contains("Kinnes"));
		 * 
		 * ArrayList l2 = new ArrayList();
		 * System.out.println("L2 is empty?: "+l2.isEmpty()); System.out.println(l2);
		 * l2.add(100); l2.add(20); l2.addAll(0,l);
		 * System.out.println("L2 is empty?: "+l2.isEmpty()); System.out.println(l2);
		 * l2.clear(); System.out.println(l2);
		 */
		

	}

}

package javaCollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(5);
		al.add(40);
		al.add(20);
		al.add("Bavya");
		al.add(true);
		al.add("c");
		/*
		 * System.out.println(al); System.out.println(al.add(50));
		 * System.out.println(al.add("Kinnes")); System.out.println(al);
		 * System.out.println(al.size()); al.add(5,"Ajay"); System.out.println(al);
		 * System.out.println(al.remove(5)); System.out.println(al);
		 * System.out.println(al.contains("Kinnes")); System.out.println(al.get(0));
		 * System.out.println(al.get(5)); System.out.println(al.set(5, "abc"));
		 * System.out.println(al); System.out.println(al.indexOf("Kinnes"));
		 */
		System.out.println("al list is--> "+al);
		ArrayList al2 = new ArrayList();
		al2.addAll(al);
		System.out.println("al2 list is--> "+al2);
		ArrayList al3 = new ArrayList();
		al3.add("Salem");
		al3.add("Chennai");
		al3.add("Trichy");
		al3.add("Chennai");
		al3.add("Madurai");
//		al3.add("Chennai");
		System.out.println("al3 list is--> "+al3);
		System.out.println("Index of Chennai--> "+al3.indexOf("Chennai"));
		System.out.println("Last Index of Chennai--> "+al3.lastIndexOf("Chennai"));
		
		
		al3.addAll(3, al);
		System.out.println("al3 new list->> "+al3);
		al3.removeAll(al);
		System.out.println("al3 after removeAll()--> "+al3);
		List al4 = al2.subList(0, 4);
		System.out.println("al4 list--> "+al);
		System.out.println(al.isEmpty()); 
		
		
		
	}

}

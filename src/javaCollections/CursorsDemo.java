package javaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorsDemo {

	public static void main(String[] args) {
		
		ArrayList names = new ArrayList();
		names.add("Kinnes");
		names.add("Bavya");
		names.add("Sharmi");
		names.add(1);
		System.out.println("Before "+names);
		//use for each
		//cannot convert from element type Object to String
//		for(Object name:names) {
//			System.out.println(name);
//		}
		//only forwared direction
		//cannot modify the contains of the collectoin
		
		Iterator i = names.iterator();
		while(i.hasNext()) {
			if(i.next().equals("Kinnes")) {
				i.remove();
			}
//			System.out.println(i.next());
		}
		System.out.println("After "+names);
		
		ListIterator li = names.listIterator();
		li.add("Ajay");
		while(li.hasNext()) {
			if(li.next().equals(1)) {
				li.set(100);
			}
		}
		
		System.out.println("after list Iterator "+names);
		
	}

}

package javaCollections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add("Kinnes");
		System.out.println(ll);
		ll.offerFirst(100);
		System.out.println("offer-> "+ll);
		ll.addFirst("ajay");
		System.out.println("After Add First-> "+ll);
		ll.addLast("bavya");
		System.out.println("After Add Last-> "+ll);
//		ll.poll(); - defaulty remove first
		ll.pollFirst();
		System.out.println("Poll first-> "+ll);
		ll.pollLast();
		System.out.println("Poll last-> "+ll);
//		ll.remove();-//remove first 
		ll.removeFirst();
		System.out.println("remove first-> "+ll);
		ll.removeLast();
		System.out.println("remove last-> "+ll);
		
		LinkedList ll2 = (LinkedList)(ll.clone());
		System.out.println("ll2 list-> "+ll2);
	}

}

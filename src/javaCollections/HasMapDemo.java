package javaCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HasMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		hm.put("Kinnes", 25);
		hm.put("Bavya", 20);
		hm.put("Sharmila", 23);
		hm.put("Suganthan", 1);
		System.out.println(hm);
		Set keys = hm.keySet();
		System.out.println("Keys are "+keys);
		Collection values = hm.values();
		System.out.println("Values are "+values);
		Set entrys = hm.entrySet();
		System.out.println("Entries are "+entrys);
		
		
		
	}

}

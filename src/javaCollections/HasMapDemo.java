package javaCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		hm.put("Kinnes", 25);
		hm.put("Bavya", 20);
		hm.put("Sharmila", 23);
		hm.put("Suganthan", 1);
//		System.out.println(hm);
		Set keys = hm.keySet();
//		System.out.println("Keys are "+keys);
		Collection values = hm.values();
//		System.out.println("Values are "+values);
		Set entrys = hm.entrySet();
//		System.out.println("Entries are "+entrys);
		
		Iterator i = entrys.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next(); // do type casting Map.Entry to acces key and values
//			System.out.println(i.next()); //normaly print all key and values
//			System.out.println(me.getKey()+" : "+me.getValue());
			if(me.getKey().equals("Kinnes")) {
				me.setValue(26);
			}
			System.out.println(me);
//			System.out.println(me.getKey()+" : "+me.getValue());
			
			
		}
		
		
		
		
	}

}

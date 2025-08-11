package javaProgramms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		// Map interface in Java
//		Map<String, Integer> m = new TreeMap<>();//Shorter list
		Map<String, Integer> m = new HashMap<>();
//		Map<String, Integer> m = new Hashtable<>();
		m.put("Kinnes", 80);
		m.put("Bhavya", 90);
		m.put("Sharmi", 75);
		m.put("Suganthan", 100);
		System.out.println(m);
		
		System.out.println(m.replace("Kinnes", 35));
		System.out.println(m.size());
		System.out.println(m.get("Bhavya"));
		System.out.println(m.containsKey("Sharmi"));
		System.out.println(m.containsValue(100));
//		System.out.println(m.remove("Kinnes"));
		System.out.println(m.keySet());
		for(String key:m.keySet()) {
			System.out.println(key);
		}
		System.out.println(m.values());
		for(Integer value:m.values()) {
			System.out.println(value);
		}
		
		System.out.println(m);

	}

}

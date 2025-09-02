package javaCollections;

import java.util.ArrayList;
import java.util.List;

public class _02_Set {

	public static void main(String[] args) {
		
		_02_Set cl = new _02_Set();
//		cl.
		
		
		
		ArrayList l = new ArrayList();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		System.out.println(l);
//		System.out.println(l.remove(1));
		
//		List li= l.subList(2, 4);
		List li = l.subList(3, 3);//empty print
		System.out.println(li);
		
		System.out.println(l.set( 1, 2000));
		System.out.println(l);

	}

}

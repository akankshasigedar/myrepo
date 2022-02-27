package collection;

import java.util.HashSet;

import java.util.Iterator;

public class HashTest {

	public static void main(String[] args) {

		HashSet<String> s = new HashSet<String>();

		s.add("link");
		s.add("vector");
		s.add("set");
		s.add("null");
		s.add("hash");
		s.add("map");
		s.add("array");

		System.out.println(s);
		System.out.println("--------------------------------------------");
		Iterator<String> i = s.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("--------------------------------------------");

		for (String d : s) {
			System.out.println(d);
		}

		System.out.println("--------------------------------------------");
		s.remove("null");
		System.out.println("after removing null" + s);

	
	s.contains(null);
	System.out.println(s);
	}
}


/*
 * output [set, null, array, link, vector, map, hash]
 * -------------------------------------------- set null array link vector map
 * hash -------------------------------------------- set null array link vector
 * map hash -------------------------------------------- after removing
 * null[set, array, link, vector, map, hash] [set, array, link, vector, map,
 * hash]
 */
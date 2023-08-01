package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {
	public static void main(String[] args) {
		Set<Object> s = new TreeSet<>();
		s.add(10);
		s.add(20);
	//	s.add("import");
		s.add(40);
	//	s.add(true);
		s.add(30);
		s.add(30);
		//s.add(null);
		System.out.println(s);
		int size = s.size();
		System.out.println(size);
		System.out.println(s);
	}
}

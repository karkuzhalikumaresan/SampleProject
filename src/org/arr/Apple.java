package org.arr;

import java.util.HashSet;
import java.util.Set;

public class Apple {
	public static void main(String[] args) {
	Set l = new HashSet<>();
	l.add("Arun");
	l.add(20);
	l.add(2024);
	l.add(600097);
	l.add(120.59f);
	l.add(9942811789l);
	l.add('K');
	l.add("Chennai");
	System.out.println(l);
	//find 'K' is present or not
	boolean contains = l.contains('K');
	System.out.println("K is available: "+contains);
	//Find the set is empty or not
	boolean empty = l.isEmpty();
	System.out.println("Set is empty:"+empty);
	//To remove value 120.59f
	boolean remove = l.remove(120.59f);
	System.out.println("Set after removed value:"+l);
	Set<String> s = new HashSet<>();
	s.add("Kumar");
	s.add("25");
	s.add("Trichy");
	System.out.println(s);
	l.addAll(s);
	System.out.println(l);
	for (String o : s) {
		System.out.println(o);
	}
  }
}

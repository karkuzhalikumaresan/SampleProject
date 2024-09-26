package org.arr;

import java.util.ArrayList;
import java.util.List;
public class Index {
	public static void main(String []args) {
		// List = 10,20,30,90,10,10,40,50
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println("Input 1:"+l);	
		//List = 30,40,50,60,80
		List l1=new ArrayList();
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(80);
		System.out.println("Input 2:"+l1);
		l1.addAll(l);
		System.out.println(l1);	
		l1.retainAll(l);
		System.out.println(l1);
		l1.removeAll(l);
		System.out.println(l1);
		
		
	}
}

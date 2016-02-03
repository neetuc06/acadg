package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Master {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(40);
		list.add(30);
		list.add(50);
		list.add(20);
		
		System.out.println("The number of elements in the list is "+ list.size());
		System.out.println("Elements in the list are:");
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){System.out.println(it.next());}
		
	}

}

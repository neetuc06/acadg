package com.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Master {
	
	public static void main(String[] args) {
		
	Employee e1 = new Employee (1, "Anil");
	Employee e2 = new Employee (2, "Shireesh");
	Employee e3 = new Employee (3, "Pulkit");
	
	Set<Employee> list = new HashSet<Employee>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	
	Iterator<Employee> it = list.iterator();
	
	while(it.hasNext()){
		System.out.println("Employee name " + it.next().name);
	}
	
	
	}
}

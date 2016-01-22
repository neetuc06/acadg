package com.test;

public class Employee {
	
	private int empid;
	private String name, designation;
	private int salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void display(){
		
	System.out.println("My name is "+ name +" and I am a "+ designation);
	System.out.println("My employee ID is "+ empid +" and my salary is "+ salary);
	}

}

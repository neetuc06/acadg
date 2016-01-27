package com.test;
import java.util.Scanner;

public class Master {
	
	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Number of students to be entered");
	int n = keyboard.nextInt();
	StudentResult[] table = new StudentResult[n];
	for (int i = 0; i < table.length; i++) {
		table[i]=new StudentResult();
	}

	
	for (int i = 0; i < table.length; i++) {
	System.out.println("Enter student details");
	System.out.print("Name:");
	table[i].setName(keyboard.next());
	System.out.print("Roll Number: ");
	table[i].setRollno(keyboard.nextInt());
	System.out.print("Reg Number: ");
	table[i].setRegno(keyboard.nextInt());
	System.out.print("Year: ");
	table[i].setYear(keyboard.nextInt());
	System.out.print("Marks: ");
	table[i].setMarks(keyboard.nextInt());}
	
	System.out.println("------------------------------------------");
	System.out.println("Displaying results of all students");
	
	for (int i = 0; i < table.length; i++) {

		System.out.print("Name:");
		System.out.println(table[i].getName());
		System.out.print("Roll Number: ");
		System.out.println(table[i].getRollno());
		System.out.print("Reg Number: ");
		System.out.println(table[i].getRegno());
		System.out.print("Year: ");
		System.out.println(table[i].getYear());
		System.out.print("Marks: ");
		System.out.println(table[i].getMarks());
		System.out.println("------------------------------------------");
		}
	
	keyboard.close();
	}
		
}



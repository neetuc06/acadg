package com.test;
import java.util.Scanner;

public class Master {
	
	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
		
	System.out.println("Choose bank name - SBI/ ICICI/ Axis");
	String input = keyboard.next();
	
	switch (input) {
	case "SBI":
		SBI r= new SBI();
		r.getRateofInterest();
		break;
		
	case "ICICI":
		Icici i= new Icici();
		i.getRateofInterest();
		break;
		
	case "Axis":
		Axis a = new Axis();
		a.getRateofInterest();
		break;

	default: 
		Bank b= new Bank();
		b.getRateofInterest();
		break;
		}
	
	keyboard.close();
	
	}

}

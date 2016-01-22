
import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
		int age;
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Enter your age:");
		age=keyboard.nextInt();
		if (age >= 18) 
				{System.out.print("You are eligible to vote");}
		else {System.out.print("Sorry you are not eligible to vote");}

	}
}
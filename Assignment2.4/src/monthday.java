
import java.util.Scanner;

public class monthday {

	public static void main(String[] args) {

		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter month name");
		String month=keyboard.nextLine();
		
		switch (month){
		
		case "January":
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			System.out.println("Month has 31 days");
			keyboard.close();
			break;
			
			
				
		case "April":
		case "June":
		case "September":
		case "November":
			System.out.println("Month has 30 days");
			keyboard.close();
			break;
			
		case "February":
			System.out.println("Month has 28 days- 29 if it is a leap year");
			keyboard.close();
			break;
	
			
		}

	}

}

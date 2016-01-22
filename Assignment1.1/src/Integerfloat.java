
import java.util.Scanner;

public class Integerfloat {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		
		int a, c;
		float b;
		
		System.out.println("Enter integer");
		a= keyboard.nextInt();
		System.out.println("Enter float");
		b= keyboard.nextFloat();
		c=(int) (a+b);
		
		System.out.print("Addition Output is ");
		System.out.println(c);
		keyboard.close();
	}

}

import java.util.Scanner;
import java.io.*;

public class calc{

	public static void main(String[] args){
		float a,b,res;
		char ch;
		Scanner scan = new Scanner(System.in);

		do{
			System.out.println("1. ADD TWO NUMBERS");
			System.out.println("2. SUBTRACT TWO NUMBERS");
			System.out.println("3. QUIT");
			System.out.println("Select an option");

			ch = scan.next().charAt(0);

			switch(ch){
				case '1': System.out.println("Enter two numbers separated by space...");
						a=scan.nextFloat();
						b=scan.nextFloat();
						res= a+b;
						System.out.println("Res = " + res);
						break;

				case '2': System.out.println("Enter two numbers separated by space...");
						a=scan.nextFloat();
						b=scan.nextFloat();
						res= a-b;
						System.out.println("Res = " + res);
						break;

				 case '3': //System.out.print.ln("Enter two numbers separated by space...");
				// 		a=scan.nextFloat();
				// 		b=scan.nextFloat();
				// 		res= a+b;
				// 		System.out.print.ln("Res = " + res);
				 		System.exit(0);
						break;

				default: System.out.println("Invalid choice!!!");
						break;
			}
			System.out.println("\n\n");

		}while(true);
	}
}
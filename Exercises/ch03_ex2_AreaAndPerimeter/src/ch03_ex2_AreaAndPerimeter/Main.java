package ch03_ex2_AreaAndPerimeter;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		// Set up scanner
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// Display welcome message
			System.out.println("Welcome to the Area and Perimeter Calculator");
			System.out.println();

			System.out.print("Enter length:   ");
			double length = Double.parseDouble(sc.nextLine());

			System.out.print("Enter width:    ");
			double width = Double.parseDouble(sc.nextLine());

			// Do math for area and perimeter
			double area = length * width;
			double perimeter = 2 * width + 2 * length;

			// Print the Area and Perimeter
			System.out.println("Area:      " + area);
			System.out.println("Perimeter: " + perimeter);

			// Do you want to continue?
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
		}
		// If not display message
		sc.close();
		System.out.println("Bye!");

	}
}

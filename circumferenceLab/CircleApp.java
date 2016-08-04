package circumferenceLab;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		Circle c1 = new Circle();

		System.out.print("This app will calculate the circumference and area of a circle.\n");

		String choice = "yes";

		int count = 0;

		while (choice.equalsIgnoreCase("yes")) {

			System.out.print("Enter the radius of the circle in inches: ");

			double radius = scan1.nextDouble();
			scan1.nextLine();

			if (radius < 0) {
				System.out.println("You must enter a number greater than zero.");
			}

			else {

				c1.setRadius(radius);

				String circumference = c1.getFormattedCircumference();

				String area = c1.getFormattedArea();

				String message1 = "Circumference: " + circumference + " inches.";
				String message2 = "Area: " + area + " square inches.";

				System.out.println("\n" + message1 + "\n");

				System.out.println(message2 + "\n");

				count++;

			}

			System.out.println("Would you like to calculate another circle?\nEnter \"yes\" or \"no.\"");

			choice = scan1.nextLine();

			if (choice.equalsIgnoreCase("no")) {
				System.out.println("You calculated " + count + " circles. Goodbye!");
			}
		}

		scan1.close();
	}
}

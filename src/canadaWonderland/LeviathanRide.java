package canadaWonderland;

import java.util.Scanner;

public class LeviathanRide {

	double height;

	Scanner input = new Scanner(System.in);

	void eligibilityForLeviathan() {

		System.out.println("Enter your height: ");
		height = input.nextDouble();

		if (height >= 54) {

			System.out.println("Eligible to ride Leviathen.");

		} else {

			System.out.println("Not Eligible to ride Leviathen.");
		}
	}

}

package canadaWonderland;

import java.util.Scanner;

public class BehemothRide {

	double height;

	Scanner input = new Scanner(System.in);

	void eligibilityForBehemoth() {

		System.out.println("Enter your height: ");
		height = input.nextDouble();

		if (height >= 54) {

			System.out.println("Eligible to ride Behemoth.");

		} else {

			System.out.println("Not Eligible to ride Behemoth.");
		}
	}

}

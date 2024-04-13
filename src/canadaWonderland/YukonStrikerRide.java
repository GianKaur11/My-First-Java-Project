package canadaWonderland;

import java.util.Scanner;

public class YukonStrikerRide {

	double height;

	Scanner input = new Scanner(System.in);

	void eligibilityForYukonStriker() {

		System.out.println("Enter your height: ");
		height = input.nextDouble();

		if (height >= 52) {

			System.out.println("Eligible to ride Yukon Striker.");

		} else {

			System.out.println("Not Eligible to ride Yukon Striker.");
		}
	}
}

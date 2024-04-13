package amusementPark;

/* In Amusement park, a ride can carry max 10 people. 
 * Write a code to help the operator from overfilling the ride 
 * i.e  more than 10 people should not be allowed to get on the ride.  
 * Also ensure that the people getting on the ride meets the height criteria, 
 * Height of person should be greater than 90 cm but less than 200 cm.   */

import java.util.Scanner;

public class AmusementParkRideCapacity {

	Scanner sc = new Scanner(System.in);

	double height;

	public void checkMaximumCapacityOfRide() {
		
		for (int noOfSeats = 1; noOfSeats <= 10; noOfSeats++) {
			
			System.out.println("Enter the Height of person " + noOfSeats + " in cm: ");
			height = sc.nextDouble();

			if (height >= 90 && height <= 200) {

				System.out.println("Enjoy your ride!");

				System.out.println(noOfSeats + " Seat occupied");

				if (noOfSeats == 10) {

					System.out.println("No more Capacity, please wait.");
				}
			} else {

				System.out.println("You are not Eligible to take ride.");
				noOfSeats = noOfSeats - 1;
			}
		}
	}

}

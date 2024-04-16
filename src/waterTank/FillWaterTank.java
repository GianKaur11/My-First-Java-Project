package waterTank;

import java.util.Scanner;

/*There is a water tank of capacity 100 litres. 
 * Water is filled into it using bucket which have capacity of 10 litres. 
 * Write a program which fills the tank to its capacity using these buckets. 
 * Also include a mechanism in your program to stop the tank from over flowing.
 */

public class FillWaterTank {

	int noOfBuckets;
	int capacityOfBucket;
	int waterInTank;
	int remainingCapacity;
	String addMoreWater;

	Scanner sc = new Scanner(System.in);

	void checkIfWaterTankIsFull() {

		System.out.println("How much water is in the tank?");
		waterInTank = sc.nextInt();

		for (int capacityOfTank = waterInTank; capacityOfTank <= 95; capacityOfTank = capacityOfTank
				+ capacityOfBucket) {

			System.out.println("Tank has " + capacityOfTank + " litres of water in it.");
			
			if (capacityOfTank == 95) {

				System.out.println("Tank is full. There is no more capacity in it.");
				break;
			
			} else if (capacityOfTank < 95) {
				System.out.println("Do you want to add more water?");
				addMoreWater = sc.next();
			}
			
			if (addMoreWater.equals("yes")) {

				noOfBuckets = noOfBuckets + 1;
				System.out.println("Enter capacity of bucket: ");
				capacityOfBucket = sc.nextInt();

				remainingCapacity = 95 - waterInTank;

				if (capacityOfBucket > remainingCapacity) {

					System.out.println("Enter less capacity to fill tank to max capacity.");
					capacityOfBucket = 0;
				}

			} else {

				System.out.println("Thank You! Have a nice day.");
				break;
			}

		}
	}

}

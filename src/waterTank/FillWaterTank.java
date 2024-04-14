package waterTank;

/*There is a water tank of capacity 100 litres. 
 * Water is filled into it using bucket which have capacity of 10 litres. 
 * Write a program which fills the tank to its capacity using these buckets. 
 * Also include a mechanism in your program to stop the tank from over flowing.
 */

public class FillWaterTank {

	int noOfBuckets;

	void checkIfWaterTankIsFull() {

		for (int capacity = 0; capacity <= 100; capacity = capacity + 10) {

			//System.out.println("You have " + noOfBuckets + " buckets in tank");

			System.out.println("Tank has " + noOfBuckets + " buckets and "+ capacity + " litres of water in it.");

			noOfBuckets = noOfBuckets + 1;
			
			if (capacity == 100) {

				System.out.println("Tank is full. There is no more capacity in it.");

			}

		}

	}

}

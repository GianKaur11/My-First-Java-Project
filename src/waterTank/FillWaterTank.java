package waterTank;

/*There is a water tank of capacity 100 litres. 
 * Water is filled into it using bucket which have capacity of 10 litres. 
 * Write a program which fills the tank to its capacity using these buckets. 
 * Also include a mechanism in your program to stop the tank from over flowing.
 */

public class FillWaterTank {

	void checkIfWaterTankIsFull() {

		for (int capacity = 10; capacity <= 100; capacity = capacity + 10) {

			System.out.println("Tank has " + capacity + " litres of water in it.");
			
			if(capacity == 100) {
				
				System.out.println("Tank is full. There is no more capacity in it.");
				
			}

		}

	}

}

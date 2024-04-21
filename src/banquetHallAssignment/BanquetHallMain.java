package banquetHallAssignment;

import java.util.Scanner;

public class BanquetHallMain {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		BanquetHall bh = new BanquetHall();
	
		System.out.println("Enter no of guests: ");
		 int noOfGuest = sc.nextInt();
		
		System.out.println("Enter base cost per person: ");
		double baseBookingCost = sc.nextDouble();		
		
		System.out.println("Enter food cost per person: ");
		double foodCost = sc.nextDouble();	

		System.out.println("Enter tip per person: ");
		double tip = sc.nextDouble();
		
		bh.calculateBaseCost(baseBookingCost, foodCost, tip, noOfGuest);
		bh.calculateCess(noOfGuest);
		bh.calculateTheTotalCost();
		bh.display();
	}

}

package banquetHallAssignment;

public class BanquetHall {
	
	
	double totalBaseCost, tax, cess, totalCost;
	
	public double calculateBaseCost(double baseBookingCost, double foodCost, double tip, int noOfGuest) {	
		totalBaseCost = noOfGuest * (baseBookingCost + foodCost + tip);
		return totalBaseCost;
	}
	
	public double calculateTax() {
		tax = totalBaseCost * 0.13;
		return tax;
	}
	
	public double calculateCess(int noOfGuest) {
		if(noOfGuest <= 40) {
			cess = totalBaseCost * 0.04;
		}else if (noOfGuest > 40 && noOfGuest <= 80 ) {
			cess = totalBaseCost * 0.08;
		}else if (noOfGuest > 80 && noOfGuest <= 150 ) {
			cess = totalBaseCost * 0.10;
		}else if (noOfGuest > 150 ) {
			cess = totalBaseCost * 0.125;
		}
		return cess;
	}
	
	public double calculateTheTotalCost() {
		calculateTax();
		totalCost = totalBaseCost + tax + cess;
		return totalCost;
	}
	
	public void display() {

		System.out.println("Total Base Cost: " +totalBaseCost);
		System.out.println("Tax: " +tax);
		System.out.println("Cess: " +cess);
		System.out.println("Total Cost: " +totalCost);
	}

}

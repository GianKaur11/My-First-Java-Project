package banquetHallAssignment;

/* Question 
 * Write a program to get complete bill at a Banquet hall by creating a class named Banquet. 
 * The class Banquet takes base cost for booking banquet hall, cost of food, beverages, taxes on food, taxes on beverage and tip as an attribute. 
 * There should be 4 methods,
 * First method calculateBaseCost() should calculate base cost on the basis of base booking cost, cost of food,tip and beverage. 
 * This method should accept 3 arguments(base cost, food cost, beverage cost and tip)  and return the value of total base cost. 
 * Second method calculatetax() should calculate tax on base cost and  returns the value of tax. You can keep tax percentage as per your wish. 
 * This method takes return value of the method calculateBaseCost() as its input parameter and on the basis of input parameter, it calculates tax on base cost.
 * Third Method calculateCess() tax should calculate the Cess as per below condition
 * Depending upon the number of guests, another tax which is known as service cess is calculated as follow:
 * 1: Less than or equal to 40 guests, cess is 4% of the total bill before taxes
 * 2: More than 40 and up to 80 guests, cess is 8% of the total bill before taxes.
 * 3: For more than 80 and less than 150 guests, cess is 10% of the total bill before taxes.
 * 4: For more than 150 guests, cess will be 12.5% of the total bill before taxes.
 * This method will take 2 parameters, first is number of guests and second parameter is the return value of the method calculateBaseCost() as its input parameter.
 * On the basis of 2 input it calculate Cess tax.
 * Last method  CalculateTheTotalCost() will calculate the total cost of booking banquet hall and it takes 3 input as parameter. All 3 parameters are the return value of following methods 
 * calculateBaseCost()
 * caculatetax()
 * calculateCess()
 * Finally, print the total cost in CalculateTheTotalCost() method.
 * Note: Keep the main method class as separate and 'Banquet' class separate, use object of Banquet class to access its methods and attributes.
 * Take all inputs through scanner Only.
*/

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
		if (noOfGuest <= 40) {
			cess = totalBaseCost * 0.04;
		} else if (noOfGuest > 40 && noOfGuest <= 80) {
			cess = totalBaseCost * 0.08;
		} else if (noOfGuest > 80 && noOfGuest <= 150) {
			cess = totalBaseCost * 0.10;
		} else if (noOfGuest > 150) {
			cess = totalBaseCost * 0.125;
		}
		return cess;
	}

	public double calculateTheTotalCost() {
		totalCost = totalBaseCost + tax + cess;
		return totalCost;
	}

	public void display() {

		System.out.println("Total Base Cost: " + totalBaseCost);
		System.out.println("Tax: " + tax);
		System.out.println("Cess: " + cess);
		System.out.println("Total Cost: " + totalCost);
	}

}

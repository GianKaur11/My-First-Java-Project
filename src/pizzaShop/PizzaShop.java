package pizzaShop;

import java.util.Scanner;

/* Write a program to prepare the bill for a pizza shop.
 *Assume an order and work out the final bill.
 *Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
 *For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
 *Extra cheese for any size pizza: + $1
 *For eg: If the Pizza is medium, pepperoni with extra cheese the program should calculate the final bill as 20+3+1 = $24 and print as
 *“Your final bill is $24” */

public class PizzaShop {

	Scanner sc = new Scanner(System.in);

	int price;

	void calculatePizzaBill() {

		System.out.println("Enter the size of Cheeze pizza: ");

		String additionalTopping;

		String sizeOfPizza = sc.next();

		switch (sizeOfPizza) {

		case "Small":

			System.out.println("Any additional topping?: " + "Extra Cheeze, Pepperoni, Pepperoni WIth Extra Cheeze");
			price = 15;
			additionalTopping = sc.next();

			if (additionalTopping.matches("ExtraCheeze")) {

				price = price + 1;

				System.out.println("Your total bill is: $" + price);

			} else if (additionalTopping.matches("Pepperoni")) {

				price = price + 2;

				System.out.println("Your total bill is: $" + price);
				
			} else if (additionalTopping.matches("PepperoniWithExtraCheeze")) {

				price = price + 2 + 1;

				System.out.println("Your total bill is: $" + price);

			}else {
				
				System.out.println("Your total bill is: $" + price);
			}

			break;

		case "Medium":

			System.out.println("Any additional topping?: " + "Extra Cheeze, Pepperoni, Pepperoni With Extra Cheeze");
			price = 20;
			additionalTopping = sc.next();

			if (additionalTopping.matches("ExtraCheeze")) {

				price = price + 1;

				System.out.println("Your total bill is: $" + price);

			} else if (additionalTopping.matches("Pepperoni")) {

				price = price + 3;

				System.out.println("Your total bill is: $" + price);
				
			} else if (additionalTopping.matches("PepperoniWithExtraCheeze")) {

				price = price + 3 + 1;

				System.out.println("Your total bill is: $" + price);

			}else {
				
				System.out.println("Your total bill is: $" + price);
			}

		
			break;

		case "Large":

			System.out.println("Any additional topping?: " + "Extra Cheeze, Pepperoni, Pepperoni With Extra Cheeze");
			price = 25;
			additionalTopping = sc.next();

			if (additionalTopping.matches("ExtraCheeze")) {

				price = price + 1;

				System.out.println("Your total bill is: $" + price);

			} else if (additionalTopping.matches("Pepperoni")) {

				price = price + 3;

				System.out.println("Your total bill is: $" + price);
				
			} else if (additionalTopping.matches("PepperoniWithExtraCheeze")) {

				price = price + 3 + 1;

				System.out.println("Your total bill is: $" + price);

			}else {
				
				System.out.println("Your total bill is: $" + price);
			}
		
			break;

		default:
			System.out.println("Please enter correct size of pizza.");
			break;
		}

	}
}

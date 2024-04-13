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

		System.out.println("Enter the size of pizza: ");

		String sizeOfPizza = sc.next();

		switch (sizeOfPizza) {

		case "Small":

			System.out.println("Which pizza do you want: "
					+ "Cheeze, Pepperoni or Pepperoni with extra cheeze");
			price = 15;
			String typeOfPizza = sc.next();
			
			if(typeOfPizza == "Cheeze") {
			
				System.out.println("Total bill: $"+ price);
				
			}else if (typeOfPizza == "Pepperoni") {
				
				price = price + 2;
				
				System.out.println("Total bill: $"+ price);
			}else if (typeOfPizza == "Pepperoni with extra cheeze") {
                    
				price = price +2 + 1;
				
				System.out.println("Total bill: $"+ price);
				
			}
			

			break;

		case "Medium":

			break;

		case "Large":

			break;

		default:
			System.out.println("Please enter correct size of pizza.");
			break;
		}

	}

}

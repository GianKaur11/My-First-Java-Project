package discountApplied;

public class CalculateDiscountApplied {

	double subTotal;
	double discountApplied;
	double amountAfterDiscount;
	double taxApplied;
	double amountAfterTax;
	double totalAmount;
	double promo5;
	double promo10;
	double promo20;
	double amountAfterPromo5;
	double amountAfterPromo10;
	double amountAfterPromo20;
	boolean promo5Applied;
	boolean promo10Applied;
	boolean promo20Applied;

	void calculateTotalDiscount() {

		amountAfterDiscount = (subTotal - (subTotal * discountApplied));
		amountAfterPromo5 = (amountAfterDiscount - (amountAfterDiscount * promo5));
		amountAfterPromo10 = (amountAfterDiscount - (amountAfterDiscount * promo10));
		amountAfterPromo20 = (amountAfterDiscount - (amountAfterDiscount * promo20));

		System.out.println("Amount before tax: $" + subTotal);
		System.out.println("Discount Applied 50%: $" + amountAfterDiscount);

		if (promo5Applied) {

			amountAfterTax = amountAfterPromo5 * taxApplied;
			totalAmount = amountAfterPromo5 + amountAfterTax;
			System.out.println("Promotion code Promo5 Applied: 5%");
			System.out.println("Amount after promotion: $" + amountAfterPromo5);
			System.out.println("Amount after 13% Tax: $" + amountAfterTax);
			System.out.println("Total Bill: $" + totalAmount);
		}

		else if (promo10Applied) {

			amountAfterTax = amountAfterPromo10 * taxApplied;
			totalAmount = amountAfterPromo10 + amountAfterTax;
			System.out.println("Promotion code Promo10 Applied: 10%");
			System.out.println("Amount after promotion: $" + amountAfterPromo10);
			System.out.println("Amount after 13% Tax: $" + amountAfterTax);
			System.out.println("Total Bill: $" + totalAmount);
		}

		else if (promo20Applied) {

			amountAfterTax = amountAfterPromo20 * taxApplied;
			totalAmount = amountAfterPromo20 + amountAfterTax;
			System.out.println("Promotion code Promo20 Applied: 20%");
			System.out.println("Amount after promotion: $" + amountAfterPromo20);
			System.out.println("Amount after 13% Tax: $" + amountAfterTax);
			System.out.println("Total Bill: $" + totalAmount);

		} else {

			amountAfterTax = amountAfterDiscount * taxApplied;
			totalAmount = amountAfterDiscount + amountAfterTax;
			System.out.println("Amount after 13% Tax: $" + amountAfterTax);
			System.out.println("Total Bill: $" + totalAmount);
		}

	}

}

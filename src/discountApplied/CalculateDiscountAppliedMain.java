package discountApplied;

public class CalculateDiscountAppliedMain {

	public static void main(String[] args) {
	
		CalculateDiscountApplied cda = new CalculateDiscountApplied();
		
		cda.subTotal = 200.00;
		cda.discountApplied = 0.50;
		cda.taxApplied = 0.13;
		cda.promo5 = 0.05;
		cda.promo10 = 0.10;
		cda.promo20 = 0.20;
		cda.promo5Applied = false;
		cda.promo10Applied = false;
		cda.promo20Applied = true;
		
		cda.calculateTotalDiscount();
		

	}

}

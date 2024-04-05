package comparisonOperator;

public class ComparisonOperator {

	int a = 15;
	int b = 20;
	boolean result = false;

	public void isAGreaterThanB() {
		result = a > b;
		System.out.println("Is A greater than B: " + result);
	}
	
	public void isAGreaterThanOrEqualToB() {

		result = a >= b;
		System.out.println("Is A greater than or equals to B: " + result);
	}

	public void compareTwoNumbers() {

		result = a == b;
		System.out.println("Is A equals to B: " + result);
	}
}

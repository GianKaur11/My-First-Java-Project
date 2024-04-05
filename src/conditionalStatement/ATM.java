package conditionalStatement;

public class ATM {

	double balance;
	double overdraftAmount;
	int withdrawlAmount;
	int actualPin;
	int enteredPin;
	boolean isPinValid;

	// balance > amount entered (or) overdraftAmount > amount entered: customer can
	// withdraw the amount
	// balance < amount entered customer can't withdraw the amount
	
	// "||" OR operator

	/*void withdrawMoneyFromAtm() {

		boolean isBalanceAvailable = (balance > withdrawlAmount) || (overdraftAmount > withdrawlAmount);

		// if else block
		// if (balance > amountEntered) {

		if (isBalanceAvailable) {

			System.out.println("Customer can withdraw the amount");
			
		} else {
			
			System.out.println("Customer does not have enough balance");
		}
	}*/

	void validatePinAndWithdrawMoney() {

		isPinValid = enteredPin == actualPin;
       
		// Condition to validate if PIN is valid
		
		if (isPinValid) {
			
			System.out.println("PIN is correct");
		
			// condition to validate the withdraw limit	
			
			if (balance > withdrawlAmount || overdraftAmount > withdrawlAmount) {

				System.out.println("Customer can withdraw the amount");
			
			} else {
			
				System.out.println("Customer does not have enough balance");
			}
		
		} else {
			
			System.out.println("PIN is incorrect");
		}
	}

}

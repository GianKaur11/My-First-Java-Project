package conditionalStatement;

public class ATMMain {

	public static void main(String[] args) {
		
		ATM atm =new ATM();
		
		atm.balance = 567.89;
		
		atm.withdrawlAmount = 1000;
		
		atm.overdraftAmount = 200;
		
		atm.actualPin = 1234;
		
		atm.enteredPin = 1234;
		
		//atm.withdrawMoneyFromAtm();
		
		atm.validatePinAndWithdrawMoney();

	}

}

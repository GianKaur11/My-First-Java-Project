package portPhoneNumber;

public class MainPortPhoneNumber {

	public static void main(String[] args) {

		PortPhoneNumber portPhoneNumber = new PortPhoneNumber();
		
		portPhoneNumber.name = "Gian Kaur";
		portPhoneNumber.cellNumber = 4389908807L;
		portPhoneNumber.DoesYourNewProviderHaveInterconnectionAgreementWithOldProvider = true;
		portPhoneNumber.IsYourCurrentNumberInService = true;
		portPhoneNumber.isYourNewProviderHaveServiceInYourArea = false;

		portPhoneNumber.IsConditionMatched();
		
	}
	
}
	

		/*portPhoneNumber.isNumberPortable();

		portPhoneNumber.checkNewProviderService();

		portPhoneNumber.checkIfNumberInService();

		portPhoneNumber.checkConnectionAgreement();

		System.out.println("Your Number is verified and can be ported.");

		// portPhoneNumber.checkConditionsToPortNumber();

		// if(checkConditionsToPortNumber=true) {

		// }

		// else {

		// System.out.println("Your Number can not be ported.");
		// }
	}*/



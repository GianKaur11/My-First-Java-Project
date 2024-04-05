package portPhoneNumber;

//import java.util.*;

public class PortPhoneNumber {

	String name;
	long cellNumber;
	boolean isYourNewProviderHaveServiceInYourArea;
	boolean IsYourCurrentNumberInService;
	boolean DoesYourNewProviderHaveInterconnectionAgreementWithOldProvider;
	
	
	void IsConditionMatched() {
		
		System.out.println("Full Name: "+ name);
		System.out.println("Cell Number: "+ cellNumber);
		
		if(isYourNewProviderHaveServiceInYourArea && IsYourCurrentNumberInService && DoesYourNewProviderHaveInterconnectionAgreementWithOldProvider) {
			
			System.out.println("Your Number has been ported successfully.");
		} else {
			
			System.out.println("Your Number does not meet conditions, can not be ported");
		}
		
	}
}

	//Scanner input = new Scanner(System.in);
	//Scanner stringinput = new Scanner(System.in);

	/*void isNumberPortable() {

		System.out.println("Full name: "+ name);
		//String name = stringinput.next();

		System.out.println("Cell phone number: "+ cellNumber);
		//cellNumber = input.nextInt();

		//System.out.printf("Name = %s and Phone Number = %d", name, cellNumber);
	}

	// void checkConditionsToPortNumber() {
	void checkNewProviderService() {

		if (isYourNewProviderHaveServiceInYourArea = false) {

			System.out.println("Service available in your area");
		}

		else {

			System.out.println("Service isn't available in your area");
		}
	}

	void checkIfNumberInService() {

		if (IsYourCurrentNumberInService = true) {

			System.out.println("Current number in service");
		}

		else {

			System.out.println("Current number is not in service, please check");
		}
	}

	void checkConnectionAgreement() {

		if (DoesYourNewProviderHaveInterconnectionAgreementWithOldProvider = true) {

			System.out.println("Connection agreement verified");
		}

		else {

			System.out.println("There is no agreement with your current provider");

		}
	}*/


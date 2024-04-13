package switchCaseExample;

import java.util.Scanner;

public class SwitchExample {

	Scanner sc = new Scanner(System.in);

	void exampleOfSwitchCase() {

		System.out.println("Enter the brand whose car u want to see");
		String brandName = sc.next();

		switch (brandName) {
		case "Toyota":
			System.out.println("The cars are: Corolla, Camry");
			break;
		case "Honda":
			System.out.println("The cars are: Civic, Pilot");
			break;
		case "GM":
			System.out.println("The cars are: Cruz");
			break;
		case "Ford":
			System.out.println("The cars are: F150, Escape");
			break;
		default:
			System.out.println("You have entered a wrong input: " +brandName);
			break;
		}
	}
 public void daysOfWeek() {
	 
	 System.out.println("Enter a number: ");
	 int inputOfUser = sc.nextInt();
	 
	 switch (inputOfUser) {
	case 1:
		System.out.println("Sunday");
		break;
	case 2:
		System.out.println("Monday");
		break;
	case 3:
		System.out.println("Tuesday");
		break;
	case 4:
		System.out.println("Wednesday");
		break;
	case 5:
		System.out.println("Thursday");
		break;
	case 6:
		System.out.println("Friday");
		break;
	case 7:
		System.out.println("Saturday");
		break;
	default:
		System.out.println("Enter a valid number");
		break;
	}
	 
 }
}

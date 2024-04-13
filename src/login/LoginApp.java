package login;

import java.util.Scanner;

/*Write a program which takes username and password from user via console 
 * and compares it with a user name and password saved in your class. 
 * Saved user id and password are as below
 * UserId	pivotAdmin
 * password	Admin123
 * If the username and password entered by user matches with the one saved in your class, 
 * then print “You are logged in to the application“ 
 * other wise  print “Incorrect User id or password.Try again”.  
 * Also a user gets 3 chances enter the correct user name and password.
 *  If the user enters incorrect user name or password more than 3 times 
 *  then print “ Account locked” 
 */

public class LoginApp {

	Scanner input = new Scanner(System.in);
	String userID, password;

	String savedUserID = "pivotAdmin";
	String savedPassword = "Admin123";

	void validateLoginCredientials() {

		for (int noOfChances = 3; noOfChances >= 1; noOfChances--) {

			System.out.println("You have " + noOfChances + " chances to enter correct UserId and Password.");

			System.out.println("Enter user Id: ");
			userID = input.next();

			System.out.println("Enter password: ");
			password = input.next();

			if (userID.equals(savedUserID) && password.equals(savedPassword)) {

				System.out.println("You are logged in to the application.");
				break;

			} else {

				System.out.println("Incorrect UserID or Password. Try again.");

				if (noOfChances == 1) {

					System.out.println("Account Locked.");
				}

			}

		}

	}
}

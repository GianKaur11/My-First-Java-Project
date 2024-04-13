package takeInputFromUser;

import java.util.Scanner;

public class TakeUserInput {
	
	Scanner sc = new Scanner(System.in);
	
	void takeTheInput() {
		
		
		
		System.out.println("Enter the name of user:");
		String name = sc.next();
		
		System.out.println("Enter the age of user:");
		int age = sc.nextInt();
		
		System.out.println("Name of the user is: " +name + "and age is: " +age);
		
	}
}

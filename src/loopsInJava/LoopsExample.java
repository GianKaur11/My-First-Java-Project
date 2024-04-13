package loopsInJava;

public class LoopsExample {

	int a = 5;

	String nameOfStudent = "Jerin";

	// Array

	String[] listOfStudents = { "Prabh", "Manvir", "Arsh", "Jerin", "Gian" };

	int[] ageOfStudent = { 15, 16, 14, 12, 18 };

	public void printStudentName() {

		System.out.println("Name of the Student: " + nameOfStudent);

	}

	public void printStudentNameFromArray() {

		System.out.println("Name of Student: " + listOfStudents[2]);
	}

	public void incrementValue() {

		// a=a+1;
		System.out.println("A value initially is: " + a);
		a++; // Post increment operator
		// a--; Post decrement operator
		// --a; pre-decrement operator

		System.out.println("A value post increment is: " + a);

		a--;
		System.out.println("A value post decrement is: " + a);

		++a;
		System.out.println("A value pre increment is: " + a);

		--a;
		System.out.println("A value pre decrement is: " + a);

	}
	
	boolean isJerinPresentInList = false;

	public void findJerin() {

		// for(counter; maximum condition for loop; increment condition){}

		// for(int counter=0;counter<5;counter = counter+2) {

		// for (int counter = 0; counter < 5; counter = counter + 2) {

		for (int counter = 0; counter < listOfStudents.length; counter++) {

			if (listOfStudents[counter] == "Jerin") {

				System.out.println("Jerin is in the list");
				isJerinPresentInList = true;
				break; // to break the loop once if condition satisfied

			} 
			
			// ! used to change the boolean variable value from true to false or false to true
			
			if(!isJerinPresentInList) {
				
				System.out.println("Jerin is not in the list");
			}
		}

		//System.out.println("Jerin is not there.");
		// System.out.println(listOfStudents[3]);

		// System.out.println(listOfStudents[counter]);
	}

	public void printAge() {

		for (int cnt = 0; cnt < 5; cnt++) {

			System.out.println(ageOfStudent[cnt]);
		}

	}

	public void attemptATM() {
		// for(int i=0;i<3;i++) {
		// for(int i=0;i<3;++i) {

		for (int i = 1; 
				i <= 3; 
				i++) {

			System.out.println("Wrong Attempt");
		}
	}

	int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public void findDivisibleBy2Number() {

		for (int a = 0; a < 10; a++) {

			if (numbers[a] % 2 == 0) {

				System.out.println("Numbers divisible by 2: " + numbers[a]);
			}
		}
	}
	
	void sumOfEvenNumber() {
		int sum=0;
		
		for(int i = 1; i<=10; i++) {
			
			if(i%2==0) {
				
				sum = sum+i;
				System.out.println("Sum of even numbers = "+ sum);
			}
		}
		
	}
}
package ontarioDrivingLicence;

public class DrivingLicence {

	String name;
	int age;
	int noOfQuestions;
	int noOfWrongAnswers;
	int passingMarks;
	boolean isVisionTestPass;
	boolean isWrittenExamPass;
	boolean isRoadTestPass;
	boolean isHighwayRoadTestPass;
	boolean isClassG1Pass;
	boolean isClassG2Pass;
	boolean isClassGPass;
	int noOfMonthsSinceG1Passed;
	int noOfMonthsSinceG2Passed;
	
	/*declaring previous experience variable, 
	if the immigrant having more than 2 year of experience from his back home 
	can also give G test after passing G1. */

	int previousExperience;
	
	
	void isDrivingLicenceIssued() {
		
		System.out.println("Full Name: " + name + '\n' + "Age: " + age);

		passingMarks = noOfQuestions - noOfWrongAnswers;
		isWrittenExamPass = passingMarks >= 32;
		isClassG1Pass = isVisionTestPass && isWrittenExamPass;
		isClassG2Pass = isClassG1Pass && isRoadTestPass && noOfMonthsSinceG1Passed >= 8;
		isClassGPass = (isClassG1Pass && age>=18 && previousExperience >=2) || (isClassG2Pass && isHighwayRoadTestPass && noOfMonthsSinceG2Passed >= 8);

		if (age >= 16) {

			if (isClassG1Pass) {
				
                System.out.println("Vision test clear" + '\n' + "Number of Correct answers: " + passingMarks);
                
				System.out.println("Congratulations! You have passed the written exam." + '\n' + "Class G1 Licence has been issued.");

				if (isClassG2Pass) {

					System.out.println("Congratulations! You have passed the road test." + '\n' + "Class G2 Licence has been issued.");

					if (isClassGPass) {

						System.out.println("Congratulations! You have passed the highway road test." + '\n' + "Class G Licence has been issued." + '\n' + "You are fully licenced now.");
					} else {

						System.out.println("Highway Road test failed.");
					}

				} else {

					System.out.println("Road test failed.");
				}
			} else {

				System.out.println("Written exam failed, please try again.");
			}

		} else {

			System.out.println("To apply for a licence, you must be at least 16 years old");
		}
	}

}

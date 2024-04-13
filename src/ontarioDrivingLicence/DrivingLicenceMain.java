package ontarioDrivingLicence;

public class DrivingLicenceMain {

	public static void main(String[] args) {

		DrivingLicence dl = new DrivingLicence();

		dl.name = "Gian Kaur";
		dl.age = 15;
		dl.noOfQuestions = 40;
		dl.noOfWrongAnswers = 10;
		dl.noOfMonthsSinceG1Passed = 8;
		dl.noOfMonthsSinceG2Passed = 8;
		dl.previousExperience = 1;
		dl.isVisionTestPass = true;
		dl.isRoadTestPass = false;
		dl.isHighwayRoadTestPass = true;
		dl.isDrivingLicenceIssued();

	}

}

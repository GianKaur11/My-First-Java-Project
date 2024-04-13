package canadaWonderland;

public class CanadaWonderlandMain {

	public static void main(String[] args) {

		LeviathanRide lr = new LeviathanRide();
		lr.eligibilityForLeviathan();

		YukonStrikerRide ys = new YukonStrikerRide();
		ys.eligibilityForYukonStriker();

		BehemothRide br = new BehemothRide();
		br.eligibilityForBehemoth();

	}

}

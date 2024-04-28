package stringAssignment;

public class StringFunctions {

	/*
	 * Q4) Create a method that accepts a string (of a person's first and last name)
	 * and returns a string with the first and last name swapped. Examples:
	 * nameShuffle("Donald Trump") ➞ "Trump Donald" nameShuffle("Seymour Butts") ➞
	 * "Butts Seymour"
	 */

	private String firstName, lastName;

	public StringFunctions(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void nameShuffle(String firstName, String lastname) {
		System.out.println("Your full name is: " + this.lastName + " " + this.firstName);
	}

	/*
	 * Q5) Create two functions: isPrefix(word, prefix-) and isSuffix(word,
	 * -suffix). isPrefix should return true if it begins with the prefix argument.
	 * isSuffix should return true if it ends with the suffix argument.Otherwise
	 * return false. Examples : isPrefix("automation", "auto-") ➞ true
	 * isSuffix("arachnophobia", "-phobia") ➞ true isPrefix("retrospect", "sub-") ➞
	 * false isSuffix("vocation", "-logy") ➞ false
	 */

	private String word;
	private String prifix;
	private String suffix;

	public StringFunctions(String word, String prifix, String suffix) {
		super();
		this.word = word;
		this.prifix = prifix;
		this.suffix = suffix;
	}

	public boolean isPrifix(String word, String prifix) {
		if (word.contains(prifix)) {
			return true;
		}
		return false;
	}

	public boolean isSuffix(String word, String suffix) {
		if (word.contains(suffix)) {
			return true;
		}
		return false;
	}

	public void printResult() {

		boolean isPrifix = isPrifix(word, prifix);
		boolean isSuffix = isSuffix(word, suffix);
		if (isPrifix) {
			System.out.println(this.prifix + " is the prifix of : " + this.word);
		}else if(!isPrifix) {
			System.out.println(this.prifix + " is not the prifix of : " + this.word);
		}
		if (isSuffix) {
			System.out.println(this.suffix + " is the suffix of : " + this.word);
		} else if (!isSuffix) {
			System.out.println(this.suffix + " is the not suffix of : " + this.word);
		}
	}

}

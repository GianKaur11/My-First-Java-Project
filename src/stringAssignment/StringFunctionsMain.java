package stringAssignment;

import java.util.Scanner;

public class StringFunctionsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Q1) Create a function that counts the number of syllables a word has. Each
		 * syllable is separated with a dash Examples numberSyllables("buf-fet") ➞ 2
		 * numberSyllables("beau-ti-ful") ➞ 3 numberSyllables("mon-u-men-tal") ➞ 4
		 * numberSyllables("on-o-mat-o-poe-ia") ➞ 6
		 */

		String string = "on-o-mat-o-poe-ia";
		int count = 0;
		String[] numberSyllable = string.split("-");

		for (int i = 0; i <= numberSyllable.length; i++) {

			if (count <= numberSyllable.length) {
				count = i;
			}
		}
		System.out.println("no of Syllable: " + count);

		/*
		 * Q2) Write a function to return the city from each of these vacation spots. As
		 * shown in example below you have to extract Munich, Portland..etc. Hint: City
		 * will always be present in last square brackets in the statement.. Examples
		 * grabCity("[Last Day!] Beer Festival [Munich]") ➞ "Munich"
		 * grabCity("Cheese Factory Tour [Portland]") ➞ "Portland"
		 * grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]")
		 * ➞"Kyoto"
		 */

		String sentance = "[Last Day!] Beer Festival [Munich]";
		System.out.println("city is: " + sentance.substring(sentance.lastIndexOf("[") + 1, sentance.lastIndexOf("]")));
		;

		/*
		 * Q3. Create a function that removes the first and last characters from a
		 * string. Example : removeFirstLast("hello") ➞ "ell" removeFirstLast("a") ➞ "a"
		 */

		String words = "Intresting";

		System.out.println("Result is: " + words.substring(1, words.length() - 1));

		/*
		 * Q4) Create a method that accepts a string (of a person's first and last name)
		 * and returns a string with the first and last name swapped. Examples:
		 * nameShuffle("Donald Trump") ➞ "Trump Donald" nameShuffle("Seymour Butts") ➞
		 * "Butts Seymour"
		 */
		System.out.println("Enter first name: ");
		String firstName = sc.next();
		System.out.println("Enter last name: ");
		String lastName = sc.next();
		StringFunctions ns = new StringFunctions(firstName, lastName);
		ns.nameShuffle(firstName, lastName);

		// String firstAndLastName = "Gian Kaur";
		// String[] nameShuffle = firstAndLastName.split(" ");
		// System.out.println("Result is: " + nameShuffle[1] + " " + nameShuffle[0]);

		/*
		 * Q5) Create two functions: isPrefix(word, prefix-) and isSuffix(word,
		 * -suffix). isPrefix should return true if it begins with the prefix argument.
		 * isSuffix should return true if it ends with the suffix argument.Otherwise
		 * return false. Examples : isPrefix("automation", "auto-") ➞ true
		 * isSuffix("arachnophobia", "-phobia") ➞ true isPrefix("retrospect", "sub-") ➞
		 * false isSuffix("vocation", "-logy") ➞ false
		 */

		System.out.println("Enter any word: ");
		String word = sc.next();
		System.out.println("Enter prifix: ");
		String prifix = sc.next();
		System.out.println("Enter Suffix:");
		String suffix = sc.next();
		StringFunctions sf = new StringFunctions(word, prifix, suffix);
		sf.printResult();
		sc.close();
	}

}

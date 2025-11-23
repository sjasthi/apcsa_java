import java.util.Scanner; // Needed for Scanner

/**
 * This program asks the user to enter a numeric test score and displays a
 * letter grade for the score. The program uses nested decision structures to
 * determine the grade.
 */

public class NestedDecision {
	public static void main(String[] args) {
		int testScore; // Numeric test score

		// Create a Scanner object for keyboard input
		Scanner scanner = new Scanner(System.in);

		// Get the numeric test score.
		System.out.print("Enter your numeric test score and I will tell you the grade: ");

		// create a helper object that takes the inputs from key board
		testScore = scanner.nextInt();

		// Display the grade.
		if (testScore < 60) {
			System.out.println("Your grade is F.");
		} else {
			if (testScore < 70) {
				System.out.println("Your grade is D.");
			} else {
				if (testScore < 80) {
					System.out.println("Your grade is C.");
				} else {
					if (testScore < 90) {
						System.out.println("Your grade is B.");
					} else {
						System.out.println("Your grade is A.");
					}
				}
			}
		}

		// Close the Scanner
		scanner.close();
	}
}

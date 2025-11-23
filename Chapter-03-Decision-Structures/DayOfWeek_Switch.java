import java.util.Scanner;

public class DayOfWeek_Switch {
	public static void main(String[] args) {
		int number; // To hold the user's input

		// Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);

		// Prompt the user and get input
		System.out.print("Enter a number in the range of 1 through 7: ");
		number = keyboard.nextInt();

		// Determine and display the day of the week using switch
		// switch case break default
		switch (number) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Error: Number should be between 1 and 7");
		}

		// Close the Scanner
		keyboard.close();
	}
}

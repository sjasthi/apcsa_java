import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Input: int
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered (int): " + intValue);
        
        // Input: double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered (double): " + doubleValue);
        
        // Input: boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("You entered (boolean): " + booleanValue);
        
        // Clear the buffer before reading strings
        scanner.nextLine();
        
        // Input: String
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();
        System.out.println("You entered (String): " + stringValue);
        
        // Input: char
        System.out.print("Enter a character: ");
        char charValue = scanner.nextLine().charAt(0);
        System.out.println("You entered (char): " + charValue);
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Display all values
        System.out.println("\n--- Summary of all inputs ---");
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Boolean: " + booleanValue);
        System.out.println("String: " + stringValue);
        System.out.println("Character: " + charValue);
    }
}

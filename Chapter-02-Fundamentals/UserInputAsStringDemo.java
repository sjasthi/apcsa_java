// Not recommended: Taking the inputs as Strings and converting those to the proper data type.
import java.util.Scanner;

public class UserInputAsStringDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Input: int (taken as String and converted)
        System.out.print("Enter an integer: ");
        String intString = scanner.nextLine();
        int intValue = Integer.parseInt(intString);
        System.out.println("You entered (int): " + intValue);
        
        // Input: double (taken as String and converted)
        System.out.print("Enter a double: ");
        String doubleString = scanner.nextLine();
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println("You entered (double): " + doubleValue);
        
        // Input: boolean (taken as String and converted)
        System.out.print("Enter a boolean (true/false): ");
        String booleanString = scanner.nextLine();
        boolean booleanValue = Boolean.parseBoolean(booleanString);
        System.out.println("You entered (boolean): " + booleanValue);
        
        // Input: String (already a String, no conversion needed)
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();
        System.out.println("You entered (String): " + stringValue);
        
        // Input: char (taken as String and converted)
        System.out.print("Enter a character: ");
        String charString = scanner.nextLine();
        char charValue = charString.charAt(0);
        System.out.println("You entered (char): " + charValue);
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Display all values with their data types
        System.out.println("\n--- Summary of all inputs ---");
        System.out.println("Integer: " + intValue + " (Type: " + ((Object)intValue).getClass().getSimpleName() + ")");
        System.out.println("Double: " + doubleValue + " (Type: " + ((Object)doubleValue).getClass().getSimpleName() + ")");
        System.out.println("Boolean: " + booleanValue + " (Type: " + ((Object)booleanValue).getClass().getSimpleName() + ")");
        System.out.println("String: " + stringValue + " (Type: " + stringValue.getClass().getSimpleName() + ")");
        System.out.println("Character: " + charValue + " (Type: " + ((Object)charValue).getClass().getSimpleName() + ")");
        
        // Demonstrate the conversion methods used
        System.out.println("\n--- Conversion Methods Used ---");
        System.out.println("String to int: Integer.parseInt(\"" + intString + "\") = " + intValue);
        System.out.println("String to double: Double.parseDouble(\"" + doubleString + "\") = " + doubleValue);
        System.out.println("String to boolean: Boolean.parseBoolean(\"" + booleanString + "\") = " + booleanValue);
        System.out.println("String to char: \"" + charString + "\".charAt(0) = " + charValue);
    }
}

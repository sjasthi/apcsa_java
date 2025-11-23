import java.util.Scanner;

public class DayOfWeek
{
   public static void main(String[] args)
   {
      int number;  // To hold the user's input
      
      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Prompt the user and get input
      System.out.print("Enter a number in the range of 1 through 7: ");
      number = keyboard.nextInt();
      
      // Determine and display the day of the week
      if (number == 1)
      {
         System.out.println("Monday");
      }
      
      if (number == 2)
      {
         System.out.println("Tuesday");
      }
      
      if (number == 3)
      {
         System.out.println("Wednesday");
      }
      
      if (number == 4)
      {
         System.out.println("Thursday");
      }
      
      if (number == 5)
      {
         System.out.println("Friday");
      }
      
      if (number == 6)
      {
         System.out.println("Saturday");
      }
      else if (number == 7)
      {
         System.out.println("Sunday");
      }
      
      // Close the Scanner
      keyboard.close();
   }
}

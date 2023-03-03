/* Lesson 1 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L1_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Initial Order
    String itemName = "apple pie";
    System.out.println("The current order is " + itemName);
    // Change Order
    System.out.println("I want to eat something else, what do you want to eat?");
    itemName = scan.nextLine();
    
    // Final Output
    System.out.println("The order has changed to " + itemName);
  }
}

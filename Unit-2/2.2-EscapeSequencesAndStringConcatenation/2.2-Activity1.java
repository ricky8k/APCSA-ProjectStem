/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L2_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// Type of Item
    System.out.println("What type of item are you buying?");
    String itemType = scan.nextLine();
    /// Number of Item(s)
    System.out.println("How many are you buying?");
    int itemQuantity = scan.nextInt();
    /// Unit Weight of Item
    System.out.println("How much does each one weigh?");
    double unitWeight = scan.nextDouble();
    
    // Final Output
    System.out.println(itemQuantity + " " + itemType + " at " + unitWeight + " pounds each will weigh " + (unitWeight * itemQuantity) + " pounds total");
  }
}
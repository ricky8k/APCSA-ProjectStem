/* Lesson 4 Coding Activity Question 4 */

import java.util.Scanner;

class U1_L4_Activity_Four 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a price:");
    double price = scan.nextDouble();
    
    // Final Output
    double change = 10 - price;
    System.out.println("Change from $10: $" + change);
  }
}

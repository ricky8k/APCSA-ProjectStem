/* Lesson 8 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L8_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter two doubles:");
    System.out.print(">");
    Double num1 = scan.nextDouble();
    System.out.print(">");
    Double num2 = scan.nextDouble();
    
    // Difference Calculation
    int diff = (int) Math.abs(Math.round(num2 - num1));
    
    // Final Output
    System.out.println("Difference: " + diff);
  }
}
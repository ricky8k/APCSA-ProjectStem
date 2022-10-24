/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L3_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter an integer:");
    int x = scan.nextInt();
    
    // Final Output
    if (x % 2 == 0) // x is even
    {
      System.out.println("Even");
    }
    else // x is odd
    {
      System.out.println("Odd");
    }
  }
}
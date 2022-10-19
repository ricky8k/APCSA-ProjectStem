/* Lesson 1 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L1_Activity_Four
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter an integer:");
    int x = scan.nextInt();
    
    // Final Output
    if (x % 2 == 0) // Checks if x can be divided by 2
    {
      System.out.println("Divisible by 2!");
    }
    if (x % 3 == 0) // Checks if x can be divided by 3
    {
      System.out.println("Divisible by 3!");
    }
  }
}
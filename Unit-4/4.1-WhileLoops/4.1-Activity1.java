/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L1_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter any numbers (Enter 5 to stop)");
    int x = 0, sum = 0;
    while (x != 5)
    {
      x = scan.nextInt();
      sum = sum + x;
    }
    sum-=5; /* Adjust for stop error */
    
    // Final Output
    System.out.println("Sum is " + sum);
  }
}
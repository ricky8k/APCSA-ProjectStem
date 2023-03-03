/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U4_L3_Activity_Four
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a positive integer:");
    int num = scan.nextInt();
    
    // Create Variables
    int output = 0;
    
    // Final Output
    /// Check num
    if (num > 0)
    {
      for (int i = num; i >= 0; i--)
      {
        if (i % 3 == 0)
          System.out.print(i + " ");
      }
    }
    else /* Error if num is not positive */
      System.out.println("error");
  }
}
/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L3_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a number between 0 and 50:");
    int num = scan.nextInt();
    
    // Create Variables
    int c = 0;
    
    // Final Output
    /// Check num
    if (num > 0 && num < 50)
    {
      for (int i = num; i <= 50; i++)
      {
        System.out.print(i + " ");
        c++;
        if (c == 5)
        {
          System.out.println("");
          c = 0;
        }
      }
    }
    else /* Error if num is not within range */
      System.out.println("error");
  }
}
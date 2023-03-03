/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L2_Activity_Four
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter two test scores:");
    double test1 = scan.nextDouble();
    double test2 = scan.nextDouble();
    
    // Final Output
    if (test1 < 0.0 || test1 > 100.0)
    {
      System.out.println("Not Valid");
    }
    if (test2 < 0.0 || test2 > 100.0)
    {
      System.out.println("Not Valid");
    }
  }
}
/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L1_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter a double:");
    double x = scan.nextDouble();
    
    // Final Output
    if (x == 12.345)
    {
      System.out.println("YES");
    }
  }
}
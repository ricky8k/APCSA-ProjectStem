/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L2_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter two numbers:");
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();
    
    // Final Output
    if (num1 <= num2)
    {
      System.out.println("Smallest is: " + num1);
    }
    if (num1 > num2)
    {
      System.out.println("Smallest is: " + num2);
    }
  }
}
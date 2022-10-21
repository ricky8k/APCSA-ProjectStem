/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L2_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter five numbers:");
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();
    double num3 = scan.nextDouble();
    double num4 = scan.nextDouble();
    double num5 = scan.nextDouble();
    
    // Calculate Average
    double avg = (num1 + num2 + num3 + num4 + num5) / 5;
    
    // Final Output
    if (avg >= 89.95)
    {
      System.out.println("ABOVE AVERAGE");
    }
  }
}
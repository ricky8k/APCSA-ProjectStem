/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L4_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter two numbers:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    
    // Final Output
    if (num1 >= 0 && num1 % 2 == 0 && num2 >= 0 && num2 % 2 == 0)
      System.out.println("Both are positive and even.");
    else if (num1 % 2 == 0 || num2 % 2 == 0)
      System.out.println("At least one is negative or odd.");
  }
}
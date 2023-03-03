/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L3_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter a letter grade:");
    String grade = scan.nextLine();
    
    // Final Output
    if (grade.equals("A")) // A = 90-100
    {
      System.out.println("90-100");
    }
    else if (grade.equals("B")) // B = 80-90
    {
      System.out.println("80-90");
    }
    else if (grade.equals("C")) // C = 70-80
    {
      System.out.println("70-80");
    }
    else if (grade.equals("D")) // D = 60-70
    {
      System.out.println("60-70");
    }
    else if (grade.equals("F")) // F = 0-60
    {
      System.out.println("0-60");
    }
    else // Grade provided is not a valid value
    {
      System.out.println("Invalid letter grade");
    }
  }
}
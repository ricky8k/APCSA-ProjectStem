/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L3_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter two integers:");
    System.out.print("> ");
    int x1 = scan.nextInt();
    System.out.print("> ");
    int x2 = scan.nextInt();
    
    // Create Problem
    int calAnswer = x1 + x2;
    System.out.println(x1 + " + " + x2 + " = ?"); // x1 + x2 = calAnswer
    System.out.print("> ");
    int userAnswer = scan.nextInt();
    
    // Final Output
    if (userAnswer == calAnswer)
    {
      System.out.println("Correct!");
    }
    else
    {
      System.out.println("Wrong");
    }
  }
}

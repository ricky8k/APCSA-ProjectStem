/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L2_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a positive integer:");
    System.out.print("> "); int num = scan.nextInt();
    
    // Create Variables
    int c = 1; /* Count Variable for Loop */
    int n = 10;
    int answer = 0;
    int resid = 0;
    
    // Final Output
    while (c <= String.valueOf(num).length())
    {
      answer = (num % n) - resid;
      resid = resid + answer; /* Adds to residual to resolve error later */
      System.out.println(answer);
      n *= 10; /* Multiply by 10 for Each Refresh */
      c++;
    }
  }
}
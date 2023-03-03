/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L4_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a number: ");
    int num = scan.nextInt();
    
    // Final Output
    if (!(num >= 65 && num <= 100))
      System.out.println("True");
    else
      System.out.println("False");
  }
}
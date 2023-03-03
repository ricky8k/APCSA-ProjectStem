/* Lesson 7 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L7_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Create Password
    String password = "bulbasaur";
    
    // User Input
    System.out.println("Enter password:");
    String pwGuess = scan.nextLine();
    
    // Final Output
    if (pwGuess.equals(password))
      System.out.println("Access granted!");
    else
      System.out.println("Access denied!");
  }
}
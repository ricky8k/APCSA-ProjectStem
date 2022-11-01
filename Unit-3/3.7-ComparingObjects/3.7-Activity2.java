/* Lesson 7 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L7_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter 2 strings:");
    String word1 = scan.nextLine();
    String word2 = scan.nextLine();
    
    // Final Output
    if (word1.equals(word2))
      System.out.println("Equal!");
    else if (word1.toLowerCase().equals(word2.toLowerCase()))
      System.out.println("Different case");
    else if (word1.substring(0, word1.length() - 1).equals(word2.substring(0, word2.length() - 1)))
      System.out.println("Close enough");
    else
      System.out.println("Try again");
  }
}
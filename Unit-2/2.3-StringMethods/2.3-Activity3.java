/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L3_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// First Word
    System.out.println("Enter first word:");
    String w1 = scan.nextLine().toLowerCase();
    /// Second Word
    System.out.println("Enter second word:");
    String w2 = scan.nextLine().toLowerCase();
    
    // Comparing First Letters (ignores dash)
    int wordResult = w1.compareTo(w2);
    
    // Final Output
    System.out.println("Result: " + wordResult);
  }
}
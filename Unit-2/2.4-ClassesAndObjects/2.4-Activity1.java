/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;
 
public class U2_L4_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// Get First String
    System.out.println("Enter first string");
    String s1 = scan.nextLine();
    /// Get Second String
    System.out.println("Enter second string");
    String s2 = scan.nextLine();
    /// Get # of Letters for Each String
    System.out.println("Enter number of letters from each word");
    int n = scan.nextInt();
    
    // Final Output
    /// Print Last n Letters of s1 + First n Letters of s2
    System.out.println(s1.substring(s1.length() - n, s1.length()) + s2.substring(0, n));
  }
}

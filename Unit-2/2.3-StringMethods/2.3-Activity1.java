/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L3_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a string:");
    String initStr = scan.nextLine();
    System.out.println("Enter a number:");
    int x = scan.nextInt();
    
    // Final Output
    String finalStr = initStr.substring(0, x) + initStr.substring(initStr.length() - x);
    System.out.println(finalStr);
  }
}
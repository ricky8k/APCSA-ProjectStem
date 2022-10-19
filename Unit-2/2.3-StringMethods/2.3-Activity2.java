/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L3_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a string:");
    String initStr = scan.nextLine();
    System.out.println("How many characters would you like to delete at the end?");
    int delChar = scan.nextInt();
    
    // Final Output
    String finalStr = initStr.substring(0, initStr.length() - delChar);
    System.out.println(finalStr);
  }
}
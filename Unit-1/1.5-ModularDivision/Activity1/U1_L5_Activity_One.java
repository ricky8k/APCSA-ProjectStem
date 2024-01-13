/* Lesson 5 - Coding Activity Question 1 */

import java.util.Scanner;

class U1_L5_Activity_One 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter a three digit number:");
    int num = scan.nextInt();
    
    // Final Output
    System.out.println("");
    System.out.println("Here are the digits:");
    /// First Digit
    int digit1 = num / 100;
    System.out.println(digit1);
    /// Second Digit
    int digit2 = num / 10 % 10;
    System.out.println(digit2);
    /// Third Digit
    int digit3 = num % 10;
    System.out.println(digit3);
  }
}
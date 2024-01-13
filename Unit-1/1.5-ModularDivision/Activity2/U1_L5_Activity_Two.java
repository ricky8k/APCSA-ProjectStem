/* Lesson 5 - Coding Activity Question 2 */

import java.util.Scanner;

class U1_L5_Activity_Two 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter a four digit number:");
    int num = scan.nextInt();
    
    // Final Output
    System.out.println("");
    System.out.println("Here are the digits:");
    /// Fourth Digit
    int digit4 = num % 10;
    System.out.println(digit4);
    /// Third Digit
    int digit3 = num / 10 % 10;
    System.out.println(digit3);
    /// Second Digit
    int digit2 = num / 100 % 10;
    System.out.println(digit2);
    /// First Digit
    int digit1 = num / 1000;
    System.out.println(digit1);
  }
}
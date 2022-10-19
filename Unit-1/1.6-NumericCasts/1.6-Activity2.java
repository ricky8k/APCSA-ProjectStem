/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L6_Activity_Two 
{
  public static void main(String[] args) 
  {
    // Initialize Variables
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please input two decimal numbers:");
    double decimal1 = scan.nextDouble();
    double decimal2 = scan.nextDouble();
    
    // Decimal to Integer
    int int1 = (int) (decimal1 + 0.5); 
    int int2 = (int) (decimal2 + 0.5);
    int answer = int1 + int2;
    
    // Final Output
    System.out.println("Answer: " + int1 + " + " + int2 + " = " + answer);
  }
}

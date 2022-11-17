/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L2_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter two numbers:");
    int num1 = scan.nextInt(), num2 = scan.nextInt();
    
    // Final Output
    System.out.print("");
    while (num1 < num2)
    {
      if (num1 % 2 == 0) /* Adjust for even num1 */
      {
        num1++;
        System.out.print(num1 + " ");
      }
      else
      {
        System.out.print(num1 + " ");
      }
      num1++;
    }
  }
}
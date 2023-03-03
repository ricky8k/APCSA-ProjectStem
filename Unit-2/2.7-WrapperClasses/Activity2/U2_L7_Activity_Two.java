/* Lesson 7 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L7_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Prepare Variables
    Integer x = null;
    Integer y = null;
    
    // User Input
    System.out.println(x + " " + y);
    System.out.println("Enter values:");
    x = scan.nextInt();
    y = scan.nextInt();
    
    // Final Output
    Double avg = (((double)(x + y)) / 2);
    System.out.println("Average of " + x + " and " + y + " is " + avg);
  }
}

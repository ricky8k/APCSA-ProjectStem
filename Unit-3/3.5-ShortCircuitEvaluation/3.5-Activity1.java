/* Lesson 5 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L5_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter 2 integers:");
    int x = scan.nextInt();
    double y = scan.nextDouble();
    
    // Final Output
    if (x/y > 1 && x/y <= 8)
      System.out.println("Ratio OK");
  }
}

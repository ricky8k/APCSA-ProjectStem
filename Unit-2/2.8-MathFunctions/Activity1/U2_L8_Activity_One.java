/* Lesson 8 Coding Activity Question 1 */

import java.util.Scanner;
import testing.Math;

public class U2_L8_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a positive integer:");
    int n = scan.nextInt();
    
    // Calculation
    System.out.println((int) Math.round((Math.random() * n) + 2));
    System.out.println((int) Math.round((Math.random() * n) + 2));
    System.out.println((int) Math.round((Math.random() * n) + 2));
  }
}

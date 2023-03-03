/* Lesson 4 1/2 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L1_5_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    int n = scan.nextInt();
    
    // Create Variables
    int sum = 0;
    
    // Calculation
    while (n > 0)
    {
      sum = sum + n;
      n--;
    }
    
    // Final Output
    System.out.println(sum);
  }
}
/* Lesson 1 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L1_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter two integers:");
    int x = scan.nextInt();
    int y = scan.nextInt();
    
    // Final Output
    if (x == 20 && y == 40)
    {
      System.out.println("YES");
    }
  }
}
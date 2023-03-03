/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L6_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    int x = scan.nextInt();
    int y = scan.nextInt();
    
    // Final Output
    if(!(y > 9) || (!(x <= 2) && x * y > 10))
      System.out.println("pass");
  }
}

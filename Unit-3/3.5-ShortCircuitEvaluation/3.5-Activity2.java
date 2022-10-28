/* Lesson 5 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L5_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a = scan.nextInt();
    int b = scan.nextInt();

    // Final Output
    if(b != 0 && a % b == 0)
      System.out.println(b + " is a factor of " + a);
    else
      System.out.println(b + " is not a factor of " + a);
  }
}

/* Lesson 1 1/2 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L1_5_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    int num = scan.nextInt();
    
    // Create Variables
    int fac = 1;
    
    // Final Output
    while(fac <= 5)
    {
      System.out.println(num * fac);
      fac++;
    }
  }
}
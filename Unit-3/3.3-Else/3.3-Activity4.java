/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L3_Activity_Four
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("What is the temperature?");
    int temp = scan.nextInt();
    
    // Final Output
    if (temp >= 97 && temp <= 99) // Normal when temp is between 97 & 99
    {
      System.out.println("Temperature is OK");
    }
    else
    {
      System.out.println("NOT NORMAL");
    }
  }
}
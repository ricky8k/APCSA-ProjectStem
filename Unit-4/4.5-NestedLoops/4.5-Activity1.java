/* Lesson 5 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L5_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Input a String:");
    String str = scan.nextLine();
    System.out.println("Input an integer:");
    int x = scan.nextInt();
    
    // Final Output
    for (int i = 0; i < str.length(); i++)
    {
      for (int j = 0; j < x; j++)
      {
        System.out.print(str.substring(i, i + 1));
      }
    }
  }
}
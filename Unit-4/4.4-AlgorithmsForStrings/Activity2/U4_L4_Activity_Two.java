/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L4_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a string:");
    String str = scan.nextLine().toLowerCase();
    
    // Final Output
    for (int i = 0; i < str.length(); i++)
    {
      if (str.substring(i, i + 1).equals("e") || str.substring(i, i + 1).equals("t") || str.substring(i, i + 1).equals("a") || str.substring(i, i + 1).equals("i") || str.substring(i, i + 1).equals("o"))
        System.out.print("");
      else
        System.out.print(str.substring(i, i + 1));
    }
  }
}
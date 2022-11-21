/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L4_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter two strings:");
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    
    // Final Output
    if (str1.length() == str2.length()) /* If str1 & str2 are same length */
    {
      for (int i = str1.length(); i > 0; i--)
      {
        System.out.print(str2.substring(i - 1, i));
        System.out.print(str1.substring(i - 1, i));
      }
    }
    else /* Output error if not the same length */
    {
      System.out.println("error");
    }
  }
}
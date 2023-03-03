/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L4_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Input String:");
    String str = scan.nextLine().toLowerCase();
    
    // Count
    int count = 0;
    /// Check for Vowels after "p"
    for (int i = 0; i < str.length() - 1; i++)
    {
      if (str.substring(i, i + 2).equals("pa"))
        count++;
      else if (str.substring(i, i + 2).equals("pe")) 
        count++;
      else if (str.substring(i, i + 2).equals("pi")) 
        count++;
      else if (str.substring(i, i + 2).equals("po")) 
        count++;
      else if (str.substring(i, i + 2).equals("pu")) 
        count++;
    }
    
    // Final Output
    System.out.println("Contains p followed by a vowel " + count + " times.");
  }
}
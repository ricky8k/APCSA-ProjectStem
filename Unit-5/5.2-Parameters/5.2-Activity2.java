/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U5_L2_Activity_Two
{
  public static void reverser(String str)
  {
    // Initialize Variable
    String revStr = "";
    
    // Reverse str
    for (int i = str.length(); i > 0; i--)
    {
      revStr = revStr + str.substring(i - 1, i);
    }
    
    // Final Output
    System.out.println(revStr);
  }
}
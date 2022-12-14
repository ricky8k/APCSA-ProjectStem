/* Lesson 4 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L4_Activity_Four
{
  public static int substringCount(String x, String y)
  {
    // Count
    int count = 0;
    for (int i = 0; i <= x.length() - y.length(); i++)
    {
      if (x.substring(i, i + y.length()).equals(y))
      {
        count++;
      }
    }
    
    return count;
  }
}
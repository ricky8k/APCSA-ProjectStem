/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L3_Activity_Two
{
  public static void main(String[] args)
  {
    // Final Output
    int c = 0;
    for (int i = 17; i <= 73; i++)
    {
      System.out.print(i + " ");
      c++;
      if (c == 10)
      {
        System.out.println("");
        c = 0;
      }
    }
  }
}
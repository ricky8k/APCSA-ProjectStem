/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U5_L2_Activity_One
{
  public static void timeOfDay(int x)
  {
    // Final Output
    if (x == 0) // 00:00 (Midnight)
      System.out.println("midnight");
    else if (x == 12) // 12:00 (Noon)
      System.out.println("noon");
    else if (x == 18) // 18:00 (Dusk)
      System.out.println("dusk");
    else if (x > 0 && x < 12) // 00:01 - 11:59 (Morning)
      System.out.println("morning");
    else if (x > 12 && x < 18) // 12:01 - 17:59 (Afternoon)
      System.out.println("afternoon");
    else if (x > 18 && x < 24) // 18:01 - 23:59 (Evening)
      System.out.println("evening");
  }
}
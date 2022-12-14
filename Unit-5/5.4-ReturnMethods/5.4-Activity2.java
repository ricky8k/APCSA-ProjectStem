/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U5_L4_Activity_Two
{
  public static double distance(int x1, int y1, int x2, int y2)
  {
    // Calculate
    double total = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    
    return total;
  }
}
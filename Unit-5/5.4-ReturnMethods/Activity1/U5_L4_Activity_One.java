/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;
import shapes.*;

public class U5_L4_Activity_One
{
  public static int totalSides(RegularPolygon x, RegularPolygon y)
  {
    // Calculate
    int total = x.getNumSides() + y.getNumSides();
    
    return total;
  }
}

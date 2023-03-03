/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;
import shapes.*;

public class U5_L4_Activity_Three
{
  public static double circDiff(Circle x, Circle y)
  {
    // Calculate
    double total = Math.abs(x.getCircumference() - y.getCircumference());
    
    return total;
  }
}

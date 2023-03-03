/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;
import shapes.*;
import testing.Math;

public class U5_L3_Activity_Two
{
  public static void randomize(Rectangle x)
  {
    // Randomize Length
    int length = (int) ((Math.random() * 11) + 10);
    if (length % 2 != 0)
      length++;
    
    // Randomize Width
    int width = (int) ((Math.random() * 7) + 7);
    if (width % 2 == 0)
      width++;
    
    // Set New Length & Width for Rectangle x
    x.setLength(length);
    x.setWidth(width);
  }
}

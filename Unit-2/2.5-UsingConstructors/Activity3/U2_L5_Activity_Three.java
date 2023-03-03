/* Lesson 5 Coding Activity Question 3 */

import java.util.Scanner;
import shapes.*;

public class U2_L5_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Type a side length:");
    double sLength = scan.nextDouble();
    
    // Creating Shapes
    RegularPolygon s1 = new RegularPolygon(sLength);
    RegularPolygon s2 = new RegularPolygon(4, sLength);
    
    // Final Output
    System.out.println(s1);
    System.out.println(s2);
  }
}

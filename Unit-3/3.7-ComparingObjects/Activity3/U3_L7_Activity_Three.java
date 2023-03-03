/* Lesson 7 Coding Activity Question 3 */

import java.util.Scanner;
import shapes.*;

public class U3_L7_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// Side Length for shape1
    System.out.println("Enter the side length of the first regular polygon:");
    double sideLength = scan.nextDouble();
    /// # of Sides for shape2
    System.out.println("Enter the number of sides of the second polygon:");
    int numSides = scan.nextInt();
    /// Side Length for shape2
    System.out.println("Enter the side length of the second polygon:");
    double sideLength2 = scan.nextDouble();
    
    // Creating Shapes
    RegularPolygon shape1 = new RegularPolygon(sideLength);
    RegularPolygon shape2 = new RegularPolygon(numSides, sideLength2);
    
    // Final Output
    if (shape1.equals(shape2))
      System.out.println("Congruent Regular Polygons!");
    else
      System.out.println("Different Regular Polygons");
  }
}

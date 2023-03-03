/* Lesson 7 Coding Activity Question 3 */

import java.util.Scanner;
import shapes.*;
 
public class U2_L7_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter number of sides:");
    Integer sides = scan.nextInt();
    System.out.println("Enter side length:");
    Double length = scan.nextDouble();
    
    // Create Shapes
    RegularPolygon p1 = new RegularPolygon(sides, length);
    RegularPolygon p2 = new RegularPolygon(sides + 1, length * 2);
    
    // Final Output
    System.out.println("The area of a " + p1 + " is: " + p1.getArea());
    System.out.println("The area of a " + p2 + " is: " + p2.getArea());
  }
}

/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;
import shapes.*;

public class U2_L6_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// Number of Sides
    System.out.println("Enter number of sides: ");
    System.out.print("> ");
    int sNum = scan.nextInt();
    /// Side Length
    System.out.println("Enter the side length: ");
    System.out.print("> ");
    double sLength = scan.nextDouble();
    
    // Calculation
    RegularPolygon polygon = new RegularPolygon(sNum, sLength);
        
    // Final Output
    /// Area with Default sNum
    System.out.println("Area with " + polygon.getNumSides() + " sides: " + polygon.getArea());
    /// Area with sNum + 2
    System.out.println("Incrementing the number of sides by two");
    polygon.addSides(2);
    System.out.println("Area with " + polygon.getNumSides() + " sides: " + polygon.getArea());
  }
}

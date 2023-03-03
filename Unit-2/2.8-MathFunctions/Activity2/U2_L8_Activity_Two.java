/* Lesson 8 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L8_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// Coordinates for x
    System.out.println("Enter the first x-coordinate:");
    double x1 = scan.nextDouble();
    System.out.println("Enter the second x-coordinate:");
    double x2 = scan.nextDouble();
    /// Coordinates for y
    System.out.println("Enter the first y-coordinate:");
    double y1 = scan.nextDouble();
    System.out.println("Enter the second y-coordinate:");
    double y2 = scan.nextDouble();
    
    // Slope Calculation
    double m = (y2 - y1) / (x2 - x1);
    
    // Final Output
    System.out.println("Slope: " + m);
  }
}
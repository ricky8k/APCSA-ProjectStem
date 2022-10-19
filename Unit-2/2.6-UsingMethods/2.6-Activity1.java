/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;
import shapes.*;

public class U2_L6_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter the radius of the circle:");
    System.out.print("> ");
    double r = scan.nextDouble();
    Circle s = new Circle(r);
    
    // Final Output
    System.out.println("A circle with a radius " + s.getRadius() + " has a circumference of " + s.getCircumference() + " and an area of " + s.getArea());
  }
}

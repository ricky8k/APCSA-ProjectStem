/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L4_Activity_Three 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Prepare Variables
    double pi = 3.14;
    
    // User Input
    System.out.println("Enter a circumference:");
    double circumference = scan.nextDouble();
    
    // Circumference to Radius
    double radius = (circumference / 2) / pi;
    System.out.println("Radius: " + radius);
    
    // Circumference to Area
    double area = (radius * radius) * pi;
    System.out.println("Area: " + area);
  }
}

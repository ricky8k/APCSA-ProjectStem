/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L4_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// Latitude
    System.out.println("Please enter the latitude:");
    double latitude = scan.nextDouble();
    /// Longitude
    System.out.println("Please enter the longitude:");
    double longitude = scan.nextDouble();
    
    // Validating Coordinates
    if (!(latitude >= -90 && latitude <= 90))
      System.out.println("latitude is incorrect");
    if (!(longitude >= -180 && longitude <= 180))
      System.out.println("longitude is incorrect");
    
    // Final Output
    if (latitude >= -90 && latitude <= 90 && longitude >= -180 && longitude <= 180)
      System.out.println("The location: " + latitude + ", " + longitude);
  }
}
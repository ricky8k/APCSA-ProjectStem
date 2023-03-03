/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L2_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Create Variables
    int cont = 1;
    double longitude, latitude;
    /// Initial Values for Coordinates
    double farNorth = -90;
    double farSouth = 90;
    double farEast = -180;
    double farWest = 180;
    
    // User Input
    while (cont == 1)
    {
      /// Input for Longitude
      System.out.println("Please enter the longitude:");
      longitude = scan.nextDouble();
      /// Input for Latitude
      System.out.println("Please enter the latitude:");
      latitude = scan.nextDouble();
      
      /// Verify Inputs
      if ((longitude >= -180 && longitude <= 180) && (latitude >= -90 && latitude <= 90))
      {
        if (latitude > farNorth)
          farNorth = latitude;
        if (latitude < farSouth)
          farSouth = latitude;
        if (longitude > farEast)
          farEast = longitude;
        if (longitude < farWest)
          farWest = longitude;
      }
      else /* Output error if criteria not met */
      {
        System.out.println("Incorrect Latitude or Longitude");
      }
      /// Ask User for New Input(s)
      System.out.println("Would you like to enter another location?");
      cont = scan.nextInt();
    }
    
    // Final Output
    System.out.println("Farthest North: " + farNorth);
    System.out.println("Farthest South: " + farSouth);
    System.out.println("Farthest East: " + farEast);
    System.out.println("Farthest West: " + farWest);
  }
}

/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import java.util.Scanner;
import assignment2.Airplane;

public class Assignment2
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude):");
    /// Plane3
    String pCSign = scan.nextLine().toUpperCase(); // Call-sign
    Double pDist = scan.nextDouble(); // Distance
    Integer pBear = scan.nextInt(); // Bearing
    Integer pAlti = scan.nextInt(); // Altitude
    System.out.println("");
    
    // Creating Planes
    /// Plane1 (AAA01) with dist. 1.0 mi, bearing 0, alti. 0ft
    Airplane plane1 = new Airplane("AAA01", 1.0, 0, 0);
    /// Plane2 (AAA02) with dist. 15.8 mi, bearing 128, alti. 30000ft
    Airplane plane2 = new Airplane("AAA02", 15.8, 128, 30000);
    /// Plane3 (pCsign) with dist. pDist, bearing pBear, alti. pAlti
    Airplane plane3 = new Airplane(pCSign, pDist, pBear, pAlti);
    
    // Initial Run
    /// Plane Positions
    System.out.println("Initial Positions:");
    System.out.println("\"Airplane 1\": " + plane1.toString()); // Plane1
    System.out.println("\"Airplane 2\": " + plane2.toString()); // Plane2
    System.out.println("\"Airplane 3\": " + plane3.toString()); // Plane3
    System.out.println("");
    /// Plane Distances
    System.out.println("Initial Distances:");
    double distDiff1 = plane1.distTo(plane2); // Calculate Dist. Between P1 & P2
    System.out.println("The distance between Airplane 1 and Airplane 2 is " + distDiff1 + " miles.");
    double distDiff2 = plane1.distTo(plane3); // Calculate Dist. Between P1 & P3
    System.out.println("The distance between Airplane 1 and Airplane 3 is " + distDiff2 + " miles.");
    double distDiff3 = plane2.distTo(plane3); // Calculate Dist. Between P2 & P3
    System.out.println("The distance between Airplane 2 and Airplane 3 is " + distDiff3 + " miles.");
    System.out.println("");
    /// Plane Height Differences
    System.out.println("Initial Height Differences:");
    int altiDiff1 = (int) Math.abs(plane1.getAlt() - plane2.getAlt()); // Calculate Alti. Between P1 & P2
    System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + altiDiff1 + " feet.");
    int altiDiff2 = (int) Math.abs(plane1.getAlt() - plane3.getAlt()); // Calculate Alti. Between P1 & P3
    System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + altiDiff2 + " feet.");
    int altiDiff3 = (int) Math.abs(plane2.getAlt() - plane3.getAlt()); // Calculate Alti. Between P2 & P3
    System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + altiDiff3 + " feet.");
    System.out.println("");
    
    // Recalculation
    /// Plane1
    plane1.move(distDiff3, 65); // Moves plane by init. dist. between P2 & P3; bearing 65 
    /* Increase Alti. by 3000ft */
    plane1.gainAlt();
    plane1.gainAlt();
    plane1.gainAlt();
    /// Plane2
    plane2.move(8, 135); // Moves plane by 8.0 mi.; bearing 135
    /* Decrease Alti. by 2000ft */
    plane2.loseAlt();
    plane2.loseAlt();
    /// Plane3
    plane3.move(5, 55); // Moves plane by 5.0 mi.; bearing 55
    /* Decrease Alti. by 4000ft */
    plane3.loseAlt();
    plane3.loseAlt();
    plane3.loseAlt();
    plane3.loseAlt();
    
    // New Run
    /// Plane Positions
    System.out.println("New Positions:");
    System.out.println("\"Airplane 1\": " + plane1.toString()); // Plane1
    System.out.println("\"Airplane 2\": " + plane2.toString()); // Plane2
    System.out.println("\"Airplane 3\": " + plane3.toString()); // Plane3
    System.out.println("");
    /// Plane Distances
    System.out.println("New Distances:");
    distDiff1 = plane1.distTo(plane2); // Calculate Dist. Between P1 & P2
    System.out.println("The distance between Airplane 1 and Airplane 2 is " + distDiff1 + " miles.");
    distDiff2 = plane1.distTo(plane3); // Calculate Dist. Between P1 & P3
    System.out.println("The distance between Airplane 1 and Airplane 3 is " + distDiff2 + " miles.");
    distDiff3 = plane2.distTo(plane3); // Calculate Dist. Between P2 & P3
    System.out.println("The distance between Airplane 2 and Airplane 3 is " + distDiff3 + " miles.");
    System.out.println("");
    /// Plane Height Differences
    System.out.println("New Height Differences:");
    altiDiff1 = (int) Math.abs(plane1.getAlt() - plane2.getAlt()); // Calculate Alti. Between P1 & P2
    System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + altiDiff1 + " feet.");
    altiDiff2 = (int) Math.abs(plane1.getAlt() - plane3.getAlt()); // Calculate Alti. Between P1 & P3
    System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + altiDiff2 + " feet.");
    altiDiff3 = (int) Math.abs(plane2.getAlt() - plane3.getAlt()); // Calculate Alti. Between P2 & P3
    System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + altiDiff3 + " feet.");
    System.out.println("");
  }
}

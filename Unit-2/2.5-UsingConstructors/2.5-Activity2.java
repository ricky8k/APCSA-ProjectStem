/* Lesson 5 Coding Activity Question 2 */

import java.util.Scanner;
import shapes.*;

public class U2_L5_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Final Output
    /// Parameters for Rectangle 1
    System.out.println("Type a number for length and width:");
    double s1length = scan.nextDouble();
    Rectangle s1 = new Rectangle(s1length);
    /// Parameters for Rectangle 2
    System.out.println("Type a length:");
    double s2length = scan.nextDouble();
    System.out.println("Type a width:");
    double s2width= scan.nextDouble();
    Rectangle s2 = new Rectangle(s2length, s2width);
    
    // Final Output
    System.out.println(s1);
    System.out.println(s2);
  }
}

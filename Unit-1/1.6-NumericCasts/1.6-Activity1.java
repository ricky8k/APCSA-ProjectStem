/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L6_Activity_One 
{
  public static void main(String[] args) 
  {
    // Initalize Scanner
    Scanner scan = new Scanner(System.in);

    // User Input
    System.out.println("Please enter the numerator:");
    int numer = scan.nextInt();
    System.out.println("Please enter the denominator:");
    int denom = scan.nextInt();
    
    // Fraction to Decimal
    double decimal = (double) numer / denom;
    
    // Final Output
    System.out.println("");
    System.out.println("The decimal value is: " + decimal);
  }
}

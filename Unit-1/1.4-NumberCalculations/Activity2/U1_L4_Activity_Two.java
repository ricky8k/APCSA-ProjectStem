/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L4_Activity_Two 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    int numFeet = scan.nextInt();
    
    // Calculation
    int numYards = numFeet / 3;
    
    // Final Output
    System.out.println(numYards);
  }
}
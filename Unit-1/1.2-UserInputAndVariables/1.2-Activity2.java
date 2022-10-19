/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L2_Activity_Two 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter four names:");
    String firstName = scan.nextLine();
    String secondName = scan.nextLine();
    String thirdName = scan.nextLine();
    String fourthName = scan.nextLine();
    
    // Final Output
    System.out.println("");
    System.out.println(fourthName + " " + secondName + " " + thirdName + " " + firstName);
    
  }
}

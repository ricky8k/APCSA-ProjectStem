/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L1_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("What is your name?");
    String name = scan.nextLine();
    System.out.println("What is your favorite number?");
    int number = scan.nextInt();
    
    // Final Output
    System.out.println("Your name is " + name + " and you like the number " + number + ".");
  }
}

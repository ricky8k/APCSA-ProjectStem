/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L2_Activity_Three 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Hi there. What is your name?");
    String name = scan.nextLine();
    System.out.println("What state do you live in?");
    String state = scan.nextLine();
    
    // Final Output
    System.out.println("My name is " + name + ". I live in " + state + ".");
  }
}

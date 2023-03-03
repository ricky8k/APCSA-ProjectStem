/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L4_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input 
    System.out.println("Enter starting number (must be an integer)");
    System.out.print(">");
    int num = scan.nextInt();
    
    // Final Output
    num++;
    System.out.println("number is now " + num);
    num++;
    System.out.println("number is now " + num);
    num++;
    System.out.println("number is now " + num);
    num++;
    System.out.println("number is now " + num);
    num--;
    System.out.println("number is now " + num);
    num--;
    System.out.println("number is now " + num);
    num--;
    System.out.println("number is now " + num);
    num--;
    System.out.println("number is now " + num);
  }
}
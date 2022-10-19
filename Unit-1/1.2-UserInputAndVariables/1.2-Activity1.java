/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L2_Activity_One 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("What is your favorite food?");
    String favoriteFood = scan.nextLine();
    
    // Final Output
    System.out.println("I like to eat " + favoriteFood + " as well!");
  }
}
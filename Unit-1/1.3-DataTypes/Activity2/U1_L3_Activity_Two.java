/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L3_Activity_Two 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Hi there. What is your name?");
    String name = scan.nextLine();
    System.out.println("Hi " + name + ". How old are you?");
    int age = scan.nextInt();
    
    // Final Output
    System.out.println(name + " is " + age + " years old.");
  }
}

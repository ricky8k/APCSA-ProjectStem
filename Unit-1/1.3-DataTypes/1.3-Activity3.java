/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U1_L3_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Java is an object-oriented programming language, true or false?");
    boolean answerOne = scan.nextBoolean();
    System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
    boolean answerTwo = scan.nextBoolean();
    
    // Final Output
    System.out.println();
    System.out.println("Question 1 - Your answer: " + answerOne + ". Correct answer: true");
    System.out.println("Question 2 - Your answer: " + answerTwo + ". Correct answer: true");
  }
}
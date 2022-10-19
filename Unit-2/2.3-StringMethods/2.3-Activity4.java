/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U2_L3_Activity_Four
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a sentence:");
    String sentence = scan.nextLine();
    
    // Final Output
    System.out.println(sentence.indexOf(" "));
  }
}
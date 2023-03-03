/* Lesson 1 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L1_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter the Scores:");
    int score = 0, bestScore = 0;
    while (score != -1)
    {
      score = scan.nextInt();
      if (score > bestScore)
        bestScore = score;
    }
    
    // Final Output
    System.out.println("The largest score is " + bestScore);
  }
}
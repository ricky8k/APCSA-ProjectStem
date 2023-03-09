/* Lesson 1 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L1_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Input a word:");
    String word = scan.nextLine();
    // Create Index
    int n = 2;
    
    // Final Output
    for (int i = 0; i <= word.length();)
    {
      if (word.indexOf(word) % 2 == 0)
      {
        System.out.print(word.substring(i, i + n)); i += 3;
        while (i + n > word.length())
          n--;
      }
    }
  }
}

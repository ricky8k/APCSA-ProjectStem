// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L4_Activity_One
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
    System.out.println("Please enter words, enter STOP to stop the loop.");
    String input = scan.nextLine();
    while(!input.equals("STOP"))
    {
      words.add(input);
      input = scan.nextLine();
    }
    System.out.println("Enter initials to search for, enter STOP to stop the loop.");
    input = scan.nextLine();
    while(!input.equals("STOP"))
    {
      System.out.println("Search for " + input + ": " + U7_L4_Activity_One.countSecondInitial(words, input));
      input = scan.nextLine();
    }
  }

}
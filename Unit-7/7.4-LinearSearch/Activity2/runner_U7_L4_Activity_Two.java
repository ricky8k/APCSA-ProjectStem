// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L4_Activity_Two
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
    System.out.println("Enter String to search for.");
    input = new String(scan.nextLine());
    System.out.println("searchSecond returns: " + U7_L4_Activity_Two.searchSecond(words, input));
  }

}
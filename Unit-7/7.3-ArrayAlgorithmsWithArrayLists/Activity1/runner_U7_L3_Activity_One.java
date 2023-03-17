// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L3_Activity_One
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
    U7_L3_Activity_One.shiftLeft(words);
    System.out.println(words);
  }
  
}
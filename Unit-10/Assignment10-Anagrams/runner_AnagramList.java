// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.ArrayList;
import java.util.Scanner;
public class runner_AnagramList
{
  public static void main(String[] args){
    System.out.println("Enter a word:");
    Scanner scan = new Scanner(System.in);
    String ipt = scan.nextLine();
    while(ipt.length() > 8){
      System.out.println("Warning - this willl result in a LOT of anagrams, please use a shorter String. Remove this check at your own risk!");
      ipt = scan.nextLine();
    }
    AnagramList test = new AnagramList(ipt);
    System.out.println("\nAnagrams list:");
    System.out.println(test.getAnagrams());
    System.out.println("\nThere are " + test.getAnagrams().size() + " possible anagrams of \"" + ipt + "\"");
    String tgt = "";
    while(!tgt.equals("QUIT")){
      System.out.println("\nEnter a String to search for in these anagrams, or \"QUIT\" to end:");
      tgt = scan.nextLine();
      if(!tgt.equals("QUIT"))
        System.out.println("Index of " + tgt + " is " + test.searchAnagrams(tgt));
    }
  }
}

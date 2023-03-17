// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
public class runner_U7_L5_Activity_One
{

  public static void main(String[] args)
  {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter array length:");
    int len = scan.nextInt();
    scan.nextLine();

    String[] wordList = new String[len];
    System.out.println("Enter values:");

    for(int i = 0; i < len; i++)
    {
      wordList[i] = scan.nextLine();
    }

    U7_L5_Activity_One.sortAndPrintReverse(wordList);
  }
}
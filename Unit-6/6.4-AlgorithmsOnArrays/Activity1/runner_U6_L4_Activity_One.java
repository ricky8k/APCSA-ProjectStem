// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
public class runner_U6_L4_Activity_One
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
    System.out.println("Enter new String:");
    String insWord = scan.nextLine();
    System.out.println("Enter place:");
    int pos = scan.nextInt();
    System.out.println("Method return: " + U6_L4_Activity_One.insert(wordList, insWord, pos));
    System.out.print("Array contents: {");
    for(int i = 0; i < len-1; i++)
    {
      System.out.print(wordList[i] + ", ");
    }
    System.out.println(wordList[len-1]+"}");
  }
}

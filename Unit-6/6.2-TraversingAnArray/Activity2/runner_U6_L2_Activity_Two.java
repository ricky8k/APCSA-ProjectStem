// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_U6_L2_Activity_Two
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter array length:");
    int len = scan.nextInt();
    int[] vals = new int[len];

    System.out.println("Enter values:");
    for(int i = 0; i < len; i++)
    {
      vals[i] = scan.nextInt();
    }
    System.out.println("Number divisible by three: " + U6_L2_Activity_Two.numDivisibleBy3(vals));

  }
}

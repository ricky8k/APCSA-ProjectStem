// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_U6_L5_Activity_Three
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter array length:");
    int len = scan.nextInt();
    int[] nums = new int[len];
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++)
    {
      nums[i] = scan.nextInt();
    }
    System.out.println(U6_L5_Activity_Three.avg(nums));
  }
}

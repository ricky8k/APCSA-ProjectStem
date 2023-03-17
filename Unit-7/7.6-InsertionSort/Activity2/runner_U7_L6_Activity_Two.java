// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L6_Activity_Two
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<Integer>();
    System.out.println("Enter ArrayList length:");
    int len = scan.nextInt();
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++)
    {
      nums.add(scan.nextInt());
    }
    int comps = U7_L6_Activity_Two.insertSort(nums);
    System.out.println("Sorted list: " + nums);
    System.out.println("Number of comparisons: " + comps);
  }
}

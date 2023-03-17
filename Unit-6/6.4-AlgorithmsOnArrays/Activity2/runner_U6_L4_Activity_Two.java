// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
public class runner_U6_L4_Activity_Two{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter array length:");
    int len = scan.nextInt();
    int[] nums = new int[len];
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++){
      nums[i] = scan.nextInt();
    }
    System.out.println("Which method?\n1 - swap\n2 - allReverseSwap");
    int mtdNum = scan.nextInt();
    if(mtdNum == 1){
      System.out.println("Enter two indices:");
      int pos1 = scan.nextInt();
      int pos2 = scan.nextInt();
      U6_L4_Activity_Two.swap(nums, pos1, pos2);
    }
    else if(mtdNum == 2){
      U6_L4_Activity_Two.allReverseSwap(nums);
    }
    else{
      return;
    }
    System.out.print("Array contents: {");
    for(int i = 0; i < len-1; i++){
      System.out.print(nums[i] + ", ");
    }
    System.out.println(nums[len-1]+"}");
  }
}
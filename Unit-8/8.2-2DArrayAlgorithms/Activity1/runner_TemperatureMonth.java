// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_TemperatureMonth {
 public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter number of weeks:");
   int rows = scan.nextInt();

   System.out.println("Enter number of days in a week:");
   int cols = scan.nextInt();

   double[][] mat = new double[rows][cols];
   System.out.println("Enter temperature values:");

   for(int r = 0; r < rows; r++){
       for(int c = 0; c < cols; c++)
           mat[r][c] = scan.nextDouble();
   }

   System.out.println("Enter Week To Access (0-indexed): ");
   int i = scan.nextInt();

   System.out.println("Enter Day of the Week to Access(0-indexed): ");
   int j = scan.nextInt();

   scan.close();
    
   TemperatureMonth t = new TemperatureMonth(mat);
   System.out.println("\nTemperatures:");

   for(double[] r : mat) {
       for(double n : r) {
           System.out.print(n + "\t");
       }

       System.out.println();
   }

   System.out.println();
   System.out.print("getMaxTempWeekly: ");
   double[] weeklyMax = t.getMaxTempWeekly();

   System.out.print("[");
   for(double max:weeklyMax) System.out.print(max + " ");
   System.out.println("]");
  
   System.out.print("getMinTempWeekly: ");
   double[] weeklyMin = t.getMinTempWeekly();
   System.out.print("[");
   for(double min:weeklyMin) System.out.print(min + " ");
   System.out.println("]");

   System.out.println("getRange: " + t.getRange());
   System.out.print("getCertainTemp(" + i + "," + j + "): " + t.getCertainTemp(i,j));

 }
}
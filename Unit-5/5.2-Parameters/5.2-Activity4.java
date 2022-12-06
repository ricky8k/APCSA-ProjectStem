/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L2_Activity_Four
{
  public static void coinConverter(int n)
  {
    // Coin Conversion
    int dollars = n / 100;
    int quarters = (n - (dollars * 100)) / 25;
    int dimes = (n - (dollars * 100) - (quarters * 25)) / 10;
    int nickels = (n - (dollars * 100) - (quarters * 25) - (dimes * 10)) / 5;
    int pennies = (n - (dollars * 100) - (quarters * 25) - (dimes * 10) - (nickels * 5));
    
    // Final Output
    System.out.println("Dollar Bills: " + dollars);
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);
  }
}
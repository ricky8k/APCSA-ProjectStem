/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L2_Activity_Four
{
  public static void coinConverter(int n)
  {
    // Coin Conversion
    int dollars = n / 100;
    int quarters = n % 100 / 25;
    int dimes = n * 0;
    int nickels = n % 15 / 4;
    int pennies = n % 10;
    
    // Final Output
    System.out.println("Dollar Bills: " + dollars + "\nQuarters: " + quarters + "\nDimes: " + dimes + "\nNickels: " + nickels + "\nPennies: " + pennies);
  }
}
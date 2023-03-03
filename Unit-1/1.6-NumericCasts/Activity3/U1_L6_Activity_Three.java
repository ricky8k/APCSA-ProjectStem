/* Lesson 6 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L6_Activity_Three 
{
  public static void main(String[] args) 
  {
    // Initialize Variables
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please input a decimal number:");
    double decimal = scan.nextDouble();
    
    // Conversion
    double tenth = ((decimal - (int) decimal) * 10); // Tenths
    double hundr = ((tenth - (int) tenth) * 10); // Hundredths
    double thous = ((hundr - (int) hundr) * 10); // Thousandths
    
    System.out.println("Answer: " + (int) tenth + " " + (int) hundr + " " + (int) thous);
  }
}

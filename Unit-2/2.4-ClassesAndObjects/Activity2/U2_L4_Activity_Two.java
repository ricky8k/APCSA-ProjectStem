/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L4_Activity_Two{
  public static void main(String[] args){
  
    // User Input
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = str1;
    
    // Final Output
    str1 = str1.toUpperCase();
    str2 = (str2.substring(0, 1).toUpperCase()) + str2.substring(1, str2.length()); 
    System.out.println(str2);
    System.out.println(str1);
  }
}
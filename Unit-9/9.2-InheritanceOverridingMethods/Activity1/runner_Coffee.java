// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
public class runner_Coffee 
{

  private static SpecialityCoffee c;

  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Choose constructor to test:\n1 - SpecialityCoffee()\n2 - SpecialityCoffee(String size, String type, String flavor)\n3 - SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor)");
    int which = scan.nextInt();
    if (which == 1) 
    {
      c = new SpecialityCoffee();
    } 
    else if (which == 2 || which == 3) 
    {
      scan.nextLine();
      System.out.println("Size?");
      String sz = scan.nextLine();
      System.out.println("Type?");
      String tp = scan.nextLine();
      System.out.println("Flavor?");
      String fl = scan.nextLine();
      if (which == 3) 
      {
        boolean iS = false;
        System.out.println("Is Skinny (y/n)?");
        String sk = scan.nextLine().toLowerCase();
        if(sk.equals("y")||sk.equals("yes")||sk.equals("t")||sk.equals("true"))
          iS = true;
        System.out.println("Shots?");
        int sh = scan.nextInt();
        c = new SpecialityCoffee(sz, iS, sh, tp, fl);
      }
      else
        c = new SpecialityCoffee(sz, tp, fl);
    }
    if(c != null) 
    {
      System.out.println(c);
      int p = c.getPrice();
      System.out.println("$"+p/100 + "."+ (p%100)/10 + p%10);
    }
  }
}
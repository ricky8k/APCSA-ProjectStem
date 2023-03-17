// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_DoubleCone {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DoubleCone c;

    System.out.println("Type \"s\" for same flavors, \"d\" for different.");
    String cons = scan.nextLine().toLowerCase();
    System.out.println("Type \"w\" for waffle cone.");

    boolean w = scan.nextLine().toLowerCase().equals("w");

    if (cons.equals("s")) {
      System.out.println("What flavour?");
      String f = scan.nextLine();
      System.out.println("topping?");
      String t = scan.nextLine();
      c = new DoubleCone(f, w);
      c.addTopping(t);
      
    } else {
      System.out.println("First flavour?");
      String f1 = scan.nextLine();
      System.out.println("Second flavour?");
      String f2 = scan.nextLine();
      System.out.println("topping?");
      String t = scan.nextLine();
      c = new DoubleCone(f1, f2, w);
      c.addTopping(t);
    }

    System.out.println(c);
    System.out.println("Change flavors? (y/n)");
    if(scan.nextLine().toLowerCase().equals("y")) {
      System.out.println("Type \"s\" for same flavors, \"d\" for different.");
      String mtd = scan.nextLine().toLowerCase();
      if (mtd.equals("s")) {
        System.out.println("What flavour?");
        String f = scan.nextLine();
        c.setFlavor(f);
      } else {
        System.out.println("First flavour?");
        String f1 = scan.nextLine();
        System.out.println("Second flavour?");
        String f2 = scan.nextLine();
        c.setFlavor(f1, f2);
      }
      System.out.println(c);
    }
  }
}

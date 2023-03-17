// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_Plane
{
  public static void main (String str[]){
    Scanner scan = new Scanner(System.in);
    Plane p = new Plane ();
    String instruction = "";
    while(!instruction.equals("q")){
      System.out.println(p);
      System.out.println("Location: " + p.getLocation());
      System.out.println("Type \"u\" to move upwards, \"d\" to move downwards, \"n\" for new Plane, \"q\" to quit.");
      instruction = scan.nextLine();
      if(instruction.equals("u")){
        p.upward();
      }
      else if(instruction.equals("d")){
        p.downward();
      }
      else if(instruction.equals("n")){
        System.out.println("Starting location for a new Plane?");
        int start = scan.nextInt();
        p = new Plane(start);
        scan.nextLine();
      }
      else if(!instruction.equals("q")){
        System.out.println("Instruction not recognized.");
      }
    }
  }
}
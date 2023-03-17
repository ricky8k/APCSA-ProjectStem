// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_Rectangle{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Rectangle r = new Rectangle();
    String instruction = "";
    while(!instruction.equals("q")){
      System.out.println("Type the name of the method to test. Type c to construct a new rectangle, q to quit.");
      instruction = scan.nextLine();
      if(instruction.equals("getArea")){
        System.out.println(r.getArea());
      }
      else if(instruction.equals("getBase")){
        System.out.println(r.getBase());
      }
      else if(instruction.equals("getHeight")){
        System.out.println(r.getHeight());
      }
      else if(instruction.equals("getPerimeter")){
        System.out.println(r.getPerimeter());
      }
      else if(instruction.equals("toString")){
        System.out.println(r);
      }
	else if(instruction.equals("getDiagonal")){
		System.out.println(r.getDiagonal());
	}
      else if(instruction.equals("setBase")){
        System.out.println("Enter parameter value:");
        double arg = scan.nextDouble();
        r.setBase(arg);
        scan.nextLine();
      }
      else if(instruction.equals("setHeight")){
        System.out.println("Enter parameter value:");
        double arg = scan.nextDouble();
        r.setHeight(arg);
        scan.nextLine();
      }
      else if(instruction.equals("equals")){
        System.out.println("Enter base and height:");
        double bs = scan.nextDouble();
        double ht = scan.nextDouble();
        Rectangle rOther = new Rectangle(bs, ht);
        System.out.println(r.equals(rOther));
        scan.nextLine();
      }
      else if(instruction.equals("c")){
        System.out.println("Enter base and height:");
        double bs = scan.nextDouble();
        double ht = scan.nextDouble();
        r = new Rectangle(bs, ht);
        scan.nextLine();
      }
      else if(!instruction.equals("q")){
        System.out.println("Not recognized.");
      }
    }
  }
}
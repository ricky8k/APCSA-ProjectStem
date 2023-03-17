// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_Oven 
{

  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Maximum oven temperature:");
    int maxTemp = scan.nextInt();
    System.out.println("Starting temperature of the oven:");
    int startTemp = scan.nextInt();

    Oven oven = new Oven(maxTemp, startTemp);

    String instruction = "";

    while (!instruction.equals("q")) 
    {
      System.out.println("New oven with a maximum temperature of " + oven.getMaxTemp() + " and a starting temperature of " +  oven.getCurrentTemp() + " degrees.");

      System.out.println("To preheat the oven enter \"p\", to turn the oven off enter" + " \"o\", to restart enter \"r\", to quit enter \"q\"");

      instruction = scan.next();

      if (instruction.equals("p")) 
      {
        System.out.println("Enter the temperature to preheat the oven to:");
        int temp = scan.nextInt();
        oven.preheat(temp);
        System.out.println("Current temperature of the oven is now " + oven.getCurrentTemp() + " degrees\n");
      } 
      else if (instruction.equals("o")) 
      {
        System.out.println("Turning the oven off.\n");
        oven.turnOff();
      }
    }
  }
}
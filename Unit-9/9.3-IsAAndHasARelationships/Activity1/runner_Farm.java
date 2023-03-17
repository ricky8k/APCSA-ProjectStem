// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_Farm
{
  private static Scanner scan;

  public static void main(String[] args)
  {
    scan = new Scanner(System.in);
    System.out.println("First, what's your farmer's forename?");
    String f = scan.nextLine();
    System.out.println("And their surname?");
    Farmer fm = new Farmer(f, scan.nextLine());
    Animal a1 = addAnimal();
    Animal a2 = addAnimal();
    Animal a3 = addAnimal();
    Farm theFarm = new Farm(fm, a1, a2, a3);
    System.out.println();
    System.out.println(theFarm);
  }

  private static Animal addAnimal()
  {
    String type = "";
    Animal a = null;
    while(a == null){
      System.out.println("Choose an animal: pig, cow or sheep.");
      type = scan.nextLine().toLowerCase();
      if (type.equals("pig"))
        a = new Pig();
      else if (type.equals("cow"))
        a = new Cow();
      else if (type.equals("sheep"))
        a = new Sheep();
      else
        System.out.println("Unrecognised animal.");
    }
    return a;
  }
}

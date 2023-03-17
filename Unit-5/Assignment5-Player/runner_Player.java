// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.lang.Math;
 
public class runner_Player {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Player p1 = null;

    System.out.println("Welcome!");
    System.out.println("This program helps you test your Player class and its methods.");
    System.out.println("A default Player object will be created for you,");
    System.out.println("or you can use the 'c' option to use another Constructor.\n");

     String instruction = "";
    while (!instruction.equals("q")) {
      System.out.println("Type the name of the method you want to test, or Type c to construct a new Player. Type q to quit.");
      instruction = scan.nextLine().trim();
      if (instruction.equals("c")) {
        System.out.println("Which constructor would you like to use?");
        System.out.println("1 - Player(String name, int x, int y, int z)");
        System.out.println("2 - Player(String name, int x, int y, int z, int hp, int direction");
 
        int choice = scan.nextInt();
        scan.nextLine();
 
        if (choice != 1 && choice != 2) {
          System.out.println("Invalid choice");
          break;
        } else {
          System.out.println("Player name:");
          String name = scan.nextLine().trim();
          System.out.println("Starting x-coordinate:");
          int x = scan.nextInt();
          System.out.println("Starting y-coordinate:");
          int y = scan.nextInt();
          System.out.println("Starting z-coordinate:");
          int z = scan.nextInt();
 
          if (choice == 1) {
            p1 = new Player(name, x, y, z);
            System.out.println("New player created!");
            System.out.println(p1);
          } else {
            System.out.println("Starting health points:");
            int hp = scan.nextInt();
            System.out.println("Starting direction");
            int dir = scan.nextInt();
            p1 = new Player(name, x, y, z, hp, dir);
            System.out.println("New player created!");
            System.out.println(p1);
          }
          scan.nextLine();
        }
        instruction = scan.nextLine().trim();
      } else if (p1 == null) {
        p1 = new Player();
      }
 
      if (instruction.equals("getNumPlayers")) {
        System.out.println("There are " + Player.getNumPlayers() + " existing Player objects");
      } else if (instruction.equals("getX")) {
        System.out.println("The x-coordinate of " + p1.getName() + " is X " + p1.getX());
      } else if (instruction.equals("getY")) {
        System.out.println("The y-coordinate of " + p1.getName() + " is Y " + p1.getY());
      } else if (instruction.equals("getZ")) {
        System.out.println("The z-coordinate of " + p1.getName() + " is Z " + p1.getZ());
      } else if (instruction.equals("getHp")) {
        System.out.println(p1.getName() + " has " + p1.getHp() + " health points");
      } else if (instruction.equals("getDirection")) {
        System.out.println(p1.getName() + " is facing " + p1.getDirection());
      } else if (instruction.equals("toString")) {
        System.out.println(p1);
      } else if (instruction.equals("getName")) {
        System.out.println("The players name is " + p1.getName());
      } else if (instruction.equals("move")) { 
        System.out.println("Enter the direction (1-6) to move in:");
        int direction = scan.nextInt();
        System.out.println("Enter the number of units to move");
        int units = scan.nextInt();
        scan.nextLine();
 
        p1.move(direction, units);
        System.out.println(p1.getName() + " is now at coordinates X " + p1.getX() + " Y " + p1.getY() + " Z " + p1.getZ());
      } else if (instruction.equals("setHp")) {
        System.out.println("Enter the new health of " + p1.getName() + ":");
        int hp = scan.nextInt();
        scan.nextLine();
 
        p1.setHp(hp);
        System.out.println(p1.getName() + " now has " + p1.getHp() + " health points");
      } else if (instruction.equals("setDirection")) {
        System.out.println("Enter the new direction that " + p1.getName() + " is facing:");
        int dr = scan.nextInt();
        scan.nextLine();
        String dir;
        p1.setDirection(dr);
        dr = p1.getDirection();
        if (dr == 1) {
          dir = "North";
        } else if (dr == 2) {
          dir = "South";
        } else if (dr == 3) {
          dir = "Up";
        } else if (dr == 4) {
          dir = "Down";
        } else if (dr == 5) {
          dir = "East";
        } else if (dr == 6) {
          dir = "West";
        } else {
          dir = "an invalid direction";
        }
        System.out.println(p1.getName() + " is now facing " + dir);
      } else if (instruction.equals("attack")) {
        Player p2 = new Player();
        System.out.println(p1.getName() + " is attacking " + p2.getName());
        System.out.println("Damage " + p1.getName() + " should deal to " + p2.getName() + ":");
        int damage = scan.nextInt();
        scan.nextLine();
 
        p1.attack(p2, damage);
        System.out.println(p2.getName() + " now has " + p2.getHp());
        System.out.println(p1.getName() + " now has " + p1.getHp());
      } else if (instruction.equals("teleport")) {
        System.out.println("Method 1 or 2?");
        System.out.println("1 - teleport(int x, int y, int z)");
        System.out.println("2 - teleport(Player p)");
 
        int choice = scan.nextInt();
        scan.nextLine();
 
        if (choice == 1) {
          System.out.println("X-coordinate to teleport to:");
          int x = scan.nextInt();
          System.out.println("Y-coordinate to teleport to:");
          int y = scan.nextInt();
          System.out.println("Z-coordinate to teleport to:");
          int z = scan.nextInt();
 
          scan.nextLine();
 
          p1.teleport(x, y, z);
          System.out.println(p1.getName() + " teleported to X " + p1.getX() + " Y " + p1.getY() + " Z " + p1.getZ());
 
        } else if (choice == 2) {
          int x = (int) (Math.random() * 11);
          int y = (int) (Math.random() * 11);
          int z = (int) (Math.random() * 11);
          Player p2 = new Player("P" + (Player.getNumPlayers() + 1), x, y, z);
          System.out.println(p2.getName() + " is at X " + p2.getX() + " Y " + p2.getY() + " Z " + p2.getZ());
          System.out.println("Teleporting " + p1.getName() + " to " + p2.getName());
          p1.teleport(p2);
          System.out.println(p1.getName() + " now at X " + p1.getX() + " Y " + p1.getY() + " Z " + p1.getZ());
          if (p1.getX() == p2.getX() && p1.getY() == p2.getY() && p1.getZ() == p2.getZ()) {
            System.out.println("The Players are at the same location");
          } else {
            System.out.println("The Players are in different locations");
          }
        } else {
          System.out.println("Invalid choice");
        }
      } else if (instruction.equals("getDistance")) {
        System.out.println("Method 1 or 2?");
        System.out.println("1 - distance(int x, int y, int z)");
        System.out.println("2 - distance(Player p)");
 
        int choice = scan.nextInt();
        scan.nextLine();
 
        if (choice == 1) {
          System.out.println("X-coordinate:");
          int x = scan.nextInt();
          System.out.println("Y-coordinate:");
          int y = scan.nextInt();
          System.out.println("Z-coordinate:");
          int z = scan.nextInt();
 
          scan.nextLine();
          System.out.printf("%s is %f units from X %d Y %d Z %d", p1.getName(), p1.getDistance(x, y, z), x, y, z);
        } else if (choice == 2) {
          Player p2 = new Player("P" + (Player.getNumPlayers() + 1), 10, -5, 87);
 
          System.out.printf("The distance between %s and %s is %f", p1.getName(), p2.getName(), p1.getDistance(p2));
        } else {
          System.out.println("Invalid choice");
        }
      } else if (instruction.equals("q")){
        System.out.println("Exiting. Bye!");
      } else {
        System.out.println("Invalid instruction");
      }
      System.out.println();
    }
  }
}
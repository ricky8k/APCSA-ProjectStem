// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class Battleship
{
  public static void main(String[] args)
  {
    // Set up board and print welcome
    Board b = new Board();
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Battleship!\n");
    boolean addNew = true;

    while(addNew)
    {
      System.out.println("Type \"a\" to add new ship, \"b\" to see the board, \"p\" to play or \"q\" to quit.");
      String ans = scan.nextLine();
      if(ans.toLowerCase().equals("q"))
        return;
      if(ans.toLowerCase().equals("a"))
      {
        // Get parameters for new ship
        System.out.println("Starting in which row?");
        int r = scan.nextInt();
        System.out.println("Starting in which column?");
        int c = scan.nextInt();
        System.out.println("How long?");
        int l = scan.nextInt();
        scan.nextLine();
        System.out.println("Horizontal (h) or vertical (v)?");
        String d = scan.nextLine();
        boolean h = (d.toLowerCase().equals("h"));

        // Call addShip method and return message based on true/false value
        if(b.addShip(r, c, l, h))
        {
          System.out.println("\nNew ship added!\n");
        }
        else
          System.out.println("\nCan't put a ship there!\n");
      }
      else if(ans.toLowerCase().equals("b"))
        System.out.println("\n" + b + "\n");
      else if(ans.toLowerCase().equals("p"))
      {
        if(b.foundShip(3) && b.foundShip(4))
        {
          addNew = false;
          System.out.println("\nOk, let's play!\n");
        }
        else
          System.out.println("\nYou need ships of length 3 and 4 to play!\n");
      }
    }

    // As long as ships remain, play game
    while(!b.gameOver())
    {
      System.out.println("Press \"s\" to shoot at a square, \"b\" to see the board, \"q\" to quit.");
      String ans = scan.nextLine();
      if(ans.toLowerCase().equals("q"))
        return;
      else if(ans.toLowerCase().equals("s")){
        // Get row and column to shoot
        System.out.println("Input row.");
        int r = scan.nextInt();
        System.out.println("Input column.");
        int c = scan.nextInt();

        // Perform shot and store result
        int result = b.shoot(r,c);

        // Choose message based on result
        if(result == 1)
          System.out.println("\nHit!\n");
        else if(result == 0)
          System.out.println("\nMiss!\n");
        else if(result == 2)
          System.out.println("\nYou already tried that.\n");
        else if(result == -1)
          System.out.println("\nInvalid coordinates.\n");
        scan.nextLine();
      }
      else if(ans.toLowerCase().equals("b"))
        System.out.println("\n" + b + "\n");
    }
    System.out.println("Game over!");
  }
}
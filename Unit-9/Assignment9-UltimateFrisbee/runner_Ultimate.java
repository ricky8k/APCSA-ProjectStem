// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.ArrayList;
import java.util.Scanner;

public class runner_Ultimate{

  public static void main(String[] args){
    ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
    ArrayList<Coach> coaches = new ArrayList<Coach>();
    Scanner scan = new Scanner(System.in);
    String ins = "";
    while(!ins.equals("q")){
      System.out.println("\nWhat do you want to do?\np - make a person\nt - make a team from the current player/coach lists\nq - quit");
      ins = scan.nextLine().toLowerCase();
      if(ins.equals("p")){
        Person p;
        System.out.println("\nWhich class do you want to use?\np - Person\nu - UltimatePlayer\nc - Captain\no - Coach");
        String cls = scan.nextLine().toLowerCase();
        System.out.println("First name?");
        String fn = scan.nextLine();
        System.out.println("Last name?");
        String ln = scan.nextLine();
        if(cls.equals("u")||cls.equals("c")){
          System.out.println("Position?");
          String ps = scan.nextLine();
          if(cls.equals("c")){
            System.out.println("Offensive coach? (t/f)");
            boolean tp = scan.nextLine().toLowerCase().equals("t");
            p = new Captain(fn, ln, ps, tp);
          }
          else
            p = new UltimatePlayer(fn, ln, ps);
          players.add((UltimatePlayer)p);
          System.out.println("\n" + fn + " " + ln + " was added to the players list.");
        }
        else if(cls.equals("o")){
          System.out.println("Role?");
          String rl = scan.nextLine();
          p = new Coach(fn, ln, rl);
          coaches.add((Coach)p);
          System.out.println("\n" + fn + " " + ln + " was added to the coaches list.");
        }
        else{
          p = new Person(fn, ln);
          System.out.println("\nSorry, only UltimatePlayers, Captains and Coaches can be added to the team.");
        }
        System.out.println("\n" + p);
        System.out.println("\nType \"t\" for " + fn + " to throw a disc.");
        if(scan.nextLine().toLowerCase().equals("t")){
          System.out.println("Enter power level between 1 and 10.");
          System.out.println(fn + " threw the disc " + p.throwDisc(scan.nextInt()) + " yards.");
          scan.nextLine();
        }
      }
      else if(ins.equals("t")){
        UltimateTeam t = new UltimateTeam(players, coaches);
        System.out.println("\nYour team is ready!\n");
        while(!ins.equals("q")){
          System.out.println("\nWhat do you want to do?\nc - see the cutters\nh - see handlers\nt = see the whole team\nq - quit");
          ins = scan.nextLine().toLowerCase();
          if(ins.equals("h"))
            System.out.println("\n" + t.getHandlers());
          else if(ins.equals("c"))
            System.out.println("\n" + t.getCutters());
          else if(ins.equals("t"))
            System.out.println("\n" + t + "\n");
        }
      }
    }
  }
}
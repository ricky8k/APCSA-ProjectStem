// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_GameWheel{

  private static Scanner scan;
  private static String instruct;
  private static GameWheel wheel;

  public static void main(String[] args){
    scan = new Scanner(System.in);
    wheel = new GameWheel();
    instruct = "";
    while(!instruct.equals("q")){
      System.out.println("Type \"p\" to play game, \"t\" to test GameWheel methods, \"q\" to quit.");
      instruct = scan.nextLine();
      if(instruct.equals("p"))
        Game.play(wheel);
      else if(instruct.equals("t"))
        testMethods();
      else if(!instruct.equals("q"))
        System.out.print("Instruction not recognized");
      System.out.println();
    }
  }

  private static void testMethods(){
    while(!instruct.equals("q") && !instruct.equals("m")){
      System.out.println("Type GameWheel method to call (toString, scramble, sort). Or type \"m\" for main menu, \"q\" to quit");
      instruct = scan.nextLine();
      if(instruct.equals("toString"))
        System.out.println(wheel);
      else if(instruct.equals("scramble"))
        wheel.scramble();
      else if(instruct.equals("sort"))
        wheel.sort();
      else if(instruct.equals("new"))
        wheel = new GameWheel(makeStarterArray());
      else if(instruct.equals("random_prize_test"))
        ranTest();
      else if(!instruct.equals("q") && !instruct.equals("m"))
        System.out.println("Instruction not recognized");
    }
  }

  private static int[] makeStarterArray(){
    int[] arr = new int[20];
    for(int i = 0; i < 20; i++){
      arr[i] = scan.nextInt();
    }
    scan.nextLine();
    return arr;
  }

  private static void ranTest(){
    int numLines = scan.nextInt();
    for(int i = 0; i<numLines; i++){
      wheel.scramble();
      for(int j = 0; j < 20; j++)
        System.out.print(wheel.getSlice(j).getPrizeAmount() + " ");
      System.out.println();
    }
    scan.nextLine();
  }
}
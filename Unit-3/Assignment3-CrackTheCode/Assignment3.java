import java.util.Scanner;

public class Assignment3 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Welcome Screen
    /// User Input
    System.out.println("Welcome. What is your name?");
    String userName = scan.nextLine();
    System.out.println("Hello " + userName + ". Are you ready to crack the code?");
    String userReady = scan.nextLine();
    /// Check userReady Status
    if (userReady.toLowerCase().equals("yes"))
      System.out.println("");
    else
      System.exit(0);
    
    // Initialize Variables
    String wrongAns = "Sorry, that was incorrect!\nBetter luck next time!";
      
    // Phase 1
    System.out.println("PHASE 1");
    System.out.println("Enter a string:");
    String phase1 = scan.nextLine();
    if (phase1.length() == 3)
      System.out.println("Correct!");
    else{
      System.out.println(wrongAns); System.exit(0);
    }
    
    // Phase 2
    System.out.println("PHASE 2");
    System.out.println("Enter a number:");
    int phase2 = scan.nextInt();
    if (phase2 == 19 || (phase2 >= 35 && phase2 < 78))
      System.out.println("Correct!");
    else{
      System.out.println(wrongAns); System.exit(0);
    }
    
    // Phase 3
    System.out.println("PHASE 3");
    System.out.println("Enter a number:");
    int phase3 = scan.nextInt();
    if ((phase3 > 0 && phase3 % 2 == 0) || phase3 % 10 == 1)
      System.out.println("Correct!");
    else{
      System.out.println(wrongAns); System.exit(0);
    }
    
    // Final Output
    System.out.println("You have cracked the code!");
  }
}

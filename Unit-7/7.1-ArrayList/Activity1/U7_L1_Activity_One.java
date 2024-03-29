import java.util.Scanner;
import java.util.ArrayList;

public class U7_L1_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Create Variable
    ArrayList<String> words = new ArrayList<String>();
    
    // User Input
    System.out.println("Please enter words, enter STOP to stop the loop.");
    String input = scan.nextLine();
    while (!(input.equals("STOP")))
    {
      words.add(input);
      input = scan.nextLine();
    }
    
    // Final Output
    System.out.println("\n" + words.size() + "\n" + words);
    /// Modify words
    if (words.size() > 2)
    {
      words.set(words.size() - 1, words.get(0));
      words.remove(0);
    }
    System.out.println(words);
  }
}

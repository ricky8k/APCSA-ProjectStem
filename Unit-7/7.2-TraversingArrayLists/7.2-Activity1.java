import java.util.Scanner;
import java.util.ArrayList;

public class U7_L2_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Create Variables
    ArrayList<String> words = new ArrayList<String>();
    String input = "";
    
    // User Input
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!(input.equals("STOP")))
    {
      input = scan.nextLine();
      // Check input
      if (!(input.equals("STOP")))
        words.add(input);
    }
    
    // Final Output
    System.out.println(words);
    /// Reverse Order
    for (int i = 0; i < words.size(); i++)
    {
      System.out.println(words.get((words.size() - 1) - i) + words.get(i));
    }
  }
}

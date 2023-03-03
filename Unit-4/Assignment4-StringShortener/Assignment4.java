import java.util.Scanner;

class Assignment4 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Type the message to be shortened");
    String message = scan.nextLine().toLowerCase();
    
    // Create Variables
    String msgPart = "";
    
    // Algorithm 1
    String a1message = "";
    int a1vowel = 0, a1const = 0;
    for (int i = 0; i < message.length(); i++)
    {
      msgPart = message.substring(i, i + 1);
      /// Eliminate Vowels
      if (i != 0 && !message.substring(i - 1, i).equals(" ") && (msgPart.equals("a") || msgPart.equals("e") || msgPart.equals("i") || msgPart.equals("o") || msgPart.equals("u")))
      {
        a1message += "";
        a1vowel++; /* Add to vowel count */
      }
      /// Eliminate Duplicate Constants
      else if (i != 0 && msgPart.equals(message.substring(i - 1, i)))
      {
        a1message += "";
        a1const++; /* Add to repeat count */
      }
      /// Create A1 Message
      else
      {
        a1message += msgPart;
      }
    }
    /// Save to Output
    int a1saved = a1const + a1vowel;
    
    // Algorithm 2
    String a2space = "", a2part = "", a2message = "";
    int u = 0;
    /// Remove All Spaces
    for (int i = 0; i < message.length(); i++)
    {
      msgPart = message.substring(i, i + 1);
      if (!(msgPart.equals(" ")))
      {
        a2space += msgPart;
      }
    }
    /// Save 1st Occurances
    for (int i = 0; i < a2space.length(); i++)
    {
      if (a2part.indexOf(a2space.substring(i, i + 1)) == -1)
      {
        a2part += a2space.substring(i, i + 1);
      }
    }
    /// Create A2 Message
    for (int i = 0; i < a2part.length(); i++) 
    {
      for (int i2 = 0; i2 < a2space.length(); i2++)
      {
        if ((a2part.substring(i, i + 1)).equals(a2space.substring(i2, i2 + 1)))  
        {
          u++; /* Add if spotted within message */
        }
      }
      a2message += u + a2part.substring(i, i + 1);
      u = 0;
    }
    /// Save to Output
    int a2unique = a2part.length();
    int a2saved = message.length() - a2message.length();
    
    // Final Output
    /// Algorithm 1
    System.out.println("\nAlgorithm 1");
    System.out.println("Vowels removed: " + a1vowel);
    System.out.println("Repeats removed: " + a1const);
    System.out.println("Algorithm 1 message: " + a1message);
    System.out.println("Algorithm 1 characters saved: " + a1saved);
    
    /// Algorithm 2
    System.out.println("\nAlgorithm 2");
    System.out.println("Unique characters found: " + a2unique);
    System.out.println("Algorithm 2 message: " + a2message);
    System.out.println("Algorithm 2 characters saved: " + a2saved);
  }
}
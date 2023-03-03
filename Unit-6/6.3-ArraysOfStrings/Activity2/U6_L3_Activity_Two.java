public class U6_L3_Activity_Two
{ 
  public static void removeVowels(String[] words)
  {
    // Create Variable
    String noVowels = "";

    // Check/Remove Vowels & Output
    for (int i = 0; i < words.length; i++)
    {
      // Refresh noVowels for next word
      noVowels = "";
      for (int j = 0; j < words[i].length(); j++)
      {
        // Remove Vowel(s)
        if (words[i].substring(j, j + 1).matches("a|e|i|o|u"))
        {
          noVowels += "";
        }
        // Keep Constant(s)
        else
        {
          noVowels += words[i].substring(j, j + 1);
        }
      }
      // Final Output
      System.out.print("\n" + noVowels);
    }
  }
}

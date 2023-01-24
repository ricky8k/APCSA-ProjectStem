public class U6_L3_Activity_One
{
  public static String findShortest(String[] words)
  {
    // Create Variable
    String shortestWord = words[1];
    
    // Compare words[i] to shortestWord
    for (int i = 0; i < words.length; i++)
    {
      if (words[i].length() < shortestWord.length())
      {
        shortestWord = words[i]; // Make words[i] the new shortestWord
      }
    }
    
    // End
    return shortestWord;
  }
}

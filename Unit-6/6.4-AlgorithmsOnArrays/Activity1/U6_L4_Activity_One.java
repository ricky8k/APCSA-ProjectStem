public class U6_L4_Activity_One
{
  public static String insert(String[] words, String newWord, int place)
  {
    // Valid place in words[]
    if (place >= 0 && place < words.length)
    {
      // Replace words[place] with newWord
      for (int i = words.length - 1; i > place; i--)
      {
        words[i] = words[i - 1];
      }
      words[place] = newWord;
      // Create return
      String strReturn = "";
      for (int i = 0; i < words.length; i++)
      {
        strReturn += words[i];
      }
      return strReturn;
    }
    // Invalid place in words[]
    else
    {
      // Create return
      return "you need a valid number";
    }
  }
}

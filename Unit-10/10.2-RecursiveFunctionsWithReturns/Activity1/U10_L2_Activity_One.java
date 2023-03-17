public class U10_L2_Activity_One
{
  public static String stringReverse(String word)
  {
    // Temporary Storage
    String str = "";
    
    // Reverse String
    if (word.length() > 0)
    {
      str = stringReverse(word.substring(1)) + word.substring(0, 1);
      word = word.substring(1);
    }
    
    // End
    return str;
  }
}
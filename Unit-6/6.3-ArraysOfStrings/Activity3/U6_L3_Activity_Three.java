public class U6_L3_Activity_Three
{
  public static void printUn(String[] words)
  {
    // Check Words & Output
    for (int i = 0; i < words.length; i++)
    {
      if (words[i].length() > 2 && words[i].substring(0, 2).equals("un"))
      {
        System.out.println(words[i]);
      }
    }
  }
}

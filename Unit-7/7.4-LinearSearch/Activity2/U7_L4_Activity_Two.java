import java.util.ArrayList;

public class U7_L4_Activity_Two
{
  public static int searchSecond(ArrayList<String> list, String word)
  {
    // Check for word in list
    for (String str: list)
    {
      if (str.equals(word))
      {
        for (int i = list.indexOf(word) + 1; i < list.size(); i++)
        {
          if (list.get(i).equals(word))
            return i;
        }
      }
    }
    
    // Not Found
    return -1;
  }
}

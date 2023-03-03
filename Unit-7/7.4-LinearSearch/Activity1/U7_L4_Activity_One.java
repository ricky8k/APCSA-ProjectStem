import java.util.ArrayList;

public class U7_L4_Activity_One
{
  public static int countSecondInitial(ArrayList<String> list, String letter)
  {
    // Initialize Variable
    int count = 0;
    
    // Check for letter in list
    for (String str: list)
    {
      if (str.toLowerCase().substring(1, 2).equals(letter.toLowerCase()))
        count++;
    }
    
    // End
    return count;
  }
}
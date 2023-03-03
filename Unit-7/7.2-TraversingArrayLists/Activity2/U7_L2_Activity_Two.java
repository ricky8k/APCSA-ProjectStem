import java.util.ArrayList;

public class U7_L2_Activity_Two
{
  public static int highestNum(ArrayList<Integer> arr)
  {
    // Check for Highest Num in arr
    int n = 0;
    for (int i = 0; i < arr.size(); i++)
    {
      if (arr.get(i) > n)
      {
        n = arr.get(i);
      }
    }
    
    // End
    return n;
  }
}

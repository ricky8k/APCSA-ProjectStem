import java.util.ArrayList;

public class U7_L2_Activity_Two
{
  public static int highestNum(ArrayList<Integer> arr)
  {
    // Check for Highest Num in arr
    int highest = arr.get(0);
    for (Integer num: arr)
    {
      if (num >= highest)
        highest = num;
    }
    
    // End
    return highest;
  }
}
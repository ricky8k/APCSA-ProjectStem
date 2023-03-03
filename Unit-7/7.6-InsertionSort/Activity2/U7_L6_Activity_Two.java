import java.util.ArrayList;

public class U7_L6_Activity_Two
{
  public static int insertSort(ArrayList<Integer> list)
  {
    // Initialize Count Variable
    int count = 0;
    // Sort list in Ascending Order
    for (int pos = 1; pos < list.size(); pos++)
    {
      // Temporary Storage
      int temp = list.get(pos);
      int index = pos;
      
      for (int rPos = index; rPos > 0; rPos--)
      {
        // Update Count
        count++;
        // Sort list
        if (index > 0 && temp < list.get(index - 1))
        {
          list.set(index, list.get(index - 1));
          index--;
        }
        else
        {
          break;
        }
      }
      list.set(index, temp);
    }

    // End
    return count;
  }
}
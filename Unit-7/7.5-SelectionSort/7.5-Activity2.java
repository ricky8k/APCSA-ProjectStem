import java.util.ArrayList;

public class U7_L5_Activity_Two
{
  public static void selectSortReverse(ArrayList<Integer> list)
  {
    // Sort list
    for (int pos = 0; pos < list.size() - 1; pos++)
    {
      // Initialize maxIndex
      int index = pos;
      // Check for Position
      for (int j = pos + 1; j < list.size(); j++)
      {
        if (list.get(j) > list.get(index))
        {
          index = j;
        }
      }
      // Swap Function
      int temp = list.get(pos);
      list.set(pos, list.get(index));
      list.set(index, temp);
    }
  }
}

import java.util.ArrayList;

public class U7_L3_Activity_One
{
  public static void shiftLeft(ArrayList<String> list)
  {
    // Move First in Array to Last
    if (list.size() >= 2)
    {
      list.add(list.get(0));
      list.remove(0);
    }
  }
}

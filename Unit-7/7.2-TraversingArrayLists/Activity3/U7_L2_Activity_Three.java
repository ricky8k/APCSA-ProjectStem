import java.util.ArrayList;

public class U7_L2_Activity_Three
{
  public static ArrayList<Integer> getEvens(ArrayList<Integer> vals)
  {
    // Check for Even Nums in vals
    ArrayList<Integer> even = new ArrayList<Integer>();
    for (int i = 0; i < vals.size(); i++)
    {
      if (vals.get(i) % 2 == 0)
      {
        even.add(vals.get(i));
      }
    }
    
    // End
    return even;
  }
}

public class U6_L5_Activity_One
{

  public static void reverse(String[] words)
  {
    // For Each String in words[]
    for (String s : words)
    {
      // Print Term in Reverse Order
      for (int i = s.length() - 1; i >= 0; i--)
      {
        System.out.print(s.substring(i, i + 1));
      }
      // Output
      System.out.println();
    }
  }
}
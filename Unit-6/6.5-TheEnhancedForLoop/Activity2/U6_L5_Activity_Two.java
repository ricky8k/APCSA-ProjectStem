public class U6_L5_Activity_Two
{
  public static int product(int[] arr)
  {
    // Create Variable
    int p = 1;
    // For Each Int in arr[]
    for(int k : arr)
    {
      p *= k;
    }
    // End
    return p;
  }
}
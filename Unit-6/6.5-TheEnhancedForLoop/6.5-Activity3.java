public class U6_L5_Activity_Three
{
  public static double avg(int[] arr)
  {
    // Create Variable
    double s = 0;
    // For Each Int in arr[]
    for (double n : arr)
    {
      s += n;
    }
    // Divide by arr[] Length
    s /= arr.length;
    // End
    return s;
  }
}
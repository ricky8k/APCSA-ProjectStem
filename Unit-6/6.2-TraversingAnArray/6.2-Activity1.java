public class U6_L2_Activity_One
{
  public static boolean containsNeg(double[] arr)
  {
    // Create Variable
    Boolean isNegative = false; /* False if no negatives are found */
    
    // Check Array for Negative Value(s)
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] < 0)
      {
        isNegative = true; /* True when negative is found */
        break;
      }
    }
    
    // End
    return isNegative;
  }
}

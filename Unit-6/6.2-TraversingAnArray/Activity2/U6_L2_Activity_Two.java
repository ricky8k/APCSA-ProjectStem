public class U6_L2_Activity_Two
{
  public static int numDivisibleBy3(int[] arr)
  {
    // Create Variable
    int numsDivisible = 0; /* 0 if no divisible values */
    
    // Check Array for Divisible Value(s)
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] % 3 == 0)
      {
        numsDivisible++; /* Adds 1 to total when divisible */
      }
    }
    
    // End
    return numsDivisible;
  }
}

public class U6_L2_Activity_Three
{
  public static int numDivisible(int num, int[] arr)
  {
    // Create Variables
    int divisor = num; /* Divide by provided num */
    int numsDivisible = 0; /* 0 if no divisible values */
    
    // Check Array for Divisible Value(s)
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] % divisor == 0)
      {
        numsDivisible++;
      }
    }
    
    // End
    return numsDivisible;
  }
}

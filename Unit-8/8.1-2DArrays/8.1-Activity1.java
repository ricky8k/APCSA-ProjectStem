public class U8_L1_Activity_One
{
  public static int sumOfDiag(int[][] arr)
  {
    // Initialize Variable
    int sum = 0;
    
    // Add Lead Diagonal
    for (int i = 0; i < arr.length; i++)
    {
      // Validate
      if (i > arr[0].length - 1)
      {
        break;
      }
      sum += arr[i][i];
    }
    
    // End
    return sum;
  }
}
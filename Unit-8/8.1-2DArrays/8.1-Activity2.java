public class U8_L1_Activity_Two
{
  public static int[][] productTable(int r, int c)
  {
    // Initialize Variable
    int[][] arr = new int[r][c];

    // Create Product Table
    for (int row = 0; row < arr.length; row++)
    {
      for (int column = 0; column < arr[row].length; column++)
      {
        arr[row][column] = row * column;
      }
    }
    
    // End
    return arr;
  }
}
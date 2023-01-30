public class U6_L4_Activity_Two
{
  public static void swap(int[] arr, int i, int j)
  {
    // Check i & j
    if (i >= 0 && j >= 0)
    {
      // Store into temp. array
      int[] tempNum = {arr[i], arr[j]};
      // Write to arr
      arr[i] = tempNum[1];
      arr[j] = tempNum[0];
    }
  }
  
  public static void allReverseSwap(int[] arr)
  {
    // Store into temp. array
    int[] tempArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++)
    {
      tempArr[i] = arr[(arr.length - 1) - i];
    }
    // Write to arr
    for (int i = 0; i < tempArr.length; i++)
    {
      arr[i] = tempArr[i];
    }
  }
}

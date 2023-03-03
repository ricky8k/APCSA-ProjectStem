public class U7_L5_Activity_One
{
  public static void sortAndPrintReverse(String[] arr)
  {
    // Sort arr
    for (int pos = arr.length - 1; pos >= 1; pos--)
    {
      int maxIndex = pos;
      for (int j = pos; j >= 0; j--)
      {
        if (arr[j].compareTo(arr[maxIndex]) < 0)
        {
          maxIndex = j;
        }
      }
      // Swap Function
      String temp = arr[pos];
      arr[pos] = arr[maxIndex];
      arr[maxIndex] = temp;
    }
    
    // Final Output
    for (String s: arr)
    {
      System.out.print(s + " ");
    }
  }
}
public class U7_L6_Activity_One
{
  public static void sortAndPrintReverse(String[] arr)
  {
    // Sort arr in Descending Order
    for (int pos = 1; pos <= arr.length - 1; pos++)
    {
      // Temporary Storage
      String temp = arr[pos];
      int index = pos;
      
      // Sort arr
      while (index > 0 && temp.compareTo(arr[index - 1]) > 0)
      {
        arr[index] = arr[index - 1];
        index--;
      }
      arr[index] = temp;
      
      // Output Current arr
      System.out.println("");
      for (String s : arr)
      {
        System.out.print(s + " ");
      }
    }
  }
}

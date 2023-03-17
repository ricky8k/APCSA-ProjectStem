public class U10_L1_Activity_One
{
  // Initialize Variables
  public static int count = 0;
  public static int max = 0;
  
  // Print Positive Integer(s) That End in Same Digit
  public static void printUpToEnd(int n)
  {
    // Record Max Value
    if (count < 1)
      max = n;
      
    // Save Integer
    n %= 10;
    n += count * 10;
    
    // Output
    if (n > 0)
      System.out.print(n + " ");
    /// Update Count
    count++;
    
    // Recursive
    if (n < max)
      printUpToEnd(n);
  }
}
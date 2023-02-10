import java.util.ArrayList;

public class U7_L3_Activity_Two
{
  public static void printStatistics(ArrayList<Integer> list)
  {
    // Create Variables
    int sum = 0;
    String mode = "no single mode";
    /// Temporary Storage
    int count = 0, maxCount = 1, savedNum = 0;
    
    // Calculation
    for (Integer num: list)
    {
      // Sum
      sum += num;
      /// Check for Mode
      count = 0;
      for (Integer num2: list)
      {
        if (num == num2)
          count++;
      }
      // Mode
      if (num != savedNum)
      {
        if (count > maxCount)
        {
          mode = num.toString();
          /// Update Temp. Storage
          savedNum = num;
          maxCount = count;
        }
        else if (count == maxCount)
        {
          mode = "no single mode";
        }
      }
    }
    // Average
    double avg = (double) sum / list.size();
    
    // Final Output
    System.out.println("Sum: " + sum + "\nAverage: " + avg + "\nMode: " + mode);
  }
}

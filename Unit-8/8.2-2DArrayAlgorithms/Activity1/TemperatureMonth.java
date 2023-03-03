public class TemperatureMonth
{
  private double[][] temperatures;

  public TemperatureMonth(double[][] t)
  {
    temperatures = t;
  }

  public double[] getMaxTempWeekly()
  {
    // Initialize Variable
    double[] arr = new double[temperatures.length];

    // Check for Max Temperatures
    for (int pos = 0; pos < temperatures.length; pos++)
    {
      // Reset Temporary Storage
      double maxTemp = temperatures[pos][0];
      // Scan Row
      for (int pos2 = 0; pos2 < temperatures[pos].length; pos2++)
      {
        if (temperatures[pos][pos2] > maxTemp)
          maxTemp = temperatures[pos][pos2];
      }
      // Add maxTemp in Row to arr
      arr[pos] = maxTemp;
    }
    
    // End
    return arr;
  }

  public double[] getMinTempWeekly()
  {
    // Initialize Variable
    double[] arr = new double[temperatures.length];

    // Check for Min Temperatures
    for (int pos = 0; pos < temperatures.length; pos++)
    {
      // Reset Temporary Storage
      double minTemp = temperatures[pos][0];
      // Scan Row
      for (int pos2 = 0; pos2 < temperatures[pos].length; pos2++)
      {
        if (temperatures[pos][pos2] < minTemp)
          minTemp = temperatures[pos][pos2];
      }
      // Add minTemp in Row to arr
      arr[pos] = minTemp;
    }
    
    // End
    return arr;
  }

  public double getRange()
  {
    // Temporary Storage
    double min = temperatures[0][0], max = temperatures[0][0];
    
    // Check Range
    for (int pos = 0; pos < temperatures.length; pos++)
    {
      // Scan Row
      for (int pos2 = 0; pos2 < temperatures[pos].length; pos2++)
      {
        // Check for Max Value
        if (temperatures[pos][pos2] > max)
          max = temperatures[pos][pos2];
        // Check for Min Value
        if (temperatures[pos][pos2] < min)
          min = temperatures[pos][pos2];
      }
    }
    
    // End
    return max - min;
  }

  public double getCertainTemp(int week, int day)
  {
    // End
    return temperatures[week][day];
  }
}
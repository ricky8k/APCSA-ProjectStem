public class Car
{
  // Initialize Variables
  private String carMake;
  private String carModel;
  private int carYear;
  private double carMpg;
  private static int count = 0;
  private int carId;
  
  // Car() - Default
  public Car()
  {
    // User Input
    carMake = "None";
    carModel = "None";
    carYear = 2000;
    carMpg = 0.0;
    // Update carId
    count++;
    carId = count;
  }
  
  // Car()
  public Car(String make, String model, int year, double mpg)
  {
    // User Input
    carMake = make;
    carModel = model;
    /// Verify year
    if (year >= 1885 && year <= 2022)
    {
      carYear = year;
    }
    else if (year > 2022)
    {
      carYear = 2022;
    }
    else if (year < 1885)
    {
      carYear = 2000;
    }
    /// Verify mpg
    if (mpg >= 0)
    {
      carMpg = mpg;
    }
    else
    {
      carMpg = 0;
    }
    // Update carId
    count++;
    carId = count;
  }
  
  // toString()
  public String toString()
  {
    return "ID: " + carId + "\nMake: " + carMake + "\nModel: " + carModel + "\nYear: " + carYear + "\nMPG: " + carMpg;
  }
}
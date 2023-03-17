public class UltimatePlayer extends Person
{
  // Store Player Values
  private int jerseyNumber;
  private String position;
  /// Temporary Storage
  private static int playerCount = 1;
  
  // Create Player Using Given Values
  public UltimatePlayer(String firstName, String lastName, String position)
  {
    // Calls Super-Constructor to Create Person
    super(firstName, lastName);
    // Set Jersey Number
    this.jerseyNumber = playerCount++;
    // Set Player Position
    if (position.matches("handler|cutter"))
    {
      this.position = position;
    }
    else
    {
      this.position = "handler";
    }
  }
  
  // Fetch Player Position
  public String getPosition()
  {
    return position;
  }
  
  // Throw Disc and Return Distance
  public int throwDisc(int pow)
  {
    // Check Power
    pow = Math.max(pow, 1);
    pow = Math.min(pow, 10);
    // Return Distance
    return pow * 4;
  }
  
  // Output to String
  public String toString()
  {
    // Calls Super-Constructor to Create String and Appends Jersey Number and Position
    return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
  }
}
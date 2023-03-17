public class Captain extends UltimatePlayer
{
  // Store Captain Type
  // true = Offense, false = Defense
  private boolean type;

  // Create Captain Using Given Values
  public Captain(String firstName, String lastName, String position, boolean type)
  {
    // Calls Super-Constructor to Create UltimatePlayer
    super(firstName, lastName, position);
    // Set Captain Type
    this.type = type;
  }
  
  // Throw Disc and Return Distance
  public int throwDisc(int pow)
  {
    // Check Power
    pow = Math.max(pow, 1);
    pow = Math.min(pow, 10);
    // Return Distance
    return pow * 5;
  }
  
  // Output to String
  public String toString()
  {
    // Calls Super-Constructor to Create String and Appends Captain Type
    return super.toString() + "\n   Captain: " + (type ? "offense" : "defense");
  }
}
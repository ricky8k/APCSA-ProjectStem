public class Farmer
{
  // Initialize Variables
  private String forename;
  private String surname;

  // Create Farmer with Specified Name
  public Farmer(String f, String s)
  {
    forename = f;
    surname = s;
  }

  // Output to String
  public String toString()
  {
    return forename + " " + surname;
  }
}
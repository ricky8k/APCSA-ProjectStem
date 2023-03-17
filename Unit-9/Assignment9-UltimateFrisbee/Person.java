public class Person
{
  // Store Person's Name
  private String firstName;
  private String lastName;
  
  // Create Person with Given Strings
  public Person(String firstName, String lastName)
  {
    // Set Person Name
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  // Throw Disc and Return Distance
  public int throwDisc(int pow)
  {
    // Check Power
    pow = Math.max(pow, 1);
    pow = Math.min(pow, 10);
    // Return Distance
    return pow * 2;
  }
  
  // Output to String
  public String toString()
  {
    return lastName + ", " + firstName;
  }
}
public class Coach extends Person
{
  // Store Coach Role
  private String role;
  
  // Create Coach with Given Values
  public Coach(String firstName, String lastName, String role)
  {
    // Calls Super-Constructor to Create Person
    super(firstName, lastName);
    // Set Coach Role
    this.role = role;
  }
  
  // Output to String
  public String toString()
  {
    // Calls Super-Constructor to Create String and Appends Role
    return super.toString() + "\n   Role: " + role;
  }
}
public class Person
{
  // Initialize Variables
  private String firstName;
  private String lastName;
  private int age;
  private String ssn;
  
  public Person(String f, String l, int a, String s)
  {
    // Store Variables to Class
    firstName = f;
    lastName = l;
    age = a;
    ssn = s;
  }
  
  public String toString()
  {
    // Default Output
    return "SSN: " + ssn + "\n\tName: " + firstName + " " + lastName + "\n\tAge: " + age; 
  }
}
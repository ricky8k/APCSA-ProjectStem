public class Animal
{
  // Initialize Variable
  private String name;

  // Create Animal with Specified Name
  public Animal(String n)
  {
    name = n;
  }

  // Get Name of Animal
  public String getName()
  {
    return name;
  }

  // Get Animal to Speak
  public String speak()
  {
    return "";
  }

  // Output to String
  public String toString()
  {
    return getName() + " (" + speak() + " " + speak() + ").";
  }
}
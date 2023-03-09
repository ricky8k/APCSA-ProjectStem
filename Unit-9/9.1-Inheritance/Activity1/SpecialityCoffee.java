public class SpecialityCoffee extends Coffee
{
  // Initialize Variable
  private String flavor;
  
  // Default SpecialityCoffee()
  public SpecialityCoffee()
  {
    super();
    flavor = "Vanilla";
  }
  
  // 3-Constructor SpecialityCoffee()
  public SpecialityCoffee(String size, String type, String flavor)
  {
    this(size, false, 1, type, flavor);
  }
  
  // 5-Constructor SpecialityCoffee()
  public SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
  {
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }
  
  // Output to String
  public String toString()
  {
    return super.toString() + " with " + flavor;
  }
}
public class SpecialityCoffee extends Coffee 
{
  // Initialize Variable
  private String flavor;

  // Default SpecialityCoffee()
  public SpecialityCoffee() 
  {
    // Calls super-constructor to create default coffee then sets flavor
    super();
    flavor = "vanilla";
  }

  // 3-Constructor SpecialityCoffee()
  public SpecialityCoffee(String size, String type, String flavor) 
  {
    // Calls constructor below with a mix of parameters and default values
    this(size, false, 1, type, flavor);
  }

  // 5-Constructor SpecialityCoffee()
  public SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
  {
    // Calls super-constructor to set first 4 variables then sets flavor
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }
  
  // Get Price of Speciality Coffee
  public int getPrice()
  {
    // Temporary Storage
    int price = super.getPrice();
    
    // Check Size of Coffee
    if (super.getSize().matches("large|extra large")) /* L or XL */
    {
      price += 50;
    }
    else /* Other Size */
    {
      price += 30;
    }
    
    // End
    return price;
  }
  
  // Output to String
  public String toString() 
  {
    // Calls Coffee toString and appends flavor to end
    return super.toString() + " with " + flavor;
  }

}
public class DoubleCone extends Cone
{
  // Initialize Variables
  private String flavor;
  private String flavor2;
  private String topping;
  
  // 2-Constructor DoubleCone()
  public DoubleCone(String f, boolean w)
  {
    // Creates Cone with 2x flavor f
    super(f, w);
    flavor = f;
    flavor2 = f;
  }
  
  // 3-Constructor DoubleCone()
  public DoubleCone(String f1, String f2, boolean w)
  {
    // Creates Cone with flavors f1 and f2
    super(f1, w);
    flavor = f1;
    flavor2 = f2;
  }
  
  // Set Flavor of Double Cone
  public void setFlavor(String f)
  {
    // Overwrites flavor and flavor2 to f
    super.setFlavor(f);
    flavor = f;
    flavor2 = f;
  }
  
  // Set Flavor of Double Cone
  public void setFlavor(String f1, String f2)
  {
    // Overwrites flavor to f1 and flavor2 to f2
    super.setFlavor(f1);
    flavor = f1;
    flavor2 = f2;
  }
  
  // Add Topping to Double Cone
  public void addTopping(String t)
  {
    // Sets topping to t
    topping = t;
  }
  
  // Output to String
  public String toString()
  {
    // Temporary Storage
    String output = "double " + super.toString();
    
    // Check Flavors
    if (flavor.equals(flavor2)) /* Same 2 Flavors */
    {
      output += " x2";
    }
    else /* Different 2 Flavors */
    {
      output += " and " + flavor2;
    }
    
    // Check Topping
    if (topping != null)
      output += " with " + topping;
    
    // End
    return output;
  }
}
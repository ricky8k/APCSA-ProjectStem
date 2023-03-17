// Provided code from Project STEM.
// No modifications were made to this file.

public class Coffee
{
  private String size;
  private boolean isSkinny;
  private int shots;
  private String type;

  public Coffee()
  {
    this("small", false, 1, "latte");
  }

  public Coffee(String size, boolean isSkinny, int shots, String type)
  {
    this.size = size;
    this.isSkinny = isSkinny;
    this.shots = shots;
    this.type = type;
  }

  public String toString()
  {
    String s = size;
    if (isSkinny)
      s += " skinny";
    return s + " " + shots + "-shot " + type;
  }

  public String getSize()
  {
    return size;
  }

  public int getPrice()
  {
    int price;
    if (size.equals("extra large"))
      price = 470;
    else if (size.equals("large"))
      price = 440;
    else if (size.equals("medium"))
      price = 360;
    else
      price = 330;

    price += shots*30;
    return price;
  }
}
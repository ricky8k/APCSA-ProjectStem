// Provided code from Project STEM.
// No modifications were made to this file.

public class Cone
{

  private String flavor;
  private boolean waffle;

  public Cone(String f, boolean w)
  {
    waffle = w;
    flavor = f;
  }

  public void setFlavor(String f)
  {
    flavor = f;
  }

  public String getFlavor()
  {
    return flavor;
  }

  public boolean getWaffle()
  {
    return waffle;
  }

  public String toString()
  {
    String s = "";
    if (waffle)
      s += "waffle ";
    s += "cone with " + flavor;
    return s;
  }

}

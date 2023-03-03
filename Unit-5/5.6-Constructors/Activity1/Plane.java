public class Plane
{
  private int location;
  private String str = "";
  
  // Plane() ; No parameter
  public Plane()
  {
    // Set location
    location = 0;
  }
  
  // Plane() ; With parameter
  public Plane(int loc)
  {
    // Set location if loc is in range
    if (loc >= -2000 && loc <= 2000)
    {
      location = loc;
    }
    // Fallback location
    else
    {
      location = 0;
    }
  }
  
  // upward() ; Move plane by 100
  public void upward()
  {
    if (location + 100 <= 2000)
    {
      location += 100;
    }
  }
  
  // downward() ; Move plane by -100
  public void downward()
  {
    if (location - 100 >= -2000)
    {
      location -= 100;
    }
  }
  
  // getLocation() ; Return location
  public int getLocation()
  {
    return location;
  }
  
  // toString()
  public String toString()
  {
    str = "";
    for(int i = location / 100; i > -20; i--)
    {
      str += " ";
    }
    str += "@";
    return str;
  }
}
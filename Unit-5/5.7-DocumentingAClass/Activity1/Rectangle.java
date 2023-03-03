public class Rectangle
{
  // Create Variables
  private double bs, ht;
  
  // Rectangle()
  /// Default
  public Rectangle()
  {
    bs = 1;
    ht = 1;
  }
  
  /// Parameter
  public Rectangle(double x, double y)
  {
    if (x > 1)
      bs = x;
    else
      bs = 1;
    if (y > 1)
      ht = y;
    else
      ht = 1;
  }
  
  // equals()
  public boolean equals(Rectangle x)
  {
    return (bs == x.getBase()) && (ht == x.getHeight());
  }
  
  // getArea()
  public double getArea()
  {
    return bs * ht;
  }
  
  // getBase()
  public double getBase()
  {
    return bs;
  }
  
  // getDiagonal()
  public double getDiagonal()
  {
    return Math.sqrt(Math.pow(bs, 2) + Math.pow(ht, 2));
  }
  
  // getHeight()
  public double getHeight()
  {
    return ht;
  }
  
  // getPerimeter()
  public double getPerimeter()
  {
    return (bs * 2) + (ht * 2);
  }
  
  // setBase()
  public void setBase(double x)
  {
    if (x > 0)
    {
      bs = x;
    }
  }
  
  // setHeight()
  public void setHeight(double x)
  {
    if (x > 0)
    {
      ht = x;
    }
  }
  
  // toString()
  public String toString()
  {
    String str = "rectangle with base " + bs + ", height " + ht;
    return str;
  }
}
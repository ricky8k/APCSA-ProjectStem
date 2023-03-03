public class Player 
{
  // Initialize Variables
  /// Player
  private static int numPlayers = 0;
  private String name;
  private int hp;
  /// Coordinates
  private int x;
  private int y;
  private int z;
  private int direction;
  
  // Create Player
  /// Make Player with Default Values
  public Player()
  {
    // Player
    /// Update Number of Players
    numPlayers++;
    /// Player Name
    name = "P" + numPlayers;
    System.out.print(numPlayers);
    /// Player Health
    hp = 20;
    /// Coordinates
    x = 0;
    y = 0;
    z = 0;
    /// Direction
    direction = 1;
  }
  
  /// Make Player with Name, X, Y, Z
  public Player(String n, int a, int b, int c)
  {
    // Player
    /// Update Number of Players
    numPlayers++;
    /// Player Name
    name = n;
    /// Player Health
    hp = 20;
    /// Coordinates
    x = a;
    y = b;
    z = c;
    /// Direction
    direction = 1;
  }
  
  /// Make Player with Name, X, Y, Z, HP, Direction
  public Player(String n, int a, int b, int c, int h , int d)
  {
    // Player
    /// Update Number of Players
    numPlayers++;
    /// Player Name
    name = n;
    /// Player Health
    if (h < 0)
      hp = 0;
    else
      hp = h;
    /// Coordinates
    x = a;
    y = b;
    z = c;
    /// Direction
    if (d >= 1 && d <= 6)
      direction = d;
    else
      direction = 1;
  }
  
  // Return Player Data
  /// Fetch Current # of Players
  public static int getNumPlayers()
  {
    return numPlayers;
  }
  /// Fetch Current Player Name
  public String getName()
  {
    return name;
  }
  /// Fetch Current X-Coordinate
  public int getX()
  {
    return x;
  }
  /// Fetch Current Y-Coordinate
  public int getY()
  {
    return y;
  }
  /// Fetch Current Z-Coordinate
  public int getZ()
  {
    return z;
  }
  /// Fetch Current Player HP
  public int getHp()
  {
    return hp;
  }
  /// Fetch Current Player Direction
  public int getDirection()
  {
    return direction;
  }
  /// Get Distance from Player to Coordinates
  public double getDistance(int a, int b, int c)
  {
    return Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2) + Math.pow(c - z, 2));
  }
  /// Get Distance from Player to Player
  public double getDistance(Player p)
  {
    return Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2) + Math.pow(p.getZ() - z, 2)); 
  }
  /// Convert to String
  public String toString()
  {
    return "Name: " + name + "\nHealth: " + hp + "\nCoordinates: X " + x + " Y " + y + " Z " + z + "\nDirection: " + direction;
  }
  
  // Modify Player
  /// Set Player HP
  public void setHp(int h)
  {
    if (h < 0)
      hp = 0;
    else
      hp = h;
  }
  /// Set Player Direction
  public void setDirection(int d)
  {
    if (d >= 1 && d <= 6)
      direction = d;
  }
  /// Move Player
  public void move(int d, int u)
  {
    // Set Direction
    int direction = getDirection();
    if (d >= 1 && d <= 6)
    {
      direction = d;
    }
    // Move
    if (direction == 1) // North
    {
      x += u;
    }
    else if (direction == 2) // South
    {
      x -= u;
    }
    else if (direction == 3) // Up
    {
      y += u;
    }
    else if (direction == 4) // Down
    {
      y -= u;
    }
    else if (direction == 5) // East
    {
      z += u;
    }
    else if (direction == 6) // West
    {
      z -= u;
    }
  }
  /// Teleport Player
  public void teleport(int a, int b, int c)
  {
    x = a;
    y = b;
    z = c;
  }
  /// Teleport Player to Player
  public void teleport(Player p)
  {
    x = p.getX();
    y = p.getY();
    z = p.getZ();
  }
  /// Attack Player
  public void attack(Player p, int d)
  {
    if (p.getHp() > 0)
    {
      if (p.getHp() - d >= 0)
        p.setHp(p.getHp() - d);
      else
        p.setHp(0);
      setHp(getHp() + (d / 2));
    }
  }
}
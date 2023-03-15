public class Board
{
  // Initialize Variable
  private String[][] squares;

  // Construct 10x10 Board
  public Board()
  {
    // Create Array
    squares = new String[10][10];
    // Add Tiles
    for (int row = 0; row < squares.length; row++)
    {
      for (int col = 0; col < squares[0].length; col++)
      {
        squares[row][col] = "-";
      }
    }
  }

  // Output to String
  public String toString()
  {
    // Temporary Storage
    String output = "";
    // Create Output
    for (int row = 0; row < squares.length; row++)
    {
      for (int col = 0; col < squares[0].length; col++)
      {
        output += squares[row][col] + " ";
      }
      output += "\n";
    }
    return output;
  }

  // Create New Ship at Specified Location
  public boolean addShip(int row, int col, int len, boolean horizontal)
  {
    // Validate Given Values
    if (row < 0 || col < 0 || row >= squares.length || col >= squares[0].length)
      return false;
    // Horizontal
    if (horizontal)
    {
      // Check New Ship Position
      if (col + len > squares.length)
        return false;
      for (int c = col; c < col + len; c++)
      {
        if (!squares[row][c].equals("-"))
          return false;
      }
      // Add New Ship to Board if Valid
      for (int c = col; c < col + len; c++)
      {
        squares[row][c] = "b";
      }
    }
    // Vertical
    else
    {
      // Check New Ship Position
      if (row + len > squares.length)
        return false;
      for (int r = row; r < row + len; r++)
      {
        if (!squares[r][col].equals("-"))
          return false;
      }
      // Add New Ship to Board if Valid
      for (int r = row; r < row + len; r++)
      {
        squares[r][col] = "b";
      }
    }
    // Confirm New Ship Added
    return true;
  }

  // Find Ship
  public boolean foundShip(int len)
  {
    // Horizontal
    for (int row = 0; row < squares.length; row++)
    {
      // Temporary Storage
      int count = 0;
      while (count < squares[0].length)
      {
        // Temporary Storage
        int foundLen = 0;
        // Find Ships in Given Length
        while (count < squares[0].length && squares[row][count].equals("b"))
        {
          foundLen++;
          count++;
        }
        if (foundLen == len)
          return true;
        // Reset Variable
        foundLen = 0;
        count++;
      }
    }
    // Vertical
    for (int pos = 0; pos < squares[0].length; pos++)
    {
      // Temporary Storage
      int counter = 0;
      while (counter < squares.length)
      {
        // Temporary Storage
        int foundLen = 0;
        // Find Ships in Given Length
        while (counter < squares.length && squares[counter][pos].equals("b"))
        {
          foundLen++;
          counter++;
        }
        if (foundLen == len)
          return true;
        // Reset Variable
        foundLen = 0;
        counter++;
      }
    }
    // End
    return false;
  }

  // Shoot Ship
  public int shoot(int row, int col)
  {
    // Validate Given Values
    if (row < 0 || col < 0 || row >= squares.length || col >= squares[0].length)
      return -1;
    // Missed Shot
    if (squares[row][col].equals("-"))
    {
      squares[row][col] = "m";
      return 0;
    }
    // Hit Shot
    if (squares[row][col].equals("b"))
    {
      squares[row][col] = "x";
      return 1;
    }
    // Already Shot
    return 2;
  }

  // Game Over
  public boolean gameOver()
  {
    // Check for Battleships on Board
    for (int row = 0; row < squares.length; row++)
    {
      for (int col = 0; col < squares[0].length; col++)
      {
        if (squares[row][col].equals("b"))
          return false;
      }
    }
    // End
    return true;
  }
}

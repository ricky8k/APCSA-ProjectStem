import java.util.ArrayList;

public class GameWheel
{
  private ArrayList<Slice> slices; // List of slices making up the wheel
  private int currentPos;   // Position of currently selected slice on wheel

  /* Returns string representation of GameWheel with each numbered slice
   * on a new line
   */
  public String toString()
  {
    // Initialize Variable
    String output = "";
    // Create String from Slices
    for (int pos = 0; pos < slices.size(); pos++)
    {
      output += "\n" + pos + " - " + slices.get(pos).toString();
    }
    // End
    return output;
  }

  /* Randomizes the positions of the slices that are in the wheel, but without
   * changing the pattern of the colors
   */
  public void scramble()
  {
    // Temporary Storage
    ArrayList<Slice> blackSlices = new ArrayList<Slice>();
    ArrayList<Slice> blueSlices = new ArrayList<Slice>();
    ArrayList<Slice> redSlices = new ArrayList<Slice>();
    
    // Sort Slices
    for (int pos = 0; pos < slices.size(); pos++)
    {
      // Black Slices
      if (pos % 5 == 0)
      {
        blackSlices.add(slices.get(pos));
      }
      // Blue Slices
      else if (pos % 2 == 0 && pos >= 2)
      {
        blueSlices.add(slices.get(pos));
      }
      // Red Slices
      else
      {
        redSlices.add(slices.get(pos));
      }
    }
    /// Clear Existing Slices
    slices.clear();
    
    // Randomize Slices Based on Rule
    for (int pos = 0; pos < 20; pos++)
    {
      // Black Slices
      if (pos % 5 == 0)
      {
        slices.add(blackSlices.remove((int)(Math.random() * blackSlices.size())));
      }
      // Blue Slices
      else if (pos % 2 == 0 && pos >= 2)
      {
        slices.add(blueSlices.remove((int)(Math.random() * blueSlices.size())));
      }
      // Red Slices
      else
      {
        slices.add(redSlices.remove((int)(Math.random() * redSlices.size())));
      }
    }
  }

  /* Sorts the positions of the slices that are in the wheel by prize amount,
   * but without changing the pattern of the colors.
   */
  public void sort()
  {
    // Temporary Storage
    ArrayList<Slice> blackSlices = new ArrayList<Slice>();
    ArrayList<Slice> blueSlices = new ArrayList<Slice>();
    ArrayList<Slice> redSlices = new ArrayList<Slice>();
    
    // Sort Slices
    for (int pos = 0; pos < slices.size(); pos++)
    {
      // Black Slices
      if (pos % 5 == 0)
      {
        blackSlices.add(slices.get(pos));
      }
      // Blue Slices
      else if (pos % 2 == 0 && pos >= 2)
      {
        blueSlices.add(slices.get(pos));
      }
      // Red Slices
      else
      {
        redSlices.add(slices.get(pos));
      }
    }
    /// Clear Existing Slices
    slices.clear();
    /// Sort With Helper Method
    insertSort(blackSlices);
    insertSort(blueSlices);
    insertSort(redSlices);
    
    // Add Slices
    for (int pos = 0; pos < 20; pos++)
    {
      if (pos % 5 == 0)
      {
        slices.add(blackSlices.remove(0));
      }
      else if (pos % 2 == 0 && pos >= 2)
      {
        slices.add(blueSlices.remove(0));
      }
      else
      {
        slices.add(redSlices.remove(0));
      }
    }
  }
  // Helper Method for sort()
  public static void insertSort(ArrayList<Slice> list)
  {
    for (int pos = 1; pos < list.size(); pos++)
    {
      int temp = list.get(pos).getPrizeAmount();
      int j;
      for (j = pos; j > 0; j--)
      {
        if (temp >= list.get(j - 1).getPrizeAmount())
        {
          break;
        }
        list.add(j - 1, list.remove(j));
      }
    }
  }

  /* COMPLETED METHODS - YOU DO NOT NEED TO CHANGE THESE */

  /* Creates a wheel with 20 preset slices
   */
  public GameWheel()
  {
    this(getStandardPrizes());
  }

  /* Creates a wheel with 20 slices, using values from array parameter
   */
  public GameWheel(int[] prizes)
  {
    currentPos = 0;
    slices = new ArrayList<Slice>();
    for(int i = 0; i < 20; i++){
      int pa = 0;
      String col = "blue";
      if(i < prizes.length)
        pa = prizes[i];
      if (i%5 == 0)
        col = "black";
      else if (i%2 == 1)
        col = "red";
      slices.add(new Slice(col, pa));
    }
  }

  /* Spins the wheel by so that a different slice is selected. Returns that
   * slice (Note: the 10 slices following the current slice are more likely to
   * be returned than the other 10).
   */
  public Slice spinWheel()
  {
    //spin power between range of 1-50 (inclusive)
    int power = (int)(Math.random()*50 + 1);
    int newPos = (currentPos + power) % slices.size();
    currentPos = newPos;
    return slices.get(currentPos);
  }

  public Slice getSlice(int i)
  {
    int sliceNum = i;
    if(i < 0 || i > 19)
      sliceNum = 0;
    return slices.get(sliceNum);
  }

  // Makes an array with a standard list of prizes
  private static int[] getStandardPrizes()
  {
    int[] arr = new int[20];
    for (int i=0; i < 20; i++)
    {
      if (i%5 == 0)
        arr[i] = i*1000;
      else if (i%2 == 1)
        arr[i] = i*100;
      else
        arr[i] = i*200;
    }
    return arr;
  }
}
import java.util.ArrayList;

public class Game
{
  public static void play(GameWheel g)
  {
    // Initialize Variables
    String spin = "";
    int totalPrize = 0;
    ArrayList<String> spins = new ArrayList<String>();
    
    // Run 3 Spins on Game Wheel
    for (int trial = 0; trial < 3; trial++)
    {
      // Get Random Slice on Wheel
      int pos = (int)(Math.random() * 20);
      // Add Winnings to Total
      int amount = g.getSlice(pos).getPrizeAmount();
      totalPrize += amount;
      // Index Spin
      spin += "\nSpin " + (trial + 1) + " - " + g.getSlice(pos);
      spins.add(g.getSlice(pos).getColor());
    }
    
    // Check Spins for Bonus Earnings
    boolean bonus = true;
    for (int pos = 0; pos < spins.size() - 1; pos++)
    {
      if (spins.get(pos).equals(spins.get(pos + 1)))
      {
        continue;
      }
      else
      {
        bonus = false;
      }
    }
    
    // Output
    if (bonus)
    {
      // Double Total Earnings
      totalPrize *= 2;
      // Final Output
      System.out.println("Total prize money: $" + totalPrize + "\n" + spin);
      System.out.println("Three " + spins.get(0) + "s = double your money!");
    }
    else
    {
      // Final Output
      System.out.println("Total prize money: $" + totalPrize + "\n" + spin);
    }
  }
}
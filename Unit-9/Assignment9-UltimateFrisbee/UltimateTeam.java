import java.util.ArrayList;

public class UltimateTeam
{
  // Store Team Data
  private ArrayList<UltimatePlayer> players;
  private ArrayList<Coach> coaches;
  
  // Create Team Using Given Values
  public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches)
  {
    // Set Team Players
    this.players = players;
    // Set Team Coaches
    this.coaches = coaches;
  }
  
  // Get Cutters from Team
  public String getCutters()
  {
    // Temporary Storage
    String output = "";
    for (UltimatePlayer player: players)
    {
      if (player.getPosition().equals("cutter"))
      {
        output += player.toString() + "\n";
      }
    }
    return output;
  }
  
  // Get Handlers from Team
  public String getHandlers()
  {
    // Temporary Storage
    String output = "";
    for (UltimatePlayer player: players)
    {
      if (player.getPosition().equals("handler"))
      {
        output += player.toString() + "\n";
      }
    }
    return output;
  }
  
  // Output to String
  public String toString()
  {
    // Temporary Storage
    String output = "COACHES\n";
    // Add Coaches
    for (Coach coach: coaches)
    {
      output += coach.toString() + "\n";
    }
    // Add Players
    output += "PLAYERS\n";
    for (UltimatePlayer player: players)
    {
      output += player.toString() + "\n";
    }
    return output;
  }
}
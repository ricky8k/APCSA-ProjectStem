public class Farm
{
  // Initialize Variables
  private Farmer theFarmer;
  private Animal firstAnimal;
  private Animal secondAnimal;
  private Animal thirdAnimal;

  // Construct Farm with Specified Animals
  public Farm(Farmer f, Animal a1, Animal a2, Animal a3)
  {
    theFarmer = f;
    firstAnimal = a1;
    secondAnimal = a2;
    thirdAnimal = a3;
  }

  // Output to String
  public String toString()
  {
    String s = theFarmer + " had a farm.";
    s += "\nAnd on that farm he had a " + firstAnimal;
    s += "\nAnd on that farm he had a " + secondAnimal;
    s += "\nAnd on that farm he had a " + thirdAnimal;
    return s;
  }
}
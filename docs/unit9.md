---
label: "Unit 9: Inheritance"
icon: code
order: -1
---

# Unit 9: Inheritance

## Lesson 1: Inheritance

### Coding Activity 1
+++ SpecialityCoffee.java
```java
public class SpecialityCoffee extends Coffee
{
  // Initialize Variable
  private String flavor;
  
  // Default SpecialityCoffee()
  public SpecialityCoffee()
  {
    super();
    flavor = "Vanilla";
  }
  
  // 3-Constructor SpecialityCoffee()
  public SpecialityCoffee(String size, String type, String flavor)
  {
    this(size, false, 1, type, flavor);
  }
  
  // 5-Constructor SpecialityCoffee()
  public SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
  {
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }
  
  // Output to String
  public String toString()
  {
    return super.toString() + " with " + flavor;
  }
}
```
+++ Coffee.java
```java
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
```
+++ runner_Coffee.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
public class runner_Coffee
{

  private static SpecialityCoffee c;

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Choose constructor to test:\n1 - SpecialityCoffee()\n2 - SpecialityCoffee(String size, String type, String flavor)\n3 - SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor)");
    int which = scan.nextInt();
    if (which == 1)
    {
      c = new SpecialityCoffee();
    }
    else if (which == 2 || which == 3)
    {
      scan.nextLine();
      System.out.println("Size?");
      String sz = scan.nextLine();
      System.out.println("Type?");
      String tp = scan.nextLine();
      System.out.println("Flavor?");
      String fl = scan.nextLine();
      if (which == 3)
      {
        System.out.println("Is Skinny (y/n)?");
        String sk = scan.nextLine().toLowerCase();
        boolean iS = (sk.equals("y")||sk.equals("yes")||sk.equals("t")||sk.equals("true"));
        System.out.println("Shots?");
        int sh = scan.nextInt();
        c = new SpecialityCoffee(sz, iS, sh, tp, fl);
      }
      else
      {
        c = new SpecialityCoffee(sz, tp, fl);
      }
    }
    if(c != null)
    {
      System.out.println(c);
    }
  }
}
```
+++

## Lesson 2: Inheritance Overriding Methods

### Coding Activity 1
+++ SpecialityCoffee.java
```java
public class SpecialityCoffee extends Coffee 
{
  // Initialize Variable
  private String flavor;

  // Default SpecialityCoffee()
  public SpecialityCoffee() 
  {
    // Calls super-constructor to create default coffee then sets flavor
    super();
    flavor = "vanilla";
  }

  // 3-Constructor SpecialityCoffee()
  public SpecialityCoffee(String size, String type, String flavor) 
  {
    // Calls constructor below with a mix of parameters and default values
    this(size, false, 1, type, flavor);
  }

  // 5-Constructor SpecialityCoffee()
  public SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
  {
    // Calls super-constructor to set first 4 variables then sets flavor
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }
  
  // Get Price of Speciality Coffee
  public int getPrice()
  {
    // Temporary Storage
    int price = super.getPrice();
    
    // Check Size of Coffee
    if (super.getSize().matches("large|extra large")) /* L or XL */
    {
      price += 50;
    }
    else /* Other Size */
    {
      price += 30;
    }
    
    // End
    return price;
  }
  
  // Output to String
  public String toString() 
  {
    // Calls Coffee toString and appends flavor to end
    return super.toString() + " with " + flavor;
  }
}
```
+++ Coffee.java
```java
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
```
+++ runner_Coffee.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
public class runner_Coffee 
{

  private static SpecialityCoffee c;

  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Choose constructor to test:\n1 - SpecialityCoffee()\n2 - SpecialityCoffee(String size, String type, String flavor)\n3 - SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor)");
    int which = scan.nextInt();
    if (which == 1) 
    {
      c = new SpecialityCoffee();
    } 
    else if (which == 2 || which == 3) 
    {
      scan.nextLine();
      System.out.println("Size?");
      String sz = scan.nextLine();
      System.out.println("Type?");
      String tp = scan.nextLine();
      System.out.println("Flavor?");
      String fl = scan.nextLine();
      if (which == 3) 
      {
        boolean iS = false;
        System.out.println("Is Skinny (y/n)?");
        String sk = scan.nextLine().toLowerCase();
        if(sk.equals("y")||sk.equals("yes")||sk.equals("t")||sk.equals("true"))
          iS = true;
        System.out.println("Shots?");
        int sh = scan.nextInt();
        c = new SpecialityCoffee(sz, iS, sh, tp, fl);
      }
      else
        c = new SpecialityCoffee(sz, tp, fl);
    }
    if(c != null) 
    {
      System.out.println(c);
      int p = c.getPrice();
      System.out.println("$"+p/100 + "."+ (p%100)/10 + p%10);
    }
  }
}
```
+++

### Coding Activity 2
+++ DoubleCone.java
```java
public class DoubleCone extends Cone
{
  // Initialize Variables
  private String flavor;
  private String flavor2;
  private String topping;
  
  // 2-Constructor DoubleCone()
  public DoubleCone(String f, boolean w)
  {
    // Creates Cone with 2x flavor f
    super(f, w);
    flavor = f;
    flavor2 = f;
  }
  
  // 3-Constructor DoubleCone()
  public DoubleCone(String f1, String f2, boolean w)
  {
    // Creates Cone with flavors f1 and f2
    super(f1, w);
    flavor = f1;
    flavor2 = f2;
  }
  
  // Set Flavor of Double Cone
  public void setFlavor(String f)
  {
    // Overwrites flavor and flavor2 to f
    super.setFlavor(f);
    flavor = f;
    flavor2 = f;
  }
  
  // Set Flavor of Double Cone
  public void setFlavor(String f1, String f2)
  {
    // Overwrites flavor to f1 and flavor2 to f2
    super.setFlavor(f1);
    flavor = f1;
    flavor2 = f2;
  }
  
  // Add Topping to Double Cone
  public void addTopping(String t)
  {
    // Sets topping to t
    topping = t;
  }
  
  // Output to String
  public String toString()
  {
    // Temporary Storage
    String output = "double " + super.toString();
    
    // Check Flavors
    if (flavor.equals(flavor2)) /* Same 2 Flavors */
    {
      output += " x2";
    }
    else /* Different 2 Flavors */
    {
      output += " and " + flavor2;
    }
    
    // Check Topping
    if (topping != null)
      output += " with " + topping;
    
    // End
    return output;
  }
}
```
+++ Cone.java
```java
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
```
+++ runner_DoubleCone.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_DoubleCone {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DoubleCone c;

    System.out.println("Type \"s\" for same flavors, \"d\" for different.");
    String cons = scan.nextLine().toLowerCase();
    System.out.println("Type \"w\" for waffle cone.");

    boolean w = scan.nextLine().toLowerCase().equals("w");

    if (cons.equals("s")) {
      System.out.println("What flavour?");
      String f = scan.nextLine();
      System.out.println("topping?");
      String t = scan.nextLine();
      c = new DoubleCone(f, w);
      c.addTopping(t);
      
    } else {
      System.out.println("First flavour?");
      String f1 = scan.nextLine();
      System.out.println("Second flavour?");
      String f2 = scan.nextLine();
      System.out.println("topping?");
      String t = scan.nextLine();
      c = new DoubleCone(f1, f2, w);
      c.addTopping(t);
    }

    System.out.println(c);
    System.out.println("Change flavors? (y/n)");
    if(scan.nextLine().toLowerCase().equals("y")) {
      System.out.println("Type \"s\" for same flavors, \"d\" for different.");
      String mtd = scan.nextLine().toLowerCase();
      if (mtd.equals("s")) {
        System.out.println("What flavour?");
        String f = scan.nextLine();
        c.setFlavor(f);
      } else {
        System.out.println("First flavour?");
        String f1 = scan.nextLine();
        System.out.println("Second flavour?");
        String f2 = scan.nextLine();
        c.setFlavor(f1, f2);
      }
      System.out.println(c);
    }
  }
}
```
+++

## Lesson 3: Is-a and Has-a Relationships

### Coding Activity 1
+++ Animal.java
```java
public class Animal
{
  // Initialize Variable
  private String name;

  // Create Animal with Specified Name
  public Animal(String n)
  {
    name = n;
  }

  // Get Name of Animal
  public String getName()
  {
    return name;
  }

  // Get Animal to Speak
  public String speak()
  {
    return "";
  }

  // Output to String
  public String toString()
  {
    return getName() + " (" + speak() + " " + speak() + ").";
  }
}
```
+++ Cow.java
```java
public class Cow extends Animal
{
  // Create Cow
  public Cow()
  {
    super("cow");
  }

  // Get Cow to Speak
  public String speak()
  {
    return "moo";
  }
}
```
+++ Farm.java
```java
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
```
+++ Farmer.java
```java
public class Farmer
{
  // Initialize Variables
  private String forename;
  private String surname;

  // Create Farmer with Specified Name
  public Farmer(String f, String s)
  {
    forename = f;
    surname = s;
  }

  // Output to String
  public String toString()
  {
    return forename + " " + surname;
  }
}
```
+++ Pig.java
```java
public class Pig extends Animal
{
  // Create Pig
  public Pig()
  {
    super("pig");
  }

  // Get Pig to Speak
  public String speak()
  {
    return "oink";
  }
}
```
+++ Sheep.java
```java
public class Sheep extends Animal
{
  // Create Sheep
  public Sheep()
  {
    super("sheep");
  }

  // Get Sheep to Speak
  public String speak()
  {
    return "baa";
  }
}
```
+++ runner_Farm.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_Farm
{
  private static Scanner scan;

  public static void main(String[] args)
  {
    scan = new Scanner(System.in);
    System.out.println("First, what's your farmer's forename?");
    String f = scan.nextLine();
    System.out.println("And their surname?");
    Farmer fm = new Farmer(f, scan.nextLine());
    Animal a1 = addAnimal();
    Animal a2 = addAnimal();
    Animal a3 = addAnimal();
    Farm theFarm = new Farm(fm, a1, a2, a3);
    System.out.println();
    System.out.println(theFarm);
  }

  private static Animal addAnimal()
  {
    String type = "";
    Animal a = null;
    while(a == null){
      System.out.println("Choose an animal: pig, cow or sheep.");
      type = scan.nextLine().toLowerCase();
      if (type.equals("pig"))
        a = new Pig();
      else if (type.equals("cow"))
        a = new Cow();
      else if (type.equals("sheep"))
        a = new Sheep();
      else
        System.out.println("Unrecognised animal.");
    }
    return a;
  }
}
```
+++

## Assignment 9: Ultimate Frisbee

### Coding Activity
+++ Captain.java
```java
public class Captain extends UltimatePlayer
{
  // Store Captain Type
  // true = Offense, false = Defense
  private boolean type;

  // Create Captain Using Given Values
  public Captain(String firstName, String lastName, String position, boolean type)
  {
    // Calls Super-Constructor to Create UltimatePlayer
    super(firstName, lastName, position);
    // Set Captain Type
    this.type = type;
  }
  
  // Throw Disc and Return Distance
  public int throwDisc(int pow)
  {
    // Check Power
    pow = Math.max(pow, 1);
    pow = Math.min(pow, 10);
    // Return Distance
    return pow * 5;
  }
  
  // Output to String
  public String toString()
  {
    // Calls Super-Constructor to Create String and Appends Captain Type
    return super.toString() + "\n   Captain: " + (type ? "offense" : "defense");
  }
}
```
+++ Coach.java
```java
public class Coach extends Person
{
  // Store Coach Role
  private String role;
  
  // Create Coach with Given Values
  public Coach(String firstName, String lastName, String role)
  {
    // Calls Super-Constructor to Create Person
    super(firstName, lastName);
    // Set Coach Role
    this.role = role;
  }
  
  // Output to String
  public String toString()
  {
    // Calls Super-Constructor to Create String and Appends Role
    return super.toString() + "\n   Role: " + role;
  }
}
```
+++ Person.java
```java
public class Person
{
  // Store Person's Name
  private String firstName;
  private String lastName;
  
  // Create Person with Given Strings
  public Person(String firstName, String lastName)
  {
    // Set Person Name
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  // Throw Disc and Return Distance
  public int throwDisc(int pow)
  {
    // Check Power
    pow = Math.max(pow, 1);
    pow = Math.min(pow, 10);
    // Return Distance
    return pow * 2;
  }
  
  // Output to String
  public String toString()
  {
    return lastName + ", " + firstName;
  }
}
```
+++ UltimatePlayer.java
```java
public class UltimatePlayer extends Person
{
  // Store Player Values
  private int jerseyNumber;
  private String position;
  /// Temporary Storage
  private static int playerCount = 1;
  
  // Create Player Using Given Values
  public UltimatePlayer(String firstName, String lastName, String position)
  {
    // Calls Super-Constructor to Create Person
    super(firstName, lastName);
    // Set Jersey Number
    this.jerseyNumber = playerCount++;
    // Set Player Position
    if (position.matches("handler|cutter"))
    {
      this.position = position;
    }
    else
    {
      this.position = "handler";
    }
  }
  
  // Fetch Player Position
  public String getPosition()
  {
    return position;
  }
  
  // Throw Disc and Return Distance
  public int throwDisc(int pow)
  {
    // Check Power
    pow = Math.max(pow, 1);
    pow = Math.min(pow, 10);
    // Return Distance
    return pow * 4;
  }
  
  // Output to String
  public String toString()
  {
    // Calls Super-Constructor to Create String and Appends Jersey Number and Position
    return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
  }
}
```
+++ UltimateTeam.java
```java
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
```
+++ runner_Ultimate.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.ArrayList;
import java.util.Scanner;

public class runner_Ultimate{

  public static void main(String[] args){
    ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
    ArrayList<Coach> coaches = new ArrayList<Coach>();
    Scanner scan = new Scanner(System.in);
    String ins = "";
    while(!ins.equals("q")){
      System.out.println("\nWhat do you want to do?\np - make a person\nt - make a team from the current player/coach lists\nq - quit");
      ins = scan.nextLine().toLowerCase();
      if(ins.equals("p")){
        Person p;
        System.out.println("\nWhich class do you want to use?\np - Person\nu - UltimatePlayer\nc - Captain\no - Coach");
        String cls = scan.nextLine().toLowerCase();
        System.out.println("First name?");
        String fn = scan.nextLine();
        System.out.println("Last name?");
        String ln = scan.nextLine();
        if(cls.equals("u")||cls.equals("c")){
          System.out.println("Position?");
          String ps = scan.nextLine();
          if(cls.equals("c")){
            System.out.println("Offensive coach? (t/f)");
            boolean tp = scan.nextLine().toLowerCase().equals("t");
            p = new Captain(fn, ln, ps, tp);
          }
          else
            p = new UltimatePlayer(fn, ln, ps);
          players.add((UltimatePlayer)p);
          System.out.println("\n" + fn + " " + ln + " was added to the players list.");
        }
        else if(cls.equals("o")){
          System.out.println("Role?");
          String rl = scan.nextLine();
          p = new Coach(fn, ln, rl);
          coaches.add((Coach)p);
          System.out.println("\n" + fn + " " + ln + " was added to the coaches list.");
        }
        else{
          p = new Person(fn, ln);
          System.out.println("\nSorry, only UltimatePlayers, Captains and Coaches can be added to the team.");
        }
        System.out.println("\n" + p);
        System.out.println("\nType \"t\" for " + fn + " to throw a disc.");
        if(scan.nextLine().toLowerCase().equals("t")){
          System.out.println("Enter power level between 1 and 10.");
          System.out.println(fn + " threw the disc " + p.throwDisc(scan.nextInt()) + " yards.");
          scan.nextLine();
        }
      }
      else if(ins.equals("t")){
        UltimateTeam t = new UltimateTeam(players, coaches);
        System.out.println("\nYour team is ready!\n");
        while(!ins.equals("q")){
          System.out.println("\nWhat do you want to do?\nc - see the cutters\nh - see handlers\nt = see the whole team\nq - quit");
          ins = scan.nextLine().toLowerCase();
          if(ins.equals("h"))
            System.out.println("\n" + t.getHandlers());
          else if(ins.equals("c"))
            System.out.println("\n" + t.getCutters());
          else if(ins.equals("t"))
            System.out.println("\n" + t + "\n");
        }
      }
    }
  }
}
```
+++

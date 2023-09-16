---
label: "Unit 5: Writing Classes"
icon: code
order: -1
---

# Unit 5: Writing Classes

## Lesson 1: Void Methods

### Coding Activity 1

+++ U5_L1_Activity_One.java

```java
/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U5_L1_Activity_One
{
  public static void myMethod()
  {
    // Final Output
    System.out.println("I'm a void method!");
  }
}
```

+++

## Lesson 2: Parameters

### Coding Activity 1

+++ U5_L2_Activity_One.java

```java
/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U5_L2_Activity_One
{
  public static void timeOfDay(int x)
  {
    // Final Output
    if (x == 0) // 00:00 (Midnight)
      System.out.println("midnight");
    else if (x == 12) // 12:00 (Noon)
      System.out.println("noon");
    else if (x == 18) // 18:00 (Dusk)
      System.out.println("dusk");
    else if (x > 0 && x < 12) // 00:01 - 11:59 (Morning)
      System.out.println("morning");
    else if (x > 12 && x < 18) // 12:01 - 17:59 (Afternoon)
      System.out.println("afternoon");
    else if (x > 18 && x < 24) // 18:01 - 23:59 (Evening)
      System.out.println("evening");
  }
}
```

+++

### Coding Activity 2

+++ U5_L2_Activity_Two.java

```java
/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U5_L2_Activity_Two
{
  public static void reverser(String str)
  {
    // Initialize Variable
    String revStr = "";
    
    // Reverse str
    for (int i = str.length(); i > 0; i--)
    {
      revStr = revStr + str.substring(i - 1, i);
    }
    
    // Final Output
    System.out.println(revStr);
  }
}
```

+++

### Coding Activity 3

+++ U5_L2_Activity_Three.java

```java
/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

public class U5_L2_Activity_Three
{
  public static void printDouble(double num, int n)
  {
    // Final Output
    for (int i = 0; i < n; i++)
    {
      System.out.println(num);
    }
  }
}
```

+++

### Coding Activity 4

+++ U5_L2_Activity_Four.java

```java
/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L2_Activity_Four
{
  public static void coinConverter(int n)
  {
    // Coin Conversion
    int dollars = n / 100;
    int quarters = (n - (dollars * 100)) / 25;
    int dimes = (n - (dollars * 100) - (quarters * 25)) / 10;
    int nickels = (n - (dollars * 100) - (quarters * 25) - (dimes * 10)) / 5;
    int pennies = (n - (dollars * 100) - (quarters * 25) - (dimes * 10) - (nickels * 5));
    
    // Final Output
    System.out.println("Dollar Bills: " + dollars);
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);
  }
}
```

+++

## Lesson 3: Parameters - Primitive vs. Class

### Coding Activity 1

+++ U5_L3_Activity_One.java

```java
/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;
import shapes.*;

public class U5_L3_Activity_One
{
  public static void makeEqTriangle(RegularPolygon x)
  {
    x.setNumSides(3);
  }
}
```

+++

### Coding Activity 2

+++ U5_L3_Activity_Two.java

```java
/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;
import shapes.*;
import testing.Math;

public class U5_L3_Activity_Two
{
  public static void randomize(Rectangle x)
  {
    // Randomize Length
    int length = (int) ((Math.random() * 11) + 10);
    if (length % 2 != 0)
      length++;
    
    // Randomize Width
    int width = (int) ((Math.random() * 7) + 7);
    if (width % 2 == 0)
      width++;
    
    // Set New Length & Width for Rectangle x
    x.setLength(length);
    x.setWidth(width);
  }
}
```

+++

### Coding Activity 3

+++ U5_L3_Activity_Three.java

```java
/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;
import shapes.*;

public class U5_L3_Activity_Three
{
  public static void updateNumSides(RegularPolygon x, int y)
  {
    x.setNumSides(y);
  }
}
```

+++

## Lesson 4: Return Methods

### Coding Activity 1

+++ U5_L4_Activity_One.java

```java
/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;
import shapes.*;

public class U5_L4_Activity_One
{
  public static int totalSides(RegularPolygon x, RegularPolygon y)
  {
    // Calculate
    int total = x.getNumSides() + y.getNumSides();
    
    return total;
  }
}
```

+++

### Coding Activity 2

+++ U5_L4_Activity_Two.java

```java
/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U5_L4_Activity_Two
{
  public static double distance(int x1, int y1, int x2, int y2)
  {
    // Calculate
    double total = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    
    return total;
  }
}
```

+++

### Coding Activity 3

+++ U5_L4_Activity_Three.java

```java
/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;
import shapes.*;

public class U5_L4_Activity_Three
{
  public static double circDiff(Circle x, Circle y)
  {
    // Calculate
    double total = Math.abs(x.getCircumference() - y.getCircumference());
    
    return total;
  }
}
```

+++

### Coding Activity 4

+++ U5_L4_Activity_Four.java

```java
/* Lesson 4 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L4_Activity_Four
{
  public static int substringCount(String x, String y)
  {
    // Count
    int count = 0;
    for (int i = 0; i <= x.length() - y.length(); i++)
    {
      if (x.substring(i, i + y.length()).equals(y))
      {
        count++;
      }
    }
    
    return count;
  }
}
```

+++

## Lesson 5: Classes - The Basics

### Coding Activity 1

+++ Person.java

```java
public class Person
{
  // Initialize Variables
  private String firstName;
  private String lastName;
  private int age;
  private String ssn;
  
  public Person(String f, String l, int a, String s)
  {
    // Store Variables to Class
    firstName = f;
    lastName = l;
    age = a;
    ssn = s;
  }
  
  public String toString()
  {
    // Default Output
    return "SSN: " + ssn + "\n\tName: " + firstName + " " + lastName + "\n\tAge: " + age; 
  }
}
```

+++ runner_Person.java

```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
 
public class runner_Person 
{
 
  public static void main(String[] args) 
  {
 
       Scanner scan = new Scanner(System.in);
 
       System.out.println("Enter the person's first name:");
       String firstName = scan.nextLine();
       System.out.println("Enter the person's last name:");
       String lastName = scan.nextLine();
       System.out.println("Enter the person's age:");
       int age = scan.nextInt();
       scan.nextLine();
       System.out.println("Enter the person's social security number:");
       String ssn = scan.nextLine();
 
       System.out.println();
       Person person = new Person(firstName, lastName, age, ssn);
       System.out.println(person);
  }
}
```

+++

### Coding Activity 2

+++ Oven.java

```java
public class Oven 
{
  // Represents the maximum possible temperature of an oven
  private int maxTemp;

  // Represents the current temperature of an oven
  private int currentTemp;

  // Constructs an oven with the given max temp and starting temp. The maximum
  // temperature of an oven must be greater than 0, but no more than 500.
  // The starting temperature should be less than or equal to the maximum t
  // temperature, but no less than 0.
  public Oven(int maxTemperature, int startTemperature) 
  {
    // Set maxTemp
    if (maxTemperature > 0 && maxTemperature <= 500)
    {
      maxTemp = maxTemperature;
    }
    else
    {
      maxTemp = 500;
    }
    // Set currentTemp
    if (startTemperature <= maxTemp && startTemperature >= 0)
    {
      currentTemp = startTemperature;
    }
    else if (startTemperature > maxTemp)
    {
      currentTemp = maxTemp;
    }
    else
    {
      currentTemp = 0;
    }
  }

  // Returns the maximum temperature of an oven
  public int getMaxTemp() 
  {
    return maxTemp;
  }

  // Returns the current temperature of an oven
  public int getCurrentTemp() 
  {
    return currentTemp;
  }

  // Turns an oven off by setting the current temperature to 0.
  public void turnOff() 
  {
    if (currentTemp > 0)
    {
      currentTemp = 0;
    }
  }

  // Returns whether the current temperature of an oven is greater than 0. Should
  // return false if the current temperature is 0.
  public boolean isOn() 
  {
    if (currentTemp > 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  // Sets the current temperature of an oven to the given value. Remember,
  // the current temperature should not exceed the max temp.
  public void preheat(int temp) 
  {
    if (temp < maxTemp)
    {
      currentTemp = temp;
    }
  }
}
```

+++ runner_Oven.java

```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_Oven 
{

  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Maximum oven temperature:");
    int maxTemp = scan.nextInt();
    System.out.println("Starting temperature of the oven:");
    int startTemp = scan.nextInt();

    Oven oven = new Oven(maxTemp, startTemp);

    String instruction = "";

    while (!instruction.equals("q")) 
    {
      System.out.println("New oven with a maximum temperature of " + oven.getMaxTemp() + " and a starting temperature of " +  oven.getCurrentTemp() + " degrees.");

      System.out.println("To preheat the oven enter \"p\", to turn the oven off enter" + " \"o\", to restart enter \"r\", to quit enter \"q\"");

      instruction = scan.next();

      if (instruction.equals("p")) 
      {
        System.out.println("Enter the temperature to preheat the oven to:");
        int temp = scan.nextInt();
        oven.preheat(temp);
        System.out.println("Current temperature of the oven is now " + oven.getCurrentTemp() + " degrees\n");
      } 
      else if (instruction.equals("o")) 
      {
        System.out.println("Turning the oven off.\n");
        oven.turnOff();
      }
    }
  }
}
```

+++

## Lesson 6: Constructors

### Coding Activity 1

+++ Plane.java

```java
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
```

+++ runner_Plane.java

```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_Plane
{
  public static void main (String str[]){
    Scanner scan = new Scanner(System.in);
    Plane p = new Plane ();
    String instruction = "";
    while(!instruction.equals("q")){
      System.out.println(p);
      System.out.println("Location: " + p.getLocation());
      System.out.println("Type \"u\" to move upwards, \"d\" to move downwards, \"n\" for new Plane, \"q\" to quit.");
      instruction = scan.nextLine();
      if(instruction.equals("u")){
        p.upward();
      }
      else if(instruction.equals("d")){
        p.downward();
      }
      else if(instruction.equals("n")){
        System.out.println("Starting location for a new Plane?");
        int start = scan.nextInt();
        p = new Plane(start);
        scan.nextLine();
      }
      else if(!instruction.equals("q")){
        System.out.println("Instruction not recognized.");
      }
    }
  }
}
```

+++

## Lesson 7: Documenting a Class

### Coding Activity 1

+++ Rectangle.java

```java
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
```

+++ runner_Rectangle.java

```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_Rectangle{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Rectangle r = new Rectangle();
    String instruction = "";
    while(!instruction.equals("q")){
      System.out.println("Type the name of the method to test. Type c to construct a new rectangle, q to quit.");
      instruction = scan.nextLine();
      if(instruction.equals("getArea")){
        System.out.println(r.getArea());
      }
      else if(instruction.equals("getBase")){
        System.out.println(r.getBase());
      }
      else if(instruction.equals("getHeight")){
        System.out.println(r.getHeight());
      }
      else if(instruction.equals("getPerimeter")){
        System.out.println(r.getPerimeter());
      }
      else if(instruction.equals("toString")){
        System.out.println(r);
      }
	else if(instruction.equals("getDiagonal")){
		System.out.println(r.getDiagonal());
	}
      else if(instruction.equals("setBase")){
        System.out.println("Enter parameter value:");
        double arg = scan.nextDouble();
        r.setBase(arg);
        scan.nextLine();
      }
      else if(instruction.equals("setHeight")){
        System.out.println("Enter parameter value:");
        double arg = scan.nextDouble();
        r.setHeight(arg);
        scan.nextLine();
      }
      else if(instruction.equals("equals")){
        System.out.println("Enter base and height:");
        double bs = scan.nextDouble();
        double ht = scan.nextDouble();
        Rectangle rOther = new Rectangle(bs, ht);
        System.out.println(r.equals(rOther));
        scan.nextLine();
      }
      else if(instruction.equals("c")){
        System.out.println("Enter base and height:");
        double bs = scan.nextDouble();
        double ht = scan.nextDouble();
        r = new Rectangle(bs, ht);
        scan.nextLine();
      }
      else if(!instruction.equals("q")){
        System.out.println("Not recognized.");
      }
    }
  }
}
```

## Lesson 8: Static vs. Instance

### Coding Activity 1

+++ Car.java

```java
public class Car
{
  // Initialize Variables
  private String carMake;
  private String carModel;
  private int carYear;
  private double carMpg;
  private static int count = 0;
  private int carId;
  
  // Car() - Default
  public Car()
  {
    // User Input
    carMake = "None";
    carModel = "None";
    carYear = 2000;
    carMpg = 0.0;
    // Update carId
    count++;
    carId = count;
  }
  
  // Car()
  public Car(String make, String model, int year, double mpg)
  {
    // User Input
    carMake = make;
    carModel = model;
    /// Verify year
    if (year >= 1885 && year <= 2022)
    {
      carYear = year;
    }
    else if (year > 2022)
    {
      carYear = 2022;
    }
    else if (year < 1885)
    {
      carYear = 2000;
    }
    /// Verify mpg
    if (mpg >= 0)
    {
      carMpg = mpg;
    }
    else
    {
      carMpg = 0;
    }
    // Update carId
    count++;
    carId = count;
  }
  
  // toString()
  public String toString()
  {
    return "ID: " + carId + "\nMake: " + carMake + "\nModel: " + carModel + "\nYear: " + carYear + "\nMPG: " + carMpg;
  }
}
```

+++ runner_Car.java

```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
 
public class runner_Car {
 
   public static void main(String[] args) {
 
       Scanner scan = new Scanner(System.in);
       String i = "";
 
       while(!i.equals("q")) {
 
           System.out.println("Input the make of the car, \"default\" to create a default car or \"q\" to quit:");
           i = scan.nextLine();
 
           System.out.println();
           if (i.equals("q")) {
               System.out.println("Exiting. Bye!");
           } else if (i.equals("default")) {
               Car car = new Car();
               System.out.print(car);
           } else {
               System.out.println("Model of the car:");
               String model = scan.nextLine();
               System.out.println("Year of the car:");
               int year = scan.nextInt();
               scan.nextLine();
               System.out.println("Miles per gallon of the car:");
               double mpg = scan.nextDouble();
               scan.nextLine();
               System.out.println();
               System.out.println(new Car(i, model, year, mpg));
           }
           System.out.println();
       }
   }
}
```

+++

## Assignment 5: Player

### Coding Activity

+++ Player.java

```java
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
```

+++ runner_Player.java

```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.lang.Math;
 
public class runner_Player {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Player p1 = null;

    System.out.println("Welcome!");
    System.out.println("This program helps you test your Player class and its methods.");
    System.out.println("A default Player object will be created for you,");
    System.out.println("or you can use the 'c' option to use another Constructor.\n");

     String instruction = "";
    while (!instruction.equals("q")) {
      System.out.println("Type the name of the method you want to test, or Type c to construct a new Player. Type q to quit.");
      instruction = scan.nextLine().trim();
      if (instruction.equals("c")) {
        System.out.println("Which constructor would you like to use?");
        System.out.println("1 - Player(String name, int x, int y, int z)");
        System.out.println("2 - Player(String name, int x, int y, int z, int hp, int direction");
 
        int choice = scan.nextInt();
        scan.nextLine();
 
        if (choice != 1 && choice != 2) {
          System.out.println("Invalid choice");
          break;
        } else {
          System.out.println("Player name:");
          String name = scan.nextLine().trim();
          System.out.println("Starting x-coordinate:");
          int x = scan.nextInt();
          System.out.println("Starting y-coordinate:");
          int y = scan.nextInt();
          System.out.println("Starting z-coordinate:");
          int z = scan.nextInt();
 
          if (choice == 1) {
            p1 = new Player(name, x, y, z);
            System.out.println("New player created!");
            System.out.println(p1);
          } else {
            System.out.println("Starting health points:");
            int hp = scan.nextInt();
            System.out.println("Starting direction");
            int dir = scan.nextInt();
            p1 = new Player(name, x, y, z, hp, dir);
            System.out.println("New player created!");
            System.out.println(p1);
          }
          scan.nextLine();
        }
        instruction = scan.nextLine().trim();
      } else if (p1 == null) {
        p1 = new Player();
      }
 
      if (instruction.equals("getNumPlayers")) {
        System.out.println("There are " + Player.getNumPlayers() + " existing Player objects");
      } else if (instruction.equals("getX")) {
        System.out.println("The x-coordinate of " + p1.getName() + " is X " + p1.getX());
      } else if (instruction.equals("getY")) {
        System.out.println("The y-coordinate of " + p1.getName() + " is Y " + p1.getY());
      } else if (instruction.equals("getZ")) {
        System.out.println("The z-coordinate of " + p1.getName() + " is Z " + p1.getZ());
      } else if (instruction.equals("getHp")) {
        System.out.println(p1.getName() + " has " + p1.getHp() + " health points");
      } else if (instruction.equals("getDirection")) {
        System.out.println(p1.getName() + " is facing " + p1.getDirection());
      } else if (instruction.equals("toString")) {
        System.out.println(p1);
      } else if (instruction.equals("getName")) {
        System.out.println("The players name is " + p1.getName());
      } else if (instruction.equals("move")) { 
        System.out.println("Enter the direction (1-6) to move in:");
        int direction = scan.nextInt();
        System.out.println("Enter the number of units to move");
        int units = scan.nextInt();
        scan.nextLine();
 
        p1.move(direction, units);
        System.out.println(p1.getName() + " is now at coordinates X " + p1.getX() + " Y " + p1.getY() + " Z " + p1.getZ());
      } else if (instruction.equals("setHp")) {
        System.out.println("Enter the new health of " + p1.getName() + ":");
        int hp = scan.nextInt();
        scan.nextLine();
 
        p1.setHp(hp);
        System.out.println(p1.getName() + " now has " + p1.getHp() + " health points");
      } else if (instruction.equals("setDirection")) {
        System.out.println("Enter the new direction that " + p1.getName() + " is facing:");
        int dr = scan.nextInt();
        scan.nextLine();
        String dir;
        p1.setDirection(dr);
        dr = p1.getDirection();
        if (dr == 1) {
          dir = "North";
        } else if (dr == 2) {
          dir = "South";
        } else if (dr == 3) {
          dir = "Up";
        } else if (dr == 4) {
          dir = "Down";
        } else if (dr == 5) {
          dir = "East";
        } else if (dr == 6) {
          dir = "West";
        } else {
          dir = "an invalid direction";
        }
        System.out.println(p1.getName() + " is now facing " + dir);
      } else if (instruction.equals("attack")) {
        Player p2 = new Player();
        System.out.println(p1.getName() + " is attacking " + p2.getName());
        System.out.println("Damage " + p1.getName() + " should deal to " + p2.getName() + ":");
        int damage = scan.nextInt();
        scan.nextLine();
 
        p1.attack(p2, damage);
        System.out.println(p2.getName() + " now has " + p2.getHp());
        System.out.println(p1.getName() + " now has " + p1.getHp());
      } else if (instruction.equals("teleport")) {
        System.out.println("Method 1 or 2?");
        System.out.println("1 - teleport(int x, int y, int z)");
        System.out.println("2 - teleport(Player p)");
 
        int choice = scan.nextInt();
        scan.nextLine();
 
        if (choice == 1) {
          System.out.println("X-coordinate to teleport to:");
          int x = scan.nextInt();
          System.out.println("Y-coordinate to teleport to:");
          int y = scan.nextInt();
          System.out.println("Z-coordinate to teleport to:");
          int z = scan.nextInt();
 
          scan.nextLine();
 
          p1.teleport(x, y, z);
          System.out.println(p1.getName() + " teleported to X " + p1.getX() + " Y " + p1.getY() + " Z " + p1.getZ());
 
        } else if (choice == 2) {
          int x = (int) (Math.random() * 11);
          int y = (int) (Math.random() * 11);
          int z = (int) (Math.random() * 11);
          Player p2 = new Player("P" + (Player.getNumPlayers() + 1), x, y, z);
          System.out.println(p2.getName() + " is at X " + p2.getX() + " Y " + p2.getY() + " Z " + p2.getZ());
          System.out.println("Teleporting " + p1.getName() + " to " + p2.getName());
          p1.teleport(p2);
          System.out.println(p1.getName() + " now at X " + p1.getX() + " Y " + p1.getY() + " Z " + p1.getZ());
          if (p1.getX() == p2.getX() && p1.getY() == p2.getY() && p1.getZ() == p2.getZ()) {
            System.out.println("The Players are at the same location");
          } else {
            System.out.println("The Players are in different locations");
          }
        } else {
          System.out.println("Invalid choice");
        }
      } else if (instruction.equals("getDistance")) {
        System.out.println("Method 1 or 2?");
        System.out.println("1 - distance(int x, int y, int z)");
        System.out.println("2 - distance(Player p)");
 
        int choice = scan.nextInt();
        scan.nextLine();
 
        if (choice == 1) {
          System.out.println("X-coordinate:");
          int x = scan.nextInt();
          System.out.println("Y-coordinate:");
          int y = scan.nextInt();
          System.out.println("Z-coordinate:");
          int z = scan.nextInt();
 
          scan.nextLine();
          System.out.printf("%s is %f units from X %d Y %d Z %d", p1.getName(), p1.getDistance(x, y, z), x, y, z);
        } else if (choice == 2) {
          Player p2 = new Player("P" + (Player.getNumPlayers() + 1), 10, -5, 87);
 
          System.out.printf("The distance between %s and %s is %f", p1.getName(), p2.getName(), p1.getDistance(p2));
        } else {
          System.out.println("Invalid choice");
        }
      } else if (instruction.equals("q")){
        System.out.println("Exiting. Bye!");
      } else {
        System.out.println("Invalid instruction");
      }
      System.out.println();
    }
  }
}
```

+++

---
label: "Unit 8: 2D Array"
icon: code
order: -1
---

# Unit 8: 2D Array

## Lesson 1: 2-D Arrays

### Coding Activity 1
+++ U8_L1_Activity_One.java
```java
public class U8_L1_Activity_One
{
  public static int sumOfDiag(int[][] arr)
  {
    // Initialize Variable
    int sum = 0;
    
    // Add Lead Diagonal
    for (int i = 0; i < arr.length; i++)
    {
      // Validate
      if (i > arr[0].length - 1)
      {
        break;
      }
      sum += arr[i][i];
    }
    
    // End
    return sum;
  }
}
```
+++ runner_U8_L1_Activity_One.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_U8_L1_Activity_One
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of rows:");
    int rows = scan.nextInt();
    System.out.println("Enter number of columns:");
    int cols = scan.nextInt();
    int[][] mat = new int[rows][cols];
    System.out.println("Enter values:");
    for(int r = 0; r < rows; r++)
    {
      for(int c = 0; c < cols; c++)
        mat[r][c] = scan.nextInt();
    }
    System.out.println("\nMatrix:");
    for(int[] r : mat)
    {
      for(int n : r)
      {
        System.out.print(n + "\t");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Diagonal Sum: " + U8_L1_Activity_One.sumOfDiag(mat));
  }
}
```
+++

### Coding Activity 2
+++ U8_L1_Activity_Two.java
```java
public class U8_L1_Activity_Two
{
  public static int[][] productTable(int r, int c)
  {
    // Initialize Variable
    int[][] arr = new int[r][c];

    // Create Product Table
    for (int row = 0; row < arr.length; row++)
    {
      for (int column = 0; column < arr[row].length; column++)
      {
        arr[row][column] = row * column;
      }
    }
    
    // End
    return arr;
  }
}
```
+++ runner_U8_L1_Activity_Two.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
public class runner_U8_L1_Activity_Two
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of rows:");
    int rows = scan.nextInt();
    System.out.println("Enter number of columns:");
    int cols = scan.nextInt();
    System.out.println();
    int[][] mat = U8_L1_Activity_Two.productTable(rows, cols);
    for(int[] r : mat)
    {
      for(int n : r)
      {
        System.out.print(n + "\t");
      }
      System.out.println();
    }
  }
}
```
+++

## Lesson 2: 2-D Array Algorithms

### Coding Activity 1
+++ TemperatureMonth.java
```java
public class TemperatureMonth
{
  private double[][] temperatures;

  public TemperatureMonth(double[][] t)
  {
    temperatures = t;
  }

  public double[] getMaxTempWeekly()
  {
    // Initialize Variable
    double[] arr = new double[temperatures.length];

    // Check for Max Temperatures
    for (int pos = 0; pos < temperatures.length; pos++)
    {
      // Reset Temporary Storage
      double maxTemp = temperatures[pos][0];
      // Scan Row
      for (int pos2 = 0; pos2 < temperatures[pos].length; pos2++)
      {
        if (temperatures[pos][pos2] > maxTemp)
          maxTemp = temperatures[pos][pos2];
      }
      // Add maxTemp in Row to arr
      arr[pos] = maxTemp;
    }
    
    // End
    return arr;
  }

  public double[] getMinTempWeekly()
  {
    // Initialize Variable
    double[] arr = new double[temperatures.length];

    // Check for Min Temperatures
    for (int pos = 0; pos < temperatures.length; pos++)
    {
      // Reset Temporary Storage
      double minTemp = temperatures[pos][0];
      // Scan Row
      for (int pos2 = 0; pos2 < temperatures[pos].length; pos2++)
      {
        if (temperatures[pos][pos2] < minTemp)
          minTemp = temperatures[pos][pos2];
      }
      // Add minTemp in Row to arr
      arr[pos] = minTemp;
    }
    
    // End
    return arr;
  }

  public double getRange()
  {
    // Temporary Storage
    double min = temperatures[0][0], max = temperatures[0][0];
    
    // Check Range
    for (int pos = 0; pos < temperatures.length; pos++)
    {
      // Scan Row
      for (int pos2 = 0; pos2 < temperatures[pos].length; pos2++)
      {
        // Check for Max Value
        if (temperatures[pos][pos2] > max)
          max = temperatures[pos][pos2];
        // Check for Min Value
        if (temperatures[pos][pos2] < min)
          min = temperatures[pos][pos2];
      }
    }
    
    // End
    return max - min;
  }

  public double getCertainTemp(int week, int day)
  {
    // End
    return temperatures[week][day];
  }
}
```
+++ runner_TemperatureMonth.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_TemperatureMonth {
 public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter number of weeks:");
   int rows = scan.nextInt();

   System.out.println("Enter number of days in a week:");
   int cols = scan.nextInt();

   double[][] mat = new double[rows][cols];
   System.out.println("Enter temperature values:");

   for(int r = 0; r < rows; r++){
       for(int c = 0; c < cols; c++)
           mat[r][c] = scan.nextDouble();
   }

   System.out.println("Enter Week To Access (0-indexed): ");
   int i = scan.nextInt();

   System.out.println("Enter Day of the Week to Access(0-indexed): ");
   int j = scan.nextInt();

   scan.close();
    
   TemperatureMonth t = new TemperatureMonth(mat);
   System.out.println("\nTemperatures:");

   for(double[] r : mat) {
       for(double n : r) {
           System.out.print(n + "\t");
       }

       System.out.println();
   }

   System.out.println();
   System.out.print("getMaxTempWeekly: ");
   double[] weeklyMax = t.getMaxTempWeekly();

   System.out.print("[");
   for(double max:weeklyMax) System.out.print(max + " ");
   System.out.println("]");
  
   System.out.print("getMinTempWeekly: ");
   double[] weeklyMin = t.getMinTempWeekly();
   System.out.print("[");
   for(double min:weeklyMin) System.out.print(min + " ");
   System.out.println("]");

   System.out.println("getRange: " + t.getRange());
   System.out.print("getCertainTemp(" + i + "," + j + "): " + t.getCertainTemp(i,j));

 }
}
```
+++

## Assignment 8: Battleship

### Coding Activity
+++ Board.java
```java
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
```
+++ Battleship.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class Battleship
{
  public static void main(String[] args)
  {
    // Set up board and print welcome
    Board b = new Board();
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Battleship!\n");
    boolean addNew = true;

    while(addNew)
    {
      System.out.println("Type \"a\" to add new ship, \"b\" to see the board, \"p\" to play or \"q\" to quit.");
      String ans = scan.nextLine();
      if(ans.toLowerCase().equals("q"))
        return;
      if(ans.toLowerCase().equals("a"))
      {
        // Get parameters for new ship
        System.out.println("Starting in which row?");
        int r = scan.nextInt();
        System.out.println("Starting in which column?");
        int c = scan.nextInt();
        System.out.println("How long?");
        int l = scan.nextInt();
        scan.nextLine();
        System.out.println("Horizontal (h) or vertical (v)?");
        String d = scan.nextLine();
        boolean h = (d.toLowerCase().equals("h"));

        // Call addShip method and return message based on true/false value
        if(b.addShip(r, c, l, h))
        {
          System.out.println("\nNew ship added!\n");
        }
        else
          System.out.println("\nCan't put a ship there!\n");
      }
      else if(ans.toLowerCase().equals("b"))
        System.out.println("\n" + b + "\n");
      else if(ans.toLowerCase().equals("p"))
      {
        if(b.foundShip(3) && b.foundShip(4))
        {
          addNew = false;
          System.out.println("\nOk, let's play!\n");
        }
        else
          System.out.println("\nYou need ships of length 3 and 4 to play!\n");
      }
    }

    // As long as ships remain, play game
    while(!b.gameOver())
    {
      System.out.println("Press \"s\" to shoot at a square, \"b\" to see the board, \"q\" to quit.");
      String ans = scan.nextLine();
      if(ans.toLowerCase().equals("q"))
        return;
      else if(ans.toLowerCase().equals("s")){
        // Get row and column to shoot
        System.out.println("Input row.");
        int r = scan.nextInt();
        System.out.println("Input column.");
        int c = scan.nextInt();

        // Perform shot and store result
        int result = b.shoot(r,c);

        // Choose message based on result
        if(result == 1)
          System.out.println("\nHit!\n");
        else if(result == 0)
          System.out.println("\nMiss!\n");
        else if(result == 2)
          System.out.println("\nYou already tried that.\n");
        else if(result == -1)
          System.out.println("\nInvalid coordinates.\n");
        scan.nextLine();
      }
      else if(ans.toLowerCase().equals("b"))
        System.out.println("\n" + b + "\n");
    }
    System.out.println("Game over!");
  }
}
```
+++
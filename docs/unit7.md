---
label: "Unit 7: ArrayList"
icon: code
order: -1
---

# Unit 7: ArrayList

## Lesson 1: ArrayList

### Coding Activity 1
+++ U7_L1_Activity_One.java
```java
import java.util.Scanner;
import java.util.ArrayList;

public class U7_L1_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Create Variable
    ArrayList<String> words = new ArrayList<String>();
    
    // User Input
    System.out.println("Please enter words, enter STOP to stop the loop.");
    String input = scan.nextLine();
    while (!(input.equals("STOP")))
    {
      words.add(input);
      input = scan.nextLine();
    }
    
    // Final Output
    System.out.println("\n" + words.size() + "\n" + words);
    /// Modify words
    if (words.size() > 2)
    {
      words.set(words.size() - 1, words.get(0));
      words.remove(0);
    }
    System.out.println(words);
  }
}
```
+++

## Lesson 2: Traversing ArrayLists

### Coding Activity 1
+++ U7_L2_Activity_One.java
```java
import java.util.Scanner;
import java.util.ArrayList;

public class U7_L2_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Create Variables
    ArrayList<String> words = new ArrayList<String>();
    String input = "";
    
    // User Input
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!(input.equals("STOP")))
    {
      input = scan.nextLine();
      // Check input
      if (!(input.equals("STOP")))
        words.add(input);
    }
    
    // Final Output
    System.out.println(words);
    /// Reverse Order
    for (int i = 0; i < words.size(); i++)
    {
      System.out.println(words.get((words.size() - 1) - i) + words.get(i));
    }
  }
}
```
+++

### Coding Activity 2
+++ U7_L2_Activity_Two.java
```java
import java.util.ArrayList;

public class U7_L2_Activity_Two
{
  public static int highestNum(ArrayList<Integer> arr)
  {
    // Check for Highest Num in arr
    int highest = arr.get(0);
    for (Integer num: arr)
    {
      if (num >= highest)
        highest = num;
    }
    
    // End
    return highest;
  }
}
```
+++ runner_U7_L2_Activity_Two.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L2_Activity_Two{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> vals = new ArrayList<Integer>();
    System.out.println("Enter ArrayList length:");
    int len = scan.nextInt();
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++){
      vals.add(scan.nextInt());
    }
    System.out.println("Highest Number: " + U7_L2_Activity_Two.highestNum(vals));
  }
}
```
+++

### Coding Activity 3
+++ U7_L2_Activity_Three.java
```java
import java.util.ArrayList;

public class U7_L2_Activity_Three
{
  public static ArrayList<Integer> getEvens(ArrayList<Integer> vals)
  {
    // Check for Even Nums in vals
    ArrayList<Integer> even = new ArrayList<Integer>();
    for (int i = 0; i < vals.size(); i++)
    {
      if (vals.get(i) % 2 == 0)
      {
        even.add(vals.get(i));
      }
    }
    
    // End
    return even;
  }
}
```
+++ runner_U7_L2_Activity_Three.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L2_Activity_Three
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<Integer>();
    System.out.println("Enter ArrayList length:");
    int len = scan.nextInt();
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++)
    {
      nums.add(scan.nextInt());
    }
    System.out.println("Evens list: " + U7_L2_Activity_Three.getEvens(nums));
    System.out.println("Original list: " + nums);
  }
}
```
+++

## Lesson 3: Array Algorithms with ArrayLists

### Coding Activity 1
+++ U7_L3_Activity_One.java
```java
import java.util.ArrayList;

public class U7_L3_Activity_One
{
  public static void shiftLeft(ArrayList<String> list)
  {
    // Move First in Array to Last
    if (list.size() >= 2)
    {
      list.add(list.get(0));
      list.remove(0);
    }
  }
}

```
+++ runner_U7_L3_Activity_One.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L3_Activity_One
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
    System.out.println("Please enter words, enter STOP to stop the loop.");
    String input = scan.nextLine();
    while(!input.equals("STOP"))
    {
      words.add(input);
      input = scan.nextLine();
    }
    U7_L3_Activity_One.shiftLeft(words);
    System.out.println(words);
  }
  
}
```
+++

### Coding Activity 2
+++ U7_L3_Activity_Two.java
```java
import java.util.ArrayList;

public class U7_L3_Activity_Two
{
  public static void printStatistics(ArrayList<Integer> list)
  {
    // Create Variables
    int sum = 0;
    String mode = "no single mode";
    /// Temporary Storage
    int count = 0, maxCount = 1, savedNum = 0;
    
    // Calculation
    for (Integer num: list)
    {
      // Sum
      sum += num;
      /// Check for Mode
      count = 0;
      for (Integer num2: list)
      {
        if (num == num2)
          count++;
      }
      // Mode
      if (num != savedNum)
      {
        if (count > maxCount)
        {
          mode = num.toString();
          /// Update Temp. Storage
          savedNum = num;
          maxCount = count;
        }
        else if (count == maxCount)
        {
          mode = "no single mode";
        }
      }
    }
    // Average
    double avg = (double) sum / list.size();
    
    // Final Output
    System.out.println("Sum: " + sum + "\nAverage: " + avg + "\nMode: " + mode);
  }
}
```
+++ runner_U7_L3_Activity_Two.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L3_Activity_Two
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<Integer>();
    System.out.println("Enter ArrayList length:");
    int len = scan.nextInt();
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++)
    {
      nums.add(scan.nextInt());
    }
    U7_L3_Activity_Two.printStatistics(nums);
  }
}
```
+++

## Lesson 4: Linear Search

### Coding Activity 1
+++ U7_L4_Activity_One.java
```java
import java.util.ArrayList;

public class U7_L4_Activity_One
{
  public static int countSecondInitial(ArrayList<String> list, String letter)
  {
    // Initialize Variable
    int count = 0;
    
    // Check for letter in list
    for (String str: list)
    {
      if (str.toLowerCase().substring(1, 2).equals(letter.toLowerCase()))
        count++;
    }
    
    // End
    return count;
  }
}
```
+++ runner_U7_L4_Activity_One.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L4_Activity_One
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
    System.out.println("Please enter words, enter STOP to stop the loop.");
    String input = scan.nextLine();
    while(!input.equals("STOP"))
    {
      words.add(input);
      input = scan.nextLine();
    }
    System.out.println("Enter initials to search for, enter STOP to stop the loop.");
    input = scan.nextLine();
    while(!input.equals("STOP"))
    {
      System.out.println("Search for " + input + ": " + U7_L4_Activity_One.countSecondInitial(words, input));
      input = scan.nextLine();
    }
  }

}
```
+++

### Coding Activity 2
+++ U7_L4_Activity_Two.java
```java
import java.util.ArrayList;

public class U7_L4_Activity_Two
{
  public static int searchSecond(ArrayList<String> list, String word)
  {
    // Check for word in list
    for (String str: list)
    {
      if (str.equals(word))
      {
        for (int i = list.indexOf(word) + 1; i < list.size(); i++)
        {
          if (list.get(i).equals(word))
            return i;
        }
      }
    }
    
    // Not Found
    return -1;
  }
}
```
+++ runner_U7_L4_Activity_Two.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L4_Activity_Two
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
    System.out.println("Please enter words, enter STOP to stop the loop.");
    String input = scan.nextLine();
    while(!input.equals("STOP"))
    {
      words.add(input);
      input = scan.nextLine();
    }
    System.out.println("Enter String to search for.");
    input = new String(scan.nextLine());
    System.out.println("searchSecond returns: " + U7_L4_Activity_Two.searchSecond(words, input));
  }

}
```
+++

## Lesson 5: Selection Sort

### Coding Activity 1
+++ U7_L5_Activity_One.java
```java
public class U7_L5_Activity_One
{
  public static void sortAndPrintReverse(String[] arr)
  {
    // Sort arr
    for (int pos = arr.length - 1; pos >= 1; pos--)
    {
      int maxIndex = pos;
      for (int j = pos; j >= 0; j--)
      {
        if (arr[j].compareTo(arr[maxIndex]) < 0)
        {
          maxIndex = j;
        }
      }
      // Swap Function
      String temp = arr[pos];
      arr[pos] = arr[maxIndex];
      arr[maxIndex] = temp;
    }
    
    // Final Output
    for (String s: arr)
    {
      System.out.print(s + " ");
    }
  }
}
```
+++ runner_U7_L5_Activity_One.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
public class runner_U7_L5_Activity_One
{

  public static void main(String[] args)
  {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter array length:");
    int len = scan.nextInt();
    scan.nextLine();

    String[] wordList = new String[len];
    System.out.println("Enter values:");

    for(int i = 0; i < len; i++)
    {
      wordList[i] = scan.nextLine();
    }

    U7_L5_Activity_One.sortAndPrintReverse(wordList);
  }
}
```
+++

### Coding Activity 2
+++ U7_L5_Activity_Two.java
```java
import java.util.ArrayList;

public class U7_L5_Activity_Two
{
  public static void selectSortReverse(ArrayList<Integer> list)
  {
    // Sort list
    for (int pos = 0; pos < list.size() - 1; pos++)
    {
      // Initialize maxIndex
      int index = pos;
      // Check for Position
      for (int j = pos + 1; j < list.size(); j++)
      {
        if (list.get(j) > list.get(index))
        {
          index = j;
        }
      }
      // Swap Function
      int temp = list.get(pos);
      list.set(pos, list.get(index));
      list.set(index, temp);
    }
  }
}
```
+++ runner_U7_L5_Activity_Two.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L5_Activity_Two
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    ArrayList<Integer> nums = new ArrayList<Integer>();
    System.out.println("Enter ArrayList length:");
    int len = scan.nextInt();

    System.out.println("Enter values:");
    for(int i = 0; i < len; i++)
    {
      nums.add(scan.nextInt());
    }

    U7_L5_Activity_Two.selectSortReverse(nums);
    System.out.println("Sorted reverse list: " + nums);
  }
}
```
+++

## Lesson 6: Insertion Sort

### Coding Activity 1
+++ U7_L6_Activity_One.java
```java
public class U7_L6_Activity_One
{
  public static void sortAndPrintReverse(String[] arr)
  {
    // Sort arr in Descending Order
    for (int pos = 1; pos <= arr.length - 1; pos++)
    {
      // Temporary Storage
      String temp = arr[pos];
      int index = pos;
      
      // Sort arr
      while (index > 0 && temp.compareTo(arr[index - 1]) > 0)
      {
        arr[index] = arr[index - 1];
        index--;
      }
      arr[index] = temp;
      
      // Output Current arr
      System.out.println("");
      for (String s : arr)
      {
        System.out.print(s + " ");
      }
    }
  }
}
```
+++ runner_U7_L6_Activity_One.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
public class runner_U7_L6_Activity_One
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter array length:");
    int len = scan.nextInt();
    scan.nextLine();

    String[] wordList = new String[len];
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++)
    {
      wordList[i] = scan.nextLine();
    }

    U7_L6_Activity_One.sortAndPrintReverse(wordList);
  }
}
```
+++

### Coding Activity 2
+++ U7_L6_Activity_Two.java
```java
import java.util.ArrayList;

public class U7_L6_Activity_Two
{
  public static int insertSort(ArrayList<Integer> list)
  {
    // Initialize Count Variable
    int count = 0;
    // Sort list in Ascending Order
    for (int pos = 1; pos < list.size(); pos++)
    {
      // Temporary Storage
      int temp = list.get(pos);
      int index = pos;
      
      for (int rPos = index; rPos > 0; rPos--)
      {
        // Update Count
        count++;
        // Sort list
        if (index > 0 && temp < list.get(index - 1))
        {
          list.set(index, list.get(index - 1));
          index--;
        }
        else
        {
          break;
        }
      }
      list.set(index, temp);
    }

    // End
    return count;
  }
}
```
+++ runner_U7_L6_Activity_Two.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L6_Activity_Two
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<Integer>();
    System.out.println("Enter ArrayList length:");
    int len = scan.nextInt();
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++)
    {
      nums.add(scan.nextInt());
    }
    int comps = U7_L6_Activity_Two.insertSort(nums);
    System.out.println("Sorted list: " + nums);
    System.out.println("Number of comparisons: " + comps);
  }
}
```
+++

## Assignment 7: Game Wheel

### Coding Activity
+++ Game.java
```java
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
```
+++ GameWheel.java
```java
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
```
+++ runner_GameWheel.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_GameWheel{

  private static Scanner scan;
  private static String instruct;
  private static GameWheel wheel;

  public static void main(String[] args){
    scan = new Scanner(System.in);
    wheel = new GameWheel();
    instruct = "";
    while(!instruct.equals("q")){
      System.out.println("Type \"p\" to play game, \"t\" to test GameWheel methods, \"q\" to quit.");
      instruct = scan.nextLine();
      if(instruct.equals("p"))
        Game.play(wheel);
      else if(instruct.equals("t"))
        testMethods();
      else if(!instruct.equals("q"))
        System.out.print("Instruction not recognized");
      System.out.println();
    }
  }

  private static void testMethods(){
    while(!instruct.equals("q") && !instruct.equals("m")){
      System.out.println("Type GameWheel method to call (toString, scramble, sort). Or type \"m\" for main menu, \"q\" to quit");
      instruct = scan.nextLine();
      if(instruct.equals("toString"))
        System.out.println(wheel);
      else if(instruct.equals("scramble"))
        wheel.scramble();
      else if(instruct.equals("sort"))
        wheel.sort();
      else if(instruct.equals("new"))
        wheel = new GameWheel(makeStarterArray());
      else if(instruct.equals("random_prize_test"))
        ranTest();
      else if(!instruct.equals("q") && !instruct.equals("m"))
        System.out.println("Instruction not recognized");
    }
  }

  private static int[] makeStarterArray(){
    int[] arr = new int[20];
    for(int i = 0; i < 20; i++){
      arr[i] = scan.nextInt();
    }
    scan.nextLine();
    return arr;
  }

  private static void ranTest(){
    int numLines = scan.nextInt();
    for(int i = 0; i<numLines; i++){
      wheel.scramble();
      for(int j = 0; j < 20; j++)
        System.out.print(wheel.getSlice(j).getPrizeAmount() + " ");
      System.out.println();
    }
    scan.nextLine();
  }
}
```
+++ Slice.java
```java
// Provided code from Project STEM.
// No modifications were made to this file.

public class Slice
{
  private String color;
  private int prizeAmount;


  // Creates a slice with color c, and cash prize p
  public Slice(String c, int p) {
   color = c;
   prizeAmount = p;
  }


  // Returns the cash prize in dollars for this slice
  public int getPrizeAmount() {
    return prizeAmount;
  }


  // Returns the color of this slice as a string
  public String getColor() {
    return color;
  }


  /* Returns a string representation of the slice in the following format:
   * "Color: red, prize amount: $50".
   */
  public String toString() {
    return "Color: " + color + ", Prize Amount: $" + prizeAmount;
  }
}
```
+++
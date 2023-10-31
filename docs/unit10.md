---
label: "Unit 10: Recursion"
icon: code
order: -1
---

# Unit 10: Recursion

## Lesson 1: Intro to Recursion

### Coding Activity 1

+++ `U10_L1_Activity_One.java`

```java
public class U10_L1_Activity_One
{
  // Initialize Variables
  public static int count = 0;
  public static int max = 0;
  
  // Print Positive Integer(s) That End in Same Digit
  public static void printUpToEnd(int n)
  {
    // Record Max Value
    if (count < 1)
      max = n;
      
    // Save Integer
    n %= 10;
    n += count * 10;
    
    // Output
    if (n > 0)
      System.out.print(n + " ");
    /// Update Count
    count++;
    
    // Recursive
    if (n < max)
      printUpToEnd(n);
  }
}
```

+++ `runner_U10_L1_Activity_One.java`

```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
public class runner_U10_L1_Activity_One
{

  public static void main(String[] args)
  {
    System.out.println("Enter positive integer:");
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    U10_L1_Activity_One.printUpToEnd(i);
    System.out.println();
  }
  
}
```

+++

## Lesson 2: Recursive Functions with Returns

### Coding Activity 1

+++ `U10_L2_Activity_One.java`

```java
public class U10_L2_Activity_One
{
  public static String stringReverse(String word)
  {
    // Temporary Storage
    String str = "";
    
    // Reverse String
    if (word.length() > 0)
    {
      str = stringReverse(word.substring(1)) + word.substring(0, 1);
      word = word.substring(1);
    }
    
    // End
    return str;
  }
}
```

+++ `runner_U10_L2_Activity_One.java`

```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;
public class runner_U10_L2_Activity_One
{

  public static void main(String[] args)
  {
    System.out.println("Enter string:");
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    System.out.println("Reversed String: " + U10_L2_Activity_One.stringReverse(s));
  }
  
}
```

+++

## Assignment 10: Anagrams

### Coding Activity

+++ `AnagramList.java`

```java
import java.util.ArrayList;

public class AnagramList
{
  // Initialize Variable
  private final ArrayList<String> anagrams;

  // Create new ArrayList anagrams and sort
  public AnagramList(String word)
  {
    anagrams = new ArrayList<String>();
    // Calls completeAnagrams with given word
    completeAnagrams("", word);
    // Calls sortAnagrams to resort anagrams
    sortAnagrams();
  }

  // Add Anagrams to ArrayList anagrams
  private void completeAnagrams(String start, String end)
  {
    if (end.length() <= 1)
    {
      anagrams.add(start + end);
    }
    else
    {
      for (int i = 0; i < end.length(); i++)
      {
        if (end.substring(0, i).indexOf(end.substring(i, i + 1)) < 0)
        {
          completeAnagrams(start + end.substring(i, i + 1), end.substring(0, i) + end.substring(i + 1));
        }
      }
    }
  }

  // Sorts ArrayList anagrams
  private void sortAnagrams()
  {
    for( int i = 1; i < anagrams.size(); i++)
    {
      int pos = i;
      while (pos > 0 && anagrams.get(i).compareTo(anagrams.get(pos - 1)) < 0)
      {
        pos--;
      }
      anagrams.add(pos, anagrams.remove(i));
    }
  }

  // Searches anagrams for given term
  public int searchAnagrams(String target)
  {
    for (int i = 0; i < anagrams.size(); i++)
    {
      if (anagrams.get(i).equals(target))
      {
        return i;
      }
    }
    return -1;
  }

  // Used to get list of anagrams externally, do not remove
  public ArrayList<String> getAnagrams()
  {
    return anagrams;
  }
}
```

+++ `runner_AnagramList.java`

```java
// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.ArrayList;
import java.util.Scanner;
public class runner_AnagramList
{
  public static void main(String[] args){
    System.out.println("Enter a word:");
    Scanner scan = new Scanner(System.in);
    String ipt = scan.nextLine();
    while(ipt.length() > 8){
      System.out.println("Warning - this willl result in a LOT of anagrams, please use a shorter String. Remove this check at your own risk!");
      ipt = scan.nextLine();
    }
    AnagramList test = new AnagramList(ipt);
    System.out.println("\nAnagrams list:");
    System.out.println(test.getAnagrams());
    System.out.println("\nThere are " + test.getAnagrams().size() + " possible anagrams of \"" + ipt + "\"");
    String tgt = "";
    while(!tgt.equals("QUIT")){
      System.out.println("\nEnter a String to search for in these anagrams, or \"QUIT\" to end:");
      tgt = scan.nextLine();
      if(!tgt.equals("QUIT"))
        System.out.println("Index of " + tgt + " is " + test.searchAnagrams(tgt));
    }
  }
}
```

+++

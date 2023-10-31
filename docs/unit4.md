---
label: "Unit 4: Iteration"
icon: code
order: -1
---

# Unit 4: Iteration

## Lesson 1: While Loops

### Coding Activity 1

+++ `U4_L1_Activity_One.java`

```java
/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L1_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter any numbers (Enter 5 to stop)");
    int x = 0, sum = 0;
    while (x != 5)
    {
      x = scan.nextInt();
      sum += x;
    }
    sum -= 5; /* Adjust for stop error */
    
    // Final Output
    System.out.println("Sum is " + sum);
  }
}
```

+++

### Coding Activity 2

+++ `U4_L1_Activity_Two.java`

```java
/* Lesson 1 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L1_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter the Scores:");
    int score = 0, bestScore = 0;
    while (score != -1)
    {
      score = scan.nextInt();
      if (score > bestScore)
        bestScore = score;
    }
    
    // Final Output
    System.out.println("The largest score is " + bestScore);
  }
}
```

+++

### Coding Activity 3

+++ `U4_L1_Activity_Three.java`

```java
/* Lesson 1 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L1_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Input a word:");
    String word = scan.nextLine();
    // Create Index
    int n = 2;
    
    // Final Output
    for (int i = 0; i <= word.length();)
    {
      if (word.indexOf(word) % 2 == 0)
      {
        System.out.print(word.substring(i, i + n)); i += 3;
        while (i + n > word.length())
          n--;
      }
    }
  }
}
```

+++

## Lesson 1 1/2: Tracing Code

### Coding Activity 1

+++ `U4_L1_5_Activity_One.java`

```java
/* Lesson 1 1/2 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L1_5_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    int num = scan.nextInt();
    
    // Create Variables
    int fac = 1;
    
    // Final Output
    while(fac <= 5)
    {
      System.out.println(num * fac);
      fac++;
    }
  }
}
```

+++

### Coding Activity 2

+++ `U4_L1_5_Activity_Two.java`

```java
/* Lesson 4 1/2 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L1_5_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    int n = scan.nextInt();
    
    // Create Variables
    int sum = 0;
    
    // Calculation
    while (n > 0)
    {
      sum = sum + n;
      n--;
    }
    
    // Final Output
    System.out.println(sum);
  }
}
```

+++

## Lesson 2: Algorithms for Numbers

### Coding Activity 1

+++ `U4_L2_Activity_One.java`

```java
/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L2_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter two numbers:");
    int num1 = scan.nextInt(), num2 = scan.nextInt();
    
    // Final Output
    System.out.print("");
    while (num1 < num2)
    {
      if (num1 % 2 == 0) /* Adjust for even num1 */
      {
        num1++;
        System.out.print(num1 + " ");
      }
      else
      {
        System.out.print(num1 + " ");
      }
      num1++;
    }
  }
}
```

+++

### Coding Activity 2

+++ `U4_L2_Activity_Two.java`

```java
/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L2_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a positive integer:");
    System.out.print("> "); int num = scan.nextInt();
    
    // Create Variables
    int c = 1; /* Count Variable for Loop */
    int n = 10;
    int answer = 0;
    int resid = 0;
    
    // Final Output
    while (c <= String.valueOf(num).length())
    {
      answer = (num % n) - resid;
      resid = resid + answer; /* Adds to residual to resolve error later */
      System.out.println(answer);
      n *= 10; /* Multiply by 10 for Each Refresh */
      c++;
    }
  }
}
```

+++

### Coding Activity 3

+++ `U4_L2_Activity_Three.java`

```java
/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L2_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Create Variables
    int cont = 1;
    double longitude, latitude;
    /// Initial Values for Coordinates
    double farNorth = -90;
    double farSouth = 90;
    double farEast = -180;
    double farWest = 180;
    
    // User Input
    while (cont == 1)
    {
      /// Input for Longitude
      System.out.println("Please enter the longitude:");
      longitude = scan.nextDouble();
      /// Input for Latitude
      System.out.println("Please enter the latitude:");
      latitude = scan.nextDouble();
      
      /// Verify Inputs
      if ((longitude >= -180 && longitude <= 180) && (latitude >= -90 && latitude <= 90))
      {
        if (latitude > farNorth)
          farNorth = latitude;
        if (latitude < farSouth)
          farSouth = latitude;
        if (longitude > farEast)
          farEast = longitude;
        if (longitude < farWest)
          farWest = longitude;
      }
      else /* Output error if criteria not met */
      {
        System.out.println("Incorrect Latitude or Longitude");
      }
      /// Ask User for New Input(s)
      System.out.println("Would you like to enter another location?");
      cont = scan.nextInt();
    }
    
    // Final Output
    System.out.println("Farthest North: " + farNorth);
    System.out.println("Farthest South: " + farSouth);
    System.out.println("Farthest East: " + farEast);
    System.out.println("Farthest West: " + farWest);
  }
}
```

+++

## Lesson 3: The For Loop

### Coding Activity 1

+++ `U4_L3_Activity_One.java`

```java
/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L3_Activity_One
{
  public static void main(String[] args)
  {
    // Final Output
    for (int i = 1; i <= 25; i += 2)
    {
      System.out.println(i);
    }
  }
}
```

+++

### Coding Activity 2

+++ `U4_L3_Activity_Two.java`

```java
/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L3_Activity_Two
{
  public static void main(String[] args)
  {
    // Final Output
    int c = 0;
    for (int i = 17; i <= 73; i++)
    {
      System.out.print(i + " ");
      c++;
      if (c == 10)
      {
        System.out.println("");
        c = 0;
      }
    }
  }
}
```

+++

### Coding Activity 3

+++ `U4_L3_Activity_Three.java`

```java
/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L3_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a number between 0 and 50:");
    int num = scan.nextInt();
    
    // Create Variables
    int c = 0;
    
    // Final Output
    /// Check num
    if (num > 0 && num < 50)
    {
      for (int i = num; i <= 50; i++)
      {
        System.out.print(i + " ");
        c++;
        if (c == 5)
        {
          System.out.println("");
          c = 0;
        }
      }
    }
    else /* Error if num is not within range */
      System.out.println("error");
  }
}
```

+++

### Coding Activity 4

+++ `U4_L3_Activity_Four.java`

```java
/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U4_L3_Activity_Four
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a positive integer:");
    int num = scan.nextInt();
    
    // Create Variables
    int output = 0;
    
    // Final Output
    /// Check num
    if (num > 0)
    {
      for (int i = num; i >= 0; i--)
      {
        if (i % 3 == 0)
          System.out.print(i + " ");
      }
    }
    else /* Error if num is not positive */
      System.out.println("error");
  }
}
```

+++

## Lesson 4: Algorithms for Strings

### Coding Activity 1

+++ `U4_L4_Activity_One.java`

```java
/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L4_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Input String:");
    String str = scan.nextLine().toLowerCase();
    
    // Count
    int count = 0;
    /// Check for Vowels after "p"
    for (int i = 0; i < str.length() - 1; i++)
    {
      if (str.substring(i, i + 2).equals("pa"))
        count++;
      else if (str.substring(i, i + 2).equals("pe")) 
        count++;
      else if (str.substring(i, i + 2).equals("pi")) 
        count++;
      else if (str.substring(i, i + 2).equals("po")) 
        count++;
      else if (str.substring(i, i + 2).equals("pu")) 
        count++;
    }
    
    // Final Output
    System.out.println("Contains p followed by a vowel " + count + " times.");
  }
}
```

+++

### Coding Activity 2

+++ `U4_L4_Activity_Two.java`

```java
/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L4_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a string:");
    String str = scan.nextLine().toLowerCase();
    
    // Final Output
    for (int i = 0; i < str.length(); i++)
    {
      if (str.substring(i, i + 1).equals("e") || str.substring(i, i + 1).equals("t") || str.substring(i, i + 1).equals("a") || str.substring(i, i + 1).equals("i") || str.substring(i, i + 1).equals("o"))
        System.out.print("");
      else
        System.out.print(str.substring(i, i + 1));
    }
  }
}
```

+++

### Coding Activity 3

+++ `U4_L4_Activity_Three.java`

```java
/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L4_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter two strings:");
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    
    // Final Output
    if (str1.length() == str2.length()) /* If str1 & str2 are same length */
    {
      for (int i = str1.length(); i > 0; i--)
      {
        System.out.print(str2.substring(i - 1, i));
        System.out.print(str1.substring(i - 1, i));
      }
    }
    else /* Output error if not the same length */
    {
      System.out.println("error");
    }
  }
}
```

+++

## Lesson 5: Nested Loops

### Coding Activity 1

+++ `U4_L5_Activity_One.java`

```java
/* Lesson 5 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L5_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Input a String:");
    String str = scan.nextLine();
    System.out.println("Input an integer:");
    int x = scan.nextInt();
    
    // Final Output
    for (int i = 0; i < str.length(); i++)
    {
      for (int j = 0; j < x; j++)
      {
        System.out.print(str.substring(i, i + 1));
      }
    }
  }
}
```

+++

### Coding Activity 2

+++ `U4_L5_Activity_Two.java`

```java
/* Lesson 5 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L5_Activity_Two
{
  public static void main(String[] args)
  {
    // Final Output
    for (int i = 10; i > 0; i--)
    {
      for (int j = 0; j < i; j++)
      {
        System.out.print(i + " ");
      }
      System.out.println("");
    }
  }
}
```

+++

## Assignment 4: String Shortener

### Coding Activity

+++ `Assignment4.java`

```java
import java.util.Scanner;

class Assignment4 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Type the message to be shortened");
    String message = scan.nextLine().toLowerCase();
    
    // Create Variables
    String msgPart = "";
    
    // Algorithm 1
    String a1message = "";
    int a1vowel = 0, a1const = 0;
    for (int i = 0; i < message.length(); i++)
    {
      msgPart = message.substring(i, i + 1);
      /// Eliminate Vowels
      if (i != 0 && !message.substring(i - 1, i).equals(" ") && (msgPart.equals("a") || msgPart.equals("e") || msgPart.equals("i") || msgPart.equals("o") || msgPart.equals("u")))
      {
        a1message += "";
        a1vowel++; /* Add to vowel count */
      }
      /// Eliminate Duplicate Constants
      else if (i != 0 && msgPart.equals(message.substring(i - 1, i)))
      {
        a1message += "";
        a1const++; /* Add to repeat count */
      }
      /// Create A1 Message
      else
      {
        a1message += msgPart;
      }
    }
    /// Save to Output
    int a1saved = a1const + a1vowel;
    
    // Algorithm 2
    String a2space = "", a2part = "", a2message = "";
    int u = 0;
    /// Remove All Spaces
    for (int i = 0; i < message.length(); i++)
    {
      msgPart = message.substring(i, i + 1);
      if (!(msgPart.equals(" ")))
      {
        a2space += msgPart;
      }
    }
    /// Save 1st Occurances
    for (int i = 0; i < a2space.length(); i++)
    {
      if (a2part.indexOf(a2space.substring(i, i + 1)) == -1)
      {
        a2part += a2space.substring(i, i + 1);
      }
    }
    /// Create A2 Message
    for (int i = 0; i < a2part.length(); i++) 
    {
      for (int i2 = 0; i2 < a2space.length(); i2++)
      {
        if ((a2part.substring(i, i + 1)).equals(a2space.substring(i2, i2 + 1)))  
        {
          u++; /* Add if spotted within message */
        }
      }
      a2message += u + a2part.substring(i, i + 1);
      u = 0;
    }
    /// Save to Output
    int a2unique = a2part.length();
    int a2saved = message.length() - a2message.length();
    
    // Final Output
    /// Algorithm 1
    System.out.println("\nAlgorithm 1");
    System.out.println("Vowels removed: " + a1vowel);
    System.out.println("Repeats removed: " + a1const);
    System.out.println("Algorithm 1 message: " + a1message);
    System.out.println("Algorithm 1 characters saved: " + a1saved);
    
    /// Algorithm 2
    System.out.println("\nAlgorithm 2");
    System.out.println("Unique characters found: " + a2unique);
    System.out.println("Algorithm 2 message: " + a2message);
    System.out.println("Algorithm 2 characters saved: " + a2saved);
  }
}
```

+++

---
label: "Unit 3: Boolean Expressions and If Statements"
icon: code
order: -1
---

# Unit 3: Boolean Expressions and If Statements

## Lesson 1: Simple Ifs

### Coding Activity 1
+++ U3_L1_Activity_One.java
```java
/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L1_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter a double:");
    double x = scan.nextDouble();
    
    // Final Output
    if (x == 12.345)
    {
      System.out.println("YES");
    }
  }
}
```
+++

### Coding Activity 2
+++ U3_L1_Activity_Two.java
```java
/* Lesson 1 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L1_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter an integer:");
    int x = scan.nextInt();
    
    // Final Output
    if (x == 48)
    {
      System.out.println("YES");
    }
  }
}
```
+++

### Coding Activity 3
+++ U3_L1_Activity_Three.java
```java
/* Lesson 1 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L1_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter two integers:");
    int x = scan.nextInt();
    int y = scan.nextInt();
    
    // Final Output
    if (x == 20 && y == 40)
    {
      System.out.println("YES");
    }
  }
}
```
+++

### Coding Activity 4
+++ U3_L1_Activity_Four.java
```java
/* Lesson 1 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L1_Activity_Four
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter an integer:");
    int x = scan.nextInt();
    
    // Final Output
    if (x % 2 == 0) // Checks if x can be divided by 2
    {
      System.out.println("Divisible by 2!");
    }
    if (x % 3 == 0) // Checks if x can be divided by 3
    {
      System.out.println("Divisible by 3!");
    }
  }
}
```
+++

## Lesson 2: Relational Operators

### Coding Activity 1
+++ U3_L2_Activity_One.java
```java
/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L2_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter five numbers:");
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();
    double num3 = scan.nextDouble();
    double num4 = scan.nextDouble();
    double num5 = scan.nextDouble();
    
    // Calculate Average
    double avg = (num1 + num2 + num3 + num4 + num5) / 5;
    
    // Final Output
    if (avg >= 89.95)
    {
      System.out.println("ABOVE AVERAGE");
    }
  }
}
```
+++

### Coding Activity 2
+++ U3_L2_Activity_Two.java
```java
/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L2_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter two numbers:");
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();
    
    // Final Output
    if (num1 <= num2)
    {
      System.out.println("Smallest is: " + num1);
    }
    if (num1 > num2)
    {
      System.out.println("Smallest is: " + num2);
    }
  }
}
```
+++

### Coding Activity 3
+++ U3_L2_Activity_Three.java
```java
/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L2_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("What is the temperature?");
    double temp = scan.nextDouble();
    
    // Final Output
    if (temp < 97 || temp > 99)
    {
      System.out.println("NOT NORMAL");
    }
  }
}
```
+++

### Coding Activity 4
+++ U3_L2_Activity_Four.java
```java
/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L2_Activity_Four
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter two test scores:");
    double test1 = scan.nextDouble();
    double test2 = scan.nextDouble();
    
    // Final Output
    if (test1 < 0.0 || test1 > 100.0)
    {
      System.out.println("Not Valid");
    }
    if (test2 < 0.0 || test2 > 100.0)
    {
      System.out.println("Not Valid");
    }
  }
}
```
+++

## Lesson 3: Else

### Coding Activity 1
+++ U3_L3_Activity_One.java
```java
/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L3_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter an integer:");
    int x = scan.nextInt();
    
    // Final Output
    if (x % 2 == 0) // x is even
    {
      System.out.println("Even");
    }
    else // x is odd
    {
      System.out.println("Odd");
    }
  }
}
```
+++

### Coding Activity 2
+++ U3_L3_Activity_Two.java
```java
/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L3_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter a letter grade:");
    String grade = scan.nextLine();
    
    // Final Output
    if (grade.equals("A")) // A = 90-100
    {
      System.out.println("90-100");
    }
    else if (grade.equals("B")) // B = 80-90
    {
      System.out.println("80-90");
    }
    else if (grade.equals("C")) // C = 70-80
    {
      System.out.println("70-80");
    }
    else if (grade.equals("D")) // D = 60-70
    {
      System.out.println("60-70");
    }
    else if (grade.equals("F")) // F = 0-60
    {
      System.out.println("0-60");
    }
    else // Grade provided is not a valid value
    {
      System.out.println("Invalid letter grade");
    }
  }
}
```
+++

### Coding Activity 3
+++ U3_L3_Activity_Three.java
```java
/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L3_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter two integers:");
    System.out.print("> ");
    int x1 = scan.nextInt();
    System.out.print("> ");
    int x2 = scan.nextInt();
    
    // Create Problem
    int calAnswer = x1 + x2;
    System.out.println(x1 + " + " + x2 + " = ?"); // x1 + x2 = calAnswer
    System.out.print("> ");
    int userAnswer = scan.nextInt();
    
    // Final Output
    if (userAnswer == calAnswer)
    {
      System.out.println("Correct!");
    }
    else
    {
      System.out.println("Wrong");
    }
  }
}
```
+++

### Coding Activity 4
+++ U3_L3_Activity_Four.java
```java
/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L3_Activity_Four
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("What is the temperature?");
    int temp = scan.nextInt();
    
    // Final Output
    if (temp >= 97 && temp <= 99) // Normal when temp is between 97 & 99
    {
      System.out.println("Temperature is OK");
    }
    else
    {
      System.out.println("NOT NORMAL");
    }
  }
}
```
+++

## Lesson 4: Logical Operators and Truth Tables

### Coding Activity 1
+++ U3_L4_Activity_One.java
```java
/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L4_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a number: ");
    int num = scan.nextInt();
    
    // Final Output
    if (!(num >= 65 && num <= 100))
      System.out.println("True");
    else
      System.out.println("False");
  }
}
```
+++

### Coding Activity 2
+++ U3_L4_Activity_Two.java
```java
/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L4_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter two numbers:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    
    // Final Output
    if (num1 >= 0 && num1 % 2 == 0 && num2 >= 0 && num2 % 2 == 0)
      System.out.println("Both are positive and even.");
    else if (num1 % 2 == 0 || num2 % 2 == 0)
      System.out.println("At least one is negative or odd.");
  }
}
```
+++

### Coding Activity 3
+++ U3_L4_Activity_Three.java
```java
/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L4_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// Latitude
    System.out.println("Please enter the latitude:");
    double latitude = scan.nextDouble();
    /// Longitude
    System.out.println("Please enter the longitude:");
    double longitude = scan.nextDouble();
    
    // Validating Coordinates
    if (!(latitude >= -90 && latitude <= 90))
      System.out.println("latitude is incorrect");
    if (!(longitude >= -180 && longitude <= 180))
      System.out.println("longitude is incorrect");
    
    // Final Output
    if (latitude >= -90 && latitude <= 90 && longitude >= -180 && longitude <= 180)
      System.out.println("The location: " + latitude + ", " + longitude);
  }
}
```
+++

## Lesson 5: Short Circuit Evaluation

### Coding Activity 1
+++ U3_L5_Activity_One.java
```java
/* Lesson 5 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L5_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter 2 integers:");
    int x = scan.nextInt();
    double y = scan.nextDouble();
    
    // Final Output
    if (x/y > 1 && x/y <= 8)
      System.out.println("Ratio OK");
  }
}
```
+++

### Coding Activity 2
+++ U3_L5_Activity_Two.java
```java
/* Lesson 5 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L5_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter two numbers:");
    int a = scan.nextInt();
    int b = scan.nextInt();

    // Final Output
    if(b != 0 && a % b == 0)
      System.out.println(b + " is a factor of " + a);
    else
      System.out.println(b + " is not a factor of " + a);
  }
}
```
+++

## Lesson 6: De Morgan's Law

### Coding Activity 1
+++ U3_L6_Activity_One.java
```java
/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L6_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a number in the fifties");
    int num = scan.nextInt();

    // Final Output
    if(!(num >= 50 && num < 60))
    {
      System.out.println("That's not in the fifties!");
      num = 55;
    }
    System.out.println("Your number is " + num);
  }
}
```
+++

### Coding Activity 2
+++ U3_L6_Activity_Two.java
```java
/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L6_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    int x = scan.nextInt();
    int y = scan.nextInt();
    
    // Final Output
    if(!(y > 9) || (!(x <= 2) && x * y > 10))
      System.out.println("pass");
  }
}
```
+++

## Lesson 7: Comparing Objects

### Coding Activity 1
+++ U3_L7_Activity_One.java
```java
/* Lesson 7 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L7_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Create Password
    String password = "bulbasaur";
    
    // User Input
    System.out.println("Enter password:");
    String pwGuess = scan.nextLine();
    
    // Final Output
    if (pwGuess.equals(password))
      System.out.println("Access granted!");
    else
      System.out.println("Access denied!");
  }
}
```
+++

### Coding Activity 2
+++ U3_L7_Activity_Two.java
```java
/* Lesson 7 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L7_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter 2 strings:");
    String word1 = scan.nextLine();
    String word2 = scan.nextLine();
    
    // Final Output
    if (word1.equals(word2))
      System.out.println("Equal!");
    else if (word1.toLowerCase().equals(word2.toLowerCase()))
      System.out.println("Different case");
    else if (word1.substring(0, word1.length() - 1).equals(word2.substring(0, word2.length() - 1)))
      System.out.println("Close enough");
    else
      System.out.println("Try again");
  }
}
```
+++

### Coding Activity 3
+++ U3_L7_Activity_Three.java
```java
/* Lesson 7 Coding Activity Question 3 */

import java.util.Scanner;
import shapes.*;

public class U3_L7_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// Side Length for shape1
    System.out.println("Enter the side length of the first regular polygon:");
    double sideLength = scan.nextDouble();
    /// # of Sides for shape2
    System.out.println("Enter the number of sides of the second polygon:");
    int numSides = scan.nextInt();
    /// Side Length for shape2
    System.out.println("Enter the side length of the second polygon:");
    double sideLength2 = scan.nextDouble();
    
    // Creating Shapes
    RegularPolygon shape1 = new RegularPolygon(sideLength);
    RegularPolygon shape2 = new RegularPolygon(numSides, sideLength2);
    
    // Final Output
    if (shape1.equals(shape2))
      System.out.println("Congruent Regular Polygons!");
    else
      System.out.println("Different Regular Polygons");
  }
}
```
+++

## Assignment 3: Crack the Code!

### Coding Activity
+++ Assignment3.java
```java
import java.util.Scanner;

public class Assignment3 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Welcome Screen
    /// User Input
    System.out.println("Welcome. What is your name?");
    String userName = scan.nextLine();
    System.out.println("Hello " + userName + ". Are you ready to crack the code?");
    String userReady = scan.nextLine();
    /// Check userReady Status
    if (userReady.toLowerCase().equals("yes"))
      System.out.println("");
    else
      System.exit(0);
    
    // Initialize Variables
    String wrongAns = "Sorry, that was incorrect!\nBetter luck next time!";
      
    // Phase 1
    System.out.println("PHASE 1");
    System.out.println("Enter a string:");
    String phase1 = scan.nextLine();
    if (phase1.length() == 3)
      System.out.println("Correct!");
    else{
      System.out.println(wrongAns); System.exit(0);
    }
    
    // Phase 2
    System.out.println("PHASE 2");
    System.out.println("Enter a number:");
    int phase2 = scan.nextInt();
    if (phase2 == 19 || (phase2 >= 35 && phase2 < 78))
      System.out.println("Correct!");
    else{
      System.out.println(wrongAns); System.exit(0);
    }
    
    // Phase 3
    System.out.println("PHASE 3");
    System.out.println("Enter a number:");
    int phase3 = scan.nextInt();
    if ((phase3 > 0 && phase3 % 2 == 0) || phase3 % 10 == 1)
      System.out.println("Correct!");
    else{
      System.out.println(wrongAns); System.exit(0);
    }
    
    // Final Output
    System.out.println("You have cracked the code!");
  }
}
```
+++
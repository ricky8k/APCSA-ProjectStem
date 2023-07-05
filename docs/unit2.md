---
label: "Unit 2: Using Objects"
icon: code
order: -1
---

# Unit 2: Using Objects

## Lesson 1: Strings and Class Types

### Coding Activity 1
+++ U2_L1_Activity_One.java
```java
/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L1_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("What is your name?");
    String name = scan.nextLine();
    System.out.println("What is your favorite number?");
    int number = scan.nextInt();
    
    // Final Output
    System.out.println("Your name is " + name + " and you like the number " + number + ".");
  }
}
```
+++

### Coding Activity 2
+++ U2_L1_Activity_Two.java
```java
/* Lesson 1 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L1_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Initial Order
    String itemName = "apple pie";
    System.out.println("The current order is " + itemName);
    // Change Order
    System.out.println("I want to eat something else, what do you want to eat?");
    itemName = scan.nextLine();
    
    // Final Output
    System.out.println("The order has changed to " + itemName);
  }
}
```
+++

## Lesson 2: Escape Sequences and String Concatenation

### Coding Activity 1
+++ U2_L2_Activity_One.java
```java
/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L2_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// Type of Item
    System.out.println("What type of item are you buying?");
    String itemType = scan.nextLine();
    /// Number of Item(s)
    System.out.println("How many are you buying?");
    int itemQuantity = scan.nextInt();
    /// Unit Weight of Item
    System.out.println("How much does each one weigh?");
    double unitWeight = scan.nextDouble();
    
    // Final Output
    System.out.println(itemQuantity + " " + itemType + " at " + unitWeight + " pounds each will weigh " + (unitWeight * itemQuantity) + " pounds total");
  }
}
```
+++

### Coding Activity 2
+++ U2_L2_Activity_One.java
```java
public class U2_L2_Activity_Two
{
  public static void main(String[] args)
  {
    // Final Output
    System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe first computer programmer");
  }
}
```
+++

### Coding Activity 3
+++ U2_L2_Activity_One.java
```java
/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L2_Activity_Three
{
  public static void main(String[] args)
  {
    // Final Output
    System.out.print("(\\(\\\n( - -)\n((\') (\')");
  }
}
```
+++

## Lesson 3: String Methods

### Coding Activity 1
+++ U2_L3_Activity_One.java
```java
/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L3_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a string:");
    String initStr = scan.nextLine();
    System.out.println("Enter a number:");
    int x = scan.nextInt();
    
    // Final Output
    String finalStr = initStr.substring(0, x) + initStr.substring(initStr.length() - x);
    System.out.println(finalStr);
  }
}
```
+++

### Coding Activity 2
+++ U2_L3_Activity_Two.java
```java
/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L3_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a string:");
    String initStr = scan.nextLine();
    System.out.println("How many characters would you like to delete at the end?");
    int delChar = scan.nextInt();
    
    // Final Output
    String finalStr = initStr.substring(0, initStr.length() - delChar);
    System.out.println(finalStr);
  }
}
```
+++

### Coding Activity 3
+++ U2_L3_Activity_Three.java
```java
/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L3_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// First Word
    System.out.println("Enter first word:");
    String w1 = scan.nextLine().toLowerCase();
    /// Second Word
    System.out.println("Enter second word:");
    String w2 = scan.nextLine().toLowerCase();
    
    // Comparing First Letters (ignores dash)
    int wordResult = w1.compareTo(w2);
    
    // Final Output
    System.out.println("Result: " + wordResult);
  }
}
```
+++

### Coding Activity 4
+++ U2_L3_Activity_Four.java
```java
/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U2_L3_Activity_Four
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a sentence:");
    String sentence = scan.nextLine();
    
    // Final Output
    System.out.println(sentence.indexOf(" "));
  }
}
```
+++

## Lesson 4: Classes and Objects

### Coding Activity 1
+++ U2_L4_Activity_One.java
```java
/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;
 
public class U2_L4_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// Get First String
    System.out.println("Enter first string");
    String s1 = scan.nextLine();
    /// Get Second String
    System.out.println("Enter second string");
    String s2 = scan.nextLine();
    /// Get # of Letters for Each String
    System.out.println("Enter number of letters from each word");
    int n = scan.nextInt();
    
    // Final Output
    /// Print Last n Letters of s1 + First n Letters of s2
    System.out.println(s1.substring(s1.length() - n, s1.length()) + s2.substring(0, n));
  }
}
```
+++

### Coding Activity 2
+++ U2_L4_Activity_Two.java
```java
/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L4_Activity_Two{
  public static void main(String[] args){
  
    // User Input
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = str1;
    
    // Final Output
    str1 = str1.toUpperCase();
    str2 = (str2.substring(0, 1).toUpperCase()) + str2.substring(1, str2.length()); 
    System.out.println(str2);
    System.out.println(str1);
  }
}
```
+++

## Lesson 5: Using Constructors

### Coding Activity 1
+++ U2_L5_Activity_One.java
```java
/* Lesson 5 Coding Activity Question 1 */

import shapes.*;

public class U2_L5_Activity_One
{
  public static void main(String[] args)
  {
    // Final Output
    Circle shape1 = new Circle(10.1);
    System.out.println(shape1);
    Circle shape2 = new Circle(14.0);
    System.out.println(shape2);
    Circle shape3 = new Circle(20.5);
    System.out.println(shape3);
  }
}
```
+++

### Coding Activity 2
+++ U2_L5_Activity_Two.java
```java
/* Lesson 5 Coding Activity Question 2 */

import java.util.Scanner;
import shapes.*;

public class U2_L5_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Final Output
    /// Parameters for Rectangle 1
    System.out.println("Type a number for length and width:");
    double s1length = scan.nextDouble();
    Rectangle s1 = new Rectangle(s1length);
    /// Parameters for Rectangle 2
    System.out.println("Type a length:");
    double s2length = scan.nextDouble();
    System.out.println("Type a width:");
    double s2width= scan.nextDouble();
    Rectangle s2 = new Rectangle(s2length, s2width);
    
    // Final Output
    System.out.println(s1);
    System.out.println(s2);
  }
}
```
+++

### Coding Activity 3
+++ U2_L5_Activity_Three.java
```java
/* Lesson 5 Coding Activity Question 3 */

import java.util.Scanner;
import shapes.*;

public class U2_L5_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Type a side length:");
    double sLength = scan.nextDouble();
    
    // Creating Shapes
    RegularPolygon s1 = new RegularPolygon(sLength);
    RegularPolygon s2 = new RegularPolygon(4, sLength);
    
    // Final Output
    System.out.println(s1);
    System.out.println(s2);
  }
}
```
+++

## Lesson 6: Using Methods

### Coding Activity 1
+++ U2_L6_Activity_One.java
```java
/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;
import shapes.*;

public class U2_L6_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter the radius of the circle:");
    System.out.print("> ");
    double r = scan.nextDouble();
    Circle s = new Circle(r);
    
    // Final Output
    System.out.println("A circle with a radius " + s.getRadius() + " has a circumference of " + s.getCircumference() + " and an area of " + s.getArea());
  }
}
```
+++

### Coding Activity 2
+++ U2_L6_Activity_Two.java
```java
/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;
import shapes.*;

public class U2_L6_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// Number of Sides
    System.out.println("Enter number of sides: ");
    System.out.print("> ");
    int sNum = scan.nextInt();
    /// Side Length
    System.out.println("Enter the side length: ");
    System.out.print("> ");
    double sLength = scan.nextDouble();
    
    // Calculation
    RegularPolygon polygon = new RegularPolygon(sNum, sLength);
        
    // Final Output
    /// Area with Default sNum
    System.out.println("Area with " + polygon.getNumSides() + " sides: " + polygon.getArea());
    /// Area with sNum + 2
    System.out.println("Incrementing the number of sides by two");
    polygon.addSides(2);
    System.out.println("Area with " + polygon.getNumSides() + " sides: " + polygon.getArea());
  }
}
```
+++

## Lesson 7: Wrapper Classes

### Coding Activity 1
+++ U2_L7_Activity_One.java
```java
/* Lesson 7 Coding Activity Question 1 */

public class U2_L7_Activity_One
{
  public static void main(String[] args)
  {
    // Final Output
    int a = Integer.MAX_VALUE;
    a++;
    System.out.println(a);
    int b = Integer.MIN_VALUE;
    b--;
    System.out.println(b);
  }
}
```
+++

### Coding Activity 2
+++ U2_L7_Activity_Two.java
```java
/* Lesson 7 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L7_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Prepare Variables
    Integer x = null;
    Integer y = null;
    
    // User Input
    System.out.println(x + " " + y);
    System.out.println("Enter values:");
    x = scan.nextInt();
    y = scan.nextInt();
    
    // Final Output
    Double avg = (((double)(x + y)) / 2);
    System.out.println("Average of " + x + " and " + y + " is " + avg);
  }
}
```
+++

### Coding Activity 3
+++ U2_L7_Activity_Three.java
```java
/* Lesson 7 Coding Activity Question 3 */

import java.util.Scanner;
import shapes.*;
 
public class U2_L7_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter number of sides:");
    Integer sides = scan.nextInt();
    System.out.println("Enter side length:");
    Double length = scan.nextDouble();
    
    // Create Shapes
    RegularPolygon p1 = new RegularPolygon(sides, length);
    RegularPolygon p2 = new RegularPolygon(sides + 1, length * 2);
    
    // Final Output
    System.out.println("The area of a " + p1 + " is: " + p1.getArea());
    System.out.println("The area of a " + p2 + " is: " + p2.getArea());
  }
}
```
+++

## Lesson 8: Math Functions

### Coding Activity 1
+++ U2_L8_Activity_One.java
```java
/* Lesson 8 Coding Activity Question 1 */

import java.util.Scanner;
import testing.Math;

public class U2_L8_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a positive integer:");
    int n = scan.nextInt();
    
    // Calculation
    System.out.println((int) Math.round((Math.random() * n) + 2));
    System.out.println((int) Math.round((Math.random() * n) + 2));
    System.out.println((int) Math.round((Math.random() * n) + 2));
  }
}
```
+++

### Coding Activity 2
+++ U2_L8_Activity_Two.java
```java
/* Lesson 8 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L8_Activity_Two
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// Coordinates for x
    System.out.println("Enter the first x-coordinate:");
    double x1 = scan.nextDouble();
    System.out.println("Enter the second x-coordinate:");
    double x2 = scan.nextDouble();
    /// Coordinates for y
    System.out.println("Enter the first y-coordinate:");
    double y1 = scan.nextDouble();
    System.out.println("Enter the second y-coordinate:");
    double y2 = scan.nextDouble();
    
    // Slope Calculation
    double m = (y2 - y1) / (x2 - x1);
    
    // Final Output
    System.out.println("Slope: " + m);
  }
}
```
+++

### Coding Activity 3
+++ U2_L8_Activity_Three.java
```java
/* Lesson 8 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L8_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter two doubles:");
    System.out.print(">");
    Double num1 = scan.nextDouble();
    System.out.print(">");
    Double num2 = scan.nextDouble();
    
    // Difference Calculation
    int diff = (int) Math.abs(Math.round(num2 - num1));
    
    // Final Output
    System.out.println("Difference: " + diff);
  }
}
```
+++

## Assignment 2: Control Tower

### Coding Activity
+++ Assignment2.java
```java
/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import java.util.Scanner;
import assignment2.Airplane;

public class Assignment2
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude):");
    /// Plane3
    String pCSign = scan.nextLine().toUpperCase(); // Call-sign
    Double pDist = scan.nextDouble(); // Distance
    Integer pBear = scan.nextInt(); // Bearing
    Integer pAlti = scan.nextInt(); // Altitude
    System.out.println("");
    
    // Creating Planes
    /// Plane1 (AAA01) with dist. 1.0 mi, bearing 0, alti. 0ft
    Airplane plane1 = new Airplane("AAA01", 1.0, 0, 0);
    /// Plane2 (AAA02) with dist. 15.8 mi, bearing 128, alti. 30000ft
    Airplane plane2 = new Airplane("AAA02", 15.8, 128, 30000);
    /// Plane3 (pCsign) with dist. pDist, bearing pBear, alti. pAlti
    Airplane plane3 = new Airplane(pCSign, pDist, pBear, pAlti);
    
    // Initial Run
    /// Plane Positions
    System.out.println("Initial Positions:");
    System.out.println("\"Airplane 1\": " + plane1.toString()); // Plane1
    System.out.println("\"Airplane 2\": " + plane2.toString()); // Plane2
    System.out.println("\"Airplane 3\": " + plane3.toString()); // Plane3
    System.out.println("");
    /// Plane Distances
    System.out.println("Initial Distances:");
    double distDiff1 = plane1.distTo(plane2); // Calculate Dist. Between P1 & P2
    System.out.println("The distance between Airplane 1 and Airplane 2 is " + distDiff1 + " miles.");
    double distDiff2 = plane1.distTo(plane3); // Calculate Dist. Between P1 & P3
    System.out.println("The distance between Airplane 1 and Airplane 3 is " + distDiff2 + " miles.");
    double distDiff3 = plane2.distTo(plane3); // Calculate Dist. Between P2 & P3
    System.out.println("The distance between Airplane 2 and Airplane 3 is " + distDiff3 + " miles.");
    System.out.println("");
    /// Plane Height Differences
    System.out.println("Initial Height Differences:");
    int altiDiff1 = (int) Math.abs(plane1.getAlt() - plane2.getAlt()); // Calculate Alti. Between P1 & P2
    System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + altiDiff1 + " feet.");
    int altiDiff2 = (int) Math.abs(plane1.getAlt() - plane3.getAlt()); // Calculate Alti. Between P1 & P3
    System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + altiDiff2 + " feet.");
    int altiDiff3 = (int) Math.abs(plane2.getAlt() - plane3.getAlt()); // Calculate Alti. Between P2 & P3
    System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + altiDiff3 + " feet.");
    System.out.println("");
    
    // Recalculation
    /// Plane1
    plane1.move(distDiff3, 65); // Moves plane by init. dist. between P2 & P3; bearing 65 
    /* Increase Alti. by 3000ft */
    plane1.gainAlt();
    plane1.gainAlt();
    plane1.gainAlt();
    /// Plane2
    plane2.move(8, 135); // Moves plane by 8.0 mi.; bearing 135
    /* Decrease Alti. by 2000ft */
    plane2.loseAlt();
    plane2.loseAlt();
    /// Plane3
    plane3.move(5, 55); // Moves plane by 5.0 mi.; bearing 55
    /* Decrease Alti. by 4000ft */
    plane3.loseAlt();
    plane3.loseAlt();
    plane3.loseAlt();
    plane3.loseAlt();
    
    // New Run
    /// Plane Positions
    System.out.println("New Positions:");
    System.out.println("\"Airplane 1\": " + plane1.toString()); // Plane1
    System.out.println("\"Airplane 2\": " + plane2.toString()); // Plane2
    System.out.println("\"Airplane 3\": " + plane3.toString()); // Plane3
    System.out.println("");
    /// Plane Distances
    System.out.println("New Distances:");
    distDiff1 = plane1.distTo(plane2); // Calculate Dist. Between P1 & P2
    System.out.println("The distance between Airplane 1 and Airplane 2 is " + distDiff1 + " miles.");
    distDiff2 = plane1.distTo(plane3); // Calculate Dist. Between P1 & P3
    System.out.println("The distance between Airplane 1 and Airplane 3 is " + distDiff2 + " miles.");
    distDiff3 = plane2.distTo(plane3); // Calculate Dist. Between P2 & P3
    System.out.println("The distance between Airplane 2 and Airplane 3 is " + distDiff3 + " miles.");
    System.out.println("");
    /// Plane Height Differences
    System.out.println("New Height Differences:");
    altiDiff1 = (int) Math.abs(plane1.getAlt() - plane2.getAlt()); // Calculate Alti. Between P1 & P2
    System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + altiDiff1 + " feet.");
    altiDiff2 = (int) Math.abs(plane1.getAlt() - plane3.getAlt()); // Calculate Alti. Between P1 & P3
    System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + altiDiff2 + " feet.");
    altiDiff3 = (int) Math.abs(plane2.getAlt() - plane3.getAlt()); // Calculate Alti. Between P2 & P3
    System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + altiDiff3 + " feet.");
    System.out.println("");
  }
}
```
+++

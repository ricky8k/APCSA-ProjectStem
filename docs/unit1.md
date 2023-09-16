---
label: "Unit 1: Primitive Types"
icon: code
order: -1
---

# Unit 1: Primitive Types

## Lesson 1: Output in Java

### Coding Activity 1

+++ U1_L1_Activity_One.java

```java
/* Lesson 1 Coding Activity Question 1 */

class U1_L1_Activity_One 
{
  public static void main(String[] args) 
  {
    // Final Output
    System.out.println(" Stephen Curry ");
  }
}
```

+++

### Coding Activity 2

+++ U1_L1_Activity_Two.java

```java
/* Lesson 1 Coding Activity Question 2 */

class U1_L1_Activity_Two 
{
  public static void main(String[] args) 
  {
    // Final Output
    System.out.println(" Coding is fun! ");
    System.out.println(" Coding is fun! ");
    System.out.println(" Coding is fun! ");
  }
}
```

+++

### Coding Activity 3

+++ U1_L1_Activity_Three.java

```java
/* Lesson 1 Coding Activity Question 3 */

class U1_L1_Activity_Three 
{
  public static void main(String[] args) 
  {
    // Final Output
    System.out.println("=========");
    System.out.println("= 0   0 =   Java is Awesome!");
    System.out.println("=   v   =");
    System.out.println("=========");
  }
}

```

+++

## Lesson 2: User Input and Variables

### Coding Activity 1

+++ U1_L2_Activity_One.java

```java
/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L2_Activity_One 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("What is your favorite food?");
    String favoriteFood = scan.nextLine();
    
    // Final Output
    System.out.println("I like to eat " + favoriteFood + " as well!");
  }
}
```

+++

### Coding Activity 2

+++ U1_L2_Activity_Two.java

```java
/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L2_Activity_Two 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter four names:");
    String firstName = scan.nextLine();
    String secondName = scan.nextLine();
    String thirdName = scan.nextLine();
    String fourthName = scan.nextLine();
    
    // Final Output
    System.out.println("");
    System.out.println(fourthName + " " + secondName + " " + thirdName + " " + firstName);
    
  }
}
```

+++

### Coding Activity 3

+++ U1_L2_Activity_Three.java

```java
/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L2_Activity_Three 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Hi there. What is your name?");
    String name = scan.nextLine();
    System.out.println("What state do you live in?");
    String state = scan.nextLine();
    
    // Final Output
    System.out.println("My name is " + name + ". I live in " + state + ".");
  }
}
```

+++

## Lesson 3: Data Types

### Coding Activity 1

+++ U1_L3_Activity_One.java

```java
/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L3_Activity_One 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    double x = scan.nextDouble();
    double y = scan.nextDouble();
    double z = scan.nextDouble();
    
    // Final Output
    System.out.println(z + " " + y + " " + x);
  }
}
```

+++

### Coding Activity 2

+++ U1_L3_Activity_Two.java

```java
/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L3_Activity_Two 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Hi there. What is your name?");
    String name = scan.nextLine();
    System.out.println("Hi " + name + ". How old are you?");
    int age = scan.nextInt();
    
    // Final Output
    System.out.println(name + " is " + age + " years old.");
  }
}
```

+++

### Coding Activity 3

+++ U1_L3_Activity_Three.java

```java
/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U1_L3_Activity_Three
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Java is an object-oriented programming language, true or false?");
    boolean answerOne = scan.nextBoolean();
    System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
    boolean answerTwo = scan.nextBoolean();
    
    // Final Output
    System.out.println();
    System.out.println("Question 1 - Your answer: " + answerOne + ". Correct answer: true");
    System.out.println("Question 2 - Your answer: " + answerTwo + ". Correct answer: true");
  }
}
```

+++

## Lesson 4: Number Calculations

### Coding Activity 1

+++ U1_L4_Activity_One.java

```java
/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L4_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input 
    System.out.println("Enter starting number (must be an integer)");
    System.out.print(">");
    int num = scan.nextInt();
    
    // Final Output
    num++;
    System.out.println("number is now " + num);
    num++;
    System.out.println("number is now " + num);
    num++;
    System.out.println("number is now " + num);
    num++;
    System.out.println("number is now " + num);
    num--;
    System.out.println("number is now " + num);
    num--;
    System.out.println("number is now " + num);
    num--;
    System.out.println("number is now " + num);
    num--;
    System.out.println("number is now " + num);
  }
}
```

+++

### Coding Activity 2

+++ U1_L4_Activity_Two.java

```java
/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L4_Activity_Two 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    int numFeet = scan.nextInt();
    
    // Calculation
    int numYards = numFeet / 3;
    
    // Final Output
    System.out.println(numYards);
  }
}
```

+++

### Coding Activity 3

+++ U1_L4_Activity_Three.java

```java
/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L4_Activity_Three 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Prepare Variables
    double pi = 3.14;
    
    // User Input
    System.out.println("Enter a circumference:");
    double circumference = scan.nextDouble();
    
    // Circumference to Radius
    double radius = (circumference / 2) / pi;
    System.out.println("Radius: " + radius);
    
    // Circumference to Area
    double area = (radius * radius) * pi;
    System.out.println("Area: " + area);
  }
}
```

+++

### Coding Activity 4

+++ U1_L4_Activity_Four.java

```java
/* Lesson 4 Coding Activity Question 4 */

import java.util.Scanner;

class U1_L4_Activity_Four 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Enter a price:");
    double price = scan.nextDouble();
    
    // Final Output
    double change = 10 - price;
    System.out.println("Change from $10: $" + change);
  }
}
```

+++

## Lesson 5: Modular Division

### Coding Activity 1

+++ U1_L5_Activity_One.java

```java
/* Unit 1 - Lesson 5 - Coding Activity Question 1 */

import java.util.Scanner;

class U1_L5_Activity_One 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter a three digit number:");
    int num = scan.nextInt();
    
    // Final Output
    System.out.println("");
    System.out.println("Here are the digits:");
    /// First Digit
    int digit1 = num / 100;
    System.out.println(digit1);
    /// Second Digit
    int digit2 = num / 10 % 10;
    System.out.println(digit2);
    /// Third Digit
    int digit3 = num % 10;
    System.out.println(digit3);
  }
}
```

+++

### Coding Activity 2

+++ U1_L5_Activity_Two.java

```java
/* Unit 1 - Lesson 5 - Coding Activity Question 2 */

import java.util.Scanner;

class U1_L5_Activity_Two 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please enter a four digit number:");
    int num = scan.nextInt();
    
    // Final Output
    System.out.println("");
    System.out.println("Here are the digits:");
    /// Fourth Digit
    int digit4 = num % 10;
    System.out.println(digit4);
    /// Third Digit
    int digit3 = num / 10 % 10;
    System.out.println(digit3);
    /// Second Digit
    int digit2 = num / 100 % 10;
    System.out.println(digit2);
    /// First Digit
    int digit1 = num / 1000;
    System.out.println(digit1);
  }
}
```

+++

## Lesson 6: Numeric Casts

### Coding Activity 1

+++ U1_L6_Activity_One.java

```java
/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L6_Activity_One 
{
  public static void main(String[] args) 
  {
    // Initalize Scanner
    Scanner scan = new Scanner(System.in);

    // User Input
    System.out.println("Please enter the numerator:");
    int numer = scan.nextInt();
    System.out.println("Please enter the denominator:");
    int denom = scan.nextInt();
    
    // Fraction to Decimal
    double decimal = (double) numer / denom;
    
    // Final Output
    System.out.println("");
    System.out.println("The decimal value is: " + decimal);
  }
}
```

+++

### Coding Activity 2

+++ U1_L6_Activity_Two.java

```java
/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L6_Activity_Two 
{
  public static void main(String[] args) 
  {
    // Initialize Variables
    Scanner scan = new Scanner(System.in);
    
    // User Input
    System.out.println("Please input two decimal numbers:");
    double decimal1 = scan.nextDouble();
    double decimal2 = scan.nextDouble();
    
    // Decimal to Integer
    int int1 = (int) (decimal1 + 0.5); 
    int int2 = (int) (decimal2 + 0.5);
    int answer = int1 + int2;
    
    // Final Output
    System.out.println("Answer: " + int1 + " + " + int2 + " = " + answer);
  }
}
```

+++

### Coding Activity 3

+++ U1_L6_Activity_Three.java

```java
/* Lesson 6 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L6_Activity_Three 
{
  public static void main(String[] args) 
  {
    // Initialize Variables
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please input a decimal number:");
    double decimal = scan.nextDouble();
    
    // Conversion
    double tenth = ((decimal - (int) decimal) * 10); // Tenths
    double hundr = ((tenth - (int) tenth) * 10); // Hundredths
    double thous = ((hundr - (int) hundr) * 10); // Thousandths
    
    System.out.println("Answer: " + (int) tenth + " " + (int) hundr + " " + (int) thous);
  }
}
```

+++

## Assignment 1: Calculating Grades

### Coding Activity

+++ Assignment1.java

```java
/* Assignment 1 - Calculating Grades */
import java.util.Scanner;

class Assignment1 
{
  public static void main(String[] args) 
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // User Input
    /// Course Title
    System.out.println("Please enter the course name.");
    String courseName = scan.nextLine();
    /// Average Time Spent Per Week (in Minutes)
    System.out.println("Please enter the average time spent in a week for this course in minutes.");
    int averageTime = scan.nextInt();
    /// Homework Grade in Course (4)
    System.out.println("Please enter the homework grades for this course.");
    int hwGradeOne = scan.nextInt();
    int hwGradeTwo = scan.nextInt();
    int hwGradeThree = scan.nextInt();
    int hwGradeFour = scan.nextInt();
    /// Quiz Grade in Course (2)
    System.out.println("Please enter the quiz grades for this course.");
    double quizGradeOne = scan.nextDouble();
    double quizGradeTwo = scan.nextDouble();
    /// Final Exam Grade in Course (1)
    System.out.println("Please enter the final exam grade for this course.");
    double examGrade = scan.nextDouble();
    
    // Calculations
    /// Average Time to Hours/Minutes
    int avgTimeHrs = averageTime / 60;
    int avgTimeMin = averageTime % 60;
    /// Homework Grade to Average
    double avgHomeworkGr = (double) (hwGradeOne + hwGradeTwo + hwGradeThree + hwGradeFour) / 4;
    /// Quiz Grade to Average
    double avgQuizGr = (quizGradeOne + quizGradeTwo) / 2;
    /// Overall Course Grade
    int overallGrade = (int) (((avgHomeworkGr * 0.35) + (avgQuizGr * 0.15) + (examGrade * 0.5)) + 0.5); 
    
    // Final Output
    System.out.println("Course name: " + courseName);
    System.out.println("Weekly time spent: " + avgTimeHrs + "h" + avgTimeMin);
    System.out.println("Average homework grade: " + avgHomeworkGr);
    System.out.println("Average quiz grade: " + avgQuizGr);
    System.out.println("Final exam grade: " + examGrade);
    System.out.println("Overall grade: " + overallGrade);
  }
}
```

+++

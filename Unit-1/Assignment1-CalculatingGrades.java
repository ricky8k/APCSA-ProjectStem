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
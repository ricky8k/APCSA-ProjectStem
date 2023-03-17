// Provided code from Project STEM.
// No modifications were made to this file.

import java.util.Scanner;

public class runner_StudentStatsArray {

   public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       String choice = "";
       while(!choice.equals("n")) {
           System.out.print("Would you like to test StudentStats? (y/n): ");
           choice = scan.nextLine().trim().toLowerCase();

           if (choice.equals("y")) {
               testStudentStats(scan);
           } else if (!choice.equals("n")) {
               System.out.println("Invalid choice.");
           } else {
               System.out.println("Bye!");
           }
       }
   }

   public static void testStudentStats(Scanner scan) {
       System.out.print("Enter the length of the Student array: ");
       int len = scan.nextInt();
       scan.nextLine();

       Student[] arr = new Student[len];
       for (int i = 0; i < len; i++) {
           System.out.println("\nPlease enter the info for student " + (i + 1) + "");
           arr[i] = studentBuilder(scan);
       }

       System.out.print("Enter a students name to search for: ");
       String name = scan.nextLine().trim();
       System.out.print("Enter a minimum gpa to search for: ");
       double gpa = scan.nextDouble();
       scan.nextLine();

       StudentStatsArray statsArray = new StudentStatsArray(arr);
       System.out.println(statsArray);
       System.out.println("\nMethod return values: ");
       System.out.println("averageGpa(): " + statsArray.averageGpa());
       System.out.println("getGpaRange(): " + statsArray.getGpaRange());
       System.out.println("getLongestName(): " + statsArray.getLongestName());
       System.out.println("getNumFreshman(): " + statsArray.getNumFreshman());
       System.out.println("search(" + name + "): " + statsArray.search(name));
       System.out.println("search(" + gpa + "): " + statsArray.search(gpa));
 int sortStatus = statsArray.sortStatus();
 System.out.println("sortStatus(): " + (sortStatus == 1 ? "Ascending" :  (sortStatus == -1 ? "Descending" : "Not sorted")));

       System.out.println();
   }

   public static Student studentBuilder(Scanner scan) {
       System.out.print("Enter the students name: ");
       String name = scan.nextLine().trim();
       System.out.print("Enter the students gpa: (0.0-4.0) ");
       double gpa = scan.nextDouble();
       scan.nextLine();
       System.out.print("Enter the students year (1-4): ");
       int year = scan.nextInt();
       scan.nextLine();
       Student student = new Student(name, gpa, year);

       return student;
   }
}
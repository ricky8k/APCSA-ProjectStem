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
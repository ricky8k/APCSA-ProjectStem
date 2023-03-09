import java.util.Scanner;

public class U6_L1_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Create Array
    double[] arr = new double[3];
    /// User Input
    arr[0] = scan.nextDouble();
    arr[1] = scan.nextDouble();
    arr[2] = scan.nextDouble();
    
    // Final Output
    System.out.println("Contents: " + arr[0] + " " + arr[1] + " " + arr[2]);
    System.out.println("Sum: " + (arr[0] + arr[1] + arr[2]));
  }
}
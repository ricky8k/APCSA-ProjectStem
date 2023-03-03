import java.util.Scanner;

public class U6_L1_Activity_One
{
  public static void main(String[] args)
  {
    // Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    // Create Array
    double[] arr = new double[4];
    /// User Input
    arr[1] = scan.nextDouble();
    arr[2] = scan.nextDouble();
    arr[3] = scan.nextDouble();
    
    // Final Output
    System.out.println("Contents: " + arr[1] + " " + arr[2] + " " + arr[3]);
    System.out.println("Sum: " + (arr[1] + arr[2] + arr[3]));
  }
}

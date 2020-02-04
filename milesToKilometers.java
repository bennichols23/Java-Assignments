import java.util.Scanner;

public class milesToKilometers {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter miles to convert to km's: ");
    double miles = scan.nextInt();
    
    System.out.printf(" %.3f Miles = %.3f Kilometers \n", miles, m2k(miles));
  }
  
  public static double m2k(double a) {
    return a * 1.60934;
  }
}

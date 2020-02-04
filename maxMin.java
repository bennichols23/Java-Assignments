import java.util.Scanner;


public class maxMin {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    double biggest = 0, smallest = 0;
    double num1 = 0, num2 = 0, num3 = 0;
    System.out.println("Hi user, give me three numbers: ");
    
    num1 = scan.nextDouble();
    num2 = scan.nextDouble();
    num3 = scan.nextDouble();
    
    if (num1 > num2) {
      biggest = num1;
      smallest = num2;
    } else {
      biggest = num2;
      smallest = num1;
    }
    
    if (num3 > biggest) {
      biggest = num3;
    }
    
    if (num3 < smallest) {
      smallest = num3;
    }
    
    System.out.println("The smallest number is " + smallest + " and the largest is " + biggest);
    
  }
}

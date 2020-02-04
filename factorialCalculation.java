import java.util.Scanner;

public class factorialCalculation {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int user = 17;
    char conf = 'Y';
    
    while (user < -16|| user > 16) {
      System.out.println("Enter a factorial number to calculate: ");
      user = scan.nextInt();
      if (user < -16) {
        System.out.println("Warning! Java cannot handle factorials smaller then -16! Continue? (Y/N): ");
        conf = scan.next().toUpperCase().charAt(0);
        if (conf == 'Y') {
          break;
        }
      } else if (user > 16) {
        System.out.println("Warning! Java cannot handle factorials larger then 16! Continue? (Y/N): ");
        conf = scan.next().toUpperCase().charAt(0);
        if (conf == 'Y') {
          break;
        }
      }
    }
    System.out.println(user+"! = "+factorial2(user));
  }
  
  public static int factorial(int a, int total) {
    if(a!=0) {
      total = total * a;
      return factorial(--a, total);
    } else {
      return total;
    }
  }
  
  public static int factorial2(int a) {
    int ret = 1;
    if(a >= 1) {
      return ret = a * factorial2(a - 1);
    } else {
      return ret;
    }
  }
}
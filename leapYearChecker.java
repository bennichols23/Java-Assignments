import java.util.Scanner;
public class leapYearChecker {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int year = 1;
    
    System.out.println("This program checks for leap years, enter 0 to exit\n");
    
    while (year != 0) {
      System.out.print("Enter year: ");
      year = scan.nextInt();
      if (year == 0) {
        System.out.println("0 entered, ending program...");
        break;
      } else if (year < 0) {
        System.out.println("Invalid year. Must be a positive number");
      } else if (year < 1582) {
        System.out.println("Invalid year. Leap year introduced after 1582");
      } else {
        if ((year % 4) != 0) {
          System.out.println(year + " is not a leap year");
        } else if ((year % 100) != 0) {
          System.out.println(year + " is a leap year");
        } else if ((year % 400) != 0) {
          System.out.println(year + " is not a leap year");
        } else {
          System.out.println(year + " is a leap year");
        }
      }
    }
  }
}

/* 
 * ALGORITHM
 * 
 * if (year is not divisible by 4) then (it is a common year)
 * else if (year is not divisible by 100) then (it is a leap year)
 * else if (year is not divisible by 400) then (it is a common year)
 * else (it is a leap year)
 */

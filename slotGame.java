import java.util.Scanner;
import java.util.Random;

public class slotGame {
  public static void main(String[] args) {
    
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    
    int num1 = 0, num2 = 0, num3 = 0, counter = 0, userInt = 0;
    double money = 1000, win = 0, lose = 0;
    boolean game = true;
    
    while(game == true) {
      System.out.println("Money: $" + money);
      System.out.println("Spins: " + counter);
      System.out.println("Jackpot: $" + lose);
      System.out.println("\n(1) - Spin slot machine (Cost $50.00)");
      System.out.println("(2) - Call it quits (Walk away with $"+money);
      System.out.println("Enter what you want to do: ");
      
      userInt = scan.nextInt();
      
      if (userInt == 1) {
        money = money - 50;
        lose = lose + 40;
        counter++;
        num1 = rand.nextInt(9);
        num2 = rand.nextInt(9);
        num3 = rand.nextInt(9);
        
        System.out.println("---------------------");
        System.out.println("---["+num1+"]---["+num2+"]---["+num3+"]---");
        System.out.println("---------------------");
        if(num1 == num2 || num2 == num3 || num3 == num1) {
          win = 100;
          System.out.println("Nice! 2 numbers matched. You won $"+win+"\n");
        } else if (num1 == num2 && num2 == num3) {
          win = lose;
          lose = 0;
          System.out.println("JACKPOT! All numbers match! You won "+win+"\n");
        } else {
          win = 0;
          System.out.println("Uh oh! No numbers matched!\n");
        }
        money = money + win;
        win = 0;
      } else if (userInt == 2) {
        System.out.println("\nYou left the casino with $" + money);
        game = false;
      } else {
        System.out.println("That's not an option, pick again!");
      }
      if (money <= 49) {
        System.out.println("\nYou ran out of money! Better luck next time!");
      }
    }
  }
}
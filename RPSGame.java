import java.util.Random;
import java.util.Scanner;

public class RPSGame {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    char user = 'R', comp = 'R', winner = 'R';
    int GAMES = 5, gen = 0, wins = 0;
    
    for(int i=0; i<=GAMES; i++) {
      
      gen = rand.nextInt(3);
      if(gen == 0) {
        comp = 'R';
      } else if (gen == 1) {
        comp = 'P';
      } else {
        comp = 'S';
      }
      
      user = inputLine("R, P, S? ").toUpperCase().charAt(0);
      System.out.println("Computer chose " + comp);
      
      winner = RPSCheck(user, comp);
      if (winner == 'T') {
        System.out.println("It was a tie!");
      } else {
        if (winner == user) {
          wins++;
        }
        System.out.println("The winner was " + winner + "!");
      }
    }
    System.out.println("You won " + wins + " times!");
  }
  
  public static String inputLine(String str) {
    Scanner scan = new Scanner(System.in);
    System.out.println(str);
    return scan.next();
  }
  
  public static char RPSCheck(char a, char b) {
    if (a == b) {
      return 'T';
    } else if (a == 'R' && b == 'P' || a == 'P' && b == 'S' || a == 'S' && b == 'P') {
      return b;
    } else {
      return a;
    }
  }
}
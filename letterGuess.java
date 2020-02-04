import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class letterGuess {
  public static void main(String[] args){
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    
    int letters = 25; // Number of sides on each dice
    char letter = 'a'; // Creates letter variable
    char guess = 'b'; // Creates guess variable
    int guesses = 10; // Creates boolean for while loop
    
    letter = (char)((rand.nextInt(letters) + 1) + 65); // Generates the random letter
    
    System.out.println("I generated a random letter, can you guess it?");
    
    while (guesses >= 1) { // Creates a loop that will not break until letter is guesed
    
      System.out.print("\n" + guesses + " / 10 guesses remaining: ");
      guess = scan.next().toUpperCase().charAt(0); // Asks user to guess letter
      
      if ((int)letter < (int)guess) { // Runs if letter is after generated letter
        System.out.println("Oh, too bad, the letter you guessed is AFTER the generated letter!");
        guesses--;
      } else if ((int)letter > (int)guess) { // Runs if letter is before generated letter
        System.out.println("Oh, too bad, the letter you guessed is BEFORE the generated letter!");
        guesses--;
      } else { // Runs if letter is same as generated letter
        System.out.println("You guessed correctly! The letter was " + letter); 
        System.out.println("It took you " + (11 - guesses) + " guesses to get the letter!");
        break;
      }
    }
    if(guesses == 0) {
      System.out.println("\nYou ran out of guesses! The letter was " + letter);
    }
  }
}
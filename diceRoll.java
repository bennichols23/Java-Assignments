import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class diceRoll {
  public static void main(String[] args){
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    
    int sides = 6; // Number of sides on each dice
    int dieFace1 = 0, dieFace2 = 0; // Creates dice variables
    
    dieFace1 = rand.nextInt(sides) + 1; // Generate random number for first die
    dieFace2 = rand.nextInt(sides) + 1; // Generate random number for second die
    
    System.out.println("Die #1: " + dieFace1 + ", Die #2: " + dieFace2);
    
    if (dieFace1 == dieFace2) { // If they match, display lucky roll
      System.out.println("Lucky roll, they match!");
    } else { // If they don't match, display better luck next time
      System.out.println("Dice are different, better luck next time.");
    }
    
  }
}
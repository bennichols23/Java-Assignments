import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class letterRole {
  public static void main(String[] args){
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    
    int sides = 25; // Number of sides on each dice
    char letter1 = 'a', letter2 = 'b'; // Creates dice variables
    
    letter1 = (char)((rand.nextInt(sides) + 1) + 65); // Generate first random letter
    letter2 = (char)((rand.nextInt(sides) + 1) + 65); // Generate last random letter
    
    System.out.println("Letter #1: " + letter1 + ", Letter #2: " + letter2);
    
    if ((int)letter1 < (int)letter2) {
      System.out.println(letter1 + " comes before " + letter2);
    } else if ((int)letter1 > (int)letter2) {
      System.out.println(letter1 + " comes after " + letter2);
    } else {
      System.out.println(letter1 + " is the same as " + letter2);
    }
    
  }
}
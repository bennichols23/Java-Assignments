import java.util.Random;

public class genArray {
  public static void main(String[] args) {
    Random rand = new Random();
    int SIZE = 100;
    int[] distance = new int[SIZE];
    
    System.out.println("Populating array with " + SIZE + " random values.");
    for(int i=0; i<SIZE; i++) {
      distance[i] = rand.nextInt(20);
    }
    
    System.out.println("Operation complete, printing array to screen...\n");
    displayArray(distance);
    
    System.out.println("\nValues printed, terminating program.");
  }
  public static void displayArray(int[] a) {
    for (int i=0; i<a.length; i++) {
      System.out.println("@ "+i+" = "+a[i]);
    } 
  }
}
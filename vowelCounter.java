import java.util.Scanner;
public class vowelCounter {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    String inputString = "a";
    int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0, totalY = 0;
    
    System.out.print("Enter a string: ");
    inputString = scan.nextLine().toLowerCase();
    
    for (int i = 0; i < inputString.length(); i++) {
      switch(inputString.charAt(i)) {
        case 'a':
          totalA++;
          break;
        case 'e':
          totalE++;
          break;
        case 'i':
          totalI++;
          break;
        case 'o':
          totalO++;
          break;
        case 'u':
          totalU++;
          break;
        case 'y':
          totalY++;
          break;
      }
    }
    System.out.println("Vowels:");
    if (totalA > 0) {
      System.out.println("a - "+totalA);
    }
    if (totalE > 0) {
      System.out.println("e - "+totalE);
    }
    if (totalI > 0) {
      System.out.println("i - "+totalI);
    }
    if (totalO > 0) {
      System.out.println("o - "+totalO);
    }
    if (totalU > 0) {
      System.out.println("u - "+totalU);
    }
    if (totalY > 0) {
      System.out.println("y - "+totalY);
    }
  }
}
import java.util.Scanner;
public class wordInput {
  public static void main(String[] args) {
    System.out.println("The input is: " + inputWord("Your name? "));
  }
  public static String inputWord(String a) {
    Scanner scan = new Scanner(System.in);
    System.out.println(a);
    String name = scan.nextLine();
    return name;
  }
}
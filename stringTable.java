import java.util.Scanner;
public class stringTable {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    String inputString = "a";
    int stringLength = 0, charNum = 0;
    
    System.out.print("Enter a string to be converted: ");
    inputString = scan.nextLine();
    
    System.out.println("\nChar\tASCII/Unicode\n--------------------");
    stringLength = inputString.length();
    
    while (stringLength > 0) {
      System.out.println(inputString.charAt(charNum)+"\t"+(int)inputString.charAt(charNum));
      charNum++;
      stringLength--;
    }
  }
}
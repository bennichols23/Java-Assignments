// Author: Ben Nichols
// Date: November 13th, 2019

// This program generates 5,000 integer values in a -250,000 to 250,000 range and writes them to a file.

import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class valueGen {
  public static void main(String[] args) throws Exception {
    String fileName = "default"; // Creates variable for file name. Defaults to default.txt
    int numAmount = 0, genNum = 0; // Creates variables numAmount for number of iterations and genNum for random num
    
    Scanner scan = new Scanner(System.in); // Creates new scanner with variable "scan"
    Random r = new Random(); // Creates new random number generator with variable "r"
    
    System.out.println("Enter file name to generate numbers to: ");
    fileName = scan.next(); // Grabs file name from user
    fileName = fileName + ".txt"; // Appends .txt to end of String
    
    System.out.println("Enter amount of numbers to generate: ");
    numAmount = scan.nextInt(); // Grabs amount of numbers to generate from user

    PrintWriter prnt = new PrintWriter(fileName); // Creates new file writer with variable "prnt"
    
    while(numAmount != 0) {
     genNum = r.nextInt(500000) - 250000; // Generates random number in range -250,000 to 250,000
     prnt.println(genNum); // Writes number to file
     
     numAmount--;
    }
    
    System.out.println("Saving file...");
    prnt.close(); // Saves file with generated numbers
    System.out.println("Operation complete!");

  }
}
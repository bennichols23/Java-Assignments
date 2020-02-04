// Author: Ben Nichols
// Date: November 13th, 2019

// This program reads a file with integers and finds the max, min, and average.

import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class valueReader {
  public static void main(String[] args) throws Exception {
    String fileName = "default"; // Creates variable for file name. Defaults to default.txt
    int readNum = 0, maxVal = -250002, minVal = 250002, avgVal = 0, totalVal = 0, count = 0;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter file name to read (without .txt): ");
    fileName = scan.next(); // Grabs file name from user
    fileName = fileName + ".txt"; // Appends .txt to end of String
    
    File fileIn = new File(fileName); // Creates new file reader with variable "fileIn"
    Scanner scanFile = new Scanner(fileIn); // Creates new scanner with variable "scan"
    
    while(scanFile.hasNext()) {
      readNum = scanFile.nextInt(); // Reads next integer in file
      if (readNum > maxVal) {
        maxVal = readNum; // Assigns new biggest value
      }
      if (readNum < minVal) {
        minVal = readNum; // Assigns new smallest value
      }
      totalVal = totalVal + readNum; // Adds value to the total of all values
      count++; // Adds 1 to the amount of values counter
    }
    
    avgVal = totalVal / count; // Calculates the average value
    
    System.out.println("In the file "+fileName+", the program calculated the following from "+count+" values...");
    System.out.println("Biggest value: "+maxVal+"\nSmallest value: "+minVal+"\nAverage value: "+avgVal);
  }
}
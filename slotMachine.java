// Author: Ben Nichols
// Date: November 13th, 2019

// This program simulates a slot machine, and then writes it to a file

import java.util.Random;
import java.io.*;

public class slotMachine {
  public static void main(String[] args) throws Exception {
    int num1 = 0, num2 = 1, num3 = 2; // Defines 3 random numbers
    int counter = 0; // Defines spin counter
    boolean match = false; // Defines number match boolean
    
    Random r = new Random(); // Creates new random number generator with variable "r"
    PrintWriter prnt = new PrintWriter("slotsresults.txt"); // Creates new file writers with variable "prnt"
   
    /////////////////////////////////////////////////////////////////////
    // MATCH SLOT MACHINE - Stops loop once a match has been generated //
    /////////////////////////////////////////////////////////////////////
    
    System.out.println("SLOT MACHINE SIMULATION (MATCH)"); // Prints to screen to notify viewers what file is
    prnt.println("SLOT MACHINE SIMULATION (MATCH)"); // Prints to head of file to notify viewers what file is
    
    while(match == false) {
      num1 = r.nextInt(10); // Generates first number
      num2 = r.nextInt(10); // Generates second number
      num3 = r.nextInt(10); // Generates third number
      counter++; // Adds 1 to te counter
      
      if(num1 == num2 && num2 == num3 && num1 == num3) {
        match = true; // If all numbers equal, break loop.
      } else {
        System.out.println("Spin " + counter + ": " + num1 + " " + num2 + " " + num3); // Prints iteration to screen
        prnt.println("Spin " + counter + ": " + num1 + " " + num2 + " " + num3); // Writes iteration to file
      }
    } // Continues looping until match
    
    System.out.println("Spin " + counter + ": " + num1 + " " + num2 + " " + num3 + " is a match! You win!");
    prnt.println("Spin " + counter + ": " + num1 + " " + num2 + " " + num3 + " is a match!"); // Writes match iteration
    
    prnt.println("Number of spins until match: " + counter); // Writes reportWin variable to file
    
    ///////////////////////////////////////////////////////////////////////////
    // SEQUENCE SLOT MACHINE - Stops loop once a sequence has been generated //
    ///////////////////////////////////////////////////////////////////////////
    
    counter = 0; // Resets counter to 0
    match = false; // Resets boolean variable to false
    
    System.out.println("\nSLOT MACHINE SIMULATION (SEQUENCE)"); // Prints to screen to notify viewers what file is
    prnt.println("\nSLOT MACHINE SIMULATION (SEQUENCE)"); // Prints to head of file to notify viewers what file is
    
    while (match == false) {
      num1 = r.nextInt(10); // Generates first number
      num2 = r.nextInt(10); // Generates second number
      num3 = r.nextInt(10); // Generates third number
      counter++; // Adds 1 to te counter
      
      if(num1 <= num2 && num2 <= num3) {
        match = true; // Breaks loop once numbers are in a sequence
      } else {
         System.out.println("Spin " + counter + ": " + num1 + " " + num2 + " " + num3); // Prints iteration to screen
         prnt.println("Spin " + counter + ": " + num1 + " " + num2 + " " + num3); // Prints iteration to file
      }
    }
    
    System.out.println("Spin " + counter + ": " + num1 + " " + num2 + " " + num3 + " is a sequence! You win!");
    System.out.println("Number of spins until sequence: " + counter); // Prints # of spins until sequence
    
    prnt.println("Spin " + counter + ": " + num1 + " " + num2 + " " + num3 + " is a sequence!");
    prnt.println("Number of spins until sequence: " + counter); // Prints # of spins until sequence
    
    prnt.close(); // Closes file, saving changes so user can view them after program has finished executing
    
  }
}
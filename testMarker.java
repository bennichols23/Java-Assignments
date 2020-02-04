/****    
  * Name: Ben Nichols
  * Student Number: t00645554
  * Assignment Number: 1
  * Due Date: January 21st, 2020
  * Program Description: Marks a true/false test and prints out the results to screen.
****/

public class testMarker {
     
     // Declares array variables
     private static char[][] answers; 
     private static String[] names;
     private static int[] correctQ; 
     private static int[] correctS;
     private static char[] key;
     
     // Creates main which calls each method
     public static void main(String[] args) {
          if(initializeData()) {
               calcCorrect();
               printResults();
          }
     }
     
     // Initializes arrays with test data
     public static boolean initializeData() {
          
          // Initializes students answers
          answers = new char[][]{
               {'F','T','T','F','T','F','T','T','F','T'}, 
               {'F','T','F','T','F','T','T','T','F','F'},
               {'F','T','T','F','T','T','T','T','T','T'},
               {'T','T','F','F','T','F','F','T','T','T'},
               {'T','T','F','T','T','T','F','F','T','F'},
               {'T','T','T','T','T','T','T','T','T','T'},
               {'F','T','F','F','F','T','F','T','F','T'},
               {'T','F','T','F','T','F','T','F','T','F'},
               {'T','T','T','F','F','T','T','F','T','F'},
               {'F','F','F','F','F','F','F','F','F','F'},
               {'T','F','T','T','F','T','T','F','T','F'},
               {'F','T','F','F','T','T','F','F','F','T'},
               {'F','T','F','T','F','T','F','T','F','T'},
               {'T','F','T','F','T','T','F','T','F','T'}};
          
          
          // Initializes students names
          names = new String[] {"Audrey", "Brian", "Elizabeth", "Ellen", "Gregory", "Harold", "Lewis", "Kevin",
               "Kieran", "Michael", "Peter", "Wayne", "Yang", "Johnny"};
          
          // Initializes answer key
          key = new char[] {'F', 'T', 'F', 'F', 'T', 'F', 'F', 'T', 'F', 'T'};
          
          // Initializes number correct for each question. Size defined by number of questions in key.
          correctQ = new int[key.length];
          for (int i=0; i<key.length; i++) {
               correctQ[i] = 0;
          }
          
          // Initializes number correct for each student. Size defined by number of student names.
          correctS = new int[names.length];
          for (int i=0; i<names.length; i++) {
               correctS[i] = 0;
          } 
          
          // Checks names vs number of tesets
          if (names.length > answers.length) {
               System.out.println("Error! More names then tests supplied. Is a test missing?\nTerminating...\n");
               return false;
          } else if (names.length < answers.length) {
               System.out.println("Error! More tests then names supplied. Is a name missing?\nTerminating...\n");
               return false;
          } else if (key.length > answers[0].length) {
               System.out.println("Error! More answers on key then on test. Is a question missing?\nTerminating...\n");
               return false;
          } else if (key.length < answers[0].length) {
               System.out.println("Error! More answers on test then on key. Is a question missing?\nTerminating...\n");
               return false;
          } else {
               return true;
          }
     }
     
     // Calculates how many answers each student got correct
     public static void calcCorrect() {
          for(int a=0; a<names.length; a++) {
               for(int b=0; b<key.length; b++) {
                    if(answers[a][b] == key[b]) {
                         correctS[a]++; // Adds 1 to number of correct answers for student
                         correctQ[b]++; // Adds 1 to number of students answered question correctly
                    }
               }
          }
     }
     
     // Prints results to screen
     public static void printResults() {
          // Sets up columns and centers them so they allign with any amount of quiz numbers
          System.out.printf("%30s %"+((key.length*2)+8)+"s %"+((key.length*2)+9)+"s %32s", "Students", "Question #", 
                            "Score /"+key.length+"\n", "");
          // Prints out amount of questions based off key array
          for(int i=0; i<key.length; i++) {
            System.out.printf("%4s", i+1);
          }
          System.out.println("");
          // Prints out test results
          for(int a=0; a<names.length; a++) {
               // Prints out student name
               System.out.printf("%30s %2s", names[a], " ");
               // Prints out student answers
               for(int b=0; b<key.length; b++) {
                    System.out.printf("%4s", answers[a][b]);
               }
               // Prints out students score 
               System.out.printf("%7s", correctS[a]);
               // Indents to a new line, repeats until no more students.
               System.out.println("");
          }
          // Indents to mark end of student results
          System.out.println("");
          // Prints out how many students got each question
          System.out.printf("%30s %2s", "Correct /"+names.length, " ");
          for(int i=0; i<key.length; i++) {
               System.out.printf("%4s", correctQ[i]);
          }
          // Calculates average and displays to screen, just for fun.
          System.out.printf("%5s %.2f", " ", calcAvg(correctS));
          System.out.print("%\n");
     }
     
     // Calculates class average, just for fun.
     public static double calcAvg(int[] a) {
          double total = 0;
          for (int i=0; i<a.length; i++) {
               total = total + a[i];
          }
          total = (total / a.length)*10;
          return total;
     }
}
// Carrie Krueger
// 9-20-21
// How to use a Scanner to read input from the keyboard

import java.util.Scanner;
// To read from the keyboard, use the premade Scanner class in Java
// Certain premade classes need to be imported to be used
// Scanner: import     Math, String: no import 


public class KeyboardInput {
   public static void main(String[] args) {
      readInput(); // read input from the keyboard
   
   }
   
   // a method that will read input from the keyboard
   public static void readInput() {
   
      String name;
      int age;
      
      // INSTANTIATE (create) a Scanner that reads from the keyboard
      // This line makes a Scanner called 'sc'
      
      Scanner sc = new Scanner(System.in);
      // Why 'sc'? could use anything.... 
      // Descriptive names are helpful
      
      // Prompt user for information
      // use the .nextLine() method to read and store text
      
      System.out.println("What is your full name?");
      name = sc.nextLine();  // reads in the line of text and stores it
      
      // Scanners have methods to read in the next piece of data (different types)
      // until there is a space or a newline
      // To read an int, use .nextInt()
      
      System.out.println("Enter your age:");
      age = sc.nextInt();
      
      // Echo [concatenation]
      System.out.println("Hello, " + name + ". How does it feel being " + age + "?");
      
      sc.close();  // close the Scanner (makes the compiler happy)
   
   }


}

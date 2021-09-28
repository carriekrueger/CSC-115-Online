// Carrie Krueger
// 3-2-21
// Notes on if/else statements

import java.util.Scanner;

public class IfElseNotes {
    public static void main(String[] args) {
        
        ifMethod(); // let's explore ifs and elses
    }
    
    // a method to study if statements 
    public static void ifMethod() {
        
        // Task: ask the user for a number and tell them if it's even 
        
        Scanner sc = new Scanner(System.in); // make a Scanner that 
                                            // reads from the keyboard
                                            
        System.out.println("Enter a number:");  // prompt the user for a number
        int number = sc.nextInt();  // read and store number 
        
        /*
        Three common mistakes:
        1. DON'T put a ; after the if()
        2. DO put curly braces { } around the code to be executed if true
        3. DO remember to test for equality with '=='
        */
        
        // test for "evenness" using mod
        if(number % 2 == 0) {
           System.out.println(number + " is even!");
           System.out.println("Rock on!!");
        }
        
        System.out.println("The end.");  // prints every time
        
        // Task: compare two numbers
        
        int num1 = 2;
        int num2 = 7;
        
        // compare two numbers and output a message
        if(num1 < num2) {
            System.out.println("num1 is less than num2!");
        } else {
            System.out.println("num1 is NOT less than num2!"); // why not
                                                               // num2 greater?
        }
        
        
        
        sc.close();
        

        
    }
}

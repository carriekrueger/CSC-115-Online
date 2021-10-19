// Carrie Krueger
// 3-18-21
// All about while loops 


public class WhileLoops {
    public static void main(String[] args) {
        
       loops(); // while loops
    }
    
    // this method looks at while loops 
    public static void loops() {
        
        // Ask a question once: if statement 
        // Ask a question repeatedly (or do something repeatedly):
        // LOOP (while loop)
        
        // LOOP RULES:
        
        // When you program a loop, you should know that it will 
        // DEFINITELY end once some condition has occurred
        
        // Usually you will have to increment some variable
        // so that the loop will approach the end state
        // LCV (loop control variable)
        
        // WAYS TO INCREMENT A VARIABLE (3.7 in textbook)
        
        int count = 0; 
        // How to add 1?
        count = count + 1; //adds 1 and assigns the value to count
        count += 1; // compound opertor (shortcut)
        count++; // another common way to increment by 1 
        
        // Use curly brackets { } around the while loop code!! 
        
        // HERE COMES A LOOP! 
        
        int counter = 0; 
        
        // ends when the value of counter is 5
        while(counter != 5) {
            counter += 1;   // increment counter to get to 5
            System.out.println(counter);
        }
        // how many times does this loop run? 5 times
        // can adjust start/end/increment values (also use < >)
        
        int num = 0; 
        while(num < 3) {
            System.out.println(num);
        }
        
        // INFINITE LOOP OF DOOM!
        // needs an incrementor 
        // Exit/break out of the terminal : Ctrl + c
        
        // LIVE CODE DEMOS IN BLACKBOARD
        
        
       
        
    }
}

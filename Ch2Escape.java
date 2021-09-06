// Carrie Krueger
// 2-9-21
// Chapter 2 Notes: Output and Escape Sequences

public class Ch2Escape {
    public static void main(String[] args) {
        escape(); // this method will explore output and escape seq.
    }
    
    // a method to investigate output and escape sequences
    public static void escape() {
        
        // print vs. println
        
        System.out.print("Hello Class!");  // next thing prints on same line
        System.out.println("It is Tuesday."); // next thing prints on next line
        
        System.out.println();  // prints a blank line
        
        
        // OUTPUT 
        System.out.println(2); // you can put text or numbers in a print statement
        System.out.println(1 + 2 * 3); // you can also do math!
                                       // (order of operations)
                                       
        // Escape Sequences:                               
        // special characters denoted with the \ (the escape character)
        
        // \n --> new line 
        System.out.print("Hello!  \n\n\n\n");
        System.out.println("He\nllo!");
        
        // \t --> tab 
        System.out.println("Hi\tHi");
        System.out.println("Hi\t\t\t\tHi");
        
        // \\ --> \
        System.out.println("\\");
        
        // \" --> " 
        System.out.println("She said \"Java is the best!\"");
        
        // You try!
        // Make a new class PrintQuote.java
        // Think of a quote or saying that you know 
        // Output that saying with visible " " around it 
        // Use a method to print your quote!
        
        // Example output: "That's the way the cookie crumbles."
        
        
        
        
        
        
        
    }
}
© 2021 GitHub, Inc.

// Carrie Krueger
// 2-9-21
// Notes about variables and String output

public class Variables {
    public static void main(String[] args){
        variables(); // a method to investigate variables
        aboutStrings(); // a method to look at Strings 
        
    }
    
    //in this method we will look at variables
    public static void variables() {
        
        /* A variable is a place to store a value. 
           A variable holds data.
           It's a named location in the computer's memory.
           
           There are a few different types of information we can store:
           
           integer(whole number):     int 
           decimal(3.14, -6.0):       double 
           boolean(true, false):      boolean 
           character('a', '3', '?'):  char 
           
           Other types: long, short, float, byte 
           All of these types are PRIMITIVE data types 
           
         */
         
        // When you want to use a variable: declare 
        // DECLARE a variable named 'age' that holds a whole number
        // (integer) 
        
        int age;
        
        // variables names start with a LOWERCASE and follow
        // camelCase 
        // class names start with an UPPERCASE 
        
        // When you want to give your variable a value, assign
        // using '=' 
        // ASSIGN the variable 'age' a value of '36'
        
        age = 36;
        
        // You can do both at once!
        // DECLARE a variable called 'gpa' that holds a decimal
        // and ASSIGN it at the same 
        
        double gpa = 3.14;
        
        // DISPLAY the current value of your variables:
        System.out.println("Your age is " + age + ".");
        System.out.println("Your gpa is " + gpa);
        
        // Reassign the value of 'gpa'
        gpa = 2.7;
        System.out.println("Your gpa is now " + gpa);
        
        // In general... 
        
        // int      num     =  28;
        // type
        //          name       
        //                     value 
        
        
        int num1 = 4; 
        int num2 = 5;
        
        // you can do stuff with variables - print, math...
        
        int sum = num1 + num2;
        System.out.println(sum); // 9
        
        int x;   // x has been DECLARED, but it has not been ASSIGNED
                 // (needs to be initialized)
        
       // System.out.println(x);  // error! won't work
       
       // YOU TRY!
       // 1. Add to PrintQuote.java or make a new class
       // 2. Declare 2 int variables and assign them values
       // 3. Dispay the sum 
       // 4. Display the product
        
        
    }
    
    
    // this method looks at Strings
    public static void aboutStrings() {
        
        // STRING
        // A variable that hold a bunch of characters (like a word)
        // String is a class (note the uppercase), but we can use
        // it like a primitive 
        
        String firstName = "Carrie"; // note the camelCase 
        System.out.println(firstName + " " + "Krueger"); //CONCATENATE
    
        // Mixing Strings and numbers is a tricky business...
        
        System.out.println("3 + 4");
        System.out.println(3 + 4);
        System.out.println(3 + 4 + " = 3 + 4");
        System.out.println("3 + 4 = " + 3 + 4); // concatenates onto the String
        System.out.println("3 + 4 = " + (3 + 4)); // add () for order of ops 
        
        System.out.println(3 - 4);
        //System.out.println("3 - 4 = " + 3 - 4); // error!
        System.out.println("3 - 4 = " + (3 - 4)); //order of ops
        
        int difference = 3 - 4; 
        System.out.println("3 - 4 = " + difference);
        
    }
    
    
    
    
    
}
© 2021 GitHub, Inc.

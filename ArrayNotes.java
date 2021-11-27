// Carrie Krueger
// 4-29-21
// All about arrays 

public class ArrayNotes {
    public static void main(String[] args) {
      
      
        /* template
        
              0   1   2   3   4   5   6
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
            -----------------------------
        */ 
        
        // ARRAY RULES: 
        
        // 1. You need to know the size of the array 
        //    when you declare it 
        // 2. Once the size of the array is set, 
        //    it can't be changed (you can not resize an array)
        // 3. Arrays can only hold one type of data 
        //    (all ints, all Strings, etc.)
        // 4. Arrays are indexed from 0 to length - 1  
        //    (ArrayIndexOutOfBoundsException)
        
        // Let's declare an array to hold daily temperatures for a week 
        
        int[] temps = new int[7]; 
        // DECLARE an array and set the length (all about the [])
        
        /* 
        
              0   1   2   3   4   5   6       positions 0 to length - 1
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |     initially filled with 0s
            -----------------------------
        */ 
        
        // loading the array with values
        
        temps[0] = 29;
        temps[1] = 31;
        temps[2] = 41;
        temps[3] = 16;
        temps[4] = 30;
        temps[5] = 30;
        temps[6] = 30;
        
        /* 
        
              0     1    2    3    4    5    6       
            ------------------------------------
            | 29 | 31 | 41 | 16 | 30 | 30 | 30 |     
            ------------------------------------
        */ 
        
        System.out.println(temps[3]);  // 16
        
        // can do anything with array elements that you can do with 
        // regular variables 
        
        double weekendAverage = (temps[0] + temps[1]) / 2.0;
        System.out.println("Weekend average temp: " + weekendAverage); // 30.0
        
        temps[3] = 26;   // no output, just changed a value
        
        /* 
        
              0     1    2    3    4    5    6       
            ------------------------------------
            | 29 | 31 | 41 | 26 | 30 | 30 | 30 |     
            ------------------------------------
        */ 
        
        System.out.println(temps[3]); // 26
        
        
        // print the first element in the array - position/index 0
        System.out.println("First: " + temps[0]);
        
        // print last element in this array - position/index 6 -- 7th element
        System.out.println("Last: " + temps[6]);
        
        // position 7? 
        
        // System.out.println(temps[7]); // ArrayIndexOutOfBounds
                                         // Exception
                                         
        // print the last element in any array? position length - 1
         System.out.println("Last: " + temps[temps.length - 1]);
        
        // how to print an array? 
        
        System.out.println(temps);  //prints memory address 
        
        // use a for loop to print every element 
        for(int i = 0; i < temps.length; i++){
            System.out.print(temps[i]+ " ");
        }
        
        System.out.println(); // next thing prints on next line
        
        // Arrays act just like Strings!
        String s = "abcdefg";  // 7 characters
        
        // Strings -> length method, arrays -> variable
        System.out.println(s.length()); // 7
        
        System.out.println(s.charAt(0));  // a
        System.out.println(s.charAt(6));  // g
        //System.out.println(s.charAt(7));  // StringIndexOutofBounds error
        System.out.println(s.charAt(s.length() - 1)); // g
        
        // sending an array as a parameter to a method
        
        printArray(temps);
        
    }
    
    
    // This method takes an array and prints the contents
    
    // NOTE: If you send an array as a parameter to a method, 
    // and change the array inside the method,
    // then the changes will "stick" when the method is done 
    // (not changing anything here)
    public static void printArray(int[] a){
         // use a for loop to print every element 
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+ " ");
        }
        
        System.out.println(); //
    }
}
       




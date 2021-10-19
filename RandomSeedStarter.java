// Carrie Krueger
// 3-30-21
// Let's experiment with seeding the random number generator!

import java.util.Scanner;
import java.util.Random;

public class RandomSeed {
    
    public static void main(String[] args) {
        
        makeRandoms();   // make random things using a seed from the user 
    }
    
    // this method asks the user for a seed for the random number generator 
    // and then generates random integers
    
    public static void makeRandoms() {
        
        // Seeding the random number generator 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a seed:");
        int seed = sc.nextInt();
        
        Random rand = new Random(seed);  // use the seed that the user entered 
        
        int rand1 = rand.nextInt(100);  // between 0 - 99
        System.out.println("Random number 1 = " + rand1);
     
                
       
  
    }
}

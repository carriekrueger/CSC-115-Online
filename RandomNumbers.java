// Carrie Krueger
// 3-25-21
// Using the Random class to make random numbers

import java.util.Random;
//we will use the premade Java class - Random


public class RandomNumbers {
    public static void main(String[] args) {
        
        makeRandoms();  // method for making and printing random numbers 
    }
    
    // this method looks at making random integers in a range 
    public static void makeRandoms()  {
        
        // HOW TO MAKE RANDOM INTEGERS USING THE RANDOM CLASS
        
        // Step 1: Instantiate (create) a Random object
        // (make an instance of the Random class)
        // This is NOT the random number, but what we will use to 
        // get the random number
        
        Random rand = new Random();
        
        // Step 2: use the .nextInt(int) method to generate a random
        // integer in a range
        // The number generated is 0 to value - 1 (exclusive of value)
        
        int randomNumber = rand.nextInt(100); // give a value 0 - 99
        System.out.println(randomNumber);
        
        // How to get a random integer between 1 and 100?
        randomNumber = rand.nextInt(101);  // no, give 0 - 100
        
        System.out.println(rand.nextInt(100) + 1);  // gives 1-100
                            //      0 -99 + 1 = 1 - 100 
        
        // How about a random integer between 75-100 (inclusive)?
        int randomNumber2 = rand.nextInt(26) + 75;
                                    //  0 -25 + 75 = 75 - 100
        
        // Formula/Rule???
        // # inside () = number of random numbers in the range
        //             = max # - min # + 1
        // # added on outside = starting number (minimum number in range)
        
        // How about a number between 20 and 50 (inclusive)?
        
        randomNumber2 = rand.nextInt(31) + 20;
        //                        // 0-30 + 20  = 20 - 50
        
        
        // Live code demo in Blackboard
        
        
        
        
        
    }
}

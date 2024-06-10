import java.util.Scanner;
// Importing Scanner class for taking input from the user.

public class Recursive_fact {
    // Define a static method 'factorial' that takes an integer 'n' as input and returns an integer.

    static int factorial(int n){
        
        // Base case: if 'n' is 0 or 1, return 1.
        if(n == 0 || n == 1 ){

            return 1; // Return 1 immediately and stop recursion.

        }

        // Recursive case: if 'n' is greater than 1, calculate factorial by calling 'factorial' recursively.

        else{

            // Call the factorial function recursively with the argument (n - 1).
            int result = n * factorial(n - 1);

            // Return the result of the current recursive call.
            return result;
        }
    }

    // The main method where the program execution starts.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        int num = sc.nextInt();
        // Storing the input from user in var 'num' of datatype Integer.
        
        // Call the 'factorial' method with input 'num' and store the result in 'fact'.
        int fact = factorial(num);
        
        // Print the final result (factorial of 5).
        System.out.println("Factorial of 5 is: " + fact);
        
        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.
    }
    
    /*
    Dry Run:

    
     LET the value of var 'num' be 5.
    1. The main method calls 'factorial(5)'.
    2. Inside 'factorial(5)', it enters the else block and calculates '5 * factorial(4)'.
    3. Inside 'factorial(4)', it calculates '4 * factorial(3)'.
    4. Inside 'factorial(3)', it calculates '3 * factorial(2)'.
    5. Inside 'factorial(2)', it calculates '2 * factorial(1)'.
    6. Inside 'factorial(1)', it returns 1.
    7. Back in 'factorial(2)', it returns '2 * 1 = 2'.
    8. Back in 'factorial(3)', it returns '3 * 2 = 6'.
    9. Back in 'factorial(4)', it returns '4 * 6 = 24'.
    10. Finally, back in 'factorial(5)', it returns '5 * 24 = 120'.
    So, the factorial of 5 is calculated as 120, which is printed as the final result.
    */
}

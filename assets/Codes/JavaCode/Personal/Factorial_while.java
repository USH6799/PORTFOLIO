package Personal;
// Package declaration and import statement for Scanner class
// package Loops;
import java.util.Scanner;

// Class declaration for calculating factorial using a while loop
public class Factorial_while {
    
    // Main method where program execution begins
    public static void main(String[] args) {
        
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting user to enter a number
        System.out.println("Enter a number:");
        
        // Reading user input as the number for which factorial is to be calculated
        int n = sc.nextInt();
        
        // Variable to store the factorial, initialized to 1
        int fact = 1;
        
        // While loop to calculate factorial of the entered number
        // Loop continues until 'n' becomes 1
        while(n != 1){
            
            // Multiplying 'fact' with 'n'
            fact *= n;
            
            // Decrementing 'n' for the next iteration
            n--; 
        }
        
        // Displaying the result, i.e., the factorial of the entered number
        System.out.println("The Factorial of the number " + n + " is: " + fact);
        
        // Closing the Scanner object to prevent resource leak
        sc.close();

        // Dry Run Comments
        /*
        Let's say the user inputs 5:

        1. The program prompts the user to enter a number.
        2. User inputs 5.
        3. 'n' is assigned the value 5.
        4. 'fact' is initialized to 1.
        5. While loop iteration 1: fact = 1 * 5 = 5, n = 4.
        6. While loop iteration 2: fact = 5 * 4 = 20, n = 3.
        7. While loop iteration 3: fact = 20 * 3 = 60, n = 2.
        8. While loop iteration 4: fact = 60 * 2 = 120, n = 1.
        9. Loop ends.
        10. The program displays: "The Factorial of the number 1 is: 120".
        */
    }
}

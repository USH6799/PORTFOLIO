package Personal;
// Package declaration and import statement for Scanner class
// package Loops;
import java.util.Scanner;

// Class declaration for calculating factorial using a for loop
public class Factorial_for {

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

        // For loop to calculate factorial of the entered number
        // Loop starts from the entered number and iterates down to 1
        for(int i = n ; i >= 1 ; i--){
            
            // Multiplying 'fact' with each value of 'i' in reverse order
            fact *= i;
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
        5. Loop Iteration 1 (i = 5): 'fact' is multiplied by 5, resulting in fact = 1 * 5 = 5.
        6. Loop Iteration 2 (i = 4): 'fact' is multiplied by 4, resulting in fact = 5 * 4 = 20.
        7. Loop Iteration 3 (i = 3): 'fact' is multiplied by 3, resulting in fact = 20 * 3 = 60.
        8. Loop Iteration 4 (i = 2): 'fact' is multiplied by 2, resulting in fact = 60 * 2 = 120.
        9. Loop Iteration 5 (i = 1): 'fact' is multiplied by 1, resulting in fact = 120 * 1 = 120.
        10. Loop ends.
        11. The program displays: "The Factorial of the number 5 is: 120".
        */
    }
}

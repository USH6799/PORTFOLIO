// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class definition for Do_while
public class Do_while {
    // Main method
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        
        // Reading the user input
        int n = sc.nextInt();
        
        // Initializing a variable 'i' to 1
        int i = 1;
        
        // Do-while loop to print numbers from 1 to 'n'
        do {
            // Printing the value of 'i'
            System.out.println(i);
            
            // Incrementing the value of 'i'
            i++;
        } while (i <= n); // Loop continues until 'i' is less than or equal to 'n'
        
        // Closing the Scanner object to prevent resource leak
        sc.close();
    }
}

/*
 * Dry Run:
 * 
 * User is prompted to enter a number.
 * 
 * User enters the number.
 * 
 * The entered number is stored in the variable 'n'.
 * 
 * Variable 'i' is initialized to 1.
 * 
 * Do-while loop begins:
 *     - 'i' is printed.
 *     - 'i' is incremented.
 *     - Loop continues until 'i' is less than or equal to 'n'.
 * 
 * Loop ends after printing numbers from 1 to 'n'.
 * 
 * Scanner object is closed to prevent resource leak.
 */

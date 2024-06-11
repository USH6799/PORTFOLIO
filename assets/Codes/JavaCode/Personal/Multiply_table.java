package Personal;
// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class definition for Multiply_table
public class Multiply_table {
    // Main method
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        
        // Reading the user input
        int n = sc.nextInt();
        
        // Loop to generate the multiplication table for the entered number
        for (int i = 1; i <= 10; i++) {
            // Printing each multiplication operation in the format "n X i = n*i"
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
        
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
 * Loop runs from 1 to 10:
 *     - For each iteration, the current value of 'i' is multiplied by 'n'.
 *     - The multiplication result is printed in the format "n X i = n*i".
 * 
 * Loop ends after generating the multiplication table for the entered number.
 * 
 * Scanner object is closed to prevent resource leak.
 * 
 * 
 * Enter a number: 5
    5 X 1 = 5
    5 X 2 = 10
    5 X 3 = 15
    5 X 4 = 20
    5 X 5 = 25
    5 X 6 = 30
    5 X 7 = 35
    5 X 8 = 40
    5 X 9 = 45
    5 X 10 = 50

 */

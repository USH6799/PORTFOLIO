
// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class definition for pattern2
public class pattern2 {
    // Method to generate the pattern
    static void pattern(int n) {
        // Outer loop to iterate over rows
        for (int i = 0; i < n; i++) {
            // Inner loop to print asterisks for each row
            for (int j = n - 1; j >= i; j--) {
                System.out.print("* "); // Print asterisk followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
    
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n: ");
        int n = sc.nextInt(); // Reading the value of 'n' from the user
        pattern(n); // Calling the pattern method with 'n'
        sc.close(); // Closing the Scanner object to prevent resource leak
    }
}

/*
 * Dry Run:
 * 
 * User is prompted to enter the value of 'n'.
 * 
 * User enters the value of 'n'.
 * 
 * The pattern method is called with the value of 'n'.
 * 
 * Outer loop iterates over rows from 0 to 'n'-1:
 *     - Inner loop prints asterisks from 'n'-1 to 'i'.
 *     - Each asterisk is followed by a space.
 *     - After printing all asterisks for the row, move to the next line.
 * 
 * Pattern is printed based on the value of 'n'.
 * 
 * Scanner object is closed to prevent resource leak.
 */

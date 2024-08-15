package Patterns;
import java.util.Scanner;

public class number_pyramid {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Asking the user to input the length of the pyramid
        System.out.print("Enter The Length: ");
        int n = sc.nextInt();
        // n holds the number of rows for the pyramid

        // Loop for generating the number pyramid
        for (int i = 1; i <= n; i++) {
            // Printing spaces before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
                // Prints spaces to align the numbers in pyramid shape
            }

            // Printing the numbers in increasing order
            for (int j = 1; j <= i; j++) {
                // Printing the current row number followed by a space
                System.out.print(i + " ");
            }

            // Moving to the next line after completing the row
            System.out.println();
        }

        // Closing the Scanner object to release resources
        sc.close();
    }

    // Dry Run Example:
    // Assume the user inputs n = 4

    // First Row (i = 1):
    // Print spaces: 3 spaces
    // Print numbers: 1
    // Output: "   1 "

    // Second Row (i = 2):
    // Print spaces: 2 spaces
    // Print numbers: 2 2
    // Output: "  2 2 "

    // Third Row (i = 3):
    // Print spaces: 1 space
    // Print numbers: 3 3 3
    // Output: " 3 3 3 "

    // Fourth Row (i = 4):
    // Print spaces: 0 spaces
    // Print numbers: 4 4 4 4
    // Output: "4 4 4 4"

    // Final Output:
    //    1
    //   2 2
    //  3 3 3
    // 4 4 4 4
}

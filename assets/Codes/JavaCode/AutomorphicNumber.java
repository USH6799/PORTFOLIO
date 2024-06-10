import java.util.Scanner;
// Importing the Scanner class from the java.util package to take user input.

public class AutomorphicNumber {
    // Main class containing the main function.

    public static void main(String[] args) {
        // Main function to run the code.

        Scanner scanner = new Scanner(System.in);
        // Creating a Scanner object 'scanner' to read input from the user.

        // Prompt the user for input
        System.out.print("Enter a number: ");
        // Printing a message to prompt the user to enter a number.

        int number = scanner.nextInt();
        // Reading an integer input from the user and storing it in the variable 'number'.

        // Calculate the square of the number
        int square = number * number;
        // Calculating the square of the input number and storing it in the variable 'square'.

        // Convert both the number and its square to strings
        String numStr = Integer.toString(number);
        // Converting the integer 'number' to a string and storing it in 'numStr'.

        String squareStr = Integer.toString(square);
        // Converting the integer 'square' to a string and storing it in 'squareStr'.

        // Check if the square ends with the number
        if (squareStr.endsWith(numStr)) {
            // Checking if 'squareStr' ends with 'numStr'.
            // The endsWith method returns true if 'squareStr' ends with the sequence of characters in 'numStr'.

            System.out.println(number + " is an automorphic number.");
            // If the condition is true, print that the number is an automorphic number.
        } else {
            System.out.println(number + " is not an automorphic number.");
            // If the condition is false, print that the number is not an automorphic number.
        }

        // Close the scanner
        scanner.close();
        // Closing the Scanner object to free up resources.
    }
}

/*
Dry Run:

1. Program execution starts from the main method.
2. Scanner object 'scanner' is created to take user input.
3. Prompt message "Enter a number: " is displayed.
4. User enters a number, e.g., 5.
5. The input number 5 is read and stored in the variable 'number'.
6. The square of 5 is calculated: 5 * 5 = 25, and stored in the variable 'square'.
7. The number 5 is converted to a string "5" and stored in 'numStr'.
8. The square 25 is converted to a string "25" and stored in 'squareStr'.
9. The program checks if "25" ends with "5":
   - Since "25" does end with "5", the condition is true.
10. The message "5 is an automorphic number." is printed.

Example 2:
1. User enters a number, e.g., 6.
2. The input number 6 is read and stored in the variable 'number'.
3. The square of 6 is calculated: 6 * 6 = 36, and stored in the variable 'square'.
4. The number 6 is converted to a string "6" and stored in 'numStr'.
5. The square 36 is converted to a string "36" and stored in 'squareStr'.
6. The program checks if "36" ends with "6":
   - Since "36" does end with "6", the condition is true.
7. The message "6 is an automorphic number." is printed.

Example 3:
1. User enters a number, e.g., 7.
2. The input number 7 is read and stored in the variable 'number'.
3. The square of 7 is calculated: 7 * 7 = 49, and stored in the variable 'square'.
4. The number 7 is converted to a string "7" and stored in 'numStr'.
5. The square 49 is converted to a string "49" and stored in 'squareStr'.
6. The program checks if "49" ends with "7":
   - Since "49" does not end with "7", the condition is false.
7. The message "7 is not an automorphic number." is printed.
*/

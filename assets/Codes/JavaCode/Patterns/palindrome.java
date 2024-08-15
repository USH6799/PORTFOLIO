import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Asking the user to input a number
        int n = sc.nextInt();
        // n holds the number of rows for the palindrome pattern

        // Loop for generating palindrome pattern
        for (int i = 1; i <= n; i++) {
            // Printing spaces before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
                // Prints spaces to align the numbers in a centered pattern
            }

            // Printing numbers in decreasing order from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
                // Prints numbers decreasing from i down to 1
            }

            // Printing numbers in increasing order from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
                // Prints numbers increasing from 2 up to i
            }

            // Moving to the next line after completing the row
            System.out.println();
        }

        // Closing the Scanner object to release resources
        sc.close();
    }

    // Dry Run Example:
    // Assume the user inputs n = 5

    // First Row (i = 1):
    // Print spaces: 4 spaces
    // Print decreasing numbers: 1
    // Print increasing numbers: (none as i=1)
    // Output: "    1"

    // Second Row (i = 2):
    // Print spaces: 3 spaces
    // Print decreasing numbers: 2 1
    // Print increasing numbers: 2
    // Output: "   121"

    // Third Row (i = 3):
    // Print spaces: 2 spaces
    // Print decreasing numbers: 3 2 1
    // Print increasing numbers: 2 3
    // Output: "  32123"

    // Fourth Row (i = 4):
    // Print spaces: 1 space
    // Print decreasing numbers: 4 3 2 1
    // Print increasing numbers: 2 3 4
    // Output: " 4321234"

    // Fifth Row (i = 5):
    // Print spaces: 0 spaces
    // Print decreasing numbers: 5 4 3 2 1
    // Print increasing numbers: 2 3 4 5
    // Output: "543212345"

    // Final Output:
    //     1
    //    121
    //   32123
    //  4321234
    // 543212345
}

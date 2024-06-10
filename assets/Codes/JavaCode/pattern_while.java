// package Loops;
// This code defines a class named pattern_while

public class pattern_while {
    // Main method
    public static void main(String[] args) {
        // Variable n initialized to 4
        int n = 4;

        // Outer while loop iterating until n is greater than or equal to 1
        while (n >= 1) {
            // Variable i initialized to 1
            int i = 1;

            // Inner while loop iterating until i is less than or equal to n
            while (i <= n) {
                // Printing '*' for each iteration of inner loop
                System.out.print("*");

                // Incrementing i
                i++;
            }

            // Decrementing n for next iteration of outer loop
            n--;

            // Moving to the next line after each iteration of outer loop
            System.out.println();
        }
    }
}

// Output:
// ****
// ***
// **
// *


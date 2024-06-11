// package Loops;
// This code defines a class named pattern_for

public class pattern_for {
    // Main method
    public static void main(String[] args) {
        // Outer loop iterating from 1 to 4
        for (int i = 1; i < 5; i++) {
            // Inner loop iterating from 5 - i to 1
            for (int j = 5 - i; j >= 1; j--) {
                // Printing '*' for each iteration of the inner loop
                System.out.print("*");
            }
            // Moving to the next line after each row
            System.out.println();
        }
    }
}

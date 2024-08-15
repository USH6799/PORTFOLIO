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
                // Prints '*' characters based on the value of j
            }
            // Moving to the next line after each row
            System.out.println();
            // Prints a new line to separate each row of stars
        }
    }
}

//////////////////////////////////////////////////////////////////

/*
Dry Run Example:
Assume the outer loop variable i iterates from 1 to 4.

1. For i = 1:
    - Inner loop: j iterates from 4 to 1
    - Output: "****"

2. For i = 2:
    - Inner loop: j iterates from 3 to 1
    - Output: "***"

3. For i = 3:
    - Inner loop: j iterates from 2 to 1
    - Output: "**"

4. For i = 4:
    - Inner loop: j iterates from 1 to 1
    - Output: "*"

Final Output:
****
***
**
*
*/

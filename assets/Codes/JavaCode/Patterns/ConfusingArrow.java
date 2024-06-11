import java.util.Scanner;
// Imported Scanner class for taking input from user.

/**
 * ConfusingArrow
 */
public class ConfusingArrow {

    void EastWest() {
        // A custom created function 'EastWest()' taking no parameters, returning void (nothing) to the caller.
        
        for (int i = 1; i <= 5; i++) {
            // A for loop running from 1 to 5 to print rows.
            
            for (int j = 1; j <= 5 + i; j++) {
                // A nested for loop running from 1 to 5+i to print columns.

                if (i < 3 && j <= 5) {
                    // If the row index 'i' is less than 3 and column index 'j' is less than or equal to 5.
                    System.out.print("  ");
                    // Print two spaces without moving to the next line.
                } else {
                    // If the condition is not met, execute the else block.
                    System.out.print("< ");
                    // Print "< " without moving to the next line.
                }
            }
            System.out.println();
            // Move to the next line after the inner loop completes.
        }

        for (int i = 4; i >= 1; i--) {
            // A for loop running from 4 to 1 (decrementing) to print rows.

            for (int j = 5 + i; j >= 1; j--) {
                // A nested for loop running from 5+i to 1 (decrementing) to print columns.

                if (i < 3 && j > i) {
                    // If the row index 'i' is less than 3 and column index 'j' is greater than 'i'.
                    System.out.print("  ");
                    // Print two spaces without moving to the next line.
                } else {
                    // If the condition is not met, execute the else block.
                    System.out.print("< ");
                    // Print "< " without moving to the next line.
                }
            }
            System.out.println();
            // Move to the next line after the inner loop completes.
        }

    } // Custom function 'EastWest()' ends here.

    void WestEast() {
        // A custom created function 'WestEast()' taking no parameters, returning void (nothing) to the caller.
        
        for (int i = 1; i <= 5; i++) {
            // A for loop running from 1 to 5 to print rows.

            for (int j = 5; j > i; j--) {
                // A nested for loop running from 5 to i (decrementing) to print initial spaces.
                System.out.print("  ");
                // Print two spaces without moving to the next line.
            }

            for (int s = 1; s <= i; s++) {
                // Another nested for loop running from 1 to i to print '>'.
                System.out.print("> ");
                // Print "> " without moving to the next line.
            }

            for (int d = 1; d <= 5; d++) {
                // Another nested for loop running from 1 to 5 to print additional '>'.

                if (i < 3) {
                    // If the row index 'i' is less than 3.
                    System.out.print("  ");
                    // Print two spaces without moving to the next line.
                } else {
                    // If the condition is not met, execute the else block.
                    System.out.print("> ");
                    // Print "> " without moving to the next line.
                }
            }

            System.out.println();
            // Move to the next line after the inner loop completes.
        }

        for (int i = 4; i >= 1; i--) {
            // A for loop running from 4 to 1 (decrementing) to print rows.

            for (int s = 5; s > i; s--) {
                // A nested for loop running from 5 to i (decrementing) to print initial spaces.
                System.out.print("  ");
                // Print two spaces without moving to the next line.
            }

            for (int j = 1; j <= i; j++) {
                // Another nested for loop running from 1 to i to print '>'.
                System.out.print("> ");
                // Print "> " without moving to the next line.
            }

            for (int d = 1; d <= 5; d++) {
                // Another nested for loop running from 1 to 5 to print additional '>'.

                if (i < 3) {
                    // If the row index 'i' is less than 3.
                    System.out.print("  ");
                    // Print two spaces without moving to the next line.
                } else {
                    // If the condition is not met, execute the else block.
                    System.out.print("> ");
                    // Print "> " without moving to the next line.
                }
            }

            System.out.println();
            // Move to the next line after the inner loop completes.
        }
    } // Custom function 'WestEast()' ends here.

    void NorthSouth() {
        // A custom created function 'NorthSouth()' taking no parameters, returning void (nothing) to the caller.
        
        for (int i = 1; i <= 5; i++) {
            // A for loop running from 1 to 5 to print rows.

            for (int s = 1; s <= 5 - i; s++) {
                // A nested for loop running from 1 to 5-i to print initial spaces.
                System.out.print("   ");
                // Print three spaces without moving to the next line.
            }

            for (int j = 1; j <= i; j++) {
                // Another nested for loop running from 1 to i to print 'V'.
                System.out.print(" V ");
                // Print " V " without moving to the next line.
            }

            for (int j = 1; j < i; j++) {
                // Another nested for loop running from 1 to i-1 to print additional 'V'.
                System.out.print(" V ");
                // Print " V " without moving to the next line.
            }

            System.out.println();
            // Move to the next line after the inner loop completes.
        }

        for (int i = 1; i <= 5; i++) {
            // A for loop running from 1 to 5 to print rows.

            for (int j = 1; j <= 9; j++) {
                // A nested for loop running from 1 to 9 to print columns.

                if (j < 3 || j > 7) {
                    // If the column index 'j' is less than 3 or greater than 7.
                    System.out.print("   ");
                    // Print three spaces without moving to the next line.
                } else {
                    // If the condition is not met, execute the else block.
                    System.out.print(" V ");
                    // Print " V " without moving to the next line.
                }
            }

            System.out.println();
            // Move to the next line after the inner loop completes.
        }
    } // Custom function 'NorthSouth()' ends here.

    void SouthNorth() {
        // A custom created function 'SouthNorth()' taking no parameters, returning void (nothing) to the caller.
        
        for (int i = 1; i <= 5; i++) {
            // A for loop running from 1 to 5 to print rows.

            for (int j = 1; j <= 9; j++) {
                // A nested for loop running from 1 to 9 to print columns.

                if (j < 3 || j > 7) {
                    // If the column index 'j' is less than 3 or greater than 7.
                    System.out.print("   ");
                    // Print three spaces without moving to the next line.
                } else {
                    // If the condition is not met, execute the else block.
                    System.out.print(" ^ ");
                    // Print " ^ " without moving to the next line.
                }
            }

            System.out.println();
            // Move to the next line after the inner loop completes.
        }

        for (int i = 1; i <= 5; i++) {
            // A for loop running from 1 to 5 to print rows.

            for (int s = 1; s < i; s++) {
                // A nested for loop running from 1 to i-1 to print initial spaces.
                System.out.print("   ");
                // Print three spaces without moving to the next line.
            }

            for (int j = i; j <= 5; j++) {
                // Another nested for loop running from i to 5 to print '^'.
                System.out.print(" ^ ");
                // Print " ^ " without moving to the next line.
            }

            for (int d = 1; d <= 5 - i; d++) {
                // Another nested for loop running from 1 to 5-i to print additional '^'.
                System.out.print(" ^ ");
                // Print " ^ " without moving to the next line.
            }

            System.out.println();
            // Move to the next line after the inner loop completes.
        }
    } // Custom function 'SouthNorth()' ends here.

    public static void main(String[] args) {
        // Main function to run the code.

        Scanner sc = new Scanner(System.in);
        // Creating 'sc' object of Scanner class for taking input or running input functions.

        System.out.println("1st Pattern Below:\n");

        ConfusingArrow direction = new ConfusingArrow();
        // Creating an object 'direction' of Class ConfusingArrow to access the class methods and variables.

        direction.WestEast();
        // Accessing custom function 'WestEast()' of the main class 'ConfusingArrow' using the object 'direction'.

        System.out.println("\n2nd Pattern Below:\n");

        direction.EastWest();
        // Accessing custom function 'EastWest()' of the main class 'ConfusingArrow' using the object 'direction'.

        System.out.println("\n3rd Pattern Below:\n");

        direction.SouthNorth();
        // Accessing custom function 'SouthNorth()' of the main class 'ConfusingArrow' using the object 'direction'.

        System.out.println("\n4th Pattern Below:\n");

        direction.NorthSouth();
        // Accessing custom function 'NorthSouth()' of the main class 'ConfusingArrow' using the object 'direction'.

        sc.close();
        // Closing the object of Scanner class so no further input could be taken; Not necessary.
    }
}

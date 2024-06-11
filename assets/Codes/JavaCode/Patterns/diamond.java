package Patterns;
import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input the size of the diamond
        int n = sc.nextInt();

        // Printing the upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Printing spaces before the asterisks
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Printing the asterisks for the current row
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Moving to the next line after completing the row
            System.out.println();
        }

        // Printing the lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Printing spaces before the asterisks
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Printing the asterisks for the current row
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Moving to the next line after completing the row
            System.out.println();
        }

        // Closing the Scanner object to release resources
        sc.close();
    }
}

package Patterns;
import java.util.Scanner;

public class number_pyramid {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input the length of the pyramid
        System.out.print("Enter The Length: ");
        int n = sc.nextInt();

        // Loop for generating the number pyramid
        for (int i = 1; i <= n; i++) {
            // Printing spaces before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
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
}

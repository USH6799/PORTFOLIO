import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input a number
        int n = sc.nextInt();

        // Loop for generating palindrome pattern
        for (int i = 1; i <= n; i++) {
            // Printing spaces before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Printing numbers in decreasing order from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Printing numbers in increasing order from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // Moving to the next line after completing the row
            System.out.println();
        }

        // Closing the Scanner object to release resources
        sc.close();
    }
}

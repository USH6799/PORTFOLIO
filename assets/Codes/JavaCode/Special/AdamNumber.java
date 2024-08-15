import java.util.Scanner;

public class AdamNumber {
    int num, rev; // Variables to store the number and its reverse

    // Constructor to initialize variables
    AdamNumber() {
        num = 0;
        rev = 0;
    }

    // Method to read the number from the user
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = sc.nextInt(); // Store the user's input in num
        sc.close(); // Close the scanner
    }

    // Method to check if a number is prime
    boolean Prime() {
        boolean res = true; // Assume the number is prime

        // Loop to check divisibility by any number less than num
        for (int i = 2; i < num; i++) {
            if (num % i == 0) { // If divisible, it's not prime
                res = false;
                break;
            }
        }
        return res; // Return true if prime, false otherwise
    }

    // Method to reverse the digits of the number
    int Reverse() {
        int temp = num; // Temporary variable to hold num
        int val = 0; // Variable to store the reversed number

        // Loop to reverse the number
        while (temp != 0) {
            int digit = temp % 10; // Extract the last digit
            val = val * 10 + digit; // Append digit to the reversed number
            temp /= 10; // Remove the last digit from temp
        }

        return val; // Return the reversed number
    }

    // Method to check if the number and its reverse are both prime (Adam number)
    void Check() {
        if (Prime()) { // Check if the original number is prime
            num = Reverse(); // Reverse the number

            if (Prime()) { // Check if the reversed number is prime
                System.out.println("It is an Adam Number");
            } else {
                System.out.println("It is not an Adam Number");
            }
        } else {
            System.out.println("It is not an Adam Number");
        }
    }

    public static void main(String[] args) {
        AdamNumber obj = new AdamNumber(); // Create an object of AdamNumber

        obj.read(); // Read the number from the user
        obj.Check(); // Check if it's an Adam number
    }

    // Dry Run Example:
    // Input: 13
    // Step 1: Check if 13 is prime -> Yes
    // Step 2: Reverse 13 -> 31
    // Step 3: Check if 31 is prime -> Yes
    // Output: "It is an Adam Number"
    //
    // Input: 12
    // Step 1: Check if 12 is prime -> No
    // Output: "It is not an Adam Number"
}

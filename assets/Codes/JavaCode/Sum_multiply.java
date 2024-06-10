// package Loops;
// This code calculates the sum of the multiplication of a given number (n) with numbers from 1 to 10.

public class Sum_multiply {
    public static void main(String[] args) {
        // Initializing the number (n) and the sum
        int n = 8;
        int sum = 0;

        // Looping from 1 to 10 to calculate the sum of the multiplication
        for (int i = 1; i <= 10; i++) {
            // Adding the result of multiplying 'n' with 'i' to the sum
            sum += i * n;
        }

        // Printing the sum
        System.out.println(sum);
    }
}

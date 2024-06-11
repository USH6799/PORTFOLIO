package Special;
import java.util.Scanner;  // Importing the Scanner class to read input from the user

public class PrimeNumber {  // Declaring the class PrimeNumber

    public static void main(String[] args) {  // Main method, the entry point of the program

        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user

        System.out.print("Enter a number: ");  // Prompting the user to enter a number

        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'


        boolean isPrime = true;  // Variable to store if the number is prime


        // Checking if the number is prime
        if (num <= 1) {  // If the number is less than or equal to 1, it is not prime

            isPrime = false;  // Setting isPrime to false

        } else {

            // Loop to check for factors from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {  // If the number is divisible by any 'i', it is not prime

                    isPrime = false;  // Setting isPrime to false

                    break;  // Exiting the loop early

                }
            }
        }

        // Printing if the number is prime or not
        if (isPrime) {
            System.out.println(num + " is a prime number.");  // If true, print that the number is prime

        } else {
            System.out.println(num + " is not a prime number.");  // If false, print that the number is not prime

        }

        sc.close();  // Closing the Scanner object

    }
}

/*
Dry Run:
Input: 29

Step 1: Initialize Variables
num = 29
isPrime = true

Step 2: Check if num is less than or equal to 1
num (29) > 1 -> Continue to next step

Step 3: Check for factors from 2 to sqrt(29)
Loop Iteration 1: i = 2, 29 % 2 != 0 -> isPrime = true
Loop Iteration 2: i = 3, 29 % 3 != 0 -> isPrime = true
Loop Iteration 3: i = 4, 29 % 4 != 0 -> isPrime = true
Loop Iteration 4: i = 5, 29 % 5 != 0 -> isPrime = true
Loop terminates as i = 6 > sqrt(29) which is about 5.385

Step 4: Print if the number is prime
isPrime (true) -> 29 is a prime number.
*/

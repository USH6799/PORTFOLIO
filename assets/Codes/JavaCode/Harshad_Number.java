import java.util.Scanner;  // Importing the Scanner class to read input from the user

public class Harshad_Number {  // Declaring the class HarshadNumber

    public static void main(String[] args) {  // Main method, the entry point of the program

        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user

        System.out.print("Enter a number: ");  // Prompting the user to enter a number

        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'


        int sumOfDigits = 0;  // Variable to store the sum of the digits of the number

        int originalNum = num;  // Storing the original number to compare later


        // Loop to calculate the sum of the digits of the number
        while (num != 0) {  // Loop runs until 'num' becomes 0

            int digit = num % 10;  // Getting the last digit of the number

            sumOfDigits += digit;  // Adding the digit to 'sumOfDigits'

            num /= 10;  // Removing the last digit from 'num'

        }

        // Checking if the original number is divisible by the sum of its digits
        if (originalNum % sumOfDigits == 0) {
            System.out.println(originalNum + " is a Harshad number.");  // If true, print that the number is a Harshad number

        } else {
            System.out.println(originalNum + " is not a Harshad number.");  // If false, print that the number is not a Harshad number

        }

        sc.close();  // Closing the Scanner object

    }
}

/*
Dry Run:
Input: 18

Step 1: Initialize Variables
num = 18
originalNum = 18
sumOfDigits = 0

Step 2: Calculating the sum of the digits
Loop Iteration 1: digit = 8, sumOfDigits = 8, num = 1
Loop Iteration 2: digit = 1, sumOfDigits = 9, num = 0 (loop terminates)

Step 3: Check if the original number is divisible by the sum of its digits
originalNum (18) % sumOfDigits (9) == 0 -> 18 is a Harshad number.
*/

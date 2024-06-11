package Special;
import java.util.Scanner;  // Importing the Scanner class to read input from the user

public class Palindrome_Number {  // Declaring the class PalindromeNumber

    public static void main(String[] args) {  // Main method, the entry point of the program

        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user

        System.out.print("Enter a number: ");  // Prompting the user to enter a number

        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'

        int originalNum = num;  // Storing the original number to compare later

        int reversedNum = 0;  // Variable to store the reversed number

        // Loop to reverse the number
        while (num != 0) {  // Loop runs until 'num' becomes 0

            int digit = num % 10;  // Getting the last digit of the number

            reversedNum = reversedNum * 10 + digit;  // Appending the digit to 'reversedNum'

            num /= 10;  // Removing the last digit from 'num'

        }

        // Checking if the reversed number equals the original number
        if (reversedNum == originalNum) {

            System.out.println(originalNum + " is a palindrome.");  // If true, print that the number is a palindrome

        } else {

            System.out.println(originalNum + " is not a palindrome.");  // If false, print that the number is not a palindrome

        }

        sc.close();  // Closing the Scanner object

    }

}

/*
Dry Run:
Input: 121

Step 1: Initialize Variables
num = 121
originalNum = 121
reversedNum = 0

Step 2: Reversing the number
Loop Iteration 1: digit = 1, reversedNum = 1, num = 12
Loop Iteration 2: digit = 2, reversedNum = 12, num = 1
Loop Iteration 3: digit = 1, reversedNum = 121, num = 0 (loop terminates)

Step 3: Check if the reversed number equals the original number
reversedNum (121) == originalNum (121) -> 121 is a palindrome.
*/

package Special;
import java.util.HashSet;  // Importing HashSet class to store intermediate results
import java.util.Scanner;  // Importing Scanner class to read input from user

public class HappyNumber {  // Declaring the class HappyNumber

    public static void main(String[] args) {  // Main method, the entry point of the program

        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user

        System.out.print("Enter a number: ");  // Prompting the user to enter a number

        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'


        HashSet<Integer> seen = new HashSet<>();  // HashSet to store intermediate results

        int sum, digit;

        // Loop to check if the number is a happy number  
        while (num != 1 && !seen.contains(num)) {  // Loop until num becomes 1 or a cycle is detected

            seen.add(num);  // Adding num to HashSet 'seen'

            sum = 0;
            while (num > 0) {  // Loop to calculate the sum of squares of digits

                digit = num % 10;  // Extracting the last digit

                sum += digit * digit;  // Adding square of digit to sum

                num /= 10;  // Removing the last digit

            }
            num = sum;  // Updating num with the sum of squares of digits

        }

        // Checking if the number is a happy number
        if (num == 1) {
            System.out.println("The number is a Happy Number.");  // If true, print that the number is a Happy Number

        } else {
            System.out.println("The number is not a Happy Number.");  // If false, print that the number is not a Happy Number

        }

        sc.close();  // Closing the Scanner object

    }
}

/*
Dry Run:
Input: 19

Step 1: Initialize Variables
num = 19
seen = {}
sum = 0
digit = 0

Step 2: Loop until num becomes 1 or a cycle is detected
Iteration 1:
    seen = {19}
    sum = 1^2 + 9^2 = 82
    num = 82
Iteration 2:
    seen = {19, 82}
    sum = 8^2 + 2^2 = 68
    num = 68
Iteration 3:
    seen = {19, 82, 68}
    sum = 6^2 + 8^2 = 100
    num = 100
Iteration 4:
    seen = {19, 82, 68, 100}
    sum = 1^2 + 0^2 + 0^2 = 1
    num = 1

Since num is now 1, the number 19 is a Happy Number.
*/

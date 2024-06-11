package Special;
import java.util.Scanner;  // Importing Scanner class to read input from the user

public class AmicableNumber {  // Declaring the class AmicableNumbers

    // Function to calculate the sum of proper divisors of a number
    static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Function to check if two numbers are amicable
    static boolean areAmicable(int a, int b) {
        return sumOfDivisors(a) == b && sumOfDivisors(b) == a;
    }

    public static void main(String[] args) {  // Main method, the entry point of the program
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        System.out.print("Enter first number: ");  // Prompting the user to enter the first number
        int num1 = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num1'
        System.out.print("Enter second number: ");  // Prompting the user to enter the second number
        int num2 = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num2'

        // Checking if the numbers are amicable
        if (areAmicable(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are amicable numbers.");  // If true, print that the numbers are amicable
        } else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers.");  // If false, print that the numbers are not amicable
        }

        sc.close();  // Closing the Scanner object
    }
}

/*
Dry Run:
Input: 220, 284

Step 1: Calculate sum of proper divisors of 220
Divisors: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110
sum = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284

Step 2: Calculate sum of proper divisors of 284
Divisors: 1, 2, 4, 71, 142
sum = 1 + 2 + 4 + 71 + 142 = 220

Step 3: Check if sums are equal to the other number
sumOfDivisors(220) == 284 and sumOfDivisors(284) == 220

220 and 284 are amicable numbers.
*/

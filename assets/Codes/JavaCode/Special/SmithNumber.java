package Special;
import java.util.Scanner;  // Importing Scanner class to read input from the user

public class SmithNumber {  // Declaring the class SmithNumber

    static boolean isPrime(int n) {  // Function to check if a number is prime

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {  // Loop to check for divisors

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int sumOfDigits(int n) {  // Function to calculate the sum of digits of a number

        int sum = 0;
        while (n > 0) {
            sum += n % 10;  // Adding the last digit to sum

            n /= 10;  // Removing the last digit

        }
        return sum;
    }

    static int sumOfPrimeFactors(int n) {  // Function to calculate the sum of prime factors of a number

        int sum = 0;
        for (int i = 2; i <= n; i++) {  // Loop to find prime factors

            while (n % i == 0 && isPrime(i)) {
                sum += sumOfDigits(i);  // Adding sum of digits of prime factor to sum

                n /= i;  // Removing the prime factor

            }
        }
        return sum;
    }

    public static void main(String[] args) {  // Main method, the entry point of the program

        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user

        System.out.print("Enter a number: ");  // Prompting the user to enter a number

        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'


        int sumOfDigits = sumOfDigits(num);  // Calculating the sum of digits of the number

        int sumOfPrimeFactors = sumOfPrimeFactors(num);  // Calculating the sum of prime factors of the number


        // Checking if the number is a Smith number
        if (sumOfDigits == sumOfPrimeFactors) {
            System.out.println(num + " is a Smith number.");  // If true, print that the number is a Smith number

        } else {
            System.out.println(num + " is not a Smith number.");  // If false, print that the number is not a Smith number

        }

        sc.close();  // Closing the Scanner object

    }
}

/*
Dry Run:
Input: 666

Step 1: Calculate sum of digits
num = 666
sumOfDigits = 6 + 6 + 6 = 18

Step 2: Calculate sum of prime factors
num = 666
Prime Factors: 2, 3, 3, 37
sumOfPrimeFactors = sumOfDigits(2) + sumOfDigits(3) + sumOfDigits(3) + sumOfDigits(37) = 2 + 3 + 3 + (3 + 7) = 18

Since sumOfDigits == sumOfPrimeFactors, 666 is a Smith number.
*/

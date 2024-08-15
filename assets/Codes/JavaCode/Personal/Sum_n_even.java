package Personal;
// package Loops;

import java.util.Scanner;

public class Sum_n_even {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Scanner object 'sc' is used to take input from the user

        // Asking the user to input the value of 'n'
        int n = sc.nextInt();
        // 'n' is the number of even numbers for which the sum will be calculated

        // Initializing variables for loop and sum calculation
        int i = 0;  // Variable 'i' to track the count of even numbers
        int sum = 0;  // Variable to accumulate the sum of even numbers

        // Looping to calculate the sum of the first 'n' even numbers
        while (i < n) {  // Loop will run until 'i' is less than 'n'
            // Multiplying 'i' by 2 to get even numbers, and adding it to the sum
            sum += i * 2;
            // For each iteration, 'i * 2' gives the next even number, which is added to 'sum'
            
            i++;  // Increment 'i' to move to the next even number
        }

        // Printing the sum of the first 'n' even numbers
        System.out.println("The Sum Of First N Even Numbers are: " + sum);
        // Outputs the final calculated sum of even numbers

        // Closing the Scanner object to release resources
        sc.close();
        // Closing the Scanner object to avoid resource leaks
    }
}

/*
Dry Run Example:
Let's assume the user inputs n = 5.

1. Initialize i = 0 and sum = 0.

2. For i = 0:
   - Even number: 0 * 2 = 0
   - Sum after addition: sum = 0 + 0 = 0

3. For i = 1:
   - Even number: 1 * 2 = 2
   - Sum after addition: sum = 0 + 2 = 2

4. For i = 2:
   - Even number: 2 * 2 = 4
   - Sum after addition: sum = 2 + 4 = 6

5. For i = 3:
   - Even number: 3 * 2 = 6
   - Sum after addition: sum = 6 + 6 = 12

6. For i = 4:
   - Even number: 4 * 2 = 8
   - Sum after addition: sum = 12 + 8 = 20

Loop ends when i reaches 5 (i < 5 is false).

Final Output:
The Sum Of First N Even Numbers are: 20
*/

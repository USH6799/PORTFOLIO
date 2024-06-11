package Recursion;
import java.util.Scanner;

public class Recursive_SumofNatural {

    // Custom function to calculate the sum of natural numbers using recursion
    static int sum_of_n(int n){

        // Base case: If n reaches 0, return 0
        if(n == 0){
            return 0;
        }

        // Recursive call to sum_of_n function with n - 1, adding current value of n
        int sum = n + sum_of_n(n - 1);
        return sum;
    }

    public static void main(String[] args) {

        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter the Number: ");

        // Reading the input number provided by the user
        int n = sc.nextInt();

        // Calling the sum_of_n function to calculate the sum of natural numbers up to n
        int total = sum_of_n(n);

        // Displaying the total sum
        System.out.println(total);

        // Closing the scanner object to prevent resource leak
        sc.close();
    }
}

/*
DRY RUN:
---------
Example: If user enters 4

1. The program prompts the user to enter a number.
2. The user enters 4.
3. The main function reads the entered number (4).
4. The main function calls the sum_of_n function with the value of 'n' as 4.
5. Inside the sum_of_n function:
    - It checks if 'n' is equal to 0. Since it's not, it proceeds to the next step.
6. It makes a recursive call to the sum_of_n function with 'n - 1', i.e., 3.
7. Inside the recursive call (n = 3):
    - It checks if 'n' is equal to 0. Since it's not, it proceeds to the next step.
8. It makes another recursive call to the sum_of_n function with 'n - 1', i.e., 2.
9. Inside the recursive call (n = 2):
    - It checks if 'n' is equal to 0. Since it's not, it proceeds to the next step.
10. It makes another recursive call to the sum_of_n function with 'n - 1', i.e., 1.
11. Inside the recursive call (n = 1):
    - It checks if 'n' is equal to 0. Since it's not, it proceeds to the next step.
12. It makes another recursive call to the sum_of_n function with 'n - 1', i.e., 0.
13. Inside the recursive call (n = 0):
    - It checks if 'n' is equal to 0. Since it is, the base case is satisfied, and it returns 0.
    - The sum of 1 and 0 is calculated and returned.
    - The sum of 2 and 1 is calculated and returned.
    - The sum of 3 and 3 is calculated and returned.
    - The sum of 4 and 6 is calculated and returned.
14. The total sum (10) is returned to the main function.
15. Finally, the total sum (10) is displayed.
*/

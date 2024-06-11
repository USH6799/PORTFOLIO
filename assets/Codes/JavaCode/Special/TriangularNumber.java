package Special;
import java.util.Scanner;  // Importing Scanner class to read input from the user

public class TriangularNumber {  // Declaring the class TriangularNumber

    // Function to check if a number is a triangular number
    static boolean isTriangular(int n) {
        int sum = 0;
        for (int i = 1; sum <= n; i++) {
            sum += i;
            if (sum == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter a number: ");  // Prompting the user to enter a number
        
        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'
        

        // Checking if the number is a triangular number
        
        if (isTriangular(num)) {
            System.out.println(num + " is a triangular number.");  // If true, print that the number is a triangular number
            
        } else {
            System.out.println(num + " is not a triangular number.");  // If false, print that the number is not a triangular number
            
        }

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 6

Step 1: Check if sum of integers from 1 equals the number
sum = 0
i = 1: sum = 0 + 1 = 1
i = 2: sum = 1 + 2 = 3
i = 3: sum = 3 + 3 = 6 (matches input number)

6 is a triangular number.
*/

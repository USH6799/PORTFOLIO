import java.util.Scanner;  // Importing Scanner class to read input from the user

public class AbundantNumber {  // Declaring the class AbundantNumber

    static boolean isAbundant(int n) {  // Function to check if a number is abundant
        
        int sum = 0;  // Initializing sum to store the sum of divisors
        

        for (int i = 1; i <= n / 2; i++) {  // Loop to find divisors of 'n'
        
            if (n % i == 0) {  // If 'i' is a divisor of 'n'
            
                sum += i;  // Add 'i' to the sum of divisors
                
            }
        }

        return sum > n;  // Return true if sum of divisors is greater than 'n', else return false
        
    }

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter a number: ");  // Prompting the user to enter a number
        
        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'
        

        // Checking if the number is abundant
        
        if (isAbundant(num)) {
            System.out.println(num + " is an abundant number.");  // If true, print that the number is abundant
            
        } else {
            System.out.println(num + " is not an abundant number.");  // If false, print that the number is not abundant
            
        }

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 12

Step 1: Find divisors of 12
Divisors: 1, 2, 3, 4, 6

Step 2: Calculate sum of divisors
sum = 1 + 2 + 3 + 4 + 6 = 16

Step 3: Check if sum of divisors (16) is greater than the number (12)
16 > 12, so 12 is an abundant number.
*/

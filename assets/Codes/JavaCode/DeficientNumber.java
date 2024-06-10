import java.util.Scanner;  // Importing Scanner class to read input from the user

public class DeficientNumber {  // Declaring the class DeficientNumber

    static boolean isDeficient(int n) {  // Function to check if a number is a deficient number
        
        int sum = 0;  // Initializing sum to store the sum of proper divisors
        
        for (int i = 1; i <= n / 2; i++) {  // Loop to find all proper divisors
            
            if (n % i == 0) {  // If 'i' is a proper divisor, add it to sum
            
                sum += i;
            }
        }
        return sum < n;  // Return true if sum of proper divisors is less than the number itself, else return false
        
    }

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter a number: ");  // Prompting the user to enter a number
        
        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'
        

        // Checking if the number is a deficient number
        
        if (isDeficient(num)) {
            System.out.println(num + " is a deficient number.");  // If true, print that the number is a deficient number
            
        } else {
            System.out.println(num + " is not a deficient number.");  // If false, print that the number is not a deficient number
            
        }

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 15

Step 1: Find sum of proper divisors
Divisors: 1, 3, 5
sum = 1 + 3 + 5 = 9

Step 2: Check if sum of proper divisors is less than the number
9 < 15, so 15 is a deficient number.
*/

package Special;
import java.util.Scanner;  // Importing Scanner class to read input from the user

public class PentagonalNumber {  // Declaring the class PentagonalNumber

    // Function to check if a number is a pentagonal number
    static boolean isPentagonal(int n) {
        for (int i = 1; ; i++) {
            int p = (i * (3 * i - 1)) / 2;
            if (p == n) {
                return true;
            } else if (p > n) {
                return false;
            }
        }
    }

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter a number: ");  // Prompting the user to enter a number
        
        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'
        

        // Checking if the number is a pentagonal number
        
        if (isPentagonal(num)) {
            System.out.println(num + " is a pentagonal number.");  // If true, print that the number is a pentagonal number
            
        } else {
            System.out.println(num + " is not a pentagonal number.");  // If false, print that the number is not a pentagonal number
            
        }

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 12

Step 1: Check if the number can be expressed as i*(3*i - 1)/2
i = 1: p = 1 * (3 * 1 - 1) / 2 = 1
i = 2: p = 2 * (3 * 2 - 1) / 2 = 5
i = 3: p = 3 * (3 * 3 - 1) / 2 = 12 (matches input number)

12 is a pentagonal number.
*/

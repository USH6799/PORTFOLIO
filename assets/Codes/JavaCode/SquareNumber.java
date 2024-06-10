import java.util.Scanner;  // Importing Scanner class to read input from the user

public class SquareNumber {  // Declaring the class SquareNumber

    // Function to check if a number is a square number
    static boolean isSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter a number: ");  // Prompting the user to enter a number
        
        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'
        

        // Checking if the number is a square number
        
        if (isSquare(num)) {
            System.out.println(num + " is a square number.");  // If true, print that the number is a square number
            
        } else {
            System.out.println(num + " is not a square number.");  // If false, print that the number is not a square number
            
        }

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 16

Step 1: Calculate the integer square root of 16
sqrt = 4

Step 2: Check if the square of the square root equals the original number
4 * 4 == 16

16 is a square number.
*/

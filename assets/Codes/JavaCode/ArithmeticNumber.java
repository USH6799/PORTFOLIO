import java.util.Scanner;  // Importing Scanner class to read input from the user

public class ArithmeticNumber {  // Declaring the class ArithmeticNumber

    // Function to check if a number is an arithmetic number
    static boolean isArithmetic(int n) {
        int digitSum = 0;
        int temp = n;

        // Calculating the sum of digits of the number
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }

        // Checking if the number is divisible by the sum of its digits
        return n % digitSum == 0;
    }

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter a number: ");  // Prompting the user to enter a number
        
        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'
        

        // Checking if the number is an arithmetic number
        
        if (isArithmetic(num)) {
            System.out.println(num + " is an arithmetic number.");  // If true, print that the number is an arithmetic number
            
        } else {
            System.out.println(num + " is not an arithmetic number.");  // If false, print that the number is not an arithmetic number
            
        }

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 18

Step 1: Calculate the sum of digits of the number
digitSum = 0
temp = 18

digitSum = 0 + 8 = 8
temp = 1

digitSum = 8 + 1 = 9
temp = 0

Step 2: Check if the number is divisible by the sum of its digits
18 % 9 = 0 (remainder is 0)

18 is an arithmetic number.
*/

import java.util.Scanner;  // Importing Scanner class to read input from the user

public class LucasNumber {  // Declaring the class LucasNumber

    // Function to find the nth Lucas number
    static int lucas(int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        return lucas(n - 1) + lucas(n - 2);
    }

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter a number: ");  // Prompting the user to enter a number
        
        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'
        

        // Finding and printing the nth Lucas number
        
        System.out.println("The " + num + "th Lucas number is: " + lucas(num));

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 5

Step 1: Calculate the 5th Lucas number
lucas(5) = lucas(4) + lucas(3)
lucas(4) = lucas(3) + lucas(2)
lucas(3) = lucas(2) + lucas(1)
lucas(2) = lucas(1) + lucas(0)
lucas(1) = 1
lucas(0) = 2

lucas(2) = 1 + 2 = 3
lucas(3) = 3 + 1 = 4
lucas(4) = 4 + 3 = 7
lucas(5) = 7 + 4 = 11

The 5th Lucas number is: 11
*/

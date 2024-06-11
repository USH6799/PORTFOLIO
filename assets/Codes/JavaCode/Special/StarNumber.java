package Special;
import java.util.Scanner;  // Importing Scanner class to read input from the user

public class StarNumber {  // Declaring the class StarNumber

    // Function to check if a number is a star number
    static boolean isStarNumber(int n) {
        for (int i = 1; ; i++) {
            int s = 6 * i * (i - 1) + 1;
            if (s == n) {
                return true;
            } else if (s > n) {
                return false;
            }
        }
    }

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter a number: ");  // Prompting the user to enter a number
        
        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'
        

        // Checking if the number is a star number
        
        if (isStarNumber(num)) {
            System.out.println(num + " is a star number.");  // If true, print that the number is a star number
            
        } else {
            System.out.println(num + " is not a star number.");  // If false, print that the number is not a star number
            
        }

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 37

Step 1: Check if the number can be expressed as 6*i*(i - 1) + 1
i = 1: s = 6 * 1 * (1 - 1) + 1 = 1
i = 2: s = 6 * 2 * (2 - 1) + 1 = 13
i = 3: s = 6 * 3 * (3 - 1) + 1 = 37 (matches input number)

37 is a star number.
*/

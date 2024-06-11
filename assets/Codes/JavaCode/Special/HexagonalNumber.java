package Special;
import java.util.Scanner;  // Importing Scanner class to read input from the user

public class HexagonalNumber {  // Declaring the class HexagonalNumber

    // Function to check if a number is a hexagonal number
    static boolean isHexagonal(int n) {
        for (int i = 1; ; i++) {
            int h = i * (2 * i - 1);
            if (h == n) {
                return true;
            } else if (h > n) {
                return false;
            }
        }
    }

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter a number: ");  // Prompting the user to enter a number
        
        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'
        

        // Checking if the number is a hexagonal number
        
        if (isHexagonal(num)) {
            System.out.println(num + " is a hexagonal number.");  // If true, print that the number is a hexagonal number
            
        } else {
            System.out.println(num + " is not a hexagonal number.");  // If false, print that the number is not a hexagonal number
            
        }

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 15

Step 1: Check if the number can be expressed as i*(2*i - 1)
i = 1: h = 1 * (2 * 1 - 1) = 1
i = 2: h = 2 * (2 * 2 - 1) = 6
i = 3: h = 3 * (2 * 3 - 1) = 15 (matches input number)

15 is a hexagonal number.
*/

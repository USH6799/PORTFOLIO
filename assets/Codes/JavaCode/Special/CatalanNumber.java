package Special;
import java.util.Scanner;  // Importing Scanner class to read input from the user

public class CatalanNumber {  // Declaring the class CatalanNumber

    // Function to find the nth Catalan number
    static int catalan(int n) {
        if (n <= 1) {
            return 1;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter a number: ");  // Prompting the user to enter a number
        
        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'
        

        // Finding and printing the nth Catalan number
        
        System.out.println("The " + num + "th Catalan number is: " + catalan(num));

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 4

Step 1: Calculate the 4th Catalan number
catalan(4) = catalan(0) * catalan(3) + catalan(1) * catalan(2) + catalan(2) * catalan(1) + catalan(3) * catalan(0)
= 1 * 5 + 1 * 2 + 2 * 1 + 5 * 1
= 5 + 2 + 2 + 5
= 14

The 4th Catalan number is: 14
*/

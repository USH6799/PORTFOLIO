import java.util.Scanner;  // Importing Scanner class to read input from the user

public class TetrahedralNumber {  // Declaring the class TetrahedralNumber

    // Function to check if a number is a tetrahedral number
    static boolean isTetrahedral(int n) {
        int sum = 0;
        for (int i = 1; sum <= n; i++) {
            sum += (i * (i + 1)) / 2;
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
        

        // Checking if the number is a tetrahedral number
        
        if (isTetrahedral(num)) {
            System.out.println(num + " is a tetrahedral number.");  // If true, print that the number is a tetrahedral number
            
        } else {
            System.out.println(num + " is not a tetrahedral number.");  // If false, print that the number is not a tetrahedral number
            
        }

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 10

Step 1: Check if the number can be expressed as sum of first i triangular numbers
sum = 0
i = 1: sum = 0 + 1 = 1
i = 2: sum = 1 + 3 = 4
i = 3: sum = 4 + 6 = 10 (matches input number)

10 is a tetrahedral number.
*/

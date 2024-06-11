package Special;
import java.util.Scanner;  // Importing Scanner class to read input from the user

public class CubeNumber {  // Declaring the class CubeNumber

    // Function to check if a number is a cube number
    static boolean isCube(int n) {
        int cbrt = (int) Math.cbrt(n);
        return cbrt * cbrt * cbrt == n;
    }

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter a number: ");  // Prompting the user to enter a number
        
        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'
        

        // Checking if the number is a cube number
        
        if (isCube(num)) {
            System.out.println(num + " is a cube number.");  // If true, print that the number is a cube number
            
        } else {
            System.out.println(num + " is not a cube number.");  // If false, print that the number is not a cube number
            
        }

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 27

Step 1: Calculate the integer cube root of 27
cbrt = 3

Step 2: Check if the cube of the cube root equals the original number
3 * 3 * 3 == 27

27 is a cube number.
*/

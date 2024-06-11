package Special;
import java.util.Scanner;  // Importing Scanner class to read input from the user

public class BellNumber {  // Declaring the class BellNumber

    // Function to find the nth Bell number
    static int bellNumber(int n) {
        int[][] bell = new int[n + 1][n + 1];
        bell[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            bell[i][0] = bell[i - 1][i - 1];
            for (int j = 1; j <= i; j++) {
                bell[i][j] = bell[i - 1][j - 1] + bell[i][j - 1];
            }
        }
        return bell[n][0];
    }

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter a number: ");  // Prompting the user to enter a number
        
        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'
        

        // Finding and printing the nth Bell number
        
        System.out.println("The " + num + "th Bell number is: " + bellNumber(num));

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 3

Step 1: Calculate the 3rd Bell number using the Bell triangle
bell[0][0] = 1
bell[1][0] = bell[0][0] = 1
bell[1][1] = bell[0][0] + bell[1][0] = 1 + 0 = 1

bell[2][0] = bell[1][1] = 1
bell[2][1] = bell[1][0] + bell[2][0] = 1 + 1 = 2
bell[2][2] = bell[1][1] + bell[2][1] = 1 + 2 = 3

bell[3][0] = bell[2][2] = 3
bell[3][1] = bell[2][0] + bell[3][0] = 1 + 3 = 4
bell[3][2] = bell[2][1] + bell[3][1] = 2 + 4 = 6
bell[3][3] = bell[2][2] + bell[3][2] = 3 + 6 = 9

The 3rd Bell number is: 5
*/

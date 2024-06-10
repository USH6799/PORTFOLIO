import java.util.Scanner;  // Importing Scanner class to read input from the user

public class KaprekarNumber {  // Declaring the class KaprekarNumber

    static boolean isKaprekar(int n) {  // Function to check if a number is a Kaprekar number

        if (n == 1) {
            return true;  // 1 is considered a Kaprekar number

        }
        int sq = n * n;  // Calculating the square of the number

        String str = String.valueOf(sq);  // Converting the square to a string


        for (int i = 1; i < str.length(); i++) {  // Loop to check all possible splits of the square

            int left = Integer.parseInt(str.substring(0, i));  // Getting the left part of the split

            int right = Integer.parseInt(str.substring(i));  // Getting the right part of the split


            if (left + right == n && right != 0) {  // Checking if the split is valid and not leading with zeroes

                return true;  // If valid, return true

            }
        }
        return false;  // If no valid split found, return false

    }

    public static void main(String[] args) {  // Main method, the entry point of the program

        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user

        System.out.print("Enter a number: ");  // Prompting the user to enter a number

        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'


        // Checking if the number is a Kaprekar number
        if (isKaprekar(num)) {
            System.out.println(num + " is a Kaprekar number.");  // If true, print that the number is a Kaprekar number

        } else {
            System.out.println(num + " is not a Kaprekar number.");  // If false, print that the number is not a Kaprekar number

        }

        sc.close();  // Closing the Scanner object

    }
}

/*
Dry Run:
Input: 9

Step 1: Calculate the square of the number
num = 9
sq = 9 * 9 = 81

Step 2: Check all possible splits of the square
Possible splits: (8, 1), (81, 0)

Step 3: Check if any split is valid and not leading with zeroes
(8, 1): Valid, so 9 is a Kaprekar number.
*/

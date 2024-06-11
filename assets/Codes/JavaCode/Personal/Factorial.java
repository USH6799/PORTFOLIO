package Personal;
import java.util.Scanner;
// imported scanner class for taking input from user.

public class Factorial{
    // classname Factorial

    static void factorial(int n,int org){
         // A custom Created fnc 'factorial(n,org)' taking 2 parameters 'n' and 'org' of datatype Integer, returning void(nothing) to the Caller.

         // Integer Datatype because it doesn't contain any floating/decimal values.

        int fact = 1;
        // A varible 'fact' intitialized as 1 of datatype Integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        while(n > 1){
            // A while loop running till the condition is true.

            // condition: Is value of var 'n' is greater than 1.

            fact = fact * n;
            // Multipling the value of var 'fact' with the value of var 'n' and storing the answer in var 'fact'.

            n--;
            // Decrementing the value of var 'n' by 1, or n = n - 1

        }// While loop ends here.
        
        System.out.println("The Factorial of " + org + " was: " + fact);
        // Printing the factorial of var 'org' .

    }// Custom fnc 'factorial(n , org)' ends here.

    public static void main(String[]args){
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        System.out.print("Enter The Number: ");
        // Asking for the number from the user to find its factorial.

        int num = sc.nextInt();
        // Storing the input from user in var 'num' of datatype Integer.

        factorial(num , num);
        // Calling the custom fnc 'factorial(n,org)' and passing two arguments 'num' and 'num' in which value of var 'n' will be stored in var 'n' and the value of another argument will be stored in var 'org' as parameters inside the fnc. 

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.

// Dry Run Explanation:

// Step 1: Importing Scanner class for user input.
// import java.util.Scanner;

// Step 2: Declaring the Factorial class.
// public class Factorial {

// Step 3: Defining the factorial method to calculate factorial of a number.
// static void factorial(int n,int org) {
// Inside factorial method:
// n = user_input (from step 5)
// org = user_input (from step 5)

// Step 4: Asking user to enter a number.
// System.out.print("Enter The Number: ");
// Input: 5

// Step 5: Taking user input for the number.
// int num = sc.nextInt();
// num = 5

// Step 6: Calling the factorial method with user input as arguments.
// factorial(num , num);
// Inside factorial method:
// n = 5
// org = 5
// Inside while loop:
// fact = 1
// fact = 1 * 5 = 5
// fact = 5 * 4 = 20
// fact = 20 * 3 = 60
// fact = 60 * 2 = 120
// fact = 120 * 1 = 120
// Print: "The Factorial of 5 was: 120"

// Step 7: Closing the Scanner object.
// sc.close();

// End of program.

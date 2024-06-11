package Special;
import java.util.Scanner;
// imported scanner class for taking input from user.

public class Special2Digit {
    // classname Special2Digit

    public static void main(String[] args) {
        // main fnc to run the code.
        
        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        System.out.print("Enter the Number: ");
        // Asking the user for the Number to check whether it is a special 2 digit no. or not.

        int num = sc.nextInt();
        // Taking input from user and storing it in variable 'num' of datatype integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        int temp = num;
        // Variable 'temp' storing the value of var 'num'. Of datatype integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        int sum = 0;
        // variable 'sum' of datatype integer, with inital value as 0.

        // Integer Datatype because it doesn't contain any floating/decimal values.
        
        int product = 1;
        // variable 'product' of datatype integer, with inital value as 1. Because any number multiplied with 0 becomes 0.
        
        // Integer Datatype because it doesn't contain any floating/decimal values.

        while(temp != 0){
            // A while loop running till the condition is true.

            //condition:- the value in var 'temp' is not equal to 0. 

            int digit = temp % 10;
            // Storing the value of eqn in variable 'digit' of Datatype integer.

            // temp % 10 returns the remainder when value of var 'temp' is divided by 10.

            // ex:- let temp = 27 , temp/10 => 27/10 returns 2 and the remainder was 7 which is stored in var 'digit' , or temp % 10 returns 7.

            // Integer Datatype because it doesn't contain any floating/decimal values.

            sum += digit;
            // sum += digit => sum = sum + digit , adding the value of var 'digit' in the var 'sum'.

            // ex:- let initial value of 'sum' be 4. sum = 4 and value of var 'digit' = 7 . Then sum = sum + digit means sum = 4 + 7. and then the value of sum becomes 11.

            product *= digit;
            // product *= digit => product = product * digit , Mulitiplying the value of var 'digit' in the var 'product'.

            // ex:- let initial value of 'product' be 4. product = 4 and value of var 'digit' = 7 . Then product = product * digit means product = 4 * 7. and then the value of product becomes 28.

            temp /= 10;
            // temp /= digit => temp = temp / digit , dividing the value of temp by 10 in the var 'temp'.

            // ex:- temp = 27 then the new value of temp will be temp = temp / 10 , temp = 27 / 10 and it returns 2 as the new value of var 'temp'.

        }// While loop ends here.

        if (sum + product == num) {
            // if condition checking a condition, if the condition is true then if code will execute and if the condition is false else code will execute.

            // condition:- if the total of value of var 'sum' and var 'product' is eqqal to the original number inputed by user in var 'num' are equal then the condition is true.

            System.out.println(num + " is a Special Two Digit Number.");
            // runs if the above condition is true, Printing that the number inputed by user is a special 2-digit Number.
            
        }// if code ends here.

        else{
            // runs if the condition mentioned above is False.

            System.out.println("It is not a Special Two Digit Number.");
            // runs if the above condition is false, Printing that the number inputed by user is not a special 2-digit Number.

        }// else code ends here.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.

/*
 * DRY RUN, 
 * 
 * A special 2 Digit Number is a number whose total of sum of digit and product of digit is equal tot he original number.
 * 
 * Ex:- 59
 *      digits are 5 and 9.
 *      sum of digits = 5 + 9 = 14 .
 *      product of digits = 5 * 9 = 45.
 * 
 *      14 + 45 = 59 hence 59 is a special 2 digit number.
 * 
 * 
 * let the number inputed by user be 59.
 * 
 * Then, the value stored in var 'num' will be 59 , num = 59
 * 
 * Next, the value of var 'temp' becomes the value of var 'num' means, temp = 59
 * 
 * value of var 'sum' = 0 .
 * 
 * value of var 'product' = 1.
 * 
 * Entering While Loop, Checking Condition(temp != 0) => (59 != 0) it returns true.
 * 
 * 1st Iteration of While Loop,
 * 
 * the value of var 'digit' will become (temp % 10) => (59 % 10) and it returns 9 (remainder).
 * 
 * The value of var 'digit' = 9.
 * 
 * The value of var 'sum' becomes (sum + digit) => (0 + 9) => 9 .
 * 
 * the Value stored in var 'sum' = 9
 * 
 * The value of var 'digit' is still same = 9.
 * 
 * The value of var 'product' becomes (product + digit) => (1 * 9) => 9 .
 * 
 * the Value stored in var 'product' = 9
 * 
 * The value of var 'temp' becomes (temp / 10) => (59 / 10) => 5(quotient) .
 * 
 * the value of var 'temp' = 5.
 * 
 * 1st Iteration of While Loop Ends.
 * 
 * Entering While Loop Again, Checking Condition(temp != 0) => (5 != 0) it returns true.
 * 
 * 2nd Iteration of While Loop,
 * 
 * the value of var 'digit' will become (temp % 10) => (5 % 10) and it returns 5 (remainder).
 * 
 * The value of var 'digit' = 5.
 * 
 * The value of var 'sum' becomes (sum + digit) => (9 + 5) => 14 .
 * 
 * the Value stored in var 'sum' = 14
 * 
 * The value of var 'digit' is still same = 5.
 * 
 * The value of var 'product' becomes (product + digit) => (9 * 5) => 45 .
 * 
 * the Value stored in var 'product' = 45
 * 
 * The value of var 'temp' becomes (temp / 10) => (5 / 10) => 0(quotient) .
 * 
 * the value of var 'temp' = 0.
 * 
 * 2nd Iteration of While Loop Ends.
 * 
 * Entering While Loop Again, Checking Condition(temp != 0) => (0 != 0) it returns False.
 * 
 * While Loop ends...
 * 
 * checking if statement condition: (sum + product) = num.
 * 
 * sum = 14.
 * product = 45.
 * num = 59.
 * 
 * (14 + 45) = 59
 * 
 *    59    =    59 , returns true.
 * 
 * If the condition is true, then the if code will run,
 * 
 * prints that the 59 is a special 2 digit number.
 * 
 *  
 */
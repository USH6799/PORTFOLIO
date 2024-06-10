import java.util.Scanner;
// imported scanner class for taking input from user.

public class Special_Factorial_digit {
    // classname Special_Factorial_digit

    static int fact(int n){
         // A custom Created fnc 'fact' taking 1 parameter 'n' of datatype Integer, returning integer value to the Caller.

        int total = 1;
        // A varible 'total' storing value as 1.

        for(int i = 1 ; i <= n ; i++){
            // A for loop running on the var 'i' where var 'i' iterates from 1 to n.

            // Means 'i' iterates as: [1 , 2 , 3 , 4 , 5 , 6 , ... , n]

            total = total * i;
            // Multipling the Value of var 'total' with the value of var 'i' and storing the result in var 'total'.

            // Ex:- let total = 2 and i = 3, then total = total * i means, total = 2 * 3. Then the New Value of var 'total' becomes 6.

        }// For loop ends here.

        return total;
        // Returning the value of var 'total' to the Caller of the function.

    }// Custom fnc 'fact' ends here

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        System.out.print("Enter the Number: ");
        // Asking the user to enter the number to check whether it is a Special Number or Not.

        int num = sc.nextInt();
        // Storing the number inputed by user in the variable 'num' of datatype Integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        int temp = num;
         // Variable 'temp' storing the value of var 'num'. Of datatype integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        int sum = 0;
        // Variable 'sum' with initial values as 0 of Datatype Integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.


        while(temp != 0){
            // A while loop running till the condition is true.

            //condition:- the value in var 'temp' is not equal to 0. 

            int digit = temp % 10;
            // Storing the value of eqn in variable 'digit' of Datatype integer.

            // temp % 10 returns the remainder when value of var 'temp' is divided by 10.

            // ex:- let temp = 27 , temp/10 => 27/10 returns 2 and the remainder was 7 which is stored in var 'digit' , or temp % 10 returns 7.

            // Integer Datatype because it doesn't contain any floating/decimal values.

            sum = sum + fact(digit);
            // sum = sum + fact(digit) , adding the value of var 'sum' and the value returned by the fnc fact(digit) in the var 'sum'.

            // ex:- let initial value of 'sum' be 4. sum = 4 , digit = 3 and value returned by the fact(digit) = 6 . Then sum = sum + fact(digit) means sum = 4 + 6. and then the value of sum becomes 10.

            temp /= 10;
            // temp /= digit => temp = temp / digit , dividing the value of temp by 10 in the var 'temp'.

            // ex:- temp = 27 then the new value of temp will be temp = temp / 10 , temp = 27 / 10 and it returns 2 as the new value of var 'temp'.
        }

        if(num == sum){
            // if condition checking a condition, if the condition is true then if code will execute and if the condition is false then the else code will execute.

            // Condition: The value of var 'num' is equal to the value of var 'sum'.

            System.out.println("The Given Number is a Special number");
            // Printing that the given number is a Special Factorial number.

        }
        
        else{
            // else code will run if the given condition is false.

            System.out.println("The Given Number is not a Special number");
            // printing that the given number is not a special factorial number.

        }

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.


// DRY RUN:-

/*
 * let the number inputed by the user be 145.
 * 
 * Then, the input will be stored in var 'num' . 
 * 
 * num = 145
 * 
 * The value of var 'num' is stored in var 'temp',
 * 
 * temp = num => temp = 145
 * 
 * a variable 'sum' with initial value as 0.
 * 
 * sum = 0 .
 * 
 * Entering While Loop:-
 * 
 *      1st Iteration, Condition: (temp != 0) => (145 != 0) returns true.
 * 
 *          Storing the remainder when the value of var 'temp' is divided by 10 in the var 'digit'. 
 * 
 *          (digit = temp % 10) => (digit = 145 % 10) => (digit = 5) because remainder of (145 % 10) was 5 .
 * 
 *          digit = 5
 *  
 *          Calculating the sum of var 'sum' and the returned value of fnc 'fact(digit)' and storing it in var 'sum'.
 * 
 *          sum = sum + fact(digit) 
 *          sum =  0  + fact(5)
 * 
 *          Calling the fnc 'fact(n)' with the value of n as 5.
 * 
 *          Inside the Fnc 'fact(n)',{
 *          
 *              the value of var 'total' is initialized as 1.
 * 
 *              total = 1
 *              
 *              Running For Loop (on var 'i'),
 * 
 *              1st Iteration: (i = 1), condition:- (i <= n) => (1 <= 5), returns true,
 *              
 *                  Calculating the Product of value of var 'total' and var 'i' and storing the calculated value in var 'total',
 *          
 *                  total = total * i 
 *                  total =   1   * 1
 * 
 *                  total = 1              
 * 
 *                  Incrementing(i++) the value of var 'i' by 1, i = 2
 * 
 *                  1st Iteration Ends Here.
 * 
 * 
 * 
 * 
 *              2nd Iteration: (i = 2), condition:- (i <= n) => (2 <= 5), returns true,
 *              
 *                  Calculating the Product of value of var 'total' and var 'i' and storing the calculated value in var 'total',
 *          
 *                  total = total * i 
 *                  total =   1   * 2
 * 
 *                  total = 2              
 * 
 *                  Incrementing(i++) the value of var 'i' by 1, i = 3
 * 
 *                  2nd Iteration Ends Here.
 * 
 * 
 * 
 *              3rd Iteration: (i = 3), condition:- (i <= n) => (3 <= 5), returns true,
 *              
 *                  Calculating the Product of value of var 'total' and var 'i' and storing the calculated value in var 'total',
 *          
 *                  total = total * i 
 *                  total =   2   * 3
 * 
 *                  total = 6              
 * 
 *                  Incrementing(i++) the value of var 'i' by 3, i = 4
 * 
 *                  3rd Iteration Ends Here.
 * 
 * 
 * 
 *              4th Iteration: (i = 4), condition:- (i <= n) => (4 <= 5), returns true,
 *              
 *                  Calculating the Product of value of var 'total' and var 'i' and storing the calculated value in var 'total',
 *          
 *                  total = total * i 
 *                  total =   6   * 4
 * 
 *                  total = 24              
 * 
 *                  Incrementing(i++) the value of var 'i' by 1, i = 5
 * 
 *                  4th Iteration Ends Here.
 * 
 * 
 * 
 *              5th Iteration: (i = 5), condition:- (i <= n) => (5 <= 5), returns true,
 *              
 *                  Calculating the Product of value of var 'total' and var 'i' and storing the calculated value in var 'total',
 *          
 *                  total = total * i 
 *                  total =   24  * 5
 * 
 *                  total = 120              
 * 
 *                  Incrementing(i++) the value of var 'i' by 1, i = 6
 * 
 *                  5th Iteration Ends Here.
 * 
 *              6th Iteration: (i = 6), condition:- (i <= n) => (6 <= 5), returns False,
 *              
 *                  The condition becomes false so exiting for loop or for loop ends.
 * 
 *          
 *          Returning the value of var 'total' to the caller.
 * 
 *          return total;
 *          
 *          return  120 ;
 * 
 *          } Fnc Ends Here
 *              
 *          sum = 0 + fact(5)
 * 
 *          So, here fact(5) fnc returns 120.
 * 
 *          sum = 0 + 120
 * 
 *          sum = 120
 * 
 *          Dividing the value of var 'temp' by 10 and storing the quotient in the var 'temp' .
 * 
 *          temp = temp / 10
 *          temp = 145  / 10
 * 
 *          temp = 14(Quotient)
 * 
 *          1st Iteration of While loop ends here.         
 * 
 * 
 * 
 * 
 * 
 * Variable Description:
 *          num = 145
 *          sum = 120
 *          temp = 14
 * 
 * 
 * Entering While Loop:-
 * 
 *      2nd Iteration, Condition: (temp != 0) => (14 != 0) returns true.
 * 
 *          Storing the remainder when the value of var 'temp' is divided by 10 in the var 'digit'. 
 * 
 *          (digit = temp % 10) => (digit = 14 % 10) => (digit = 4) because remainder of (14 % 10) was 4 .
 * 
 *          digit = 4
 *  
 *          Calculating the sum of var 'sum' and the returned value of fnc 'fact(digit)' and storing it in var 'sum'.
 * 
 *          sum = sum + fact(digit) 
 *          sum =  120  + fact(4)
 * 
 *          Calling the fnc 'fact(n)' with the value of n as 4.
 * 
 *          Inside the Fnc 'fact(n)',{
 *          
 *              the value of var 'total' is initialized as 1.
 * 
 *              total = 1
 *              
 *              Running For Loop (on var 'i'),
 * 
 *              1st Iteration: (i = 1), condition:- (i <= n) => (1 <= 4), returns true,
 *              
 *                  Calculating the Product of value of var 'total' and var 'i' and storing the calculated value in var 'total',
 *          
 *                  total = total * i 
 *                  total =   1   * 1
 * 
 *                  total = 1              
 * 
 *                  Incrementing(i++) the value of var 'i' by 1, i = 2
 * 
 *                  1st Iteration Ends Here.
 * 
 * 
 * 
 * 
 *              2nd Iteration: (i = 2), condition:- (i <= n) => (2 <= 4), returns true,
 *              
 *                  Calculating the Product of value of var 'total' and var 'i' and storing the calculated value in var 'total',
 *          
 *                  total = total * i 
 *                  total =   1   * 2
 * 
 *                  total = 2              
 * 
 *                  Incrementing(i++) the value of var 'i' by 1, i = 3
 * 
 *                  2nd Iteration Ends Here.
 * 
 * 
 * 
 *              3rd Iteration: (i = 3), condition:- (i <= n) => (3 <= 4), returns true,
 *              
 *                  Calculating the Product of value of var 'total' and var 'i' and storing the calculated value in var 'total',
 *          
 *                  total = total * i 
 *                  total =   2   * 3
 * 
 *                  total = 6              
 * 
 *                  Incrementing(i++) the value of var 'i' by 3, i = 4
 * 
 *                  3rd Iteration Ends Here.
 * 
 * 
 * 
 *              4th Iteration: (i = 4), condition:- (i <= n) => (4 <= 4), returns true,
 *              
 *                  Calculating the Product of value of var 'total' and var 'i' and storing the calculated value in var 'total',
 *          
 *                  total = total * i 
 *                  total =   6   * 4
 * 
 *                  total = 24              
 * 
 *                  Incrementing(i++) the value of var 'i' by 1, i = 5
 * 
 *                  4th Iteration Ends Here.
 * 
 * 
 *              5th Iteration: (i = 5), condition:- (i <= n) => (5 <= 4), returns False,
 *              
 *                  The condition becomes false so exiting for loop or for loop ends.
 * 
 *          
 *          Returning the value of var 'total' to the caller.
 * 
 *          return total;
 *          
 *          return  24 ;
 * 
 *          } Fnc Ends Here
 *              
 *          sum = 120 + fact(4)
 * 
 *          So, here fact(4) fnc returns 24.
 * 
 *          sum = 120 + 24
 * 
 *          sum = 144
 * 
 *          Dividing the value of var 'temp' by 10 and storing the quotient in the var 'temp' .
 * 
 *          temp = temp / 10
 *          temp =  14  / 10
 * 
 *          temp = 1(Quotient)
 * 
 *          2nd Iteration of While loop ends here.         
 * 
 * 
 * 
 * 
 * Variable Description:
 *          num = 145
 *          sum = 144
 *          temp = 1
 * 
 * 
 * Entering While Loop:-
 * 
 *      3rd Iteration, Condition: (temp != 0) => (1 != 0) returns true.
 * 
 *          Storing the remainder when the value of var 'temp' is divided by 10 in the var 'digit'. 
 * 
 *          (digit = temp % 10) => (digit = 1 % 10) => (digit = 1) because remainder of (1 % 10) was 1 .
 * 
 *          digit = 1
 *  
 *          Calculating the sum of var 'sum' and the returned value of fnc 'fact(digit)' and storing it in var 'sum'.
 * 
 *          sum = sum + fact(digit) 
 *          sum =  144  + fact(1)
 * 
 *          Calling the fnc 'fact(n)' with the value of n as 1.
 * 
 *          Inside the Fnc 'fact(n)',{
 *          
 *              the value of var 'total' is initialized as 1.
 * 
 *              total = 1
 *              
 *              Running For Loop (on var 'i'),
 * 
 *              1st Iteration: (i = 1), condition:- (i <= n) => (1 <= 1), returns true,
 *              
 *                  Calculating the Product of value of var 'total' and var 'i' and storing the calculated value in var 'total',
 *          
 *                  total = total * i 
 *                  total =   1   * 1
 * 
 *                  total = 1              
 * 
 *                  Incrementing(i++) the value of var 'i' by 1, i = 2
 * 
 *                  1st Iteration Ends Here.
 * 
 * 
 *              2nd Iteration: (i = 2), condition:- (i <= n) => (2 <= 1), returns False,
 *              
 *                  The condition becomes false so exiting for loop or for loop ends.
 * 
 *          
 *          Returning the value of var 'total' to the caller.
 * 
 *          return total;
 *          
 *          return  1 ;
 * 
 *          } Fnc Ends Here
 *              
 *          sum = 144 + fact(1)
 * 
 *          So, here fact(1) fnc returns 1.
 * 
 *          sum = 144 + 1
 * 
 *          sum = 145
 * 
 *          Dividing the value of var 'temp' by 10 and storing the quotient in the var 'temp' .
 * 
 *          temp = temp / 10
 *          temp =  1  / 10
 * 
 *          temp = 0 (Quotient)
 * 
 *          3rd Iteration of While loop ends here.
 * 
 * 
 *      4th Iteration, Condition: (temp != 0) => (0 != 0) returns false.
 * 
 *          Condition becomes false so exiting while loop or while loop ends here.
 * 
 * 
 * 
 * 
 * Variable Description:
 *          num = 145
 *          sum = 145
 *          temp = 0
 *          
 * 
 * Checking if Statement, Condition (num == sum) => ( 145 == 145 ) which returns true,
 * 
 *      When the Condition is true, then the 'if' code will run,
 *          
 *          Prints that the given number is a Special Number.
 * 
 */

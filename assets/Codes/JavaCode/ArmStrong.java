import java.util.Scanner;
// imported scanner class for taking input from user.

public class ArmStrong{
    // classname ArmStrong

    public static void main(String[]args){
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        System.out.println("Enter the Number: ");
        // Asking for the Number to Check whether the Number is a ArmStrong or Not.

        int num = sc.nextInt();
        // Taking input from user and storing it in variable 'num' of datatype integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        int sum = 0;
        // A variable 'sum' storing the value as 0 of datatype 'integer'.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        int i = num;
        // A variable 'i' storing the value of var 'num'. Of datatype Integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.
        
        while(i != 0){
            // A while loop running until the condition is true.

            // Condition:- Is the value of var 'i' is not equal to 0.

            int remain = i % 10;
            // a Variable 'remain' storing the Remainder of the value of var 'i' when it is divided by 10. (i % 10) , Datatype integer.

            // Integer Datatype because it doesn't contain any floating/decimal values.

            sum = sum + (remain * remain * remain);
            // Storing the value of ( sum + remain^3) in variable 'sum'.

            i = i / 10;
            // Dividing the Value of var 'i' by 10 and saving the quotient in var 'i' as its new value.

        }// While Loop Ends here.

        if(sum == num){
            // if condition checking a condition, if the condition is true then if code will execute and if the condition is false else code will execute.

            // Condition:- the value of var 'sum' is equal to the value of var 'num'.

            System.out.println("The Given Number[" + num + "] is An ArmStrong Number");
            // Printing that the given numbe is a armstrong number.

        }// if code ends here.

        else{
            // If the condition above is false , then else code will run.

            System.out.println("The Given Number["+num+"] is A Not an ArmStrong Number");
            // printing that the given number is not a ArmStrong number.

        }// else code ends here.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.

// Dry Run:-

/*
 * let the inputed number by the user was '135'
 * 
 * The value inputed by the user will be stored in the var 'num', num = 135
 * 
 * the value of var 'sum' initialized as 0.
 * 
 * The value of var 'num' will be stored in var 'i', i = num => i = 135
 * 
 * Entering While Loop,
 * 
 *      1st Iteration, Condition: (i != 0) => (135 != 0) => true
 *      
 *          Storing the value of (i % 10) in var 'remain', (135 % 10) => 5 (remainder)
 * 
 *          remain = 5
 * 
 *          Adding the value of var 'sum' and cube of value of var 'remain' and Storing it in var 'sum'
 * 
 *          sum = sum + (remain * remain * remain)
 *          sum =  0  + (remain ^ 3)
 *          sum =  0  + (5 ^ 3) 
 *          sum =  0  +   125
 * 
 *          sum = 125, new value of var 'sum' is 125
 * 
 *          Storing the value of (i / 10) in the var 'i', (135 / 10) => 13(Quotient).
 * 
 *          i = 13
 * 
 *          1st Iteration Ends Here.
 * 
 *      Variable Description:-
 * 
 *              num = 135
 *              sum = 125
 *               i  = 13
 * 
 *      2nd Iteration, Condition: (i != 0) => (13 != 0) => true
 *      
 *          Storing the value of (i % 10) in var 'remain', (13 % 10) => 3 (remainder)
 * 
 *          remain = 3
 * 
 *          Adding the value of var 'sum' and cube of value of var 'remain' and Storing it in var 'sum'
 * 
 *          sum = sum + (remain * remain * remain)
 *          sum =  0  + (remain ^ 3)
 *          sum =  0  + (3 ^ 3) 
 *          sum = 125 +    9
 * 
 *          sum = 134, new value of var 'sum' is 134
 * 
 *          Storing the value of (i / 10) in the var 'i', (13 / 10) => 1(Quotient).
 * 
 *          i = 1
 * 
 *          2nd Iteration Ends Here.
 * 
 *          Variable Description:-
 * 
 *              num = 135
 *              sum = 134
 *               i  =  1
 * 
 *      3rd Iteration, Condition: (i != 0) => (1 != 0) => true
 *      
 *          Storing the value of (i % 10) in var 'remain', (1 % 10) => 1 (remainder)
 * 
 *          remain = 1
 * 
 *          Adding the value of var 'sum' and cube of value of var 'remain' and Storing it in var 'sum'
 * 
 *          sum = sum + (remain * remain * remain)
 *          sum =  0  + (remain ^ 3)
 *          sum =  0  + (1 ^ 3) 
 *          sum = 134 +    1
 * 
 *          sum = 135, new value of var 'sum' is 135
 * 
 *          Storing the value of (i / 10) in the var 'i', (1 / 10) => 0(Quotient).
 * 
 *          i = 0
 * 
 *          3rd Iteration Ends Here.
 * 
 * 
 *      3rd Iteration, Condition: (i != 0) => (0 != 0) => False
 * 
 *      Condition becomes false so exiting while loop.
 * 
 * Exited While Loop!
 * 
 *          Variable Description:-
 * 
 *              num = 135
 *              sum = 135
 *               i  =  0
 *          
 * Checking if Condition: (sum == num) => (135 = 135), condition becomes true, running 'if' code.
 * 
 *  Printing that the given number(135) is a ArmStrong Number.
 * 
 *      
 *  
 * 
 * 
 */
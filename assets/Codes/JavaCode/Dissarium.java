import java.util.*;
// imported scanner class for taking input from user.

public class Dissarium{
    // classname Dissarium
    
    public static void main(String[]args){
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // imported scanner class for taking input from user.
        
        System.out.print("Enter the Number: ");
        // Asking the user to enter the number to check whether the number is a dissarium or not.

        int num = sc.nextInt();
        // Storing the input in var 'num' od datatype integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.
        
        int sum = 0;
        // A Variable 'sum' storing value as 0. Of datatype integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        int temp = num;
        // Variable 'temp' storing the value of var 'num'. Of datatype integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        int len = 0;
        // A Variable 'len' with intital value as 0 to store the total digit in the given number of datatype integer

        // Integer Datatype because it doesn't contain any floating/decimal values.

        while(temp != 0){
            // a while loop runs until the condition becomes false.

            // condition:- Is value in var 'temp' is not equal to 0.

            temp = temp / 10;
            // Dividing the value of var 'temp' by 10 and storing the value(Quotient) in var 'temp'

            //ex:- let temp be 34, then temp = temp / 10 => temp = 34/10. which returns 3 as quotient.

            // New value of var 'temp' becomes 3

            len++;
            // incrementing the value of var 'len' by 1.

        }// while loop ends here.

        temp = num;
        // refilling the value of var 'num' in var 'temp' because due to above while loop , the value of var 'temp' becomes 0 at last.

        for(int i = len ; i >= 1 ; i--){
            // For loop iterating on variable 'i' whose initial value was the value stored in var 'len' , iterating from 'len' to 1.

            // Iteration:- len , len - 1 , len - 2 , len - 3 , ... , 1.


            int digit = temp % 10;
            // Storing the value of eqn in variable 'digit' of Datatype integer.

            // temp % 10 returns the remainder when value of var 'temp' is divided by 10.

            // ex:- let temp = 27 , temp/10 => 27/10 returns 2 and the ramainder was 7 which is stored in var 'digit' , or temp / 10 returns 7.

            // Integer Datatype because it doesn't contain any floating/decimal values.

            sum += Math.pow(digit , i);
            System.out.println(sum);

            // sum += Math.pow(digit, i) => sum = sum + Math.pow(digit, i) , adding the value of 'digit' raised to power of var 'i' in the var 'sum'.

            // ex:- let initial value of 'sum' be 4. sum = 4 and value of var 'digit' = 7 and 'i' = 2 . Then sum = sum + Math.pow(digit, i) means sum = 4 + Math.pow(7 , 2) => 4 + 49. and then the value of sum becomes 53.

            temp = temp / 10;
            // Storing the value of eqn in variable 'temp' of Datatype integer.

            // temp / 10 returns the Quotient when value of var 'temp' is divided by 10.

            // ex:- let temp = 27 , temp/10 => 27/10 returns 2 and the Quotient was 2 which is stored in var 'temp' as its new value , or temp / 10 returns 2.

            // Integer Datatype because it doesn't contain any floating/decimal values.

        }// for loop ends here.
        
        if(sum == num){
            // if condition checking a condition, if the condition is true then if code will execute and if the condition is false nothing will execute.

            // condition:- if the value of var 'sum' and the value of var 'num' are equal.

            System.out.println(num + " is a Dissarium Number ");
            // printing that the given number is a Dissarium Number
        }
        else{
            System.out.println(num + " is not a Dissarium Number ");
            // printing that the given number is not a Dissarium Number
            
        }
        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.
    }
}

/*
 * DRY RUN:-(If u want complete explanation about the program then u can see the dry run otherwise skip it.)
 * 
 * Dissarium Number:- A number whose sum of digit raise to the power of their consecutive places will be equal to the original number.
 * 
 * power symbol => base^power
 * 
 * ex:- 135 = 1^1 + 3^2 + 5^3 or 5^3 + 3^2 + 1^1
 *          = 1 + 9 + 125 or 125 + 9 + 1
 * 
 *      135 = 135 So it is a Dissarium number
 * 
 * let the inputed number by user be 135 ,
 * 
 * It get Stored in var 'num' , num = 135 .
 * 
 * Value of var 'sum' = 0 .
 * 
 * Storing the value of var 'num' in var 'temp' , temp = num => temp = 135
 * 
 * Value of var 'len' = 0 .
 * 
 * Entering While Loop condition: (temp != 0) => (135 != 0) returns true.
 * 
 * 1st Iteration Of while loop:-
 * 
 *      dividing the value of var 'temp' by 10 and storing the new value in var 'temp'.
 * 
 *      temp = temp / 10 
 *      temp = 135  / 10 => 13 (Quotient)
 *       
 *      New Value of var 'temp' = 13 .
 * 
 *      Incrementing the value of var 'len' by 1 => Before len = 0 and Now, len = 1 . 
 * 
 *      1st Iteration of While Loop ends
 * 
 * Entering While Loop condition: (temp != 0) => (13 != 0) returns true.
 * 
 * 2nd Iteration Of while loop:-
 * 
 *      dividing the value of var 'temp' by 10 and storing the new value in var 'temp'.
 * 
 *      temp = temp / 10 
 *      temp =  13  / 10 => 1 (Quotient)
 *       
 *      New Value of var 'temp' = 1 .
 * 
 *      Incrementing the value of var 'len' by 1 => Before len = 1 and Now, len = 2 . 
 * 
 *      2nd Iteration of While Loop ends
 * 
 * Entering While Loop condition: (temp != 0) => (1 != 0) returns true.
 * 
 * 3rd Iteration Of while loop:-
 * 
 *      dividing the value of var 'temp' by 10 and storing the new value in var 'temp'.
 * 
 *      temp = temp / 10 
 *      temp =   1  / 10 => 0 (Quotient)
 *       
 *      New Value of var 'temp' = 0 .
 * 
 *      Incrementing the value of var 'len' by 1 => Before len = 2 and Now, len = 3 . 
 * 
 *      3rd Iteration of While Loop ends
 * 
 * Entering While Loop condition: (temp != 0) => (0 != 0) returns false.
 * 
 * While loop iteration ends.
 * 
 * Variable Description:-
 *      num = 135
 *      temp = 0
 *      len = 3
 *      sum = 0
 * 
 * Setting value of var 'temp' with the new value pf var 'num' because after the above while loop, the value of var 'temp' becomes 0.
 * 
 * New value of var 'temp' = num => 135 
 * 
 * Entering For loop iterating on var 'i' , (i = len) => i = 3 | Condition: (i >= 1) returns true .
 * 
 *      1st Iteration of For Loop:- ( i = 3 )
 *          
 *          Storing the value of (temp % 10) in var 'digit'.
 *          
 *          (temp % 10) => (135 % 10) => 13(Quotient) and 5(remainder)
 *          
 *          Storing the remainder in var 'digit', digit = 3 .
 * 
 *          Adding the value of Math.pow(digit , len) and the value of var 'sum' and storing it in the var 'sum' .
 *              
 *          sum = sum + Math.pow(digit , i) .
 * 
 *          sum = 0 + Math.pow(5 , 3) .
 * 
 *          sum = 0 + 125
 * 
 *          the new value of var 'sum' becomes sum = 125
 * 
 *          Storing the value of (temp / 10) in the var 'temp' .
 *          
 *          temp = temp / 10
 * 
 *          temp = 135 / 10
 * 
 *          the new value of var 'temp' = 13
 * 
 *      1st iteration of for loop ends:- Decrementing(--) the value of var 'i' by 1, Before i = 3 Now, i = 2
 * 
 * Variable Description:-
 *      num = 135
 *      temp = 13
 *      len = 3
 *      sum = 125
 *          
 * Entering For loop iterating on var 'i' , i = 2 | Condition: (i >= 1) returns true .
 * 
 *      2nd Iteration of For Loop:- ( i = 2 )
 *          
 *          Storing the value of (temp % 10) in var 'digit'.
 *          
 *          (temp % 10) => (13 % 10) => 1(Quotient) and 3(remainder)
 *          
 *          Storing the remainder in var 'digit', digit = 3 .
 * 
 *          Adding the value of Math.pow(digit , len) and the value of var 'sum' and storing it in the var 'sum' .
 *              
 *          sum = sum + Math.pow(digit , i) .
 * 
 *          sum = 125 + Math.pow(3 , 2) .
 * 
 *          sum = 125 + 9
 * 
 *          the new value of var 'sum' becomes sum = 134
 * 
 *          Storing the value of (temp / 10) in the var 'temp' .
 *          
 *          temp = temp / 10
 * 
 *          temp = 13 / 10
 * 
 *          the new value of var 'temp' = 1
 * 
 *      2nd iteration of for loop ends:- Decrementing(--) the value of var 'i' by 1, Before i = 2 Now, i = 1
 * 
 * Variable Description:-
 *      num = 135
 *      temp = 1
 *      len = 3
 *      sum = 134
 *                  
 * Entering For loop iterating on var 'i' , i = 1 | Condition: (i >= 1) returns true .
 * 
 *      3rd Iteration of For Loop:- ( i = 1 )
 *          
 *          Storing the value of (temp % 10) in var 'digit'.
 *          
 *          (temp % 10) => (1 % 10) => 0(Quotient) and 1(remainder)
 *          
 *          Storing the remainder in var 'digit', digit = 1 .
 * 
 *          Adding the value of Math.pow(digit , len) and the value of var 'sum' and storing it in the var 'sum' .
 *              
 *          sum = sum + Math.pow(digit , i) .
 * 
 *          sum = 125 + Math.pow(1 , 2) .
 * 
 *          sum = 134 + 1
 * 
 *          the new value of var 'sum' becomes sum = 135
 * 
 *          Storing the value of (temp / 10) in the var 'temp' .
 *          
 *          temp = temp / 10
 * 
 *          temp = 1 / 10
 * 
 *          the new value of var 'temp' = 0
 * 
 *      3rd iteration of for loop ends:- Decrementing(--) the value of var 'i' by 1, Before i = 1 Now, i = 0
 * 
 * Variable Description:-
 *      num = 135
 *      temp = 0
 *      len = 3
 *      sum = 135
 * 
 * Entering For loop iterating on var 'i' , i = 0 | Condition: (i >= 1) returns false . 
 *          
 * For loop iteration ends here.
 * 
 * Checking if Statement (condition: sum = num) => (135 = 135) returns true
 * 
 * is the condition is true then if code will run and if the condition is false else code will run:-
 *  
 *  Running 'if' code, printing that the number given is a dissarium number.
 * 
 * 
 * 
 */
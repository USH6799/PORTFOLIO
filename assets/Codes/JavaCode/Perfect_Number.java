import java.util.Scanner;
// imported scanner class for taking input from user.

public class Perfect_Number{
    // classname Perfect_Number

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        System.out.print("Enter the Number to Check whether it is a Prime Number or not: ");
        // Asking the user to enter the number.

        int num = sc.nextInt();
        // A variable 'num' storing the input taken from the user of datatype Integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        int sum = 0;
        // a variable 'sum' intialized as 0.

        for(int i = 1 ; i < num ; i++){
            // A for loop iterating on var 'i' where i iterates from 1 to the num.

            // Means var 'i' iterates as [1,2,3,4,...,num - 1].

            if(num % i == 0){
                // if condition checking a condition, if the condition is true then if code will execute and if the condition is false else code will execute.

                // Condition: if the remainder of (num/i) or the value of var 'num' is divided by the value of var 'i' and the remainder is equal to 0, then it returns true.

                sum = sum + i;
                // if the above condition is true, then this code will run.

                // adding the value of var 'sum' and var 'i' and storing it as the new value of var 'sum'.
                
            }// if code ends here.


            else{
                // if the above condition becomes false, then else code will run.

                continue;
                // skipping this iteration and moving to the next iteration of the for loop.

            }// else code ends here.

        }// for loop ends here.

        if(num == sum){
            // if condition checking a condition, if the condition is true then if code will execute and if the condition is false else code will execute.

            // condition: the value of var 'num' is equal to the value of var 'sum'.it returns true.

            System.out.println(num + " is a Perfect number");
            // if the above condition is true, then this code will run and prints that the given number is a perfect number.

        }// if code ends here.

        else{
            // if the above condition is false, then else code will run.

            System.out.println(num + " is not a Perfect Number");
            // prints that the given number is not a perfect number.

        }// else code ends here.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.
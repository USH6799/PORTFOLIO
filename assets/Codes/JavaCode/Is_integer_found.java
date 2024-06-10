import java.util.Scanner;
// imported scanner class for taking input from user.

public class Is_integer_found {
    // classname Is_integer_found

    public static void main(String[] args) {
        // main fnc to run the code.

        int arr[] = {1,4,5,7,9};
        // A array variable arr[] of length 5 and type int, declared and initialized Both.

        // Array is a variable which can store more than 1 data.

        // Array Syntax:-  <datatype> <arrayname>[] = new <datatype>[length];
        
        // Now the Time For Both Declaraton as well as initialization Syntax:-
        
        // <datatype> <arrayname>[] = {value1 , value2 ,value3 , ...};
        
        Scanner sc = new Scanner(System.in); 
        // imported scanner class for taking input from user.

        System.out.print("Enter the Number: ");
        // Asking for The number For checking if the number is present in array or not.

        int num = sc.nextInt();
        // The number is taken input from user to find in the array and the number is stored in var 'num' of datatype integer.

        boolean is_in_array = false;
        // variable 'is_in_array' of datatype boolean storing value as false.

        // Boolean datatype because it only contains either true or false as value.

        for (int i : arr) {
            // Enhanced for loop iterating on the each item of array arr[]

            // Storing the value of each item of array in var 'i' of same datatype(int).

            if(i == num){
                // if condition checking a condition, if the condition is true then 'if' code will execute and if the condition is false nothing will execute.

                // Remember the value of item of array will be stored in the var 'i' not the index like normal for loop.

                // condition:- if the value of 'i' will be equal to the value of Variable 'num'.

                is_in_array = true;
                // if the condition is true, then the value of var 'is_in_array' becomes true.

                break;
                // Uses break Keyword to exit the loop immediately without doing other iterations.

            }// if ends here.

        }// for loop ends here.

        if(is_in_array == true){
            // If condition checking a condition, if the condition is true then 'if' code will execute and if the condition is false then else code will run.

            // condition:- if the value of is_in_array was true.

            System.out.println("The Number( " + num + " ) given by user is not present in the Array.");
            // if the conditions satisfied then 'if' code will run and print the above code. 

        }// if ends here.

        else{
            // if the condition is false then else code will run.

            System.out.println("The Number( " + num + " ) given by user is not Absent in the Array.");
            // if the condition above is not satisfied then 'else' code will run and print the above code. 

        }// else code ends here.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.

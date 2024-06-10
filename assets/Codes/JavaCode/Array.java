package Arrays;
// package name Arrays.

import java.util.Scanner;
// imported scanner class for taking input from user.
public class Array {
    // classname Array

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // imported scanner class for taking input from user.

        double Declared_arr[] = new double[5];
        // A array variable Declared_arr[] of length 5 and type double, only declared not initialized.

        // Declaration Syntax:-  <datatype> <arrayname>[] = new <datatype>[length];
        
        // Array is a variable which can store more than 1 data.

        // here Declared_arr[] can store 5 diffrent data/values.

        // Declared_arr[] --> [data1 , data2 , data3 , data4 , data5];

        // ex:- arr[] = [1.2 , 1.4 , 23 , 45.3 , 53.1];

        // Initialization Syntax:- <arrayname> [index] = value;

        // In java, index always start from 0, So 1-9 is written as 0-8.

        //like:- 
        Declared_arr[0] = 10;
        Declared_arr[1] = 19;
        Declared_arr[2] = 27;
        Declared_arr[3] = 37;
        Declared_arr[4] = 29;

        // Printing Values of Array, There are many methods to do that, main method is directly printing or loop Printing:-

        // Direct Printing:-
        System.out.println("Directly Printing The Values of Array Declared_arr[]");

        System.out.println("First Value in Array: " + Declared_arr[0]);
        System.out.println("Second Value in Array: " + Declared_arr[1]);
        System.out.println("Third Value in Array: " + Declared_arr[2]);
        System.out.println("Fourth Value in Array: " + Declared_arr[3]);
        System.out.println("Fifth Value in Array: " + Declared_arr[4]);

        // Empty print statements to add lines in btw:-
        System.out.println();
        System.out.println();

        // Loop Printing: 3 types(while,for,enhanced for):-

        // While Loop Printing:-
        System.out.println("Printing the Values of Array Declared_Arr[] using While Loop");

        int i = 0;

        while (i < Declared_arr.length) {
            // here .length is a fnc provided by java to find the length of any array.

            // in this while loop var i iterates from 0 to length of array[i.e. 5].
            // means i changes its value 5 times -> [0 , 1 , 2 , 3 , 4].

            System.out.println(i + ". Value in Array: " + Declared_arr[i]);
            // In this Print Statement, we can see that the value of i changes each time and it was the index of array, so it will print from 0 index to 4th index.

            // incrementing value of i by 1.
            i++;

        }// While Loop Ends here.

        // Empty print statements to add lines in btw:-
        System.out.println();
        System.out.println();
        
        // For Loop Printing:-
        System.out.println("Printing the Value of Declared_arr[] Using For Loop");
        
        for (int j = 0; j < Declared_arr.length; j++) {
            // in this for loop, a variable j is iterating from 0 to length of array[5] ,means it goes on 0 , 1 , 2 , 3 , 4 ,then loop ends.
            
            System.out.println(j + ". Value in Array: " + Declared_arr[j]);
            // In this Print Statement, we can see that the value of j changes each time and it was the index of array, so it will print from 0 index to 4th index.
            
        }// For loop ends here.
        
        // Empty print statements to add lines in btw:-
        System.out.println();
        System.out.println();

        // Printing Value of Array Using Enhanced For loop:-

        // Syntax For loop:- for(<iterating var> or <datatype><Variablename> : <arrayname>){ <code> }

        //Like:-

        for(Double k : Declared_arr){
            // For loop created and variable k of same data type of array iterating on each value of array.

            // Remember: k is not the index, it is the value of array.

            System.out.println("Value in Array: " + k);
            // In this Print Statement, we can see that the value of k changes each time and it was the index of array, so it will print from 1st Value to last Value.

        }// Enhanced For ends here.

        // Now the Time For Both Declaraton as well as initialization Syntax:-

        // <datatype> <arrayname>[] = {value1 , value2 ,value3 , ...};

        // In this U can decide your Own length by entering Values.

        //Ex:-

        int initialized_arr[] = {1 , 3 , 5 , 6 , 10};
        // this is an example of both declaration and intialization.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.

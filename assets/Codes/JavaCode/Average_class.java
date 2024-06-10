package Arrays;
// packageName Arrays.

import java.util.Scanner;
// imported scanner class for taking input from user.

public class Average_class {
    // classname Average_class

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        System.out.print("Number of Students In the Class: ");
        // Asking for entering the Strength of Class or No.of Students in the class.

        int n = sc.nextInt();
        // Storing the total no. of Students in variable n of Datatype Integer.

        Float arr[] = new Float[n];
        // A array variable arr[] of length n and type float, only declared not initialized.

        // Array is a variable which can store more than 1 data/value.

        // Array Syntax:-  <datatype> <arrayname>[] = new <datatype>[length];
        
        // An array arr[] of Datatype Float Of length n or the total no. of Students.

        // datatype float because it may contain decimal values.

        
        for (int i = 1; i <= arr.length; i++) {
            // for loop on var i iterating from 1 to the length of Array.

            // Means 'i' will iterate on: 1 to arr.length(n) .

            System.out.print("Enter the Marks Of student " + i + " in physics: ");
            // Asking for the marks of students in physics From 1st student to nth student.

            Float marks = sc.nextFloat();
            // Storing the Marks of 'i'th Student in variable marks of datatype float because it may contain decimal values.

            arr[i - 1] = marks;
            // Setting the Value of arr[index].

            // Here, Setting the value of arr[i - 1] with value of 'marks' variable.

            // (i - 1) because index starts from 0 to n-1 , but in reality 1 to n.

            // in Index, 0 means 1 and (n-1) means n.

        }// For loop Ends here.

        Float total = 0.0f;
        // To store the value of total marks of the Students of the class in variable total with initial value as 0.0 of datatype Float because it may contain decimal values also.

        for (Float i : arr) {
            // running Enhances For loop with variable i of same datatype of array(float) and remember each time the value of arr is stored in var 'i' not the index.

            total += i;
            // Adding the marks of Each student stored in arr[] to Variable 'total'.
            
            // total += i; --> total = total + i;

        }// Enhanced For loop ends here.

        System.out.printf("Average:- %f" , (total / n));
        // Doing (total/n) where var 'total' contains the sum of marks of all students and variable 'n' contains the total no. of students, To Find the Average.

        // Average -->  (Total sum of items / total no. of items) X 100 .

        // Printing the Average marks of the class through printf function.

        // using system.out.printf() or .format(), to print the strings and variable combined more easily.

        // The syntax is like this- ("String part %d %s %f %c" , variables), 

        // In this all characters followed by % sign represent data type of variables like %s - String, %c - char %f - float, %d - integer.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.

// If you don't know array, please refer Array.java file.

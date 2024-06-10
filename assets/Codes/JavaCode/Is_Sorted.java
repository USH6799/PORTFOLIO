public class Is_Sorted {
    // classname Is_Sorted

    public static void main(String[] args) {
        // main fnc to run the code.

        int arr[] = {1111 , 734 , 823 , 834}; // it is an unsorted array, if u want to check the sorted results then add '//' at the starting of line.

        // int arr[] = {234 , 345 , 456 , 567}; // if You want to see the sorted result then remove '//' from the starting of line and follow the above step also.

        // A array variable arr[] of length 4 and type int, declared and initialized both.

        // Array is a variable which can store more than 1 data.

        // Array Syntax:-  <datatype> <arrayname>[] = new <datatype>[length];

        // Now the Time For Both Declaraton as well as initialization Syntax:-
        
        // <datatype> <arrayname>[] = {value1 , value2 ,value3 , ...};
        
        boolean sorted = true;
        // variable 'sorted' storing value as true of datatype boolean.

        //Boolean datatype because it only contains either true or false as value.

        for (int i = 0; i < arr.length - 1; i++) {
            // for loop on variable 'i' iterating from 0 to arr.length-1 or 4 - 1.

            // Means var 'i' iterates 3 times --> 0 , 1 , 2 .

            if(arr[i] > arr[ i + 1]){
                // if condition checking a condition, if the condition is true then if code will execute and if the condition is false else code will execute.

                // Condition:- checks- the value of arr[i] is greater than its succeeding value or arr[i + 1].

                sorted = false;
                // The code will run if the condition given above was true.

                // setting the value of variable 'sorted' with false.

                break;
                // Uses break Keyword to exit the loop immediately without doing other iterations.

            }// if code ends here.

            else{
                // if the condition given above was false then 'else' code will run.

                sorted = true;
                // setting the value of variable 'sorted' with true.

            }// else code ends here.

        }// for loop ends here.

        if(sorted){
            // if condition checking a condition, if the condition is true then if code will execute and if the condition is false nothing will execute.

            // condition:- checking the value of variable 'sorted' is true or false.

            System.out.println("Array is Sorted");
            // if the above condition is true or the value of var 'sorted' is true then the 'if' code will run.

            // prints that the array is sorted.(in ascending order)

        }// if code ends here.

        else{

            //if the above condition is false or the value of var 'sorted' is false then the else code will run.

            System.out.println("Array is Not Sorted");

            // printing that the array is not sorted.

        }// else code ends here.

    }// main fnc closes here.

}// class ends here.


/* DRY RUN, 
 * 
 * arr[] = {1111 , 734 , 823 , 834};
 * 
 * arr[0] --> 1111 
 * arr[1] --> 734
 * arr[2] --> 823 
 * arr[3] --> 834
 * 
 * for (i = 0) | (arr[i] -> arr[0] -> 1111) | (arr[i+1] => arr[1] => 734),
 * 
 * > sorted = true
 * 
 * 
 * condition 1st if:- (1111 > 734) , means true.
 * 
 * if the condition is true then, Value of sorted becomes false.
 * 
 * then break statement get executed and for loop ends.
 * 
 * > sorted = false
 * 
 * condition 2nd if:- (sorted) , means false,
 * 
 * prints that array is not sorted.
 *
 * 
 * Testing same with commented array above or the sorted array.
 * 
 * arr[] = {234 , 345 , 456 , 567};
 * 
 * arr[0] --> 234
 * arr[1] --> 345
 * arr[2] --> 456 
 * arr[3] --> 567
 * 
 * 
 * for (i = 0) | (arr[i] -> arr[0] -> 234) | (arr[i+1] => arr[1] => 345),
 * 
 * > sorted = true
 * 
 * condition 1st if:- (234 > 345) , means false.
 * 
 * if the condition is false then else code runs and Value of sorted becomes true.
 * 
 * > sorted = true
 * 
 * 
 * 
 * for (i = 1) | (arr[i] -> arr[1] -> 345) | (arr[i+1] => arr[2] => 456),
 * 
 * > sorted = true
 * 
 * condition 1st if:- (345 > 456) , means false.
 * 
 * if the condition is false then else code runs and Value of sorted becomes true.
 * 
 * > sorted = true
 * 
 * 
 * 
 * for (i = 2) | (arr[i] -> arr[2] -> 456) | (arr[i+1] => arr[3] => 567),
 * 
 * > sorted = true
 * 
 * condition 1st if:- (456 > 567) , means false.
 * 
 * if the condition is false then else code runs and Value of sorted becomes true.
 * 
 * > sorted = true
 * 
 * Iteration of loop completes, for loop ends !!!
 * 
 * condition 2nd if:- (sorted) , means true:-
 * 
 * prints that the array is sorted.
 * 
*/

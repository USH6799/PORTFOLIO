public class Find_max {
    // classname Find_max

    public static void main(String[] args) {
        // main fnc to run the code.

        int arr[] = {1 ,8, 26, 23, 13, 25};
        // A array variable arr[] of length 6 and type int, declared and initialized Also.

        // Array is a variable which can store more than 1 data.

        // Array Syntax:-  <datatype> <arrayname>[] = new <datatype>[length];

        // Here i Used For Both Declaraton as well as initialization Syntax:-
        
        // <datatype> <arrayname>[] = {value1 , value2 ,value3 , ...};
        
        // In the Array arr[] The Value are stored According to the index. --> {index0 , index1 , index2 , index3 , index4 , index5}
        
        int max = arr[0];
        // A variable 'max' of datatype integer storing value of arr[index].

        // Here, It is Storing arr[0] value. Which is 1 According to the Array arr[].

        for (int i = 0; i < arr.length - 1; i++) {
            // for loop running on variable 'i' iterating from 0 to arr.length - 1, or here, arr.length -> 6 , and the i iterates from 0 to 6-1 , --> (0,1,2,3,4). Only five times.

            if(max < arr[i + 1]){
                // if Condition checking one condition, if the condition is true then if code will execute otherwise if code will not be executed.

                // Condition:- if the value in var 'max' is smaller than value of arr[i + 1].

                max = arr[i + 1];
                // If the condition is true, then the new value of var 'max' will be the value stored in arr[i + 1].

            }// if code ends here.

        }// For loop ends here.

        System.out.println(max);
        // Printing the maximum number in the Array. means the value stored in variable 'max'.

    }// main fnc closes here.

}// class ends here.


/* DRY RUN, 
 * 
 * arr[] = {1 , 8 , 26 , 23 , 13 , 25}
 * 
 * arr[0] --> 1 
 * arr[1] --> 8 
 * arr[2] --> 26 
 * arr[3] --> 23
 * arr[4] --> 13
 * arr[5] --> 25
 * 
 * for (i = 0) | (max = arr[0] = 1) | (arr[i+1] = arr[1] = 8),
 * 
 * condition:- (1 < 8) , means true.
 * if the condition is true then, Value of max becomes arr[i + 1] = 8
 * 
 * 
 * for (i = 1) | (max = 8) | (arr[i+1] = arr[2] = 26),
 * 
 * condition:- (8 < 26) , means true.
 * if the condition is true then, Value of max becomes arr[i + 1] = 26.
 * 
 * 
 * for (i = 2) | (max = 26) | (arr[i+1] = arr[3] = 23),
 * 
 * condition:- (26 < 23) , means false.
 * if the condition is false then nothing will be executed.
 * 
 * 
 * for (i = 3) | (max = 26) | (arr[i+1] = arr[4] = 13),
 * 
 * condition:- (26 < 13) , means false.
 * if the condition is false then nothing will be executed.
 * 
 * 
 * for (i = 4) | (max = 26) | (arr[i+1] = arr[5] = 25),
 * 
 * condition:- (26 < 25) , means false.
 * if the condition is false then nothing will be executed.
 * 
 * final value of max = 26
 * 
 * It is also the highest value present in array.
 * 
 * 
*/
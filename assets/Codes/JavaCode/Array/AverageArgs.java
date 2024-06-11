package Array;
public class AverageArgs {
    // classname AverageArgs

    static int Average(int ...args){
         // A custom Created fnc 'Average' taking Array(...) parameter 'args' of datatype Integer, returning Integer to the Caller.

         // Integer Datatype because it doesn't contain any floating/decimal values.

         // We use (...args) as the parameter which takes all the arguments at the point of calling without any specified length , syntax:- ...<arrayname> , it also helps to work on multiple parameter when we dont know the number of Parameters.

        int sum = 0; 
        // A variable 'sum' Storing value as 0 of datatype integer.

        for (int i : args) {
            // For loop created and variable 'i' of same data type of array iterating on each value of array 'args'.
            
            // Remember: i is not the index, it is the value of array.

            sum += i;
            // sum += i => sum = sum + i;

            // Incrementing the value of var 'sum' by the value of var 'i'

        }// For loop Ends here.

        int average = sum / args.length;
        // Storing the Average of the sum of the values of items of array by the no .of items present in the array.

        return average;
        // Returning the Value of var 'average' to the caller.

    }// Custom fnc 'Average' ends here.

    public static void main(String[] args) {
        // main fnc closes here.

        int avg = Average(5 , 4 , 7 , 4 , 5);
        // Calling the fnc 'Average() throught the variable 'avg' (caller)

        // Giving 5 arguments to the fnc 'Average()' which is stored in the array 'args' like args = [5 , 4 , 7 , 4 , 5]

        System.out.println(avg);
        // Printing the Value stored in var 'avg'.

    }// main fnc closes here.

}// class ends here.

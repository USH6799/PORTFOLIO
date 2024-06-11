package Array;
// Reverb_array.java

// Defining the Reverb_array class
public class Reverb_array {
    
    // Main method
    public static void main(String[] args) {

        // Initializing an array
        int arr[] = {1,3,5,7,9};

        // Printing the original array
        System.out.println("Array Before Reversing!");

        for (int i : arr) {
            // For loop created and variable i of same data type of array iterating on each value of array.

            // Remember: i is not the index, it is the value of array.
            System.out.println(i);
        }

        // Calculating the mid-point of the array
        int n = arr.length / 2;
        int temp;
        // Reversing the array
        for(int i = 0; i < n; i++){
            temp = arr[i];
            int x = arr.length - i - 1;
            arr[i] = arr[x];
            arr[x] = temp;
        }
        // Printing the reversed array
        System.out.println("Array After Reversing!");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

// Dry Run:

// Original Array: {1, 3, 5, 7, 9}

// n = 5 / 2 = 2

// Iteration 1:
//     temp = 1
//     x = 5 - 0 - 1 = 4
//     arr[0] = arr[4] = 9
//     arr[4] = temp = 1

// Iteration 2:
//     temp = 3
//     x = 5 - 1 - 1 = 3
//     arr[1] = arr[3] = 7
//     arr[3] = temp = 3

// Final Array: {9, 7, 5, 3, 1}

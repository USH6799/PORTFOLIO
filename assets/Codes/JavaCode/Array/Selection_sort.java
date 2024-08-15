import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input the number of numbers they want to sort
        System.out.print("How many Numbers You want to Sort: ");
        int num = sc.nextInt();
        // num holds the number of elements the user wants to sort

        // Creating an array to store the numbers
        int array[] = new int[num];
        // array is initialized with size num

        // Asking the user to input the numbers
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the " + (i + 1) + "'th Number: ");
            array[i] = sc.nextInt();
            // array[i] is assigned the user input for each element
        }

        // Sorting the array using selection sort algorithm
        for (int i = 0; i < array.length; i++) {
            // Assume the current position i is the smallest
            int smallest = i;

            for (int j = i + 1; j < array.length; j++) {
                // Finding the index of the smallest element in the unsorted portion
                if (array[smallest] > array[j]) {
                    smallest = j;
                    // Update smallest to the new smallest index
                }
            }

            // Swapping the elements
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
            // Swap the elements at indices i and smallest
        }

        // Printing the sorted array
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
            // Print each element of the sorted array
        }

        // Closing the Scanner object to release resources
        sc.close();
    }

    // Dry Run Example:
    // Assume the user inputs num = 5 and the numbers are: 64, 25, 12, 22, 11
    // Initial array: [64, 25, 12, 22, 11]

    // First Pass (i = 0):
    // smallest = 0, array[smallest] = 64
    // Compare 64 with 25: smallest = 1 (25 < 64)
    // Compare 25 with 12: smallest = 2 (12 < 25)
    // Compare 12 with 22: smallest = 2 (22 >= 12)
    // Compare 12 with 11: smallest = 4 (11 < 12)
    // Swap 64 and 11
    // Array after first pass: [11, 25, 12, 22, 64]

    // Second Pass (i = 1):
    // smallest = 1, array[smallest] = 25
    // Compare 25 with 12: smallest = 2 (12 < 25)
    // Compare 12 with 22: smallest = 2 (22 >= 12)
    // Swap 25 and 12
    // Array after second pass: [11, 12, 25, 22, 64]

    // Third Pass (i = 2):
    // smallest = 2, array[smallest] = 25
    // Compare 25 with 22: smallest = 3 (22 < 25)
    // Swap 25 and 22
    // Array after third pass: [11, 12, 22, 25, 64]

    // Fourth Pass (i = 3):
    // smallest = 3, array[smallest] = 25
    // No need to swap as the rest is already sorted
    // Array remains: [11, 12, 22, 25, 64]

    // Final sorted array: [11, 12, 22, 25, 64]
}

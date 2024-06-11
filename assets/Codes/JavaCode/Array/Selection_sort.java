package Array;
import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input the number of numbers they want to sort
        System.out.print("How many Numbers You want to Sort: ");
        int num = sc.nextInt();

        // Creating an array to store the numbers
        int array[] = new int[num];

        // Asking the user to input the numbers
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the " + (i + 1) + "'th Number: ");
            array[i] = sc.nextInt();
        }

        // Sorting the array using selection sort algorithm
        for (int i = 0; i < array.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                // Finding the index of the smallest element
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            // Swapping the elements
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }

        // Printing the sorted array
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }

        // Closing the Scanner object to release resources
        sc.close();
    }
}

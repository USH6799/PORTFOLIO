import java.util.ArrayList;  // Importing ArrayList class to store the sequence
import java.util.Scanner;  // Importing Scanner class to read input from the user

public class LuckyNumber {  // Declaring the class LuckyNumber

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter the range to find lucky numbers (e.g., 1 to 100): ");  // Prompting the user to enter the range
        
        int start = sc.nextInt();  // Reading the starting number of the range
        
        int end = sc.nextInt();  // Reading the ending number of the range
        

        ArrayList<Integer> numbers = new ArrayList<>();  // ArrayList to store the sequence of numbers
        
        ArrayList<Integer> luckyNumbers = new ArrayList<>();  // ArrayList to store the lucky numbers
        
        for (int i = start; i <= end; i++) {  // Loop to initialize the numbers list
            
            numbers.add(i);
        }

        int index = 1;  // Variable to keep track of the index of the next number to be removed
        
        int size = numbers.size();  // Variable to store the size of the numbers list
        
        while (index < size) {  // Loop to find and remove lucky numbers
            
            for (int i = index; i < size; i += index) {  // Loop to remove every index-th number
                
                numbers.remove(i);  // Removing the number at index i
                
                size--;  // Decreasing the size of the numbers list
                
            }
            index++;  // Moving to the next index
            
        }

        luckyNumbers.addAll(numbers);  // Adding the remaining numbers to the lucky numbers list
        

        // Printing the lucky numbers
        
        System.out.println("Lucky numbers in the range " + start + " to " + end + " are:");
        for (int num : luckyNumbers) {
            System.out.print(num + " ");
        }

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: Range from 1 to 100

Step 1: Initialize Variables
start = 1
end = 100
numbers = [1, 2, 3, ..., 100]
luckyNumbers = []
index = 1
size = 100

Step 2: Loop to find and remove lucky numbers
Iteration 1:
    Removing every 1st number from the list
    numbers = [2, 4, 6, ..., 100]
    size = 50
Iteration 2:
    Removing every 2nd number from the list
    numbers = [2, 6, 10, ..., 98]
    size = 33
Iteration 3:
    Removing every 3rd number from the list
    numbers = [2, 6, 12, ..., 96]
    size = 25
Iteration 4:
    Removing every 4th number from the list
    numbers = [2, 6, 12, 20, 30, ..., 92]
    size = 20
Iteration 5:
    Removing every 5th number from the list
    numbers = [2, 6, 12, 20, 30, 42, 56, ..., 90]
    size = 16
Iteration 6:
    Removing every 6th number from the list
    numbers = [2, 6, 12, 20, 30, 42, 56, 72, 90]
    size = 14
Iteration 7:
    Removing every 7th number from the list
    numbers = [2, 6, 12, 20, 30, 42, 56, 72, 90]
    size = 13
Iteration 8:
    Removing every 8th number from the list
    numbers = [2, 6, 12, 20, 30, 42, 56, 72, 90]
    size = 12
Iteration 9:
    Removing every 9th number from the list
    numbers = [2, 6, 12, 20, 30, 42, 56, 72, 90]
    size = 11
Iteration 10:
    Removing every 10th number from the list
    numbers = [2, 6, 12, 20, 30, 42, 56, 72, 90]
    size = 10

Step 3: Copy the remaining numbers to the lucky numbers list
luckyNumbers = [2, 6, 12, 20, 30, 42, 56, 72, 90]

Step 4: Printing the lucky numbers
"Lucky numbers in the range 1 to 100 are: 2 6 12 20 30 42 56 72 90"

*/
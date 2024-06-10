// Package declaration and import statement for Scanner class
// package Loops;
import java.util.Scanner;

// Class declaration for printing odd numbers using a for loop
public class For_Loop {

    // Main method where program execution begins
    public static void main(String[] args) {
        
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting user to enter a number
        System.out.println("Enter a number:");
        
        // Reading user input as the number for which odd numbers are to be printed
        int n = sc.nextInt();
        
        // For loop to print odd numbers up to 'n'
        for(int i = 0 ; i < n ; i++){
            
            // Printing odd numbers (2 * i + 1)
            System.out.println(i * 2 + 1);
        }
        
        // Closing the Scanner object to prevent resource leak
        sc.close(); 
        
        // Dry Run Comments
        /*
        Let's say the user inputs 5:

        1. The program prompts the user to enter a number.
        2. User inputs 5.
        3. 'n' is assigned the value 5.
        4. For loop iteration 1: i = 0, prints 0 * 2 + 1 = 1.
        5. For loop iteration 2: i = 1, prints 1 * 2 + 1 = 3.
        6. For loop iteration 3: i = 2, prints 2 * 2 + 1 = 5.
        7. For loop iteration 4: i = 3, prints 3 * 2 + 1 = 7.
        8. For loop iteration 5: i = 4, prints 4 * 2 + 1 = 9.
        9. Loop ends.
        10. The program displays:
           1
           3
           5
           7
           9
        */
    }
}

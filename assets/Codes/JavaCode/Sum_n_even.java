// package Loops;
import java.util.Scanner;

public class Sum_n_even {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Asking the user to input the value of 'n'
        int n = sc.nextInt();
        
        // Initializing variables for loop and sum calculation
        int i = 0;
        int sum = 0;
        
        // Looping to calculate the sum of the first 'n' even numbers
        while (i <= n) {
            // Multiplying 'i' by 2 to get even numbers, and adding it to the sum
            sum += i * 2;
            i++;
        }
        
        // Printing the sum of the first 'n' even numbers
        System.out.println("The Sum Of First N Even Numbers are: " + sum);
        
        // Closing the Scanner object to release resources
        sc.close();
    }
}

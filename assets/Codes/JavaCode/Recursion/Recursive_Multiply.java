package Recursion;
import java.util.Scanner;

public class Recursive_Multiply {

    // Custom function to print the multiplication table of a number
    static void table(int n, int i){

        // Printing the multiplication expression and its result
        System.out.printf("%d X %d = %d\n" , n , i , n*i);

        // Base case: If i reaches 10, return from the function
        if(i == 10){
            return;
        }
        
        // Recursive call to table function with incremented value of i
        table(n , i + 1);
    }

    public static void main(String[] args) {

        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter The Number: ");

        // Reading the input number provided by the user
        int n = sc.nextInt();

        // Calling the table function with initial value of i as 1
        table(n , 1);

        // closing the obj of Scanner class so no further input could be taken; Not Necessary.
        sc.close();

    }   
}

//////////////////////////////////////////////

/*
DRY RUN:
----------
Example: If user enters 5

1. The program prompts the user to enter a number.
2. The user enters 5.
3. The main function reads the entered number (5).
4. The main function calls the table function with the value of 'n' as 5 and 'i' as 1.
5. Inside the table function:
    - It prints: "5 X 1 = 5"
    - Then, it checks if 'i' is equal to 10. Since it's not, it proceeds to the next step.
    - It makes a recursive call to the table function with 'n' as 5 and 'i' as 2.
6. Inside the recursive call:
    - It prints: "5 X 2 = 10"
    - Then, it checks if 'i' is equal to 10. Since it's not, it proceeds to the next step.
    - It makes another recursive call to the table function with 'n' as 5 and 'i' as 3.
7. This process continues until 'i' reaches 10. At that point, the base case is satisfied, and the recursion stops.
8. After printing the entire multiplication table for 5, the program terminates.

Output:
-------
Enter The Number: 5
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
5 X 8 = 40
5 X 9 = 45
5 X 10 = 50
*/

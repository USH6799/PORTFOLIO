package Recursion;
// Recursivepattern1.java

// Importing the Scanner class from java.util package
import java.util.Scanner;

// Defining the Recursivepattern1 class
public class Recursivepattern1 {

    // Custom function to draw a pattern using recursion
    static void Draw(int x ,int i){
        
        // Draw stars based on the current value of 'i'
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();

        // Base case: If 'x' is equal to 'i', return from the function
        if(x == i){
            return;
        }
        
        // Recursive call to Draw function with 'i + 1'
        Draw(x , i + 1);
    }

    // Main method
    public static void main(String[] args) {

        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a number
        int n = sc.nextInt();

        // Calling the Draw function to draw the pattern
        Draw(n , 1);

        // Closing the scanner object to prevent resource leak
        sc.close();
    }
}

/*
Dry Run:

Input: 4

Draw(4, 1)
    Loop from j=0 to j<1:
        Print "* "
    Print new line
    Draw(4, 2)
        Loop from j=0 to j<2:
            Print "* "
        Print new line
        Draw(4, 3)
            Loop from j=0 to j<3:
                Print "* "
            Print new line
            Draw(4, 4)
                Loop from j=0 to j<4:
                    Print "* "
                Print new line
                Draw(4, 5)
                    x is equal to i, so return
                Return from Draw(4, 5)
            Return from Draw(4, 4)
        Return from Draw(4, 3)
    Return from Draw(4, 2)
Return from Draw(4, 1)

Output:
* 
* * 
* * * 
* * * * 
*/

package Recursion;
// RecursivePattern2.java

// Importing the Scanner class from java.util package
import java.util.Scanner;

// Defining the RecursivePattern2 class
public class RecursivePattern2 {

    // Custom function to draw a pattern using recursion
    static void Draw(int x){

        // Draw stars based on the current value of 'x'
        for (int i = x; i > 0; i--) {
            System.out.print("* ");
        }
        System.out.println();

        // Base case: If 'x' is equal to 1, return from the function
        if(x == 1){
            return;
        }
        
        // Recursive call to Draw function with 'x - 1'
        Draw(x - 1);
    }

    // Main method
    public static void main(String[] args) {

        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a number
        int n = sc.nextInt();

        // Calling the Draw function to draw the pattern
        Draw(n);

        // Closing the scanner object to prevent resource leak
        sc.close();
    }
}

/*
Dry Run:

Input: 4

Draw(4)
    Loop from i=4 to i>0:
        Print "* " four times
        Print new line
    Draw(3)
        Loop from i=3 to i>0:
            Print "* " three times
            Print new line
        Draw(2)
            Loop from i=2 to i>0:
                Print "* " two times
                Print new line
            Draw(1)
            print ' * ' 1 times
                x is equal to 1, so return
            Return from Draw(1)
        Return from Draw(2)
    Return from Draw(3)
Return from Draw(4)

Output:
* * * * 
* * * 
* * 
* 
*/

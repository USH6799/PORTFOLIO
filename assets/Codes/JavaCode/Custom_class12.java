import java.util.Scanner;
// imported scanner class for taking input from user.

class rectangle {
    // Custom Created Class 'rectangle' means (doesn't contain main fnc), classname rectangle

    private int length;
    // A private variable 'length' just declared, of datatype Integer.
    
    // Integer Datatype because it doesn't contain any floating/decimal values.
    
    // private (access specifier) used here so that no other class other than this class can access this variables directly or through objects.
    
    private int breadth;
    // A private variable 'breadth' just declared, of datatype Integer.

    // Integer Datatype because it doesn't contain any floating/decimal values.

    // private (access specifier) used here so that no other class other than this class can access this variables directly or through objects.

    public rectangle() {
        // A Constructor fnc 'rectangle()' returning nothing, taking no parameters.
        
        // this is the constructor fnc of 0 parameters.
        
        // A constructor fnc is the fnc with the same name of the class, and which can be called directly during object creation or just by new keyword.
        
        length = 4;
        // Storing 4 in the private var 'length'.

        breadth = 5;
        // Storing 5 in the private var 'breadth'.

        System.out.println("Area: " + length * breadth);
        // Printing the area of the rectangle whose length is stored in var 'length' and breadth is stored in var 'breadth'.

    } // Custom fnc 'rectangle()' end's here.

    public rectangle(int len) {
        // A Constructor fnc 'rectangle(len)' returning nothing, taking 1 parameter 'len'.
        
        // this is the constructor fnc of 1 parameter 'len'.
        
        // A constructor fnc is the fnc with the same name of the class, and which can be called directly during object creation or just by new keyword.
        
        // Overloaded functions are the functions which have the same name but taking different no. of parameters inside them.

        length = len;
        // Storing the value of var 'len' in parameter 'length'.

        breadth = 5;
        // Storing 5 in var 'breadth'.

        System.out.println("Area: " + length * breadth);
        // Printing the area of the rectangle.

    } // Custom fnc 'rectangle(len)' ends here.

    public rectangle(int len, int bre) {
        // A Constructor fnc 'rectangle(len,bre)' returning nothing, taking 2 parameters 'len' and 'bre'.
        
        // this is the constructor fnc of 2 parameters.
        
        // A constructor fnc is the fnc with the same name of the class, and which can be called directly during object creation or just by new keyword.
        
        // Overloaded functions are the functions which have the same name but taking different no. of parameters inside them.

        length = len;
        // storing the value of parameter 'len' in var 'length'.

        breadth = bre;
        // storing the value of parameter 'bre' in var 'breadth'.

        System.out.println("Area: " + length * breadth);
        // Printing the area of Rectangle.

    } // Custom fnc 'rectangle(len,bre)' ends here.

} // Custom class 'rectangle' ends here.

public class Custom_class12 {
    // It is the main class, means it contains the main method.

    // classname Custom_class12

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        System.out.println("Enter the Length of The Rectangle: ");
        // Asking the user for entering the length of the rectangle.
        
        int len = sc.nextInt();
        // Taking input from user and storing it in var 'len'.
        
        System.out.println("Enter the Breadth of the Rectangle: ");
        // Asking the user for entering the breadth of the rectangle.

        int bre = sc.nextInt();
        // Taking input from user and storing it in var 'bre'.

        System.out.println("\nThe Output of 1st Constructor Method: ");
        // Telling the user about the output.
        
        new rectangle();
        // Calling the 1st constructor method(no parameter) using the new keyword. 
        
        // The length and breadth of Rectangle is already defined in the fnc.
        
        System.out.println("\nThe Output of 2nd Constructor Method: ");
        // Telling the user about the output.
        
        new rectangle(len);
        // Calling the 2nd constructor method(1 parameter) using the new keyword. 
        
        // The length of Rectangle is taken from the user in var 'len'.
        
        // The breadth of Rectangle is already defined in the fnc.
        
        System.out.println("\nThe Output of 3rd Constructor Method: ");
        // Telling the user about the output.

        new rectangle(len, bre);
        // Calling the 3rd constructor method(2 parameter) using the new keyword. 

        // The length of Rectangle is taken from the user in var 'len'.
        
        // The Breadth of Rectangle is taken from the user in var 'bre'.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    } // main fnc closes here.

} // class ends here.

/* Dry Run:

User Input:
Enter the Length of The Rectangle: 
3
Enter the Breadth of the Rectangle: 
7

Execution Steps:

1. Creating `rectangle` object with no parameters:
   - `new rectangle()`:
     - Calls the constructor `rectangle()`.
     - `length` is set to 4.
     - `breadth` is set to 5.
     - Prints: "Area: 20" (since 4 * 5 = 20).

2. Creating `rectangle` object with one parameter:
   - `new rectangle(3)`:
     - Calls the constructor `rectangle(int len)`.
     - `length` is set to 3 (input value).
     - `breadth` is set to 5.
     - Prints: "Area: 15" (since 3 * 5 = 15).

3. Creating `rectangle` object with two parameters:
   - `new rectangle(3, 7)`:
     - Calls the constructor `rectangle(int len, int bre)`.
     - `length` is set to 3 (input value).
     - `breadth` is set to 7 (input value).
     - Prints: "Area: 21" (since 3 * 7 = 21).

Summary of Output:

The Output of 1st Constructor Method: 
Area: 20

The Output of 2nd Constructor Method: 
Area: 15

The Output of 3rd Constructor Method: 
Area: 21

*/


import java.util.Scanner;  
// imported scanner class for taking input from user.
 
public class Custom_Class_rectangleInvoked {
    // Main class(it contains main fnc) , classname Custom_Class_rectangleInvoked

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // imported scanner class for taking input from user.

        System.out.print("Enter The Length: ");
        // asking for the length of the Rectangle.

        int x = sc.nextInt();
        // storing the input taken from user in variable 'x' of datatype integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.
        
        System.out.print("Enter The Breadth: ");
        // Asking for the Breadth of the rectangle.

        int y = sc.nextInt();        
        // storing the input taken from user in variable 'y' of datatype integer.
        
        // Integer Datatype because it doesn't contain any floating/decimal values.
        
        Rectangle shape = new Rectangle();
        // Creating an object 'shape' of Class Rectangle to access the class methods and variables.
        
        // Syntax of obj creation:- <classname> <objectname> = new <classname> ();
        
        shape.setDimen(x , y);
        // Accessing method of Rectangle class using the object 'shape' using .(dot) operator.

        // giving two arguments in the setDimen() fnc x for int a and y for int b inside the fnc.

        int pm = shape.perimeter();
        // Accessing the method of custom class 'rectangle' using object 'shape' with . operator, and here variable 'pm' is the caller of the func perimeter() , so the returned value from fnc is stored in variable 'pm' of same datatype.
        
        int ar = shape.area();
        // Accessing the method of custom class 'rectangle' using object 'shape' with . operator, and here variable 'ar' is the caller of the func area() , so the returned value from fnc is stored in variable 'ar' of same datatype.

        
        System.out.println("Perimeter of Rectangle: " + pm);
        // printing the value stored in variable 'pm'
        
        System.out.println("Area of Rectangle: " + ar);
        // printing the value stored in variable 'ar'

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.

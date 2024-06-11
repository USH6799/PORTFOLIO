
import java.util.Scanner;  
// imported scanner class for taking input from user.
 


class Rectangle{
    // custom created class(doesn't have main fnc) , classname Rectangle

    int length;
    // A variable 'length' just declared not initialized of datatype integer.

    // Integer Datatype because it doesn't contain any floating/decimal values.

    int breadth;
    // A variable 'breadth' just declared not intialized

    void setDimen(int a , int b){
        // A custom Fnc 'setDimen' taking two parameters 'a' and 'b' both of integer datatype.

        // returning nothing. (void).

        length = a;
        // storing the value of 'a' in variable 'length'.
        
        breadth = b;
        // storing the value of 'b' in variable 'breadth'.

    }// SetDimen() fnc ends here.

    public int perimeter(){
        // A custom fnc 'perimeter' taking no parameter, returning integer value.

        int perimeter = 2 * (length + breadth);
        // formula of perimeter of Rectangle:- 2 X (length + breadth).

        // storing the value of soln. in variable 'perimeter' of datatype integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        return perimeter;
        // returning the value stored in var 'perimeter' to Caller.

    }// perimeter() fnc ends here.

    public int area(){
        // A custom fnc 'area' taking no parameter, returning integer value.

        int area = length * breadth;
        // Area of Rectangle:- Length X breadth .

        // storing the value of answer in variable 'area' of datatype integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        return area;
        // returning the value of var 'area' to the caller.

    }// area() fnc ends here.

}// custom class ends.


// In next Program(pg 9.17), we use this class to get the area and perimeter of Rectangle.



public class Custom_Class_rectangleInvoked extends Rectangle {
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

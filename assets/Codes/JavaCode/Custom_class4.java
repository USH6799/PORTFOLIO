class Rectangle{
    // Custom Created Class 'Rectangle' means (doesn't contain main fnc) , classname Rectangle.

    int length;
    // A Class variable 'length' just Declared of datatype Integer.

    int breadth;
    // a Class variable 'breadth' just declared of datatype Integer.

    // Class variable means defined wtihout any fnc/method, it can be accessed anywhere and in any fnc inside the Class.

    double perimeter(){
         // A custom Created fnc 'perimeter()' taking no parameter, returning value(double) to the Caller.
         
         return 2 * (length + breadth);
         // Calulating the perimeter of the given length and breadth and returning the answer to the caller of the fnc.
         
        }// Custom fnc 'perimeter()' ends here.
        
        double area(){
            // A custom Created fnc 'area()' taking no parameter, returning value(double) to the Caller.
            
            return length * breadth;
            // Calulating the area of the given length and breadth and returning the answer to the caller of the fnc.
            
        }// Custom fnc 'area()' ends here.

}// Custom class 'Rectangle' ends here.

public class Custom_class4 {
    // Main class bcoz it contains the main method.

    // classname Custom_class4

    public static void main(String[] args) {
        // main fnc to run the code.

        Rectangle shape = new  Rectangle();
        // Creating an object 'shape' of Class Rectangle to access the class methods and variables.

        shape.length = 4;
        // Accessing variable 'length' of Custom created class 'Rectangle' using the object 'shape' .
        
        // Setting the value of var 'length' as 4.
        
        shape.breadth = 5;
        // Accessing variable 'breadth' of Custom created class 'Rectangle' using the object 'shape' .

        // Setting the value of var 'length' as 5.

        System.out.println("Perimter: " + shape.perimeter());
        // Printing the Perimeter by calling the custom created fnc 'perimeter()' from custom class 'Rectangle' using the object 'shape'.
        
        System.out.println("Area: " + shape.area());
        // Printing the area by calling the custom created fnc 'area()' from custom class 'Rectangle' using the object 'shape'.

    }// main fnc closes here.

}// class ends here.

// Dry Run Explanation:

// Step 1: Creating Rectangle object shape
// Rectangle shape = new Rectangle();

// Step 2: Setting length value for shape
// shape.length = 4;

// Step 3: Setting breadth value for shape
// shape.breadth = 5;

// Step 4: Calling perimeter method for shape
// Inside perimeter method:
// return 2 * (length + breadth);
// Output: perimeter = 2 * (4 + 5) = 2 * 9 = 18

// Step 5: Printing perimeter value
// System.out.println("Perimeter: " + shape.perimeter());
// Output: Perimeter: 18.0

// Step 6: Calling area method for shape
// Inside area method:
// return length * breadth;
// Output: area = 4 * 5 = 20

// Step 7: Printing area value
// System.out.println("Area: " + shape.area());
// Output: Area: 20.0

// End of program

class Square{
    // Custom Created Class 'Square' means (doesn't contain main fnc) , classname Square

    int side;
    // A variable 'side' just declared , Of datatype integer. 

    // Integer Datatype because it doesn't contain any floating/decimal values.

    double perimeter(){
         // A custom Created fnc 'perimeter()' taking no parameter, returning double value to the Caller of the fnc.
         
         return side * 4;
         // Multipling the value of var 'side' by 4 and returning the answer to the caller of the fnc.
         
        }// Custom fnc 'perimeter() ends here.'
        
        
        double area(){
            // A custom Created fnc 'area()' taking no parameter, returning double value to the Caller of the fnc.
            
            return side * side;
            // Squaring the value of var 'side' and returning the answer to the caller of the fnc.

    }// Custom fnc 'area()' ends here.

}// Custom class 'Square' ends here.

public class Custom_class3 {
    // Main class bcoz it contains the main method/fnc .

    // classname Custom_class4

    public static void main(String[] args) {
        // main fnc to run the code.

        Square shape = new Square();   
        // Creating an object 'shape' of Class Square to access the class methods and variables.

        shape.side = 5;
        // Setting the value of var 'side' of custom class 'Square' using the object 'shape' to access the class variables and methods.

        double pm = shape.perimeter();
        // Calling the fnc 'perimeter()' of custom class 'Square' using the object 'shape' and storing thre returned value of the fnc in var 'pm'(caller) of datatype double.
        
        // double dataype because it may contain decimal values.
        
        double ar = shape.area();
        // Calling the fnc 'area()' of custom class 'Square' using the object 'shape' and storing thre returned value of the fnc in var 'ar'(caller) of datatype double.

        // double dataype because it may contain decimal values.

        System.out.println("Perimeter: " + pm);
        // Printing the Perimeter of the given side of the Square.

        System.out.println("Perimeter: " + ar);
        // Printing the Area of the given side of the Square.

    }// main fnc closes here.

}// class ends here.


// Dry Run Explanation:

// Step 1: Creating Square object shape
// Square shape = new Square();

// Step 2: Setting side value for shape
// shape.side = 5;

// Step 3: Calling perimeter method for shape
// Inside perimeter method:
// return side * 4;
// Output: perimeter = 5 * 4 = 20

// Step 4: Storing perimeter value in pm
// double pm = 20.0;

// Step 5: Calling area method for shape
// Inside area method:
// return side * side;
// Output: area = 5 * 5 = 25

// Step 6: Storing area value in ar
// double ar = 25.0;

// Step 7: Printing perimeter and area values
// System.out.println("Perimeter: " + pm);
// Output: Perimeter: 20.0
// System.out.println("Perimeter: " + ar);
// Output: Perimeter: 25.0

// End of program

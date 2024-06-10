class Circle{
    // Custom Created Class 'Circle' means (doesn't contain main fnc) , classname Circle

    int radius;
    // A class variable 'radius' just declared.

    // Class variable means defined wtihout any fnc/method, it can be accessed anywhere and in any fnc inside the Class.

    void circum(){
         // A custom Created fnc 'circum()' taking no parameters, returning void(nothing) to the Caller.

        System.out.println("Circumference: " + (2 * Math.PI * radius));
        // Used Math.PI to get the exact value of Pi to find the circumference of he circle with the given radius.

        // Printing the circumference (2*pi*r)

    }// Custom fnc 'Circum()' ends here.


    void area(){
         // A custom Created fnc 'area()' taking no parameter, returning void(nothing) to the Caller.

        System.out.println("Area: " + (Math.PI * Math.pow(radius, 2)));
        // Printing the area of the circle.

    }// custom fnc 'area()' ends here.

}// Custom class 'Circle' ends here.



public class Custom_class6 {
    // It is the main class bcoz it contains the main fnc.

    // classname Custom_class6

    public static void main(String[] args) {
        // main fnc to run the code.

        Circle shape = new Circle();
        // Creating an object 'shape' of Class Circle to access the class methods and variables.

        // Syntax of obj creation:- <classname> <objectname> = new <classname> ();

        shape.radius = 100;
        // Accessing The variable 'radius' of custom created class 'Circle' using object 'shape'.

        // Setting it's value as 100.

        shape.area();
        // Running custom fnc 'area()' of custom class 'Circle' using obj 'shape'.

        shape.circum();
        // Running custom fnc 'circum()' of custom class 'Circle' using obj 'shape'.

    }// main fnc closes here.

}// class ends here.

// Dry Run Explanation:

// Step 1: Creating Circle object shape
// Circle shape = new Circle();

// Step 2: Setting radius value for shape
// shape.radius = 100;

// Step 3: Calling area method for shape
// Inside area method:
// System.out.println("Area: " + (Math.PI * Math.pow(radius, 2)));
// Output: Area: 31415.926535897932

// Step 4: Calling circum method for shape
// Inside circum method:
// System.out.println("Circumference: " + (2 * Math.PI * radius));
// Output: Circumference: 628.3185307179587

// End of program

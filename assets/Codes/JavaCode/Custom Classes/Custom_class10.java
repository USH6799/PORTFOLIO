class cylinder {
    // Custom Created Class 'cylinder'

    private double radius;
    // a private variable 'radius' declared of datatype double.

    private double height;
    // a private variable 'height' declared of datatype double.

    public void SetHeight(double h) {
        // A setter function 'SetHeight()' to set the value of private variable 'height' taking 1 parameter 'h' of datatype double.

        height = h;
        // Storing the value of parameter 'h' in the variable 'height'.
    } // setter function 'SetHeight(h)' ends here.

    public double getHeight() {
        // A getter function 'getHeight()' to get the value of private variable 'height' in form of returned value (double) from the function, taking no parameters.

        return height;
        // returning the value of variable 'height' to the caller of the function.
    } // getter function 'getHeight()' ends here.

    public void SetRadius(double r) {
        // A setter function 'SetRadius()' to set the value of private variable 'radius' taking 1 parameter 'r' of datatype double.

        radius = r;
        // Storing the value of parameter 'r' in the variable 'radius'.
    } // setter function 'SetRadius(r)' ends here.

    public double GetRadius() {
        // A getter function 'GetRadius()' to get the value of private variable 'radius' in form of returned value (double) from the function, taking no parameters.

        return radius;
        // returning the value of variable 'radius' to the caller of the function.
    } // getter function 'GetRadius()' ends here.

    public double SurfaceArea() {
        // A custom created function 'SurfaceArea' taking no parameter, returning value (double) to the caller.

        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        // returning the solution of the equation for finding the surface area of a cylinder shape.
    } // custom function 'SurfaceArea()' ends here.

    public double Volume() {
        // A custom created function 'Volume()' taking no parameter, returning value (double) to the caller.

        return Math.PI * radius * radius * height;
        // returning the answer of the equation for finding the volume of a cylinder shape and returning it to the caller of the function.
    } // custom function 'Volume()' ends here.
} // Custom class 'cylinder' ends here.

public class Custom_class10 {
    // Main class containing the main function.

    public static void main(String[] args) {
        // main function to run the code.

        cylinder shape = new cylinder();
        // Creating an object 'shape' of class 'cylinder' to access the class methods and variables.
        // Syntax of object creation: <classname> <objectname> = new <classname>();

        shape.SetHeight(20.0);
        // Calling the setter function 'SetHeight(h)' of the class 'cylinder' by the object 'shape' and passing 20.0 as the value of 'h'.

        shape.SetRadius(5.0);
        // Calling the setter function 'SetRadius(r)' of the class 'cylinder' by the object 'shape' and passing 5.0 as the value of 'r'.

        System.out.println("The Surface Area is: " + shape.SurfaceArea());
        // Calling the custom function 'SurfaceArea()' of class 'cylinder' by the object 'shape' and printing the returned value from the function.

        System.out.println("The Volume is: " + shape.Volume());
        // Calling the custom function 'Volume()' of class 'cylinder' by the object 'shape' and printing the returned value from the function.
    } // main function ends here.
} // class ends here.

/*
Dry Run:
1. Program execution starts from the main method.
2. Creates an object 'shape' of class 'cylinder'.
3. Calls 'SetHeight(20.0)' on 'shape':
   - Sets 'height' to 20.0.
4. Calls 'SetRadius(5.0)' on 'shape':
   - Sets 'radius' to 5.0.
5. Calls 'SurfaceArea()' on 'shape':
   - Calculates surface area using the formula:
     - 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height
     - 2 * Math.PI * 5.0 * 5.0 + 2 * Math.PI * 5.0 * 20.0
     - 157.07963267948966 + 628.3185307179587
     - 785.3981633974483
   - Prints "The Surface Area is: 785.3981633974483".
6. Calls 'Volume()' on 'shape':
   - Calculates volume using the formula:
     - Math.PI * radius * radius * height
     - Math.PI * 5.0 * 5.0 * 20.0
     - 1570.7963267948967
   - Prints "The Volume is: 1570.7963267948967".
*/

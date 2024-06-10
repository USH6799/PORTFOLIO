class Cylinder1 {
    // Custom Created Class 'Cylinder1' means it doesn't contain the main function. Classname is 'Cylinder1'.
    
    private double radius;
    // A private variable 'radius' declared of datatype double.
    // Private access specifier is used here so that no other class other than this class can access these variables directly or through objects.

    private double height;
    // A private variable 'height' declared of datatype double.
    // Private access specifier is used here so that no other class other than this class can access these variables directly or through objects.

    // Double datatype because it may contain decimal values.

    public Cylinder1(double r, double h) {
        // A Constructor function 'Cylinder1', taking 2 parameters 'r' and 'h' of datatype double.
        // Constructor functions have the same name as the class and can be called directly during object creation or just by using the new keyword.

        radius = r;
        // Storing the value of parameter 'r' in the variable 'radius'.

        height = h;
        // Storing the value of parameter 'h' in the variable 'height'.

        return;
        // Returning from the constructor function. This is implicit and optional.
    }

    public double SurfaceArea() {
        // A custom function 'SurfaceArea' that calculates the surface area of the cylinder.

        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        // Returning the calculated surface area using the formula:
        // Surface Area = 2 * π * radius^2 + 2 * π * radius * height
    }

    public double Volume() {
        // A custom function 'Volume' that calculates the volume of the cylinder.

        return Math.PI * radius * radius * height;
        // Returning the calculated volume using the formula:
        // Volume = π * radius^2 * height
    }
}

public class Custom_class11 {
    // Main class containing the main function.

    public static void main(String[] args) {
        // Main function to run the code.

        Cylinder1 shape = new Cylinder1(9, 12);
        // Creating an object 'shape' of class 'Cylinder1' with radius 9 and height 12.
        // Calls the constructor 'Cylinder1(9, 12)', initializing radius to 9 and height to 12.

        System.out.println("The Surface Area was: " + shape.SurfaceArea());
        // Calling the custom function 'SurfaceArea()' of class 'Cylinder1' by the object 'shape' and printing the returned value from the function.
        // The Surface Area = 2 * π * 9^2 + 2 * π * 9 * 12 = 2 * π * 81 + 2 * π * 108 = 2 * π * (81 + 108) = 2 * π * 189 = 1188.4955592153876

        System.out.println("The Volume is: " + shape.Volume());
        // Calling the custom function 'Volume()' of class 'Cylinder1' by the object 'shape' and printing the returned value from the function.
        // The Volume = π * 9^2 * 12 = π * 81 * 12 = π * 972 = 3053.6280592892786
    }
}

/*
Dry Run:
1. Program execution starts from the main method.
2. Creates an object 'shape' of class 'Cylinder1' with radius 9 and height 12.
   - Constructor 'Cylinder1(9, 12)' is called.
   - radius is set to 9.
   - height is set to 12.
3. Calls 'SurfaceArea()' on 'shape':
   - Calculates surface area using the formula:
     - 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height
     - 2 * Math.PI * 9 * 9 + 2 * Math.PI * 9 * 12
     - 2 * Math.PI * 81 + 2 * Math.PI * 108
     - 2 * Math.PI * (81 + 108)
     - 2 * Math.PI * 189
     - 1188.4955592153876
   - Prints "The Surface Area was: 1188.4955592153876".
4. Calls 'Volume()' on 'shape':
   - Calculates volume using the formula:
     - Math.PI * radius * radius * height
     - Math.PI * 9 * 9 * 12
     - Math.PI * 81 * 12
     - Math.PI * 972
     - 3053.6280592892786
   - Prints "The Volume is: 3053.6280592892786".
*/

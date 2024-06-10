class Cylinder {
    // Custom Created Class 'Cylinder'

    private double radius; // Private variable 'radius' of datatype double
    private double height; // Private variable 'height' of datatype double

    // Setter method to set the height
    public void SetHeight(double h) {
        height = h; // Assigns the parameter 'h' to the class variable 'height'
    }

    // Getter method to get the height
    public double getHeight() {
        return height; // Returns the value of 'height'
    }

    // Setter method to set the radius
    public void SetRadius(double r) {
        radius = r; // Assigns the parameter 'r' to the class variable 'radius'
    }

    // Getter method to get the radius
    public double GetRadius() {
        return radius; // Returns the value of 'radius'
    }
}

public class Custom_class9 {
    // Main class containing the main method

    public static void main(String[] args) {
        // Main method, the entry point of the program

        Cylinder shape = new Cylinder();
        // Creating an object 'shape' of the class 'Cylinder' to access the class methods and variables

        shape.SetHeight(20.0);
        // Calling the setter method 'SetHeight' on the object 'shape' and passing 20.0 as the parameter
        // This sets the height of the cylinder to 20.0

        shape.SetRadius(5.0);
        // Calling the setter method 'SetRadius' on the object 'shape' and passing 5.0 as the parameter
        // This sets the radius of the cylinder to 5.0

        System.out.println("Height: " + shape.getHeight());
        // Calling the getter method 'getHeight' on the object 'shape' to retrieve the height value
        // Printing the height value

        System.out.println("Radius: " + shape.GetRadius());
        // Calling the getter method 'GetRadius' on the object 'shape' to retrieve the radius value
        // Printing the radius value
    }
}

/*
Dry Run:
1. Program starts execution from the main method.
2. Creates an object 'shape' of class 'Cylinder'.
3. Calls 'SetHeight(20.0)' on 'shape':
   - Sets 'height' to 20.0.
4. Calls 'SetRadius(5.0)' on 'shape':
   - Sets 'radius' to 5.0.
5. Calls 'getHeight()' on 'shape':
   - Returns 'height' which is 20.0.
   - Prints "Height: 20.0".
6. Calls 'GetRadius()' on 'shape':
   - Returns 'radius' which is 5.0.
   - Prints "Radius: 5.0".
*/

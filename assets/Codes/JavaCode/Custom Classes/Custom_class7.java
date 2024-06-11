class Circle{
    // Custom Created Class 'Circle' means (doesn't contain main fnc) , classname Circle

    private double radius;
    // a private variable 'radius' just declared of datatype double.

    // private (access specifier) used here so that other classes cannot access this variable directly or through objects.

    private double area = Math.PI * radius * radius;
    // a private variable 'area' storing the area of circle from the formula (pi X r^2) , of datatype double.
    
    // private (access specifier) used here so that no other class other than this class can access this variables directly or through objects.
    
    private double circum = 2 * 3.14f * radius;
    // a private variable 'circum' storing the circumference of circle from the formula (2 X pi X r) , of datatype double.

    // private (access specifier) used here so that no other class other than this class can access this variables directly or through objects.

    // double dataype because it may contain decimal values.
    

    void SetRadius(int r){
        // A setter fnc 'setRadius' to set the value of private variable 'radius' taking 1 paramter 'r' of datatype Integer. 
        
        radius = r;
        // Setting the value of private var 'radius' as the value of var 'r'.
        
    }// setter fnc 'setRadius(r)' ends here. 
    
    double GetRadius(){
        // A getter fnc 'GetRadius()' to get the value of private variable 'radius' in form of returned value(double) from the fnc, taking no parameters.

        return radius;
        // returning the value stored in private var 'radius' to the caller of fnc.

    }// getter fnc 'GetRadius()' ends here.

    void GetArea(){
        // A getter fnc 'GetArea()' to get the value of private variable 'area' in form of printed value from the fnc, taking no parameters. 

        System.out.println("Area: " + area);
        // Printing the area of the circle stored in private var 'area'.

    }// getter fnc 'GetArea()' ends here.

    void GetPerimeter(){
        // A getter fnc 'GetPerimeter()' to get the value of private variable 'circum' in form of printed value from the fnc, taking no paramters. 

        System.out.println("Perimeter: " + circum);
        // printing the Perimeter/Circumference of the circle.

    }// getter fnc 'GetPerimeter()' ends here.
    
}// Custom class 'Circle' ends here.

public class Custom_class7 {
    // it is the main class bcoz it contains the main fnc.

    // classname Custom_class7

    public static void main(String[] args) {
        // main fnc to run the code.

        Circle shape = new Circle();
        // Creating an object 'shape' of Class Circle to access the class methods and variables.

        shape.SetRadius(5);
        // Accessing setter fnc 'SetRadius(r)' of the custom class 'Circle' using the object 'shape'.

        // Passing 5 as the argument , which later becomes the value of var 'r' inside the setter fnc.

        System.out.println("Radius of The Circle: " + shape.GetRadius());
        // Accessing getter fnc 'GetRadius()' of the custom class 'Circle' using the object 'shape'.

        // printing the radius of the circle.

        shape.GetArea();
        // Accessing getter fnc 'GetArea()' of the custom class 'Circle' using the object 'shape'.

        shape.GetPerimeter();
        // Accessing getter fnc 'SetPerimeter()' of the custom class 'Circle' using the object 'shape'.
        
    }// main fnc closes here.

}// class ends here.

// Dry Run Explanation:

// Step 1: Creating Circle object shape
// Circle shape = new Circle();

// Step 2: Setting radius value for shape using SetRadius method
// shape.SetRadius(5);

// Step 3: Getting radius value for shape using GetRadius method and printing it
// System.out.println("Radius of The Circle: " + shape.GetRadius());
// Output: Radius of The Circle: 5.0

// Step 4: Getting area value for shape using GetArea method and printing it
// shape.GetArea();
// Inside GetArea method:
// System.out.println("Area: " + area);
// Output: Area: 0.0 (Since the area calculation is done when the Circle object is initialized, it's not updated)

// Step 5: Getting perimeter value for shape using GetPerimeter method and printing it
// shape.GetPerimeter();
// Inside GetPerimeter method:
// System.out.println("Perimeter: " + circum);
// Output: Perimeter: 0.0 (Similar to area, perimeter calculation is done when the Circle object is initialized, it's not updated)

// End of program

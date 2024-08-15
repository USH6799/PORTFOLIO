public class Cylinder {
    // classname Cylinder

    public static void main(String[] args) {
        // main function to run the code.

        double radius = 5.75;
        // Storing the value of the radius of the cylinder in variable 'radius'.
        // Type: double (because radius can be a decimal value)

        int height = 15;
        // Storing the height of the cylinder in variable 'height'.
        // Type: int (since height is an integer value)

        final double pi = 3.14159;
        // Storing the value of Pi in variable 'pi'.
        // Type: double (since Pi is a decimal value)
        // 'final' keyword indicates that the value of Pi is constant and cannot be changed

        // Calculating the volume of the cylinder using the formula:
        // Volume = π * radius^2 * height
        System.out.println("Volume Of The Cylinder: " + (pi * radius * radius * height));
        // Printing the calculated volume of the cylinder
    }
}

///////////////////////////////////////////////////////

/*
Dry Run Example:
1. Initialize variables:
   - radius = 5.75
   - height = 15
   - pi = 3.14159

2. Calculate the volume using the formula:
   - Volume = pi * radius * radius * height
   - Volume = 3.14159 * 5.75 * 5.75 * 15
   - Volume = 3.14159 * 33.0625 * 15
   - Volume = 3.14159 * 495.9375
   - Volume = 1554.956875

3. Output:
   - Print: Volume Of The Cylinder: 1554.956875
*/

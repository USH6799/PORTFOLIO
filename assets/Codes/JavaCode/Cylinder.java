public class Cylinder {
    // classname Cylinder
    public static void main(String[] args) {
        // mian fnc to run the code.

        double radius = 5.75;
        // storing value of radius of Cylinder in variable radius (type: double because radius is in decimal value)

        int height = 15;
         // variable to store the length or height of the cylinder . (type: int beacuse storing integer.)

        final double pi = 3.14159;
        // variable to store the value of pi approx to 5 decimal points in variable pi | final is used here beacuse the value of pi is fixed and never change (not Necessary) 

        // double type beacuse it containing decimal values.

        System.out.println("Volume Of The Cylinder: " + (pi * radius * radius * height));
        // printing The Volume of Cylinder by formula (Pie X radius X radius X height).
    }
}

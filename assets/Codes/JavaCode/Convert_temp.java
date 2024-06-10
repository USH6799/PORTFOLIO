import java.util.Scanner;
// imported scanner class for taking input from user.

public class Convert_temp {
    // classname Convert_temp

    static void Celsius_to_Farenheit(Double temp){
         // A custom Created fnc 'Celsius_to_Farenheit(temp)' taking 1 parameter 'temp' of datatype double, returning void(nothing) to the Caller.

        double farenheit = (temp * 1.8) + 32;
        // Coverting the given temperature(celsius) to Farenheit.

        // Storing the answer of the calculation: (temp X 1.8) + 32
        // In var 'farenheit' of datatype double.

        // double dataype because it may contain decimal values.

        System.out.println("Temperature(in Farenheit): " + farenheit);
        // Printing the value of var 'farenheit'.

        // Printing the Temperature in Farenheit.

    }// Custom fnc 'Celsius_to_Farenheit(temp) ends here'

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        double n = sc.nextDouble();
        // Taking input from user and storing in var 'n' of datatype double.

        // double dataype because it may contain decimal values.

        Celsius_to_Farenheit(n);
        // Calling fnc 'Celsius_to_Farenheit(temp)' and passing the value of var 'n' as argument.

        // Passing var 'n' as argument which is further becomes var 'temp' as parameter inside the fnc.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.

// Dry Run Explanation:

// Step 1: Importing Scanner class for user input.
// import java.util.Scanner;

// Step 2: Declaring the Convert_temp class.
// public class Convert_temp {

// Step 3: Defining the Celsius_to_Farenheit method to convert Celsius to Fahrenheit.
// static void Celsius_to_Farenheit(Double temp) {
// Inside Celsius_to_Farenheit method:
// temp = user_input (from step 5)

// Step 4: Taking user input for temperature in Celsius.
// Scanner sc = new Scanner(System.in);
// double n = sc.nextDouble();
// Input: 20

// Step 5: Calling the Celsius_to_Farenheit method with user input as argument.
// Celsius_to_Farenheit(n);
// Inside Celsius_to_Farenheit method:
// temp = 20
// Fahrenheit = (20 * 1.8) + 32 = 68

// Step 6: Closing the Scanner object.
// sc.close();

// End of program.




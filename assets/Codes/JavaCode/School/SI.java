public class SI {
    // classname SI

    public static void main(String[] args) {
        // main function to run the Code.

        double p = 20000;
        // principal price stored in variable p | Datatype: double (for decimal values)
        
        double r = 13.5;
        // Rate of Interest stored in variable r | Datatype: double (for decimal values)
        
        int t = 4;
        // Time in Years stored in variable t | Datatype: int (for integer values)
        
        // Basic formula for finding simple interest: (principal * rate * time) / 100
        double interest = (p * r * t) / 100;
        // Calculating simple interest using the formula and storing the value in variable 'interest'
        // Data type: double (since the result of the calculation is a decimal value)

        System.out.printf("Simple Interest: %.2f", interest);
        // Printing the interest with a label, formatted to two decimal places
    }
}

/////////////////////////////////////////////////////////////////////////////

/*
Dry Run Example:
1. Initialize variables:
   - p = 20000 (principal)
   - r = 13.5 (rate of interest)
   - t = 4 (time in years)

2. Calculate Simple Interest using the formula:
   - interest = (p * r * t) / 100
   - interest = (20000 * 13.5 * 4) / 100
   - interest = (1080000) / 100
   - interest = 10800.0

3. Output:
   - Print: Simple Interest: 10800.00
*/

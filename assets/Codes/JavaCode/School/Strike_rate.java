public class Strike_rate {
    public static void main(String[] args) {
        // Variables to store the runs and balls faced by the cricketer
        int run = 113;
        // 'run' stores the total runs made by the cricketer, which is 113.

        int ball = 144;
        // 'ball' stores the total number of balls faced by the cricketer, which is 144.

        // Strike Rate:- Runs made in every 100 balls faced.

        // Calculating the strike rate of the cricketer (runs per 100 balls)
        double SR = (100.0 * run) / ball;
        // 'SR' stores the calculated strike rate.
        // The formula used is: (100 * total runs) / total balls faced.
        // '100.0' is used to ensure the calculation is performed in floating-point arithmetic, resulting in a double value.

        // Printing the runs and balls faced by the cricketer
        System.out.println("The Cricketer Makes " + run + " Runs in " + ball + " balls");
        // This statement prints out the total runs and balls faced by the cricketer.

        // Printing the strike rate of the cricketer
        System.out.println("Strike Rate Of the Cricketer Is: " + SR);
        // This statement prints out the calculated strike rate of the cricketer.
    }
}

/*
Dry Run Example:
1. Initialize variables:
   - run = 113
   - ball = 144

2. Calculate the Strike Rate:
   - Formula: (100 * run) / ball
   - Substitute values: (100 * 113) / 144
   - Calculation: 11300 / 144 ≈ 78.47

3. Output:
   - The program prints: "The Cricketer Makes 113 Runs in 144 balls"
   - The program prints: "Strike Rate Of the Cricketer Is: 78.47222222222223"
   
Explanation:
- Strike rate is a measure of a cricketer's scoring efficiency, representing the number of runs scored per 100 balls faced.
- In this example, the cricketer scores 113 runs in 144 balls, resulting in a strike rate of approximately 78.47.
*/

public class Strike_rate {
    public static void main(String[] args) {
        // Variables to store the runs and balls faced by the cricketer
        int run = 113;
        int ball = 144;

        // Strike Rate:- Runs made in every 100 balls faced.

        // Calculating the strike rate of the cricketer (runs per 100 balls)
        double SR = (100 * run) / ball;

        // Printing the runs and balls faced by the cricketer
        System.out.println("The Cricketer Makes " + run + " Runs in " + ball + " balls");

        // Printing the strike rate of the cricketer
        System.out.println("Strike Rate Of the Cricketer Is: " + SR);
    }
}

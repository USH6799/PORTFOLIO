public class Economy_rate {
    // classname Economy_rate

    public static void main(String[] args) {
        // main fnc to run the code.

        int over1 = 6; 
        // variable 'over1' storing the value 6 as the total runs scored in 1st over, datatype of integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        int over2 = 13; 
        // variable 'over2' storing the value 13 as the total runs scored in 2nd over, datatype of integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        int over3 = 4;
        // variable 'over3' storing the value 4 as the total runs scored in 3rd over, datatype of integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        int over4 = 7;
        // variable 'over4' storing the value 7 as the total runs scored in 4th over, datatype of integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.
        
        double runs = over1 + over2 + over3 + over4;
        // total runs made in together in 4 overs stored in var 'runs' of datatype double

        // double dataype because it may contain decimal values.

        System.out.println("Total Run in 1st Over: " + over1 + " Runs");
        // printing the runs scored in 1st over.

        System.out.println("Total Run in 2nd Over: " + over2 + " Runs");
        // printing the runs scored in 2nd over.

        System.out.println("Total Run in 3th Over: " + over3 + " Runs");
        // printing the runs scored in 3rd over.

        System.out.println("Total Run in 4th Over: " + over4 + " Runs");
        // printing the runs scored in 4th over.

        double rate = runs / 4;
        // storing the average runs scored in 4 overs in variable 'rate' of datatype double.

        // double dataype because it may contain decimal values.

        // rate = total runs in all over / no. of overs .

        System.out.println("\nThe Economy Rate On the Following Overs is: " + rate);
        // printing the average in all overs.

    }// main fnc closes here.

}// class ends here.
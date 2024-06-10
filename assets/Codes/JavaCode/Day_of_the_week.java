import java.util.Scanner;
// imported scanner class for taking input from user.

public class Day_of_the_week {
    // classname Day_of_the_week

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc =new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        System.out.print("Enter The Number Of The Day in a Week: ");
        // asking for the day number in the week(ex.1-monday and 7-sunday).

        int day = sc.nextInt();
        // taking input from user and the value stored in variable day of type integer.

        String Day_inwords = "";
        // a variable to store the Day_inwords name according to the day number.

        switch(day){
            // applying switch case on variable day.

            case 1 -> Day_inwords = "Monday";
            // runs case 1 if value in var day = 1, uses '->' so no need of break statement.

            // storing "monday" in variable Day_inwords 

            case 2 -> Day_inwords = "Tuesday";
            // runs case 2 if value in var day = 2, uses '->' so no need of break statement.

            // storing "tuesday" in variable Day_inwords 

            case 3 -> Day_inwords = "Wednesday";
            // runs case 3 if value in var day = 3, uses '->' so no need of break statement.

            // storing "wednesday" in variable Day_inwords 

            case 4 -> Day_inwords = "Thursday";
            // runs case 4 if value in var day = 4, uses '->' so no need of break statement.

            // storing "thursday" in variable Day_inwords 

            case 5 -> Day_inwords = "Friday";
            // runs case 5 if value in var day = 5, uses '->' so no need of break statement.

            // storing "friday" in variable Day_inwords 

            case 6 -> Day_inwords = "Satureday";
            // runs case 6 if value in var day = 6, uses '->' so no need of break statement.

            // storing "saturday" in variable Day_inwords 

            case 7 -> Day_inwords = "Sunday";
            // runs case 7 if value in var day = 7, uses '->' so no need of break statement.

            // storing "sunday" in variable Day_inwords 

            default -> Day_inwords = "Wrong Day Input";
            // runs if no case are found, uses '->' so no need of break statement.

            // storing "Wrong Day Input" or 'error' in variable Day_inwords 

        }// switch case ends here.

        System.out.println("The Day " + day +" Was : " + Day_inwords);
        // printing the day name according to the day number.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.

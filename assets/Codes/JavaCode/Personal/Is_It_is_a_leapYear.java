package Personal;
import java.util.Scanner;
// imported scanner class for taking input from user.

public class Is_It_is_a_leapYear {
    // classname Is_It_is_a_leapYear

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // imported scanner class for taking input from user.

        System.out.print("Enter The Year: ");
        // Asking to enter the year to check it if it is a leap year or not.

        int year = sc.nextInt();
        // taking year as input in var 'year' of datatype integer.

        if(year % 4 == 0){
            // if statement, to check that if year given by user is divisible by 4 ,then it is a leap year.

            System.out.printf("%d Is a leap Year" , year);
            //printing that the year is a leap year.

            // using system.out.printf() or .format(), to print the strings and variable combined more easily:- in these both fnc the syntax is like this- ("String part %d %s %f %c" , variables), in this all characters followed by % sign represent data type of variables like %s - String, %c - char %f - float, %d - integer.

        }// if codes ends here.

        else{
            // else code begins when if code doesn't runs.

            System.out.printf("%d Is Not a leap Year" , year);
            // printing that the year is not a leap year.

            // using system.out.printf() or .format(), to print the strings and variable combined more easily:- in these both fnc the syntax is like this- ("String part %d %s %f %c" , variables), in this all characters followed by % sign represent data type of variables like %s - String, %c - char %f - float, %d - integer.

        }// else code ends here.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.

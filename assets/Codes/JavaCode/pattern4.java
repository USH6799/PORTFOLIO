import java.util.Scanner;
// importing Scanner Class For Input From the User

/**
 * pattern4
 */
public class pattern4 {
    // class pattern4

    public static void main(String[] args) {
        // main function

        Scanner sc = new Scanner(System.in);
        // Scanner Class Obj 'sc' For Input

        System.out.print("Enter the Length Or no.of Rows-> ");
        // Asking for length of pattern or rows.

        int n=sc.nextInt();
        // var 'n' to store the Value

        int num = 1;
        // variable to print the number | This variable is written out of loop because the value of this variable will not change
        for (int i = 1; i <= n; i++) {
            // outer loop going from 1 to n -> print Rows

            for (int j = 0; j < i; j++) {
                // inner loop going from 1 to i -> print columns

                System.out.print(num + "\t");
                // print the value of var 'num'

                num++;
                //incrementing value of var 'num' by 1
                //num++ -> num = num + 1

            }// inner loop ends
            
            System.out.println();
            //to go to next line or row

        }// outer loop ends

        sc.close();
        //Closing Input Obj So There Will Be no Further Use Of Scanner Class | Not Important To write , Only For Supressing Warnings

    }
}

// Target Pattern:-if n = 5
//          1
//          2   3
//          4   5   6
//          7   8   9   10      
//          11  12  13  14  15
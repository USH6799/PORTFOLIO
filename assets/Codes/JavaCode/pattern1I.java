import java.util.Scanner;
// importing Scanner Class For Input From the User

public class pattern1I {
    // class pattern1I

public static void main(String []args){
    // main function

    Scanner sc = new Scanner(System.in);
    // Scanner Class Obj 'sc' For Input

    System.out.print("Enter The Length: ");
    // Asking for length of pattern or rows.

    int n = sc.nextInt();
    // var 'n' to store the Value

    for (int i = 1; i <= n; i++) {
    // outer loop going from 1 to n -> print Rows

        for(int j = 1; j <= i; j++){
        // inner loop going from 1 to 'i'

            System.out.print(i);
            // prints the value of i

        }// inner loops end
     
        System.out.println();
        // used to move to next row or line

    }// outer loop ends

    sc.close();
    // Closing Input Obj So There Will Be no Further Use Of Scanner Class | Not Important To write , Only For Supressing Warnings

    }
}

// Target Pattern:-if n = 5
//          1
//          2 2
//          3 3 3
//          4 4 4 4
//          5 5 5 5 5
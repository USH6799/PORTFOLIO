import java.util.Scanner;
// importing Scanner Class For Input From the User
public class pattern1J {
    // class pattern1J

public static void main(String []args){
    // main function

    Scanner sc = new Scanner(System.in);
    // Scanner Class Obj 'sc' For Input

    System.out.print("Enter The Length: ");
    // Asking for length of pattern or rows.

    int n = sc.nextInt();
    // var 'n' to store the Value

    for (int i = 1; i <= n; i++) {
        // outer loop from 1 to 'n'

        for(int j = 1; j <= i; j++){
            // inner loop from 1 to i

            System.out.println(j);
            // prints the value of j

        }// inner loop ends back to outer loop[line 21]
     
        System.out.println();
        // used to move to next line or row

    }// outer loops ends.

    sc.close();
    // Closing Input Obj So There Will Be no Further Use Of Scanner Class | Not Important To write , Only For Supressing Warnings

    }
}

// Target Pattern:-if n = 5
//          1
//          1 2
//          1 2 3
//          1 2 3 4
//          1 2 3 4 5
import java.util.Scanner;
// importing Scanner Class For Input From the User

/**
 * pattern5
 */
public class pattern5 {
    // class pattern5

    public static void main(String[] args) {
        // main function

        Scanner sc = new Scanner(System.in);
        // Scanner Class Obj 'sc' For Input

        System.out.print("Enter the Length Or no.of Rows-> ");
        // Asking for length of pattern or rows.

        int n=sc.nextInt();
        // var 'n' to store the Value

        for (int i = 1; i <= n; i++) {
            // outer loop Running From 1 to n

            for (int j = 1; j <= i; j++) {
                // inner loop running from 1 to i

                System.out.print(i*j + "\t");
                // printing the value of calculation(i*j) done of the value of var i and j
                // \t -> For A bigger Space Between The Outputs
                
            }//inner loops end

            System.out.println();
            //to move to the next line or row

        }//outer loops end

        sc.close();
        //Closing Input Obj So There Will Be no Further Use Of Scanner Class | Not Important To write , Only For Supressing Warnings

    }

}

// Target Pattern:-if n = 5
//          1
//          2   3
//          3   6   9
//          4   8   12  16
//          5   10  15  20  25
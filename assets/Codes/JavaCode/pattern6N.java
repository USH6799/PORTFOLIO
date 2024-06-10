import java.util.Scanner;
// importing Scanner Class For Input From the User

/**
 * pattern5
 */
public class pattern6N {
    // class pattern6N

    public static void main(String[] args) {
        // main function

        Scanner sc = new Scanner(System.in);
        // Scanner Class Obj 'sc' For Input

        System.out.print("Enter the Length Or no.of Rows-> ");
        // Asking for length of pattern or rows.

        int n=sc.nextInt();
        // var 'n' to store the Value

        for (int i = 1; i <= n; i++) {
            // outer loops running from 1 to n

            for (int j = 1; j <= n-i; j++) {
                // inner loop running from 1 to n-i

                System.out.print(" ");
                // printing spaces
                
            }// inner loops end

            System.out.println(i);
            // printing the value of var i , then moving to the next line or row
            
        }// outer loops end

        sc.close();
         // Closing Input Obj So There Will Be no Further Use Of Scanner Class | Not Important To write , Only For Supressing Warnings
    }

}

// Target Pattern:-if n = 5
//              s s s s 1
//              s s s 2
//              s s 3
//              s 4
//              5

// s ---> spaces = " "
import java.util.Scanner;
// importing Scanner Class For Input From the User

/**
 * pattern7R
 */
public class pattern7R {
    // class pattern7R
    
    public static void main(String[] args) {
        // main function

        Scanner sc = new Scanner(System.in);
        // Scanner Class Obj 'sc' For Input

        System.out.print("Enter the Length Or no.of Rows-> ");
        // Asking for length of pattern or rows.

        int n=sc.nextInt();
        // var 'n' to store the Value

        for (int i = n; i >= 1; i--) {
            // outer loops running from n to 1

            for (int j = 1; j <= n - i; j++) {
                // inner loop running from 1 to (n - i)
                // j < i --> j <= i - 1

                System.out.print(" ");
                // printing spaces
                
            }// inner loops end

            System.out.println(i);
            // printing the value of i,  then moving to the next line or row
            
        }// outer loops end

        sc.close();
         // Closing Input Obj So There Will Be no Further Use Of Scanner Class | Not Important To write , Only For Supressing Warnings
    }

}

// Target Pattern:-if n = 5
//              5
//              s 4
//              s s 3
//              s s s 2 
//              s s s s 1

// s ---> spaces = " "
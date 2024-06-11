import java.util.Scanner;
// importing Scanner Class For Input From the User

/**
 * pattern2S
 */
public class pattern2S {
    // class pattern2S

    public static void main(String[] args) {
        // main function

        Scanner sc = new Scanner(System.in);
        // Scanner Class Obj 'sc' For Input

        System.out.print("Enter the Length Or no.of Rows-> ");
        // Asking for length of pattern or rows.

        int n=sc.nextInt();
        // var 'n' to store the Value

        char letter = 97; // ASCII value used / Full explanation at last
        // variable to print the Letter | This variable is written out of loop because the value of this variable will not change with Any Loop iteration [including outer and inner both]

        for (int i = 1; i <= n; i++) {
            // outer loop going from 1 to n -> print Rows

            for (int j = 0; j < i; j++) {
                // inner loop going from 1 to i -> print columns

                System.out.print(letter + "\t");
                // print the value of var 'letter'
                //First Convert's the Char type Number into its ASCII value

                letter++;
                //incrementing value of var 'letter' by 1
                //letter++ -> letter = letter + 1

            }// inner loop ends
            
            System.out.println();
            //to go to next line or row

        }// outer loop ends

        sc.close();
        //Closing Input Obj So There Will Be no Further Use Of Scanner Class | Not Important To write , Only For Supressing Warnings

    }
}

// Target Pattern:-if n = 5
//          a
//          b   c
//          d   e   f
//          g   h   i   j      
//          k   l   m   n   o


//Explanation of ASCII :-

/*
     ASCII-> i dont know the full form Sorry...
     so when You create A char data type variable it stores a single character or ASCII numbers

     Like, characters are from a to z , A to Z , and Some Symbols[! / ? ; ,] 
     So for ex-

     int a = 65;  --> 65 [Expected Output And True Output]

     char a = 65; --> 65 [Expected Output and Wrong Output]
                  --> A  [True Output]

        here u Can see,
         That in integer type var 'a' ,The Output is Same as the number
         But, In Char type var 'a' , The Output is Diffrent And the output is a letter or a character.


         This is Due TO ASCII type Conversion which is Only possible between int and char data types

         A - Z => 65 - 90
         a - z => 97 - 122
*/
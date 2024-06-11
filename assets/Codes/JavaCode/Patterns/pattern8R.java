import java.util.Scanner;
// importing Scanner Class For Input From the User

/**
 * pattern8R
 */
public class pattern8R {
    // class pattern8R

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

            for (int j = 1; j <= n; j++) {
                // inner loop running from 1 to n

                if (i == j || (i + j) == 6) {//if the condition is true this code{} will run

                    //condition is used to print stars on diffrent location
                    //explained deeply at the last..

                    System.out.print("*");
                    //used to print stars

                }//if code ends 

                else {//if the condition is flase then this code{} will run

                    System.out.print(" ");
                    //used to print spaces

                }//else code ends
                
                
            }// inner loops end

            System.out.println();
            //used to go to next line or row
            
        }// outer loops end

        sc.close();
         // Closing Input Obj So There Will Be no Further Use Of Scanner Class | Not Important To write , Only For Supressing Warnings

    }

}

// Target Pattern:-if n = 5
//              1 s s s 1
//              s 2 s 2 s
//              s s 3 s s
//              s 4 s 4 s
//              5 s s s 5

// s ---> spaces = " "

//bachooo. Explanation:-

/*
        j=1|j=2|j=3|j=4|j=5
    i=1: 1   s   s   s   1
    i=2: s   2   s   2   s           
    i=3: s   s   3   s   s         
    i=4: s   4   s   4   s         
    i=5: 5   s   s   s   5

    in this above table:
    @1[condition - true => ] --> 'if' code will run 
    whenever i and j are equal , The value of i , Were Printed
    like:-  i=1,j=1 [i=j] ---> "*"
            i=2,j=2 [i=j] ---> "*" 
            i=3,j=3 [i=j] ---> "*"
            i=4,j=4 [i=j] ---> "*"
            i=5,j=5 [i=j] ---> "*"

    @2[condition - true => 'if' code will run]
    Whenever i and j are not equal the computer will check the next condition because we used OR symbol(||) which means if any one condition is true then the if code will run and only if both condition is false then only the else code will run

    which means if i and j are not equal it checks the next condition and the next condition says if the sum of i and j is equal to 6 then print the value of i ,

    if i + j = 6 --> print "*"


        j=1|j=2|j=3|j=4|j=5
    i=1:                 *
    i=2:             *              
    i=3:         *               
    i=4:     *                    
    i=5: *                


    in this New table, U can see the value of i , which were print only by the 2nd condition   (i+j=6)
    
    like,,
            1st value -> i=1:j=5 => [i + j = 6] --> true
            2nd value -> i=2:j=4 => [i + j = 6] --> true
            3rd value -> i=3:j=3 => [i + j = 6] --> true
            4th value -> i=4:j=2 => [i + j = 6] --> true
            5th value -> i=5:j=1 => [i + j = 6] --> true

    Abhiii Bachaa hai.

    @3[condition - false] --> 'else' code will run

    Now We seen the statements of true only Now the time for false statements ,
    Whenever The i nd j are not Equal and their sum is not equal to 6 then the Else code will run and print spaces

    Like,
        
        j=1|j=2|j=3|j=4|j=5
    i=1: 1   s   s   s   1
    i=2: s   2   s   2   s           
    i=3: s   s   3   s   s         
    i=4: s   4   s   4   s         
    i=5: 5   s   s   s   5

    i=1:j=2 --> [i /= j] and [i + j /= 6]
    i=1:j=3 --> [i /= j] and [i + j /= 6]
    i=1:j=4 --> [i /= j] and [i + j /= 6]
    i=2:j=1 --> [i /= j] and [i + j /= 6]
    i=2:j=3 --> [i /= j] and [i + j /= 6]
    i=2:j=5 --> [i /= j] and [i + j /= 6]
    i=3:j=1 --> [i /= j] and [i + j /= 6]
    i=3:j=2 --> [i /= j] and [i + j /= 6]
    i=3:j=4 --> [i /= j] and [i + j /= 6]
    i=3:j=5 --> [i /= j] and [i + j /= 6]
    i=4:j=1 --> [i /= j] and [i + j /= 6]
    i=4:j=3 --> [i /= j] and [i + j /= 6]
    i=4:j=5 --> [i /= j] and [i + j /= 6]
    i=5:j=2 --> [i /= j] and [i + j /= 6]
    i=5:j=3 --> [i /= j] and [i + j /= 6]
    i=5:j=4 --> [i /= j] and [i + j /= 6]


    '/=' --> Not Equal To
 */
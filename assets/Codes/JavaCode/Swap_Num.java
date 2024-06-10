import java.util.Scanner;
// Scanner Class For Input From the User

/**
 * Swap_Num
 */
public class Swap_Num {

    public static void main (String[] args/* <-- 'String[] args' Can Be Replaced By 'int temp' For Input From The terminal , If u are using this then don't use Scanner Class*/) {

        Scanner sc = new Scanner(System.in);
         // Scanner 'sc'<- obj for Input

        System.out.print("Enter The Value Of a -> ");
        // Asking the Value Of 1st Variable
        int a = sc.nextInt();
        // var 'a' to Store The Value Of 1st Variable

        System.out.print("Enter The Value Of b -> ");
        // Asking the Value Of 1st Variable

        int b = sc.nextInt();
        // var 'b' to Store The Value Of 2nd Variable

        System.out.println("The Value Of \'a\' Before Swapping -> " + a);
        //displaying value of var 'a' before swapping

        System.out.println("The Value Of \'b\' Before Swapping -> " + b);
        //displaying value of var 'b' before swapping

        a = a + b;
        // for example.take a = 2 , b = 5
        // a = a + b --> a = 2 + 5 ->|a = 7 & b = 5{remain same}

        b = a - b;
        // b = a - b --> b = 7 - 5 ->|a = 7{remain same} & b = 2

        a = a - b;
        // a = a - b --> a = 7 - 2 ->|a = 5 & b = 2 {Both Swapped}

        System.out.println("The Value Of \'a\' After Swapping -> " + a);
        //displaying value of var 'a' after swapping

        System.out.println("The Value Of \'b\' After Swapping -> " + b);
        //displaying value of var 'b' after swapping

        sc.close();
         //Closing Input Obj So There Will Be no Further Use Of Scanner Class | Not Important To write , Only For Supressing Warnings
    }
}
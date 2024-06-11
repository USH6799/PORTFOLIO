import java.util.Scanner;
// imported scanner class for taking input from user.

// You can create this program like my program also it is not necessary to have the sme program creating methods.

public class In_Notes {
    // classname In_Notes

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // imported scanner class for taking input from user.

        System.out.print("Enter The Amount: ");
        // asking for the total amount or money to get all the info.

        int amount = sc.nextInt();
        // Taking the Total money as input from the user stored in variable 'amount' of datatype integer. 

        // integer datatype means it doesn't take floating/decimal values.

        System.out.println("Rs 1000 notes : " + (amount / 1000));
        // printing the no. of 1000 notes in the total amount stored in var 'amount'.

        // getting the no.of 1000 notes by dividing the total money by 1000.

        // printing the quotient of amount/1000 .

        amount %= 1000;
        // amount %= 1000 --> amount = amount % 1000.

        // Here dividing the total money stored in var 'amount' by 1000 and storing the remainder in the same var 'amount' and it is now the new value of variable 'amount'.

        System.out.println("Rs 500 notes : " + (amount / 500));
        // printing the no. of 500 notes in the total amount stored in var 'amount'.

        // getting the no.of 500 notes by dividing the value of var 'amount' by 500.

        // printing the quotient of amount/500 .

        amount %= 500;
        // amount %= 500 --> amount = amount % 500.

        // Here dividing the total money stored in var 'amount' by 500 and storing the remainder in the same var 'amount' and it is now the new value of variable 'amount'.

        System.out.println("Rs 200 notes : " + (amount / 200));
        // printing the no. of 200 notes in the total amount stored in var 'amount'.

        // getting the no.of 200 notes by dividing the value of var 'amount' by 200.

        // printing the quotient of amount/200 .

        amount %= 200;
        // amount %= 200 --> amount = amount % 200.

        // Here dividing the total money stored in var 'amount' by 200 and storing the remainder in the same var 'amount' and it is now the new value of variable 'amount'.

        System.out.println("Rs 100 notes : " + (amount / 100));
        // printing the no. of 100 notes in the total amount stored in var 'amount'.

        // getting the no.of 100 notes by dividing the value of var 'amount' by 100.

        // printing the quotient of amount / 100 .

        amount %= 100;
        // amount %= 100 --> amount = amount % 100.

        // Here dividing the total money stored in var 'amount' by 100 and storing the remainder in the same var 'amount' and it is now the new value of variable 'amount'.

        System.out.println("Rs 50 notes : " + (amount / 50));
        // printing the no. of 50 notes in the total amount stored in var 'amount'.

        // getting the no.of 50 notes by dividing the value of var 'amount' by 50.

        // printing the quotient of amount / 50 .

        amount %= 50;
        // amount %= 50 --> amount = amount % 50.

        // Here dividing the total money stored in var 'amount' by 50 and storing the remainder in the same var 'amount' and it is now the new value of variable 'amount'.

        System.out.println("Rs 20 notes : " + (amount / 20));
        // printing the no. of 20 notes in the total amount stored in var 'amount'.

        // getting the no.of 20 notes by dividing the value of var 'amount' by 20.

        // printing the quotient of amount / 20 .

        amount %= 20;
        // amount %= 20 --> amount = amount % 20.

        // Here dividing the total money stored in var 'amount' by 20 and storing the remainder in the same var 'amount' and it is now the new value of variable 'amount'.

        System.out.println("Rs 10 notes : " + (amount / 10));
        // printing the no. of 10 notes in the total amount stored in var 'amount'.

        // getting the no.of 10 notes by dividing the value of var 'amount' by 10.

        // printing the quotient of amount / 10 .

        amount %= 10;
        // amount %= 10 --> amount = amount % 10.

        // Here dividing the total money stored in var 'amount' by 10 and storing the remainder in the same var 'amount' and it is now the new value of variable 'amount'.

        System.out.println("Rs 5 notes : " + (amount / 5));
        // printing the no. of 5 notes in the total amount stored in var 'amount'.

        // getting the no.of 5 notes by dividing the value of var 'amount' by 5.

        // printing the quotient of amount / 5 .

        amount %= 5;
        // amount %= 5 --> amount = amount % 5.

        // Here dividing the total money stored in var 'amount' by 5 and storing the remainder in the same var 'amount' and it is now the new value of variable 'amount'.

        System.out.println("Rs 2 notes : " + (amount / 2));
        // printing the no. of 2 notes in the total amount stored in var 'amount'.

        // getting the no.of 2 notes by dividing the value of var 'amount' by 2.

        // printing the quotient of amount/2 .

        amount %= 2;
        // amount %= 2 --> amount = amount % 2.

        // Here dividing the total money stored in var 'amount' by 2 and storing the remainder in the same var 'amount' and it is now the new value of variable 'amount'.

        System.out.println("Rs 1 notes : " + (amount / 1));
        // printing the no. of 1 notes in the total amount stored in var 'amount'.

        // getting the no.of 1 notes by dividing the value of var 'amount' by 1.

        // printing the quotient of amount/1 .

        amount %= 1;
        // amount %= 1 --> amount = amount % 1.

        // Here dividing the total money stored in var 'amount' by 1 and storing the remainder in the same var 'amount' and it is now the new value of variable 'amount'.

        sc.close();        
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.
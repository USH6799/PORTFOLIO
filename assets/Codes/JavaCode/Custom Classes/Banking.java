import java.util.Scanner;
// imported scanner class for taking input from user.

/**
 * Banking
 */

class Account{
    // Custom Created Class 'Account' means (doesn't contain main fnc) , classname Account

    double balance;
    // A variable 'balance' just declared of datatype double.

    // double dataype because it may contain decimal values.

    int ac_no;
    // A variable 'ac_no' just declared of datatype Integer.

    public void setBalance(double bl) {
         // A custom Created fnc 'setBalance(bl)' taking 1 parameter 'bl' of datatype double, returning void(nothing) to the Caller.

        balance = bl;
        // Storing the Value of parameter var 'bl' in the var 'balance'.

    }// Custom fnc 'setBalance(bl)' ends here.

    public void setAc_no(int n) {
         // A custom Created fnc 'setAc_no(n)' taking 1 parameter 'n' of datatype Integer, returning void(nothing) to the Caller.

        ac_no = n;
        // Storing the value of parameter 'n' in the var 'ac_no'.

    }// Custom fnc 'setAc_no(n)' ends here.

    private double Interest(double r){
         // A custom Created fnc 'Interest(r)' taking 1 parameter 'r' of datatype double, returning value(double) to the Caller of the Fnc.

        double si = (balance * r * 1) / 100;
        // Calculating the eqn and returning the value or answer in the variable 'si' of datatype double.

        // double dataype because it may contain decimal values.

        return si;
        // Returing the value of var 'si' to the caller of the Function.

    }// Custom fnc 'Interest(r)' ends here.

    void Details(){
         // A custom Created fnc 'Details()' taking no parameters and returning void(nothing) to the Caller.

        System.out.printf("The Total Balance Rs.%f Available in the Account\n" , balance);
        // Printing the total balance in the account of the user.

        // using system.out.printf() or .format(), to print the strings and variable combined more easily.
        // The syntax is like this- ("String part %d %s %f %c" , variables), 
        // In this all characters followed by % sign represent data type of variables like %s - String, %c - char %f - float, %d - integer.

        System.out.println("The Account no. was " + ac_no);
        // Printing the account no. of the user.

    }// Custom fnc 'Details()' ends here.

    void UpdateBalance(double r){
         // A custom Created fnc 'UpdateBalance(r)' taking 1 parameter 'r' of datatype double, returning void(nothing) to the Caller.

        double interest = Interest(r);
        // Storing the returned value came from the fnc 'interest(r)' when it is Called with the argument 'r'.

        // double dataype because it may contain decimal values.

        System.out.println("***************************************");
        // Printing line for making code look better.
        
        System.out.println("Balance Before The Interest Added: Rs." + balance);
        // Printing the Balance before adding the Interest.
        
        balance += interest;
        // balance += interest => balance = balance + interest
        
        // Adding the value of var 'balance' and var 'interest' and storing it in the var 'balance' as the new value.
        
        System.out.println("Interest Earned: Rs." + interest);
        // Printing the Interest earned.
        
        System.out.println("Balance After The Interest Added: Rs." + balance);
        // Printing the Balance After adding the Interest.
        
        System.out.println("***************************************");
        // Printing line for making code look better.
        
    }// Custom fnc 'UpdateBalance(r)' ends here.

    
}// Custom class 'Account' ends here.

public class Banking {
    // main class , classname 'Banking'

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        Account ac = new Account();
        // Creating an object 'ac' of Class 'Account' to access the class methods and variables.

        // Syntax of obj creation:- <classname> <objectname> = new <classname> ();

        System.out.print("Enter The Money: ");
        // Asking the user to enter the Amount or money/balance.

        double money = sc.nextDouble();
        // Taking input From the user and storing it in var 'money' of datatype double.

        // double dataype because it may contain decimal values.

        ac.setBalance(money); 
        // Accesing the method 'setBalance(bl)' of the class 'Account' using the object created 'ac'.

        // Where the var 'money' is passed as argument, which later saves in var 'bl' as parameter.


        System.out.print("Enter The Account Number: ");
        // Asking the User to Enter the Account number.

        int x = sc.nextInt();
        // Taking input from user and storing it in var 'x' of datatype Integer.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        ac.setAc_no(x); 
        // Accesing the method 'setAc_no(n)' of the class 'Account' using the object created 'ac'.

        // Where the var 'x' is passed as argument, which later saves in var 'n' as parameter.
        
        System.out.print("Enter The Rate Of Interest: ");
        // Asking the user to enter the rate% or the rate of Interest.
        
        double rate = sc.nextDouble();
        // Taking input from user and storing it in var 'rate' of datatype Double.
        
        // double dataype because it may contain decimal values.
        
        ac.UpdateBalance(rate);
        // Accesing the method 'UpdateBalance()' of the class 'Account' using the object created 'ac'.
        
        // Where the var 'rate' is passed as argument, which later saves in var 'r' as parameter.

        ac.Details();
        // Accesing the method 'Details()' of the class 'Account' using the object created 'ac'.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.

// Dry Run Explanation:

// Suppose the user inputs the following values:
// Money = 5000.0
// Account Number = 123456
// Rate of Interest = 5.0

// Step 1: Creating Scanner object
// Scanner sc = new Scanner(System.in);

// Step 2: Creating Account object
// Account ac = new Account();

// Step 3: Asking user to enter the money
// System.out.print("Enter The Money: ");
// User input: 5000.0

// Step 4: Setting balance using setBalance method
// ac.setBalance(5000.0);

// Step 5: Asking user to enter the account number
// System.out.print("Enter The Account Number: ");
// User input: 123456

// Step 6: Setting account number using setAc_no method
// ac.setAc_no(123456);

// Step 7: Asking user to enter the rate of interest
// System.out.print("Enter The Rate Of Interest: ");
// User input: 5.0

// Step 8: Updating balance using UpdateBalance method
// ac.UpdateBalance(5.0);

// Inside UpdateBalance method:
// Step 1: Calculating interest
// double interest = Interest(5.0);
// interest = (5000.0 * 5.0 * 1) / 100 = 250.0

// Step 2: Printing balance before interest added
// System.out.println("Balance Before The Interest Added: Rs." + balance);
// Output: Balance Before The Interest Added: Rs.5000.0

// Step 3: Adding interest to balance
// balance += interest;
// balance = 5000.0 + 250.0 = 5250.0

// Step 4: Printing interest earned
// System.out.println("Interest Earned: Rs." + interest);
// Output: Interest Earned: Rs.250.0

// Step 5: Printing balance after interest added
// System.out.println("Balance After The Interest Added: Rs." + balance);
// Output: Balance After The Interest Added: Rs.5250.0

// Step 6: Printing separator
// System.out.println("***************************************");
// Output: ***************************************

// Step 9: Displaying account details using Details method
// ac.Details();

// Inside Details method:
// System.out.printf("The Total Balance Rs.%f Available in the Account\n" , balance);
// Output: The Total Balance Rs.5250.0 Available in the Account

// System.out.println("The Account no. was " + ac_no);
// Output: The Account no. was 123456

// Step 10: Closing Scanner object
// sc.close();

// End of program

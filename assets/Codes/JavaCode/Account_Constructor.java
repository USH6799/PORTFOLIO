public class Account_Constructor {
    // classname Account_Updated

    double balance;
    // A class variable 'balance' Just Declared of Datatype double.
    
    // Class variable means defined wtihout any fnc/method, it can be accessed anywhere and in any fnc inside the Class.
    
    // double dataype because it may contain decimal values.
    
    int acno;
    // A class variable 'acno' Just Declared of Datatype Integer.
    
    // Class variable means defined wtihout any fnc/method, it can be accessed anywhere and in any fnc inside the Class.

    // Integer Datatype because it doesn't contain any floating/decimal values.

    Account_Constructor(double p , int n){ // here as you see this is the constructor of class Account_Construcor, it has same name as the class and hence it is known as constructor fnc which can be directly called during object creation.

        // Taking 2 parameters 'p' and 'n'

        balance = p; // Setting the value of 'balance' as p.
        acno = n; // Setting the value of 'acno' as n.

    }// constructor fnc ends here.


    double calcInterest(double amt , double rate){
        // A custom Created fnc 'calcInterest(amt,rate)' taking 2 parameters 'amt' and 'rate' of datatype Double, returning Value(double) to the Caller.

        double interest = (amt * rate * 1) / 100;
        // finding the interest on given amount and the rate of interest for 1 year and Storing the result in var 'interest' of datatype Double.

        return interest;
        // Returning the value of var 'interest' to the caller of the fnc.

    }// Custom fnc 'calcInterest(amt,rate)' ends here.


    void UpdateBalance(Account_Constructor ac1 , double r){
        // A custom Created fnc 'UpdateBalance(p,r)' taking 2 parameters 'p' and 'r' of datatype Account or class and double, returning void(nothing) to the Caller.

        double SI = calcInterest(ac1.balance , r);
        // Calling the fnc 'calcInterest(amt,rate) by passing 2 arguments value of balance in obj 'p' & 'r' .

        // Storing the Returned value of the fnc to the variable 'SI'(Caller of the fnc) of datatype double.

        // Inside the fnc: 'p' -> 'amt' & 'r' -> 'rate'.

        System.out.println("The Initial Balance was: " + ac1.balance);
        // Printing the intital balance of the Account before adding interest to it.

        double amt = ac1.balance + SI;
        // Adding interest 'SI' to the Principal balance 'p' and Storing the Final Amount in var 'amt' of datatype Double.

        System.out.println("The Interest Earned on Rs." + ac1.balance + " at the rate of " + r + "% is: " + SI);
        // Printing the interest earned by the account on 'p' at the rate of 'r'.

        System.out.println("The Updated Balance was: " + amt);
        // Printing the Balance after adding interest which is stored in var 'amt'.

    }// Custom fnc 'UpdateBalance(p,r)' ends here.

    void display(){
        // A custom Created fnc 'display()' taking no paramaters, returning void(nothing) to the Caller.

        System.out.println("Account No. " + acno);
        // Printing the account no. of the Account.

        System.out.println("Balance: " + balance);
        // Printing the Balance of the Account.

    }// Custom fnc 'display()' ends here.

    public static void main(String[] args) {
        // main fnc to run the code.

        Account_Constructor ac1 = new Account_Constructor(1200 , 34000);
        // Creating an object 'ac1' of Class Account to access the class methods and variables.

        // Also calling the constructor by passing 2 arguments.

        // Syntax of obj creation:- <classname> <objectname> = new <classname> ();

        
        ac1.UpdateBalance(ac1, 7.5);
        // Accessing the Custom fnc 'UpdateBalance(p,r)' of the custom class 'Account' using the object 'ac1'.
        
        // Passing 2 arguments in the fnc '34000' & '7.5' which are later inside the fnc becomes the value of var 'p' and 'r' respectively.

        ac1.display();

    }// main fnc ends here.

}// class closes here.

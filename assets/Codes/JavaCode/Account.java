public class Account {
    // classname Account

    double balance;
    // A class variable 'balance' Just Declared of Datatype double.
    
    // Class variable means defined wtihout any fnc/method, it can be accessed anywhere and in any fnc inside the Class.
    
    // double dataype because it may contain decimal values.
    
    int acno;
    // A class variable 'acno' Just Declared of Datatype Integer.
    
    // Class variable means defined wtihout any fnc/method, it can be accessed anywhere and in any fnc inside the Class.

    // Integer Datatype because it doesn't contain any floating/decimal values.

    void getDetails(int a , double b){
        // A custom Created fnc 'getDetails(a,b)' taking 2 parameters 'a' and 'b' of datatype Integer and double, returning void(nothing) to the Caller.

        acno = a;
        // Storing the value of parameter 'a' in var 'acno'
        
        balance = b;
        // Storing the value of parameter 'b' in var 'balance'

    }// custom fnc 'getDetails(a,b)' ends here.


    double calcInterest(double amt , double rate){
        // A custom Created fnc 'calcInterest(amt,rate)' taking 2 parameters 'amt' and 'rate' of datatype Double, returning Value(double) to the Caller.

        double interest = (amt * rate * 1) / 100;
        // finding the interest on given amount and the rate of interest for 1 year and Storing the result in var 'interest' of datatype Double.

        return interest;
        // Returning the value of var 'interest' to the caller of the fnc.

    }// Custom fnc 'calcInterest(amt,rate)' ends here.


    void UpdateBalance(double p , double r){
        // A custom Created fnc 'UpdateBalance(p,r)' taking 2 parameters 'p' and 'r' of datatype double, returning void(nothing) to the Caller.

        double SI = calcInterest(p , r);
        // Calling the fnc 'calcInterest(amt,rate) by passing 2 arguments 'p' & 'r' .

        // Storing the Returned value of the fnc to the variable 'SI'(Caller of the fnc) of datatype double.

        // Inside the fnc: 'p' -> 'amt' & 'r' -> 'rate'.

        System.out.println("The Initial Balance was: " + p);
        // Printing the intital balance of the Account before adding interest to it.

        double amt = p + SI;
        // Adding interest 'SI' to the Principle balance 'p' and Storing the Final Amount in var 'amt' of datatype Double.

        System.out.println("The Interest Earned on Rs." + p + " at the rate of " + r + "% is: " + SI);
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

        Account ac1 = new Account();
        // Creating an object 'ac1' of Class Account to access the class methods and variables.

        // Syntax of obj creation:- <classname> <objectname> = new <classname> ();

        ac1.getDetails(1203, 34000);
        // Accessing the Custom fnc 'getDetails(a,b)' of the custom class 'Account' using the object 'ac1'.
        
        // Passing 2 arguments in the fnc '1203' & '34000' which are later inside the fnc becomes the value of var 'a' and 'b' respectively.
        
        ac1.UpdateBalance(34000, 7.5);
        // Accessing the Custom fnc 'UpdateBalance(p,r)' of the custom class 'Account' using the object 'ac1'.
        
        // Passing 2 arguments in the fnc '34000' & '7.5' which are later inside the fnc becomes the value of var 'p' and 'r' respectively.

        ac1.display();

    }// main fnc ends here.

}// class closes here.

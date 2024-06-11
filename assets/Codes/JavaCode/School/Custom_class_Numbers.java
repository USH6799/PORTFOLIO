import java.util.Scanner;
// imported scanner class for taking input from user.

class CalcExpo{
    // Custom Created Class 'CalcExpo' means (doesn't contain main fnc) , classname CalcExpo

    double base;
    // variable 'base' of datatype double to store the value of number, only Declared Not intialized.

    // double dataype because it may contain decimal values.
    
    double expo;
    // variable 'expo' of datatype double to store the value of power, only Declared Not intialized.

    // double dataype because it may contain decimal values.
    
    void getArgs(double b, double e){
        // A custom Created fnc 'getArgs' taking 2 parameters 'b' and 'e' of datatype double, returning void(nothing) to the Caller.

        base = b;
        // Setting the value of variable 'base' by the value of parameter 'b' .
        
        expo = e;
        // Setting the value of variable 'expo' by the value of parameter 'e' .

    }// custom fnc 'getArgs' ends here.


    double Power(){
         // A custom Created fnc 'Power' taking no parameters, returning Value(double datatype) to the Caller.

         double newNum = Math.pow(base , expo);
         // a variable 'newNum' storing the value of base raised to power expo, like ex:-

         // using Math.pow(base , power):- to find the value of given base and power using this. 

         // base = 4 and expo = 2 , then it stores 4 raised to the power of 2 , or 4 X 4 = 16.

         // double dataype because it may contain decimal values.

        return newNum;
        // returning the value of var 'newNum' to the caller.

    }// Custom created fnc 'power' ends here.
    
    double SqRoot(){
         // A custom Created fnc 'SqRoot' taking No parameters , returning value(double datatype) to the Caller.

         double rootedNum = Math.sqrt(base);
         // variable 'rootedNum' storing the value of sqrt of given value stored in var 'base' of datatype double.

         // double dataype because it may contain decimal values.
         
         // using Math.sqrt(number):- To find the Square Root of a given number using this. 

        return rootedNum;
        // returns the value of var 'rootedNum' to the caller of the fnc.

    }// Custom created fnc 'SqRoot' ends here.

}// Custom Created Class 'CalcExpo' ends here.


public class Custom_class_Numbers {
    // The main class (contains the main fnc) , classname Custom_class_numbers

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        CalcExpo num = new CalcExpo();
        // Creating an object 'num' of Class CalcExpo to access the class methods and variables.

        // Syntax of obj creation:- <classname> <objectname> = new <classname> ();

        System.out.print("Enter The Base: ");
        // Asking the User to Enter the value of its base number.

        double base = sc.nextDouble();
        // taking input from user and storing the value in variable 'base' of datatype double.

        // double dataype because it may contain decimal values.

        System.out.print("Enter The Exponent: ");
        // Asking the user to enter the value of the power of the number.
        
        double expo = sc.nextDouble();
        // taking input from user and storing the value in variable 'expo' of datatype double.

        // double dataype because it may contain decimal values.

        num.getArgs(base , expo);
        // Using object 'num' with .(dot) operator to access class methods and calling 'getArgs' method of class 'CalcExpo' and giving two arguments var 'base' for var 'b' and var 'expo' for var 'e' of Same datatype.

        // double dataype because it may contain decimal values.

        System.out.println("The Number " + base + " Raised to the Power "+ expo + " was: " + num.Power());
        // printing the value of the given number 'base' raised to power 'expo'.

        // used object 'num' with . operator to access its class methods and calling Power() method and the Power methos returned the value to its caller (Here ,the caller was the print fnc).

        System.out.println("The Sqroot Was: " + num.SqRoot());
        // printing the Square Root of the given number 'base'.

        // used object 'num' with . operator to access its class methods and calling Sqrt() method and the Sqrt method returned the value to its caller (Here , the caller was the print fnc).

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.

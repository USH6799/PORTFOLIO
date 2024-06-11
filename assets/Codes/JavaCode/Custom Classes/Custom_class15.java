class base{
    // Custom Created Class 'base' means (doesn't contain main fnc) , classname base

    // This class is the parent class, means it doesnt inherit anything of any other class but other classes or derived classes can access this class through extends keyword.


    base(){
        // A Constructor fnc 'base()' returning nothing, taking no parameters.
        
        // this is the constructor fnc of 0 parameters.
        
        // A constructor fnc is the fnc with the same name of the class, and which can be called directly during object creation or just by new keyword.
        
        System.out.println("I am a constructor With 0 Parameter");
        // Printing that it is the call of constructor of 0 parameter.

    }// Custom fnc 'base()' ends here.


    base(int a){
        // A Constructor fnc 'base(a)' returning nothing, taking 1 parameter 'a'.
        
        // this is the constructor fnc of 1 parameters.
        
        // A constructor fnc is the fnc with the same name of the class, and which can be called directly during object creation or just by new keyword.

        // Overloaded functions are the functions which have the same name but taking diffrent no. of parameters inside them.
        
        System.out.println("I am a Overloaded constructor of 1 parameter, value of a: " + a);
        // Printing that this is the constructor fnc of 1 parameter.

    }// Overloaded fnc 'base(a)' ends here.

}// Custom Class or parent class 'base' ends here.


class Derived extends base{
    // Custom Created Class 'Derived' means (doesn't contain main fnc) , classname Derived

    // Using 'extends' keyword, It Extends or inherit the data members(variables and methods) of parent class 'base'.
    

    Derived(){
        // A Constructor fnc 'Derived()' returning nothing, taking no parameters.
        
        // this is the constructor fnc of 0 parameters.
        
        // A constructor fnc is the fnc with the same name of the class, and which can be called directly during object creation or just by new keyword.
        
        
        super(3);
        // Calling the Constructor Method of Parent class 'base'.

        // Passing 1 arguments , which means it is calling the overloaded constructot method with 1 parameter.

        // Accessing the custom fnc 'base(a)' of the custom class 'base' using the object 'derived' of 'Derived' bacause 'Derived' extends 'base' and it has access to all the variables and methods of 'base'.

        // Used 'super(3)' to tell the computer that the function is calling the constructor(1 parameter) of the Parent class 'base'.

        System.out.println("I am the constructor of Derived class");
        // Printing that this Cosntrucor is of Derived class.

    }// Custom fnc 'Derived()' ends here.

}// Custom class or child class 'Derived()' ends here.


public class Custom_class15 {
    // It is the main class bcoz it contains the main method.

    // classname Custom_class15

    public static void main(String[] args) {
        // main fnc to run the code.

    new base();
    // Calling the Constructor method 'base()' of Custom class 'base' using new keyword. 
    
    new Derived(); // it inherits the base class constructor fnc
    // Calling the Constructor method 'Derived()' of Custom class 'Derived' using new keyword. 

    }// main fnc closes here.

}// class ends here.

// Dry Run:- 

/*
 * STEP 1:
 *      calling construcor 'base()' of the Custom class 'base'.
 * 
 *      Inside base() fnc:
 *          printing the Statement:- "I am a constructor With 0 Parameter".
 * 
 * STEP 2:
 *      Calling Constructor 'Derived()' of the Custom Class 'Derived'.
 * 
 *      Inside The Derived() fnc:
 *          Calling the Constructor of its parent class with 1 parameter 'a' or '3' .
 *          
 *          Using super(3) it calls the constructor of Parent class 'base'.
 * 
 *          Inside base class, there are 2 constructors:
 *              Checking constructor method with 1 parameter.
 * 
 *              Calling base(a) constructor method.
 * 
 *              Inside base(a) Constructor Method:
 *                  base(3):- a = 3
 * 
 *                  Printing the statement:- "I am a Overloaded constructor of 1 parameter, value of a: 3" .
 * 
 *                  base(a) cosntructor ends here.
 *              base class ends here.
 * 
 *          Inside the Derived() fnc Printing the Statement:- "I am the constructor of Derived class".
 * 
 *          Derived() fnc ends here.
 * 
 * Program ends...
 * 
 * 
 * Output: 
 * 
 *      I am a constructor With 0 Parameter
        I am a Overloaded constructor of 1 parameter, value of a: 3
        I am the constructor of Derived class
 */

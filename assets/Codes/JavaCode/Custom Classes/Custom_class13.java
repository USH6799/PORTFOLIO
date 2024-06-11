class Parent_class{ 
    // Custom Created Class 'Parent_Class' means (doesn't contain main fnc) , classname Parent_Class

    // This class is the parent class, means it doesnt inherit anything of any other class but other classes or derived classes can access this class through extends keyword.

    private int x = 3;
    // a private variable 'x' storing 3 of datatype integer.

    // Integer Datatype because it doesn't contain any floating/decimal values.

    // private (access specifier) used here so that no other class other than this class can access this variables directly or through objects.

    public int getX() {
        // A getter fnc getX()' to get the value of private variable 'x' in form of returned value(integer) from the fnc, taking no paramters. 

        return x;
        // returning the value of private var 'x' of datatype integer to the caller.

    }// custom fnc 'getX()' ends here.

    public void setX(int a) {
        // A setter fnc 'setX(a)' to set the value of private variable 'x' taking 1 parameter 'a' of datatype Integer. 

        x = a;
        // Storing the value of var 'a' in var 'x' as its value.

    }// Custom fnc 'setX(a)' ends here.

    void PrintMe(){
         // A custom Created fnc 'PrintMe()' taking no parameters, returning void(nothing) to the Caller.

        System.out.println("I Was Present In the Parent Class");
        // Printing that this fnc is present in parent class 'Parent_Class'.

    }// Custom fnc 'PrintMe()' ends here.

}// Custom class 'Parent_Class' ends here.


class Child_class extends Parent_class{
    // Custom Created Class 'Child_Class' means (doesn't contain main fnc) , classname Child_Class.

    // Using 'extends' keyword, It Extends or inherit the data members(variables and methods) of parent class 'Parent_Class'.

    private int y;
    // A Private variable 'y' just declared of datatype integer.
    

    public void setY(int b) {
        // A setter fnc 'setY(b)' to set the value of private variable 'y' taking 1 paramter 'b' of datatype Integer. 

        y = b;
        // Storing the value of var 'b' in var 'y' as its value.

    }// Custom fnc 'setY(b)' ends here.


    public int getY() {
        // A getter fnc 'getY()' to get the value of private variable 'y' in form of returned value(integer) from the fnc, taking no paramters. 

        return y;
        // returning the value of private var 'y' of datatype integer to the caller.

    }// Custom fnc 'getY()' ends here.


}// Custom class 'Child_Class' ends here.

public class Custom_class13 {
    // It is the main class of this code.

    // classname Custom_class13
    public static void main(String[] args) {
        // main fnc to run the code.

        Parent_class base = new Parent_class();
        // Creating an object 'base' of Class 'Parent_class' to access the class methods and variables.

        base.setX(5);
        // Accessing setter fnc 'setX(5)' of the custom class 'Parent_class' using the object 'base' .

        System.out.println(base.getX());
        // base.getX() used to return the value of var 'x' of datatype integer to the caller.

        // Accessing getter fnc 'getX()' of the custom class 'Parent_class' using the object 'base' .


        // Passing 5 as the argument , which later becomes the value of var 'a' inside the setter fnc.
        
        base.PrintMe();   
        // Accessing the custom fnc 'PrintMe()' of the custom class 'Parent_class' using the object 'base' .


        Child_class derived = new Child_class();
        // Creating an object 'derived' of Class 'Child_class' to access the class methods and variables.

        derived.setY(10);
        // Accessing setter fnc 'setY(10)' of the custom class 'Child_class' using the object 'derived' .

        // Passing 10 as the argument , which later becomes the value of var 'b' inside the setter fnc.

        System.out.println(derived.getY());
        // Accessing getter fnc 'getY()' of the custom class 'Child_class' using the object 'derived' .

        // printing the value of var 'y' of datatype integer.

        derived.setX(10);
        // Accessing setter fnc 'setX(10)' of the custom class 'Parent_class' using the object 'derived' of 'Child_class' bacause 'Child_class' extends 'Parent_class' and it has access to all the variables and methods of 'Parent_class'.

        // Passing 10 as the argument , which later becomes the value of var 'a' inside the setter fnc.

        System.out.println(derived.getX());
        // Accessing getter fnc 'getX()' of the custom class 'Parent_class' using the object 'derived' of 'Child_class' bacause 'Child_class' extends 'Parent_class' and it has access to all the variables and methods of 'Parent_class'.
        
        // printing the value of var 'x' of datatype integer.
        
        derived.PrintMe();   
        // Accessing getter fnc 'PrintMe()' of the custom class 'Parent_class' using the object 'derived' of 'Child_class' bacause 'Child_class' extends 'Parent_class' and it has access to all the variables and methods of 'Parent_class'.
        
    }// main fnc ends here.

}// 'Custom_class13' ends here. 

// Explanation: This code is basically a custom class, which is created in order to demonstrate the concepts of inheritance.


/* Dry Run:

1. Creating `base` object of Parent_class:
    - `Parent_class base = new Parent_class();`
    - Calls Parent_class constructor (default values of x = 3).

2. Setting x value for `base`:
    - `base.setX(5);`
    - x is set to 5.
    
3. Getting x value for `base`:
    - `System.out.println(base.getX());`
    - Prints: 5.
    
4. Calling PrintMe for `base`:
    - `base.PrintMe();`
    - Prints: "I Was Present In the Parent Class".

5. Creating `derived` object of Child_class:
    - `Child_class derived = new Child_class();`
    - Calls Parent_class constructor (default values of x = 3), Child_class does not have its own constructor, so Parent_class constructor is called.

6. Setting y value for `derived`:
    - `derived.setY(10);`
    - y is set to 10.
    
7. Getting y value for `derived`:
    - `System.out.println(derived.getY());`
    - Prints: 10.
    
8. Setting x value for `derived`:
    - `derived.setX(10);`
    - x is set to 10 (Parent_class method accessible to Child_class).

9. Getting x value for `derived`:
    - `System.out.println(derived.getX());`
    - Prints: 10.
    
10. Calling PrintMe for `derived`:
    - `derived.PrintMe();`
    - Prints: "I Was Present In the Parent Class".
*/
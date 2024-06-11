class Employee{
    // Custom Created Class 'Employee' means (doesn't contain main fnc) , classname Employee

    private int id;
    // A private variable 'id' just declared of datatype Integer.

    // private (access specifier) used here so that no other class other than this class can access this variables directly or through objects.

    private String name;
    // A private variable 'name' just declared of datatype String.

    // private (access specifier) used here so that no other class other than this class can access this variables directly or through objects.

    // double dataype because it may contain decimal values.


    Employee(){
        // The 1st overloaded Constructor fnc 'Employee()' returning nothing, taking no parameters.

        // this is the constructor fnc of 0 parameters.

        // A constructor fnc is the fnc with the same name of the class, and which can be called directly during object creation or just by new keyword.

        // Syntax: <classname>(<parameters>){<code>}

        // Fnc name is same as the classname and at the time of calling, if you want to access other data members of the class then u can create object , otherwise u can directly call the constructor fnc using new keyword.

        // Syntax: new <constructor_fnc>;


        name = "ananya";
        // Setting the value of private var 'name' as "ananya" .

        id = 45;
        // Setting the value of private var 'id' as 45 .

    }// Constructor fnc 'Employee()' ends here.


    Employee(String n){
        // the 2nd Overloaded Constructor fnc 'Employee(n)' returning nothing, taking 1 parameters.
        
        // this is the Overloaded constructor fnc of 1 parameter.
        
        // Overloaded functions are the functions which have the same name but taking diffrent no. of parameters inside them.
        
        // A constructor fnc is the fnc with the same name of the class, and which can be called directly during object creation or just by new keyword.
        
        
        name = n;
        // Storing the value of parameter 'n' in the private var 'name'.

        id = 67;
        // Setting the value of private var 'id' as 67.
        
    }// Overloaded constructor fnc 'Employee(n)' ends here.
    
    
    Employee(String n , int i){
        // the 3rd Overloaded Constructor fnc 'Employee(n,i)' returning nothing, taking 3 parameters.

        // this is the constructor fnc of 2 parameters.
        
        // A constructor fnc is the fnc with the same name of the class, and which can be called directly during object creation or just by new keyword.
        
        // Overloaded functions are the functions which have the same name but taking diffrent no. of parameters inside them.

        name = n;
        // Storing the value of parameter 'n' in the private var 'name' .
        
        id = i;
        // Storing the value of parameter 'i' in the private var 'id' .
        
    }// Overloaded constructor fnc 'Employee(n,i)' ends here.

    
    void printdetails(){
         // A custom Created fnc 'printdetails()' taking no parameter, returning void(nothing) to the Caller.

        System.out.println("The name of the Employee was: " + name);
        // printing the name of the employee stored in private var 'name' .

        System.out.println("The Id of the Employee was: " + id);
        // printing the name of the employee stored in private var 'id' .

    }// Custom fnc 'printdetails()' ends here.

}// Custom class ends here.

public class Custom_class8 {
    // It is the main class bcoz it contains the main fnc.

    // classname Custom_class8

    public static void main(String[] args) {
        // main fnc to run the code.

        Employee emp1 = new Employee();
        // Calling 1st Overloaded constructor fnc 'Employee()' through new keyword.
        
        // Also creating an object 'emp1' of class 'Employee' to access its method and variables.

        emp1.printdetails();
        // Accessing custom fnc 'printdetails()' of the custom class 'Employee' using the object 'emp1'.


        Employee emp2 = new Employee("Uttkarsh");
        // Calling 2nd Overloaded constructor fnc 'Employee(n)' through new keyword.
        
        // Also creating an object 'emp2' of class 'Employee' to access its method and variables.

        emp2.printdetails();
        // Accessing custom fnc 'printdetails()' of the custom class 'Employee' using the object 'emp2'.


        Employee emp3 = new Employee("Abhay" , 24);
        // Calling 3rd Overloaded constructor fnc 'Employee(n,i)' through new keyword.
        
        // Also creating an object 'emp3' of class 'Employee' to access its method and variables.

        emp3.printdetails();
        // Accessing custom fnc 'printdetails()' of the custom class 'Employee' using the object 'emp3'.

    }// main fnc closes here.

}// class ends here.


// Dry Run Explanation:

// Step 1: Creating Employee object emp1 using the default constructor
// Employee emp1 = new Employee();
// Inside default constructor:
// name = "ananya";
// id = 45;
// Output of emp1.printdetails():
// The name of the Employee was: ananya
// The Id of the Employee was: 45

// Step 2: Creating Employee object emp2 using the constructor with one parameter
// Employee emp2 = new Employee("Uttkarsh");
// Inside constructor with one parameter:
// name = "Uttkarsh";
// id = 67; (default value)
// Output of emp2.printdetails():
// The name of the Employee was: Uttkarsh
// The Id of the Employee was: 67

// Step 3: Creating Employee object emp3 using the constructor with two parameters
// Employee emp3 = new Employee("Abhay" , 24);
// Inside constructor with two parameters:
// name = "Abhay";
// id = 24;
// Output of emp3.printdetails():
// The name of the Employee was: Abhay
// The Id of the Employee was: 24

// End of program

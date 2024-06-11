class Employee{
    // Custom Created Class 'Employee' means (doesn't contain main fnc) , classname Employee

    int age;
    // A class variable 'age' just declared of datatype Integer.

    // Integer Datatype because it doesn't contain any floating/decimal values.

    // Class variable means defined wtihout any fnc/method, it can be accessed anywhere and in any fnc inside the Class.


    String name;
    // A class variable 'name' just declared of datatype String.

    // Class variable means defined wtihout any fnc/method, it can be accessed anywhere and in any fnc inside the Class.

    int Salary(){
         // A custom Created fnc 'Salary()' taking no parameter, returning Integer value to the Caller of the Fnc.

        int salary;
        // A variable 'salary' just declared of datatype salary.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        if(age < 18){
            // if condition checking a condition, if the condition is true then if code will execute and if the condition is false nothing will execute.

            // Condition: is the value of var 'age' is smaller than 18 or not.

            salary = 20000;
            // If the above condition is true, then the value of var 'salary' becomes 20000 .

        }// if code ends here.

        else{
            // If the above condition is false , then else code will run .

            salary = 28000;
            // If the value of var 'age' is more than 18 or equal to 18 then this code will run and the value of var 'salary' becomes 28000 .

        }// else code ends here.

        return salary;
        // Returning the value of var 'salary' to the caller of the fnc.

    }// Custom fnc 'Salary()' ends here.

    void printDetails(){
         // A custom Created fnc 'printDetails()' taking no parameter, returning void(nothing) to the Caller.

        System.out.println("My Name Is: " + name);
        // Printing the Name of the User.

        System.out.println("My Age Is: " + age);
        // Printing the Age of the User.

        int wage = Salary();
        // Storing the value returned by the fnc 'Salary()' in the variable 'wage'(caller) of Integer datatype.

        // Integer Datatype because it doesn't contain any floating/decimal values.

        System.out.println("Reply From Company Below!");
        // Printing the Reply Given by the Company below,

        System.out.println("According To Your Age , We Offer You " + wage + " As Salary");
        // Printing the salary given to a specified employee based on his age.

        System.out.println();
        // Printing a new line.

    }// Custom fnc 'printDetails()' ends here.

}// Custom class 'Employee' ends here.

public class Custom_class1 {
    // This is the main class bcoz it contains main method.

    // classname Custom_class1

    public static void main(String[] args) {
        // main fnc to run the code.

        Employee emp1 = new Employee();
        // Creating an object 'emp1' of Class Employee to access the class methods and variables.

        // Syntax of obj creation:- <classname> <objectname> = new <classname> ();

        emp1.name = "Uttkarsh Shah";
        // Setting the value of var 'name' inside another class using the object 'emp1' to access 'Employee' class variables.

        emp1.age = 15;
        // Setting the value of var 'age' inside another class using the object 'emp1' to access 'Employee' class variables.

        emp1.printDetails();
        // Calling 'printDetails()' fnc of class 'Employee' through the object 'emp1'.

        Employee emp2 = new Employee();
        // Creating an object 'emp2' of Class Employee to access the class methods and variables.

        // Syntax of obj creation:- <classname> <objectname> = new <classname> ();
        
        // Setting the value of var 'name' inside another class using the object 'emp2' to access 'Employee' class variables.
        emp2.name = "Abhay Vaishya";

        // Setting the value of var 'age' inside another class using the object 'emp2' to access 'Employee' class variables.
        emp2.age = 17;

        // Calling 'printDetails()' fnc of class 'Employee' through the object 'emp2'.
        emp2.printDetails();


        // Creating an object 'emp3' of Class Employee to access the class methods and variables.
        Employee emp3 = new Employee();

        // Syntax of obj creation:- <classname> <objectname> = new <classname> ();

        // Setting the value of var 'name' inside another class using the object 'emp3' to access 'Employee' class variables.
        emp3.name = "Ananya Singh";

        // Setting the value of var 'age' inside another class using the object 'emp3' to access 'Employee' class variables.
        emp3.age = 18;

        // Calling 'printDetails()' fnc of class 'Employee' through the object 'emp3'.
        emp3.printDetails();

    }// main fnc closes here.

}// class ends here.



// Dry Run Explanation:

// Employee 1:
// Setting values for emp1:
// emp1.name = "Uttkarsh Shah"
// emp1.age = 15

// Step 1: Creating Employee object emp1
// Employee emp1 = new Employee();

// Step 2: Setting name and age for emp1
// emp1.name = "Uttkarsh Shah"
// emp1.age = 15

// Step 3: Calling printDetails method for emp1
// Inside printDetails method:
// System.out.println("My Name Is: " + name);
// Output: My Name Is: Uttkarsh Shah
// System.out.println("My Age Is: " + age);
// Output: My Age Is: 15
// Inside Salary method:
// salary = 20000
// System.out.println("According To Your Age , We Offer You " + wage + " As Salary");
// Output: According To Your Age , We Offer You 20000 As Salary

// Employee 2:
// Setting values for emp2:
// emp2.name = "Abhay Vaishya"
// emp2.age = 17

// Step 1: Creating Employee object emp2
// Employee emp2 = new Employee();

// Step 2: Setting name and age for emp2
// emp2.name = "Abhay Vaishya"
// emp2.age = 17

// Step 3: Calling printDetails method for emp2
// Inside printDetails method:
// System.out.println("My Name Is: " + name);
// Output: My Name Is: Abhay Vaishya
// System.out.println("My Age Is: " + age);
// Output: My Age Is: 17
// Inside Salary method:
// salary = 28000
// System.out.println("According To Your Age , We Offer You " + wage + " As Salary");
// Output: According To Your Age , We Offer You 28000 As Salary

// Employee 3:
// Setting values for emp3:
// emp3.name = "Ananya Singh"
// emp3.age = 18

// Step 1: Creating Employee object emp3
// Employee emp3 = new Employee();

// Step 2: Setting name and age for emp3
// emp3.name = "Ananya Singh"
// emp3.age = 18

// Step 3: Calling printDetails method for emp3
// Inside printDetails method:
// System.out.println("My Name Is: " + name);
// Output: My Name Is: Ananya Singh
// System.out.println("My Age Is: " + age);
// Output: My Age Is: 18
// Inside Salary method:
// salary = 28000
// System.out.println("According To Your Age , We Offer You " + wage + " As Salary");
// Output: According To Your Age , We Offer You 28000 As Salary

// End of program


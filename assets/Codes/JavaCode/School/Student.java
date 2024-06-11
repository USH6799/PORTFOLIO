

class Student{
    // classname Student

    double mark1;
    // a variable 'mark1' to store the 1st mark of the student , datatype double. 

    double mark2;
    // a variable 'mark2' to store the 2nd mark of the student , datatype double. 

    double mark3;
    // a variable 'mark3' to store the 3rd mark of the student , datatype double. 

    double avg;
    // A variable 'avg' to store the Average of the marks of the Student. datatype double.

    double total;
    // A variable 'total' to store tht total marks of the student, datatype double.

    // double dataype because it may contain decimal values.

    void marks(double a , double b , double c){
         // A custom Created fnc 'marks(a,b,c)' taking 3 parameters 'a' , 'b' and 'c' of datatype double, returning void(nothing) to the Caller.

        mark1 = a ;
        // storing the value of var 'a' in the variable 'mark1'.
        mark2 = b ;
        // storing the value of var 'b' in the variable 'mark2'.
        mark3 = c ;
        // storing the value of var 'c' in the variable 'mark3'.

    }// Custom fnc marks(a,b,c) ends here.

    void GetAvg(){
         // A custom Created fnc 'GetAvg()' taking no parameter, returning void(nothing) to the Caller.

        avg = total / 3;
        // Storing the value of (total / 3) in variable 'avg'.

    }// Custom fnc 'GetAvg()' ends here.

    double GetTotal(){
        // A custom Created fnc 'GetTotal()' taking no Parameters, returning value stored in var 'total' (double datatype) to the Caller.

        total = mark1 + mark2 + mark3; 
        // storing the sum of values of var 'mark1' , 'mark2' and 'mark3' in var 'total'

        return total;
        // Returning the Value of var 'total' .

    }// Custom fnc 'getTotal()' ends here.
    
    void result(){
         // A custom Created fnc 'result' taking no parameters , returning void(nothing) to the Caller.

        System.out.println();
        // printing space or extra line.

        System.out.println("You Got " + mark1 + " in 1st subject");
        // printing the marks got in 1st subject

        System.out.println("You Got " + mark2 + " in 2nd subject");
        // printing the marks got in 2nd subject

        System.out.println("You Got " + mark3 + " in 3rd subject");
        // printing the marks got in 3rd subject

        System.out.println("Total Marks: " + total + " Out of 300");
        // Printing the total marks of all 3 subjects.
        
        System.out.println("Average Marks: " + avg);
        // printing the avreage marks of total marks.

    }// Custom created fnc 'result()' ends here.

}// Custom created class 'student' ends here.

// This program will not run because it doesn't contain main method , it is only created for the purpose of invoking and inheriting to use in any other class inside the same package.

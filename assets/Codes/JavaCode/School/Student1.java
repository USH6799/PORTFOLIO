public class Student1 { 
    // classname Student1

    String name; // here 'name' is just declared of datatype String , Class variable means defined wtihout any fnc/method, it can be accessed anywhere and in any fnc inside the Class.

    double mk1 , mk2 , mk3; // Three variables 'mk1' , 'mk2' and 'mk3' just declared of datatype double.

    // double dataype because it may contain decimal values.

    Student1(String str , double mark1 , double mark2 , double mark3){ // A Constructor fnc 'Student1()' returning nothing, taking 4 parameters.
    
    // this is the constructor fnc of 4 parameters.
    
    // A constructor fnc is the fnc with the same name of the class, and which can be called directly during object creation or just by new keyword.

    name = str; // Setting the value of 'str' into 'name'

    mk1 = mark1; // Storing the value of 'mark1' in var 'mk1'

    mk2 = mark2; // Storing the value of 'mark2' in var 'mk2'

    mk3 = mark3; // Storing the value of 'mark3' in var 'mk3'

    }// Constructor fnc ends here.

    String getname(){ // a simple fnc to get the name of the student by calling the fnc, returning String datatype value.

        return name; // returning the value of var 'name' to the caller.

    }// getname() func ends here.

    double getaverage(){ // a simple fnc to get the average of the student by calling the fnc, returning double datatype value.

        return (mk1 + mk2 + mk3) / 3; // returning the value of average of three variables to the caller.

    }// getaverage() func ends here.
    
}// Student1 class ends here.

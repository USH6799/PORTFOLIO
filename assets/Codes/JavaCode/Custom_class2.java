class CellPhone{
    // Custom Created Class 'CellPhone' means (doesn't contain main fnc) , classname CellPhone

    void ring(){
         // A custom Created fnc 'ring()' taking no parameter, returning void(nothing) to the Caller.

        System.out.println("Ringing ...");
        // Printing that the phone is ringing.

    }// Custom fnc 'ring()' ends here.

    void Vibrate(){
         // A custom Created fnc 'Vibrate()' taking no parameter, returning void(nothing) to the Caller.

        System.out.println("Vibrating ...");
        // Printing that the phone is vibrating.

    }// Custom fnc 'Vibrate()' ends here.

    void Mute(){
         // A custom Created fnc 'Mute()' taking no parameter, returning void(nothing) to the Caller.

        System.out.println("Muted!");
        // Printing that the phone is Muted.

    }// Custom fnc 'Mute()' ends here.

    void call(long n){
         // A custom Created fnc 'call(n)' taking 1 parameter 'n' of datatype long, returning void(nothing) to the Caller.

        // Long datatype because the limit of Integer datatype was 2,147,483,647 . So using long datatype whose limit is 9,223,372,036,854,775,807.

        System.out.println("Calling " + n + " ...");
        // Printing that its calling the given number.

    }// Custom fnc 'call(n)' ends here.

}// Custom class 'CellPhone' ends here.

public class Custom_class2 {
    // It is the main class bcoz it contains the main fnc.

    // classname Custom_class2

    public static void main(String[] args) {
        // main fnc to run the code.

        CellPhone iphone = new CellPhone();
        // Creating an object 'iphone' of Class CellPhone to access the class methods and variables.

        iphone.call(8435647099l);
        // Calling the fnc 'call(n)' of clas 'CellPhone' with the help of object 'iphone', and passing a long datatype value as argument.

        // passing a number(8435647099) with the character 'l' specifing that the value is of Long datatype otherwise JVM treats the given value as Integer, which may create issue/error .

        // The value passed as argument will be converted and stored in parameter 'n' inside the fnc.

        // Long datatype because the limit of Integer datatype was 2,147,483,647 . So using long datatype whose limit is 9,223,372,036,854,775,807.


        iphone.ring();
        // Calling the 'ring()' fnc of class 'CellPhone' Using the object 'iphone' to acces the class variables and methods.

        iphone.Vibrate();
        // Calling the 'Vibrate()' fnc of class 'CellPhone' Using the object 'iphone' to acces the class variables and methods.

        iphone.Mute();
        // Calling the 'Mute()' fnc of class 'CellPhone' Using the object 'iphone' to acces the class variables and methods.

    }// main fnc closes here.

}// class ends here.


// Dry Run Explanation:

// Step 1: Creating CellPhone object iphone
// CellPhone iphone = new CellPhone();

// Step 2: Calling call method for iphone
// Inside call method:
// System.out.println("Calling " + n + " ...");
// Output: Calling 8435647099 ...

// Step 3: Calling ring method for iphone
// Inside ring method:
// System.out.println("Ringing ...");
// Output: Ringing ...

// Step 4: Calling Vibrate method for iphone
// Inside Vibrate method:
// System.out.println("Vibrating ...");
// Output: Vibrating ...

// Step 5: Calling Mute method for iphone
// Inside Mute method:
// System.out.println("Muted!");
// Output: Muted!

// End of program

class Animal{
    // Custom Created Class or the Parent class 'Animal' means (doesn't contain main fnc) , classname Animal

    // This class is the parent class, means it doesnt inherit anything of any other class but other classes or derived classes can access this class through extends keyword.

    String name;
    // A variable 'name' just declared of datatype String.

    String type;
    // A variable 'type' just declared of datatype String.

    int age;
    // A variable 'age' just declared of datatype integer.

    boolean canwalk;
    // A variable 'canwalk' just declared of datatype boolean.
    
    boolean canharm;
    // A variable 'canharm' just declared of datatype boolean.

    boolean can_tamed;
    // A variable 'can_tamed' just declared of datatype boolean.

    String color;
    // A variable 'color' of datatype String.

}// custom class 'Animal' ends here.

class Dog extends Animal{
    // Custom Created Class or the Child class 'Dog' means (doesn't contain main fnc) , classname Dog.

    // Using 'extends' keyword, It Extends or inherit the data members(variables and methods) of parent class 'Animal'.

    boolean willBark = true;
    // A variable 'willBark' Storing the value as true of datatype boolean.

    boolean is_friendly;
    // A variable 'is_friendly' just declared of datatype boolean.

    //Boolean datatype because it only contains either true or false as value.

    void details(){
         // A custom Created fnc 'details()' taking no parameters, returning void(nothing) to the Caller.
         
         System.out.printf("Name: %s \n Breed: %s \n Color: %s \n Age: %d \n Can Walk: %b \n Will Bark: %b \n Can harm: %b \n Is friendly: %b \n Can tamed: %b\n\n" , name , type , color , age , canwalk , willBark , canharm , is_friendly , can_tamed); 
         // Printing all the data members(variables and methods) of parent class 'Parent_Class' and then printing the data members(variables and methods) of child class 'Dog'.
         
         // using system.out.printf() or .format(), to print the strings and variable combined more easily.
         // The syntax is like this- ("String part %d %s %f %c" , variables), 
         // In this all characters followed by % sign represent data type of variables like %s - String, %c - char %f - float, %d - integer.
         
        }// Custom fnc 'details()' end here.
        
    }// Custom class 'Dog' ends here.

class Cat extends Animal{
    // Custom Created Class or the child class 'Cat' means (doesn't contain main fnc) , classname Cat.
    
    // Using 'extends' keyword, It Extends or inherit the data members(variables and methods) of parent class 'Animal'.
    
    boolean willMeow = true;
    // A variable 'willMeow' initialized as true of Datatype boolean.
    
    //Boolean datatype because it only contains either true or false as value.
    
    boolean FallDmg = false;
    // A variable 'FallDmg' initialized as false of Datatype boolean.
    
    boolean is_friendly;
    // A variable 'is_friendly' just declared of datatype boolean.
    
    void details(){
        // A custom Created fnc 'details()' taking no parameters, returning void(nothing) to the Caller.
        
        System.out.printf("Name: %s \n Breed: %s \n Color: %s \n Age: %d \n Can Walk: %b \n Can harm: %b \n Can tamed: %b \n Fall Damage: %b\n Is friendly: %b\n Will Meow: %b\n\n" , name , type , color , age , canwalk , canharm , can_tamed , FallDmg , is_friendly , willMeow);

        // Printing all the data members(variables and methods) of parent class 'Parent_Class' and then printing the data members(variables and methods) of child class 'Dog'.
        // Printing all the data members(variables and methods) of parent class 'Parent_Class' and then printing the data members(variables and methods) of child class 'Dog'.
        
        // using system.out.printf() or .format(), to print the strings and variable combined more easily.
        // The syntax is like this- ("String part %d %s %f %c" , variables), 
        // In this all characters followed by % sign represent data type of variables like %s - String, %c - char %f - float, %d - integer.

    }// Custom fnc 'details()' ends here.

}// Custom class 'Cat' ends here.

class Rabbit extends Animal{
    // Custom Created Class or child class 'Rabbit' means (doesn't contain main fnc) , classname Rabbit

    boolean MakeHighJump = true;
    // A variable 'MakeHighJump' storing true as its value of datatype boolean.

    boolean is_friendly = true;
    // A variable 'is_friendly' storing true as its value of datatype boolean.

    //Boolean datatype because it only contains either true or false as value.

    void details(){
         // A custom Created fnc 'getArgs' taking 2 parameters 'b' and 'e' of datatype double, returning void(nothing) to the Caller.
        System.out.printf("Name: %s \n Breed: %s \n Color: %s \n Age: %d \n Can Walk: %b \n Can harm: %b \n Can tamed: %b \n Make High Jumps: %b\n Is friendly: %b\n\n" , name , type , color , age , canwalk , canharm , can_tamed , MakeHighJump , is_friendly);
        
        // Printing all the data members(variables and methods) of parent class 'Parent_Class' and then printing the data members(variables and methods) of child class 'Dog'.
        
        // Printing all the data members(variables and methods) of parent class 'Parent_Class' and then printing the data members(variables and methods) of child class 'Dog'.
        
        // using system.out.printf() or .format(), to print the strings and variable combined more easily.
        // The syntax is like this- ("String part %d %s %f %c" , variables), 
        // In this all characters followed by % sign represent data type of variables like %s - String, %c - char %f - float, %d - integer.

    }// Custom fnc 'details()' ends here.

}// Custom class 'Rabbit' ends here.

public class Custom_class14 {
    // This is the main class bcoz it contains the main method.

    // classname Custom_class14

    public static void main(String[] args) {
        // main fnc to run the code.

        // DOG CLASS - Started

        Dog jimmy = new Dog();
        // Creating an object 'jimmy' of Class Dog to access the class methods and variables.

        jimmy.name = "Jimmy";
        // Accessing the variable 'name' of the custom class 'Animal' using the object 'jimmy' of 'Dog' bacause 'Dog' extends 'Animal' and it has access to all the variables and methods of 'Animal'.
        
        jimmy.age = 6;
        // Accessing the variable 'age' of the custom class 'Animal' using the object 'jimmy' of 'Dog' bacause 'Dog' extends 'Animal' and it has access to all the variables and methods of 'Animal'.

        jimmy.type = "German Shepherd";
        // Accessing the variable 'type' of the custom class 'Animal' using the object 'jimmy' of 'Dog' bacause 'Dog' extends 'Animal' and it has access to all the variables and methods of 'Animal'.

        jimmy.canwalk = true;
        // Accessing the variable 'canwalk' of the custom class 'Animal' using the object 'jimmy' of 'Dog' bacause 'Dog' extends 'Animal' and it has access to all the variables and methods of 'Animal'.

        jimmy.canharm = true;
        // Accessing the variable 'canharm' of the custom class 'Animal' using the object 'jimmy' of 'Dog' bacause 'Dog' extends 'Animal' and it has access to all the variables and methods of 'Animal'.
        
        jimmy.can_tamed = true;
        // Accessing the variable 'can_tamed' of the custom class 'Animal' using the object 'jimmy' of 'Dog' bacause 'Dog' extends 'Animal' and it has access to all the variables and methods of 'Animal'.
        
        jimmy.color = "Black";
        // Accessing the variable 'color' of the custom class 'Animal' using the object 'jimmy' of 'Dog' bacause 'Dog' extends 'Animal' and it has access to all the variables and methods of 'Animal'.

        jimmy.is_friendly = true;
        // Accessing the variable 'is_friendly' of class 'Dog' through the object 'jimmy'.
        

        jimmy.details();
        // Accessing the custom fnc 'details()' of the custom class 'Dog' using the object 'jimmy'.
        
        // DOG CLASS - Ended
        
        
        // CAT CLASS - Started

        Cat bella = new Cat();
        // Creating an object 'bella' of Class Cat to access the class methods and variables.

        // Syntax of obj creation:- <classname> <objectname> = new <classname> ();

        bella.name = "bella";
        // Accessing the variable 'name' of the custom class 'Animal' using the object 'bella' of 'Cat' bacause 'Cat' extends 'Animal' and it has access to all the variables and methods of 'Animal'.
        
        bella.age = 4;
        // Accessing the variable 'age' of the custom class 'Animal' using the object 'bella' of 'Cat' bacause 'Cat' extends 'Animal' and it has access to all the variables and methods of 'Animal'.

        bella.type = "Siberian";
        // Accessing the variable 'type' of the custom class 'Animal' using the object 'bella' of 'Cat' bacause 'Cat' extends 'Animal' and it has access to all the variables and methods of 'Animal'.

        bella.canwalk = true;
        // Accessing the variable 'canwalk' of the custom class 'Animal' using the object 'bella' of 'Cat' bacause 'Cat' extends 'Animal' and it has access to all the variables and methods of 'Animal'.

        bella.canharm = true;
        // Accessing the variable 'canharm' of the custom class 'Animal' using the object 'bella' of 'Cat' bacause 'Cat' extends 'Animal' and it has access to all the variables and methods of 'Animal'.
        
        bella.can_tamed = true;
        // Accessing the variable 'can_tamed' of the custom class 'Animal' using the object 'bella' of 'Cat' bacause 'Cat' extends 'Animal' and it has access to all the variables and methods of 'Animal'.
        
        bella.color = "white";
        // Accessing the variable 'color' of the custom class 'Animal' using the object 'bella' of 'Cat' bacause 'Cat' extends 'Animal' and it has access to all the variables and methods of 'Animal'.

        bella.is_friendly = true;
        // Accessing the variable 'is_friendly' of class 'Cat' through the object 'bella'.

        bella.details();
        // Accessing the custom fnc 'details()' of the custom class 'Cat' using the object 'bella'.
        
        // CAT CLASS - Ended
        
        
        // RABBIT CLASS - Started
        
        Rabbit chiku = new Rabbit();
        // Creating an object 'chiku' of Class Rabbit to access the class methods and variables.

        // Syntax of obj creation:- <classname> <objectname> = new <classname> ();

        chiku.name = "chiku";
        // Accessing the variable 'name' of the custom class 'Animal' using the object 'chiku' of 'Rabbit' bacause 'Rabbit' extends 'Animal' and it has access to all the variables and methods of 'Animal'.
        
        chiku.age = 2;
        // Accessing the variable 'age' of the custom class 'Animal' using the object 'chiku' of 'Rabbit' bacause 'Rabbit' extends 'Animal' and it has access to all the variables and methods of 'Animal'.

        chiku.type = "Austrailian Bunny";
        // Accessing the variable 'type' of the custom class 'Animal' using the object 'chiku' of 'Rabbit' bacause 'Rabbit' extends 'Animal' and it has access to all the variables and methods of 'Animal'.

        chiku.canwalk = true;
        // Accessing the variable 'canwalk' of the custom class 'Animal' using the object 'chiku' of 'Rabbit' bacause 'Rabbit' extends 'Animal' and it has access to all the variables and methods of 'Animal'.

        chiku.canharm = false;
        // Accessing the variable 'canharm' of the custom class 'Animal' using the object 'chiku' of 'Rabbit' bacause 'Rabbit' extends 'Animal' and it has access to all the variables and methods of 'Animal'.
        
        chiku.can_tamed = true;
        // Accessing the variable 'can_tamed' of the custom class 'Animal' using the object 'chiku' of 'Rabbit' bacause 'Rabbit' extends 'Animal' and it has access to all the variables and methods of 'Animal'.
        
        chiku.color = "black & White";
        // Accessing the variable 'color' of the custom class 'Animal' using the object 'chiku' of 'Rabbit' bacause 'Rabbit' extends 'Animal' and it has access to all the variables and methods of 'Animal'.

        chiku.is_friendly = true;
        // Accessing the variable 'is_friendly' of class 'Rabbit' through the object 'chiku'.

        chiku.details();
        // Accessing the custom fnc 'details()' of the custom class 'Rabbit' using the object 'chiku'.

        // RABBIT CLASS - Ended

    }// main fnc closes here.

}// class ends here.


// Output for Dog:
// Name: Jimmy 
// Breed: German Shepherd 
// Color: Black 
// Age: 6 
// Can Walk: true 
// Will Bark: true 
// Can harm: true 
// Is friendly: true 
// Can tamed: true

// Output for Cat:
// Name: bella 
// Breed: Siberian 
// Color: white 
// Age: 4 
// Can Walk: true 
// Can harm: true 
// Can tamed: true 
// Fall Damage: false
// Is friendly: true
// Will Meow: true

// Output for Rabbit:
// Name: chiku 
// Breed: Austrailian Bunny 
// Color: black & White 
// Age: 2 
// Can Walk: true 
// Can harm: false 
// Can tamed: true 
// Make High Jumps: true
// Is friendly: true

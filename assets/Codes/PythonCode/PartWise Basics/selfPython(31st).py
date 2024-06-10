# ----------------------------------------------------------
 # What is self in methods?
# ----------------------------------------------------------
# 
# So the Question arises What is the Use of self parameter in the constructor fnc, always remember that self refers to the object or the variable in which class will be stored when called.


ferrari = CarFactory8("Covered" , 2 , "8 cycle") # here the self parameter takes ferrari as its argument.


# Lets check what self contains or refer to.

class CarFactory9: # this is a simple class
    
    def __init__(self): # It is the constructor fnc of the class which automatically runs when class called.
        
        print(self) # Printing the value of var 'self'
        

CarFactory9()

# OUTPUT when class called:- <__main__.CarFactory9 object at 0x0000000001E2A5C0> , this is the address of obj 'ferrari'

# if you don not believe that you can try printing the obj 'ferrari' on the terminal.

print(ferrari) # Output:- <__main__.CarFactory9 object at 0x0000000001E2A5C0> 

# Both the output as same which means self refers to the parent obj or the calling obj.


# Now lets store the value of parameters in inside the object.

class CarFactory: # this is a simple class
    
    def __init__(self , body , tyre , engine): # here, 3 parameters are given in the constructor fnc.
        
        self.body = body # Here, the variable 'body' is stored in the parameter 'body' , used self because self refers to the parent obj
        
        self.tyre = tyre # Here, the variable 'tyre' is stored in the parameter 'tyre' used self because self refers to the parent obj
        
        self.engine = engine # Here, the variable 'engine' is stored in the parameter 'engine' used self because self refers to the parent obj
        
        print(body , tyre , engine) # prints the 3 parameters
        
ferrari = CarFactory("Covered" , 4 , "8 cycle") # here the self parameter takes ferrari as its argument. and calling the constructor fnc with 3 parameters.

# OUTPUT:- Covered 4 8 cycle

Alto = CarFactory("Covered" , 4 , "4 cycle") # here the self parameter takes Alto as its argument. and calling the constructor fnc with 3 parameters.

# OUTPUT:- Covered 4 4 cycle

Splendor = CarFactory("Open" , 2 , "8 cycle") # here the self parameter takes Splendor as its argument. and calling the constructor fnc with 3 parameters.

# OUTPUT:- Open 2 8 cycle


# Now like i want to change the alto engine type from 4 cycle to 6 cycle.

Alto.engine = "6 cycle" # here, the variable 'engine' is stored in the parameter 'engine' used self because self refers to the parent obj


# -----------------------------------------------
class Main: # this is a simple class
    
    def hello(): # this is a fnc of class , also known as class method taking no parameters
        
        print("hello!") # prints hello

        
# Calling With Classname:

Main.hello() # This will call the class and from class it calls the hello() method passing no parameters

# OUTPUT:- hello!


# Calling With Objectname

obj = Main() # Here the variable 'obj' becomes an object by calling the class 'Main'.

# obj.hello() 

# This will call the class through object and from class it calls the hello() method passing no parameters. 

# but this will show error that it requires no parameters but one parameter is passed.

# Now, the Question arise, what parameter is being passed?

# The answer is the object 'obj' is passed in the fnc 'hello()' of 0 parameters, because whenever method is called through object, it takes object as its parameter.

# here self is used to store the object parameter inside any method.


class Main2: # this is a simple class
    
    def hello(self): # this is a fnc of class , also known as class method taking 1 parameter
        
        print("hello !") # prints hello
        
obj = Main2() # Here the variable 'obj' becomes an object by calling the class 'Main2'.

obj.hello() # This will call the class through object and from class it calls the hello() method passing 1 parameter 'that is obj'.

# OUTPUT:- hello !


class Factory: # this is a simple class
    
    def __init__(self , bodytype , tyretype , enginetype): # It is the constructor fnc of the class which automatically runs when class called taking 3 parameters.
        
        self.BT = bodytype # Here, the variable 'bodytype' is stored in the parameter 'BT' , used self because self refers to the parent obj
        
        self.TT = tyretype # Here, the variable 'tyretype' is stored in the parameter 'TT' used self because self refers to the parent obj

        self.ET = enginetype # Here, the variable 'engine' is stored in the parameter 'engine' used self because self refers to the parent obj
        
    def PrintDetails(self): # this is a fnc of class , also known as class method taking 1 parameter is the obj.
        
        print(f"The Details are :\n Body Type: {self.BT} ,Tyre Type: {self.TT} ,Engine Type: {self.ET}") # prints the 3 parameters
        
ferrari = Factory("Covered" , 4 , "8 cycle") # here the self parameter takes ferrari as its argument. and calling the constructor fnc with 3 parameters.

ferrari.PrintDetails() # This will call the class and from class it calls the PrintDetails() method passing no parameters but in realtiy passing the object as parameter which later stored in self.

# OUTPUT:- The Details are :
# Body Type: Covered
# Tyre Type: 4
# Engine Type: 8 cycle


alto = Factory("Covered" , 4 , "4 cycle") # here the self parameter takes Alto as its argument. and calling the constructor fnc with 3 parameters.

alto.PrintDetails() # This will call the class and from class it calls the PrintDetails() method passing no parameters but in realtiy passing the object as parameter which later stored in self.

# OUTPUT:- The Details are :
# Body Type: Covered
# Tyre Type: 4
# Engine Type: 4 cycle


Splendor = Factory("Open" , 2 , "8 cycle") # here the self parameter takes Splendor as its argument. and calling the constructor fnc with 3 parameters.

Splendor.PrintDetails() # This will call the class and from class it calls the PrintDetails() method passing no parameters but in realtiy passing the object as parameter which later stored in self.

# OUTPUT:- The Details are :
# Body Type: Open
# Tyre Type: 2
# Engine Type: 8 cycle

# ----------------------------------------------------------
 # CONSTRUCTOR IN PYTHON
# ----------------------------------------------------------

 
#  constructor Method is the the fnc which has the __init__ method with self as the parameter, So that whenever u need some predefined input for the class then you can use constructor.

class CarFactory7: # This is the Simple of Class.
    
    def __init__(self): # this is the main method which automatically runs during class calls and doesn't reuired to call it.
        
        print("Hello! I am Automaticlly Called") # Prints hello
        
    def ManualHello(): # here, a function 'ManualHello()' is declared inside the class and it is known as class methods.
        
        print("Hello! I Am called by the user") # prints hello
        
# Lets try calling class,

CarFactory7() # This will call the class and class automatically calls the __init__ or main method.

# OUTPUT:- Hello! I am Automatically Called

CarFactory7.ManualHello()


# U can give more parameters is the constructor fnc like,

class CarFactory8: # this is the simple class
    
    def __init__(self , body , tyre , engine): # here, 3 parameters are given in the constructor fnc.
        
        print(body , tyre , engine) # prints the 3 parameters
        
# CarFactory8() 

# this will call the class and class automatically calls the __init__ or main method but it needs 3 arguments to be passed and if no arguments are passed it will show error.


CarFactory8("Covered" , 2 , "8 cycle") # here, 3 arguments are passed and the constructor fnc automatically runs.

# OUTPUT:- "Covered" 2 "8 cycle"
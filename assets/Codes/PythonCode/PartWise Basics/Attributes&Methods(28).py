# ----------------------------------------------------------
 # CLASS ATTRIBUTES AND METHODS
 
 # A variable inside any class or class variables are known as attributes.
 
 # A function inside any class or class functions are known as methods.
 
class CarFactory2: # this is a simple example of class
    
    a = 10 # here, a variable 'a' is declared inside the class and it is known as class attributes.
    
    def hello(): # here, a function 'hello' is declared inside the class and it is known as class methods.
        
        pass # A keyword used to declare a empty function.
    
    
# ----------------------------------------------------------
 # PUBLIC AND PRIVATE ATTRIBUTES AND METHODS
 
 
class CarFactory3: # this is a simple example of class
    
    a = 10 # here, a variable 'a' is declared inside the class and it is known as class attributes.
    
    def hello():# here, a function 'hello' is declared inside the class and it is known as class methods.
        
        print("Hello! I am a Class Method") # Printing that it is a class method.
        
    hello() # here inside the class You can directly call the class method inside the class by calling the class outside.
    
CarFactory3() # here it called the class and class runs and the method inside it will run.
    
print(CarFactory3.a) # Here, Accessing attribute 'a' of Class 'CarFactory3' using . operator and printing on terminal.

# here as you see anybody can access the class variables outside the class easily.

# Now lets Try to Access Class method:

CarFactory3.hello() # Same as calling the fnc but specify the classname with . operator to access its method.

# OUTPUT:- Hello! I am a Class Method

# As You saw anybody here can access the class variables and methods easily outside the class, hence they are called public attributes and public methods of the class.


class CarFactory4: # this is a simple example of class
    
    __a = 10 # here, a variable 'a' is declared inside the class and it is known as class attributes.
    
    # Using Double Underscore in front of any attribute or method will make it private.
    
    
    def __hello():# here, a function 'hello' is declared inside the class and it is known as class methods.
        
        print("Hello! I am a Class Method") # Printing that it is a class method.
         
    # hello()
     
    # here inside the class You can directly call the class method inside the class but now You cannot access it inside the class Also if you tey to call the method that it will show the error and some thinks that i changed the name of the method So here it is:
    
# print(CarFactory4.a)

# You can try to Print the value of attribute 'a' outside the class using classname and . operator , still you cannot access it and print it. It shows the error that it is not defined in the class.

# CarFactory4.hello()

# You can try same with method but still you cannot access it because they all becomes private using (__) double underscore.


# ----------------------------------------------------------
 # HOW TO ACCESS PRIVATE ATTRIBUTES AND METHODS?
 
 # you can access private method by calling them inside the class and calling the class from outside.
 
class CarFactory5: # this is a simple example of class
    
    __a = 10 # here, a variable 'a' is declared inside the class and it is known as class attributes.
    
    # Using Double Underscore in front of any attribute or method will make it private.
    
    def __hello():# here, a function 'hello' is declared inside the class and it is known as class methods.
        
        print("Hello! I am a Class Method") # Printing that it is a class method.
        
    # hello()
     
    # here inside the class You can directly call the class method inside the class but now You cannot access it inside the class Also if you tey to call the method that it will show the error and some thinks that i changed the name of the method So here it is:
    
    __hello() # using this statement with the class method let you access the method in the class. U can use double underscore during calling the fnc to access it.
    
CarFactory5() # Calling the Class from outside to run the class line wise,

# after class running the method __hello() will run and prints the statements which means the method is accessiable.

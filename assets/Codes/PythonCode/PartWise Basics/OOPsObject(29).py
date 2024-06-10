# ----------------------------------------------------------
 # OBJECT CREATION
# ----------------------------------------------------------
 
#  To create a Object u have to call the class and Store it in the variable.

# Then that variable becomes object.

class CarFactory6: # This is the Simple of Class.
    a = 10 # A variable 'a' storing 10 inside it , declared inside the class and becomes class attribute.
    
    __b = 15 # A private variable 'b' Storing 15 inside it, declared inside the class becomes class attribute.
    
    def hello():# here, a function 'hello' is declared inside the class and it is known as class methods.
        
        print("Hello Guys") # Printing...
        
# Syntax for object:- objname = classname()

obj = CarFactory6() # Here the variable 'obj' becomes an object by calling the class 'CarFactory6'.

print(obj.a) # Instead of Writing classname , u can use object to access class attributes and methods.

# Object gets all the powers of classes.

# Object has the advantage that they can create as many as we want , means diffrent objects of same class like,

obj1 = CarFactory6() # Here, a new object of class 'CarFactory6' is created.

obj2 = CarFactory6() # Here, a new object of class 'CarFactory6' is created.

obj3 = CarFactory6() # Here, a new object of class 'CarFactory6' is created.
